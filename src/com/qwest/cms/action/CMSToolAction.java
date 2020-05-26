/*
 * Created on Feb 20, 2008
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.qwest.cms.action;




import com.qwest.cms.utils.KeyPairType;


import com.qwest.cms.utils.CmsDbTable;
import com.qwest.cms.utils.SignatureType;
import com.qwest.cms.utils.X509CertUtil;
import com.qwest.cms.utils.KeyPairUtil;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.upload.FormFile;
import org.bouncycastle.asn1.x509.X509Name;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.jce.PKCS10CertificationRequest;
import com.qwest.cms.BO.CMSBO;
import com.qwest.cms.actionForm.CMSFunctionForm;
import com.qwest.cms.actionForm.CMSToolForm;
import com.qwest.cms.dao.GenericDAO;
import com.qwest.cms.dao.ToolsDao;
import com.qwest.cms.exception.CMSBaseException;
import com.qwest.cms.utils.*;

/**
 * @author ipatan
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class CMSToolAction extends  DispatchAction {
	ActionErrors actionErrors = new ActionErrors();	
    Logger logger = Logger.getLogger(CMSFunctionAction.class);
    ActionMessages actionMessages = new ActionMessages();
     public boolean montht ;
    public boolean dayt ;
    public int compresultm;
    public int compresultd;
    public int compresulty;
    
	public ActionForward autoDisc(ActionMapping mapping, 
			   ActionForm form, HttpServletRequest request, 
			   HttpServletResponse response) throws Exception {
		      
			 // System.out.println("Auto Disc 1**********");
			 /* Process p;

			  try
			  {
			      String cmd = CMSProperties.getString("UNTAR_SCRIPT");
			  p = Runtime.getRuntime().exec(cmd);
		  p.waitFor();
			  if(p.exitValue() == 0)
			  {
			  System.out.println("CommandSuccessful  "+cmd);
			  }
			  else
			  {
			  System.out.println("CommandFailure");
			  } 
			  }
			  catch(Exception ex)
			  {
			  System.out.println("Exception:"+ex.toString());
			  }*/

	    
			  System.out.println("Auto Disc sending**********");			  
			  return mapping.findForward("AutoDisc");
			 }
	
	public ActionForward checkCert(ActionMapping mapping, 
			   ActionForm form, HttpServletRequest request, 
			   HttpServletResponse response) throws Exception {
			 
			  System.out.println("Tool Check Cert Action ***********");
			  logger.info("Tool Check Cert Action ***********");
			  HttpSession session=request.getSession();
			  CMSToolForm toolForm = (CMSToolForm)form;			  
			  CMSToolAction tool = new CMSToolAction();
			  actionErrors.clear();
			  tool.dirList(mapping, form, request, response);
			  
			  try {
				  String dirExists = (String)session.getAttribute("dirExists");
				  System.out.println("value of NO CERT**********"+dirExists);
				  if ( dirExists.equals("DirNotExists") ){
					  System.out.println("nocerts in check cert......"+dirExists);
					  logger.debug("Tools ---> checkCert -- Server Directory does not exist -"+dirExists);	
					  actionMessages.clear();
					  actionMessages.add("mess", new ActionMessage("error.toolMess"));
					  saveMessages(request, actionMessages);
					  System.out.println("action mess");
					  return new CMSToolAction().reqform(mapping, form, request, response);
				  } else if ( dirExists.equals("DirExists") ){
					  System.out.println("cert dir in check cert........"+dirExists);
					  logger.debug("Tools ---> checkCert - Server Directory Exists  -"+dirExists);
					  toolForm.setAppServer(toolForm.getAppServer());
					  System.out.println("App server name is "+toolForm.getAppServer());
					  return new CMSToolAction().loadAppUser(mapping, form, request, response);
					  //return mapping.findForward("loadAppUser");
				  }
				  
				  return mapping.findForward("tool");
			  } catch (SQLException e) {
					logger.error("SQL Exception in Tools - Check Cert  "+e.getMessage());
					actionErrors.add("db error", new ActionError("error.dbError"));
					saveErrors(request, actionErrors);
					return mapping.findForward("editProfAuthCheck");
				}catch (Exception e) {
					logger.error("Exception in Tools - Check Cert "+e.getMessage());
					actionErrors.add("error", new ActionError("error.message"));
					saveErrors(request, actionErrors);
					return mapping.findForward("editProfAuthCheck");
				}

	}
	
	public void dirList(ActionMapping mapping, 
			   ActionForm form, HttpServletRequest request, 
			   HttpServletResponse response) {
     try{
     	System.out.println();
     	actionErrors.clear();
        HttpSession session=request.getSession();
        CMSToolForm toolForm = (CMSToolForm)form;
        boolean fileExists = true;
        String appServer = null;
        String cuid=(String)session.getAttribute("login");
        if ( (cuid == null) || (cuid.equals(null) || (cuid.equals(""))) ){
			  logger.error("Login Id in Edit Prof is null");
			  actionErrors.add("errMess", new ActionError("error.message"));
			  saveErrors(request, actionErrors);			
		  }
        
      //String crt_home=CMSProperties.getString("crt_home");
      String crt_home=CMSProperties.getString("UNTAR_SCRIPT");
        System.out.println(" crt_home =="+crt_home+"  cuid ==> "+cuid);
        appServer = toolForm.getAppServer();
     	File directory=new File(crt_home);
     	ArrayList dirList = new ArrayList();
        if(directory.isDirectory()) {                        
         	File[] contents = directory.listFiles();
         	for(int i=0;i<contents.length;i++){
         			File file=contents[i];
         			if(file.getName().equalsIgnoreCase((appServer))){
         				if(file.isDirectory())
         					dirList.add(file.getName().trim());
         			}
         	}
        }
         
		PrintWriter pw=response.getWriter();
		// int c=Integer.parseInt(fm.getA())*Integer.parseInt(fm.getB());
		System.out.println("dirList.size() "+dirList.size());
		logger.debug("Tools ---> dirList -- Server Directory List Size  -"+dirList.size());
		session.setAttribute("noCerts", null);
		if(dirList.size()>0){
			pw.write(dirList.toString());	
			session.setAttribute("dirExists", "DirExists");				
		} else {
		session.setAttribute("dirExists", "DirNotExists");
		System.out.println(" sending 0");
		pw.write("0");
		//actionErrors.add("errMess", new ActionError("error.noCertLoad"));
		//saveErrors(request, actionErrors);			     
		fileExists = false;				 
		if(fileExists == false){			 
		     session.setAttribute("noCerts", "noCertificates");
		}else{
		     session.setAttribute("noCerts", "Certificates");
		}
		//return fileExists;
		}
		System.out.println("dir contains....."+(String)session.getAttribute("noCerts"));
		logger.debug("Tools ---> dirList -- Directory contains ........."+(String)session.getAttribute("noCerts"));
      }catch(Exception ie){
         System.out.println(" io Exception "+ie.getMessage());
         logger.debug("Tools ---> dirList-- Exception in File Handling "+ie.getMessage());         
      }
      //return true;
     	
	}         
	
	public ActionForward loadAppUser(ActionMapping mapping, 
			   ActionForm form, HttpServletRequest request, 
			   HttpServletResponse response) throws Exception {
			 
			  System.out.println("Tools Load App User Action ***********");
			  logger.info("Tools Load App User Action ***********");
			  HttpSession session=request.getSession();
			  CMSToolForm toolForm = (CMSToolForm)form;	 
			  actionErrors.clear();
			  String loginId=(String)session.getAttribute("login");
			  if ( (loginId == null) || (loginId.equals(null) || (loginId.equals(""))) ){
				  logger.error("Login Id in Edit Prof is null");
				  actionErrors.add("errMess", new ActionError("error.message"));
				  saveErrors(request, actionErrors);				  
				  return mapping.findForward("editProfAuthCheck");
			  }
			  GenericDAO genDao = new GenericDAO();
			  ArrayList appList = new ArrayList();
			  ArrayList appsList = new ArrayList();
			  String[] appUser = null;
			  ArrayList appUserList = new ArrayList();
			  ArrayList appsUserList = new ArrayList();
			  String getAppDetailQuery = "SELECT * from "+CmsDbTable.TBL_CMS_APP_MEMBER+" where MEMBER_CUID = '" +
			  			loginId.toUpperCase()+"'";
			  
			  System.out.println("getAppDetailQuery in tools action .........../ "+getAppDetailQuery);
			  try {
				  appList = genDao.getAppMemberDetail(getAppDetailQuery);
				  System.out.println("App List..... size"+appList.size());
				  for (int i = 0; i < appList.size(); i++) {
					  String[] appDetails = (String[]) appList.get(i);
					  CMSBO cmsBO = new CMSBO();
					  cmsBO.setAppName(appDetails[0]);
					  cmsBO.setAcronym(appDetails[1]);
					  appsList.add(cmsBO);
					  //System.out.println(appDetails[0]+appDetails[1]);
				  }			  
				  System.out.println("Size of apps list"+appsList.size());
				  CMSBO cmsBO = new CMSBO();
				  for (int i = 0; i < appsList.size(); i++) {
					  cmsBO = (CMSBO)appsList.get(i);
					  //cmsBO = (CMSBO)session.getAttribute("AppList");
					  appUser = genDao.getAppUserName(cmsBO.getAppName(), cmsBO.getAcronym());
					  //System.out.println("App User names are ......"+appUser.length );
					  appUserList.add(appUser);
					  //System.out.println("App User List is ......."+appUserList.size());
				  }
				  Set s=new HashSet();
				  for (int i = 0; i < appUserList.size(); i++) {
					  String[] strArr = (String[]) appUserList.get(i);
					  for (int j = 0; j < strArr.length; j++) {
						  if(!s.contains(strArr[j])){
						      //System.out.println(" hi "+strArr[j]);
						      s.add(strArr[j]);
						      CMSBO cmsbo = new CMSBO();
						      cmsbo.setAppUserName(strArr[j]);				  
						      appsUserList.add(cmsbo);
						  }

						  //System.out.println("user names are ....."+strArr[j]);
						  logger.debug("Tools --> Load App User -- The App User Names List Names are ******** "+strArr[j]);
					  }				  
				  }		
				  
				 //String crt_home=CMSProperties.getString("crt_home");
				String crt_home=CMSProperties.getString("UNTAR_SCRIPT");
				  String appServer = toolForm.getAppServer();
				  System.out.println("crt_home .......... "+crt_home);
				  System.out.println("appServer ............... "+appServer);
				  File directory=new File(crt_home+"/"+appServer);
				  ArrayList userList=new ArrayList();
				  if(directory.isDirectory()) {                        
						File[] contents = directory.listFiles();
						
						for(int j=0;j<contents.length;j++){
		      			File file=contents[j];
		      			if(file.isDirectory()){	
		      			  CMSBO cmsbo = new CMSBO();
		      			cmsbo.setAppUserName(file.getName().trim());
		      			  userList.add(cmsbo);
		      					
		      				}
		      			//	}
						}
					}
				  System.out.println("Apps User List size is "+userList.size());
				  logger.debug("Tools --> Load App User -- Apps User List size is "+appsUserList.size());
				  //session.setAttribute("appsUserList", appsUserList);	
				  session.setAttribute("appsUserList", userList);	
				  return mapping.findForward("loadAppUser");
			  } catch (SQLException e) {
					logger.error("SQL Exception in Tools - Load App User  "+e.getMessage());
					actionErrors.add("db error", new ActionError("error.dbError"));
					saveErrors(request, actionErrors);
					return mapping.findForward("editProfAuthCheck");
				}catch (Exception e) {
					logger.error("Exception in Tools - Load App User "+e.getMessage());
					actionErrors.add("error", new ActionError("error.message"));
					saveErrors(request, actionErrors);
					return mapping.findForward("editProfAuthCheck");
				}			  
			 }
 
	public ActionForward checkAppUserName(ActionMapping mapping, 
			   ActionForm form, HttpServletRequest request, 
			   HttpServletResponse response) throws Exception {
			
			HttpSession session=request.getSession();
			System.out.println("Check App User Action *********  ");
			logger.info("Tools -- Check App User Action *********  ");
			actionErrors.clear();
			String cuid=(String)session.getAttribute("login");
			if ( (cuid == null) || (cuid.equals(null) || (cuid.equals(""))) ){
				  logger.error("Login Id in Edit Prof is null");
				  actionErrors.add("errMess", new ActionError("error.message"));
				  saveErrors(request, actionErrors);				  
				  return mapping.findForward("editProfAuthCheck");
			  }
			CMSToolForm toolForm = (CMSToolForm)form;			
			String appUserName = toolForm.getAppUserName();			        
			System.out.println(" Checking app user ......."+appUserName);
			logger.debug("Tools -- Check App User - Checking app user ......  "+appUserName);
			session.setAttribute("appUserName", appUserName);			
			CMSToolAction toolAct = new CMSToolAction();
			toolAct.certList(mapping, form, request, response);
			return  new CMSToolAction().disCrtList(mapping, form, request, response);
	}
	
	public ActionForward LoadEditCert(ActionMapping mapping, 
			   ActionForm form, HttpServletRequest request, 
			   HttpServletResponse response) throws Exception {
			
			HttpSession session=request.getSession();
			System.out.println("Load Edit Cert Action *********  ");
			logger.info("Tools -- Load Edit Cert Action *********  ");
			actionErrors.clear();
			String path = request.getParameter("path");
			session.setAttribute("path", path);
			//path = path.substring(path.lastIndexOf('/')+1,path.indexOf('.'));
			String crtname=new File(path).getName();
			CMSToolForm toolForm = (CMSToolForm)form;	
			
			toolForm.setCertName(crtname);
			
			return mapping.findForward("loadEditCert");
	}
	
/*	public ActionForward loadEditPage(ActionMapping mapping, 
			   ActionForm form, HttpServletRequest request, 
			   HttpServletResponse response) throws Exception {
			
			HttpSession session=request.getSession();
			System.out.println("Load Edit Page Action *********  ");
			logger.info("Tools -- Load Edit Page Action *********  ");
			actionErrors.clear();			
			
			CMSToolForm toolForm = (CMSToolForm)form;	
			//toolForm.setCertName((String)session.getAttribute("path"));
			System.out.println("Load edit cert .......... path is ---" +(String)session.getAttribute("path"));
			return mapping.findForward("loadEditPage");
	}*/
	
	public void loadEditSave(ActionMapping mapping, 
			   ActionForm form, HttpServletRequest request, 
			   HttpServletResponse response) throws Exception {
			
			HttpSession session=request.getSession();
			System.out.println("Load Edit SAVE Action *********  ");
			logger.info("Tools -- Load Edit SAVE Action *********  ");
			actionErrors.clear();
			String certName = null;
			String certNickName = null;
			String appName = null;
			String hostID = null;
			String hostIP = null;
			String certType = null;
			String loadNotes = null;
			String path = (String)session.getAttribute("path");
			CMSToolForm toolForm = (CMSToolForm)form;	
			certName = toolForm.getCertName();
			appName = toolForm.getAppName();
			certNickName = toolForm.getCertNickName();
			certType = toolForm.getCertType();
			hostID = toolForm.getHostID();
			hostIP = toolForm.getHostIP();
			
			loadNotes = toolForm.getLoadNotes();
			
			HashMap map=(HashMap)session.getAttribute("savemap");
			ArrayList saveList=new ArrayList();
			saveList.add(appName);
			saveList.add(certNickName);
			saveList.add(certType);
			saveList.add(hostID);
			saveList.add(hostIP);
			saveList.add(loadNotes);
			//path=path.replace('/', '\\');
			map.put(path,saveList);
			session.setAttribute("savemap",map);
			System.out.println("All values in save load -----for path "+path+" & "+map.size());			
			
			//return mapping.findForward("loadEditSave");
	}
	
	public void certList(ActionMapping mapping, 
			   ActionForm form, HttpServletRequest request, 
			   HttpServletResponse response){
		HttpSession session=request.getSession();
		actionErrors.clear();
		String cuid=(String)session.getAttribute("login");
		if ( (cuid == null) || (cuid.equals(null) || (cuid.equals(""))) ){
			  logger.error("Login Id in Edit Prof is null");
			  actionErrors.add("errMess", new ActionError("error.message"));
			  saveErrors(request, actionErrors);						  
		  }
		
		//String crt_home=CMSProperties.getString("crt_home");
		String crt_home=CMSProperties.getString("UNTAR_SCRIPT");
		CMSToolForm toolForm = (CMSToolForm)form;
		Map map=new LinkedHashMap();
		boolean fileExists = true;
		String appUserName = toolForm.getAppUserName();
		String appServer = toolForm.getAppServer();
  
		try{
			File directory=new File(crt_home+"/"+appServer);
			ArrayList dirList = new ArrayList();
			if(directory.isDirectory()) {                        
				File[] contents = directory.listFiles();
				for(int i=0;i<contents.length;i++){
      			File file=contents[i];
      			if(file.getName().startsWith(appUserName.toUpperCase())||file.getName().startsWith(appUserName.toLowerCase())){
      				if(file.isDirectory())
      					dirList.add(file.getName().trim());
      				}
				}
			}
			PrintWriter pw=response.getWriter();
			System.out.println("dirList.size() "+dirList.size());
			logger.debug("Tools -- Cert List -- Cert Dir list size()is  "+dirList.size());
			if(dirList.size()>0){
				pw.write(dirList.toString());	
				session.setAttribute("appDirExists", "appDirExists");
				File crtDir=new File(crt_home+"/"+appServer+"/"+appUserName);
				File[] crts = crtDir.listFiles();
				for(int i=0;i<crts.length;i++){
					File file=crts[i];                  
					try{
						ParseX509Certificate crt=new ParseX509Certificate(file);
						map.put(file.getPath(), crt);
					}catch(CertificateException crtExp){
						System.out.println(" File"+file.getPath()+" is not proper Certficate to parse \n Exp Message: "+crtExp.getMessage());
						logger.error("Tools -- Cert List -- Exception in Parsing certificate  "+crtExp);
						/*actionErrors.add("errMess", new ActionError("error.parseCert"));
						saveErrors(request, actionErrors);*/
					}
               
					//System.out.println(" No ot files crt "+map.size());
					logger.debug("Tools -- Cert List -- No of crt files is "+map.size());
				 }
				
			 } else {
			 session.setAttribute("appDirExists", "appDirNotExists");
		     System.out.println(" sending 0");
		     pw.write("0");
		     //actionErrors.add("errMess", new ActionError("error.noCertLoad"));
			 //saveErrors(request, actionErrors);			     
			 fileExists = false;				 
			 if(fileExists == false){
				 System.out.println("file exists is false....");
				  session.setAttribute("certList", "noCertificates");
			  }else{
				  session.setAttribute("certList", "Certificates");
			  } 	          			 
		 }
		 System.out.println("dir contains....."+(String)session.getAttribute("certList"));
		  //return mapping.findForward("tool2");
  
		 }catch(Exception ie){
			 System.out.println(" io Exception "+ie.getMessage());
			 logger.error("Tools -- Cert List -- Exception in Cert List "+ie.getMessage());
		 }
	}
 
    public ActionForward disCrtList(ActionMapping mapping, 
			   ActionForm form, HttpServletRequest request, 
			   HttpServletResponse response)throws Exception {
    	
    	System.out.println("DisCrtList Action **********");
    	logger.info("Tools -- Display Cert List --");
    	HashMap map=new HashMap();
    	HashMap savemap=new HashMap();
    	ArrayList list=new ArrayList();
    	String readSuc="";
        String unValid="";
        CMSToolForm toolForm = (CMSToolForm)form;
        HttpSession session=request.getSession();	
        actionErrors.clear();
        ToolsDao dao=new ToolsDao();
        String appServer = toolForm.getAppServer();
        String appUserName = toolForm.getAppUserName();
       // String crt_home=CMSProperties.getString("crt_home");
        String crt_home=CMSProperties.getString("UNTAR_SCRIPT");
        CmsToolUtil toolUtil=new CmsToolUtil();
        CmsMail cmsMail = new CmsMail();
        String ccList[]={};
       
        try {
        	File crtDir=new File(crt_home+"/"+appServer+"/"+appUserName);
            System.out.println(" fielr path "+crtDir.getPath()+" "+crtDir.isDirectory());
            String cuid=(String)session.getAttribute("login");
            if ( (cuid == null) || (cuid.equals(null) || (cuid.equals(""))) ){
				  logger.error("Login Id in Edit Prof is null");
				  actionErrors.add("errMess", new ActionError("error.message"));
				  saveErrors(request, actionErrors);				  
				  return mapping.findForward("editProfAuthCheck");
			  }
            if(crtDir.isDirectory()) { 
                File[] crts = crtDir.listFiles();
                for(int i=0;i<crts.length;i++){
                   	File file=crts[i];  
                    	try{
                    	    String filePath=file.getPath();
                    	    if(filePath.endsWith(".p12") || filePath.endsWith(".pfx") || filePath.endsWith(".p7b")||filePath.endsWith("jks")){
                    	        String format = "PKCS12";   
                                if(filePath.endsWith("jks"))
                                 		format = "JKS";
                                KeyStore keyStore = KeyStore.getInstance(format);
                                FileInputStream fis = new FileInputStream(file);
                                keyStore.load(fis,null);
                                Enumeration e = keyStore.aliases();
                                int numJ=1;
                                while(e.hasMoreElements()){
                                    String aliasName = (String)e.nextElement(); 
                                    ParseX509Certificate crt=new ParseX509Certificate(aliasName,keyStore);
                                    if(crt.getX509cert()!=null){
                                 		map.put(file.getPath()+"."+numJ++, crt);
                                 		readSuc=readSuc+file.getName().replaceAll(CMSProperties.getString("delimiter"), ",")+","+crt.getNotBefore()+","+crt.getNotAfter()+"\n";
                                }else{
                         		    list.add(file.getPath());
                          		   unValid=unValid+file.getName()+"\n";    
                          		   }
                                }
                                fis.close();
                    	    }else{
                    		ParseX509Certificate crt=new ParseX509Certificate(file);
                    		 if(crt.getX509cert()!=null){
                         		map.put(file.getPath(), crt);
                         		readSuc=readSuc+file.getName().replaceAll(CMSProperties.getString("delimiter"), ",")+","+crt.getNotBefore()+","+crt.getNotAfter()+"\n";
                    		 }else{
                         		    list.add(file.getPath());
                         		   unValid=unValid+file.getName()+"\n";
                     		}
                    	    }
                    	}catch(CertificateException crtExp){
                    		System.out.println(" File"+file.getPath()+" Cannot parse Certficate  \n Exp Message: "+crtExp.getMessage());
                    		logger.error("Tools -Display Cert List -- Certificate Parse Error  - "+crtExp);                    		
                    		unValid=unValid+file.getName()+"\n";                    		
                    	}catch(IOException exp){
                    		System.out.println(" File"+file.getPath()+" IO EXPN \n Exp Message: "+exp.getMessage());
                    		logger.error("Tools -Display Cert List -- Cert IOException - "+exp);                    		
                    		unValid=unValid+file.getName()+"\n";                    		
                    	}                     	
                   	 	System.out.println(" No ot files crt "+map.size());
                   	 	logger.debug("Tools -Display Cert List -- No of cert files are "+map.size());
                  }
                toolUtil.mailPwdCrt(list, cuid);
            }           
            logger.info("Valide cert => "+readSuc);           
            logger.info("unValid cert => "+unValid);           
            toolUtil.writeFile(new File(CMSProperties.getString("unReadableFiles")), unValid);
            toolUtil.writeFile(new File(CMSProperties.getString("readableFiles")), readSuc);            
            cmsMail.sendMessWithAttach("Readable Files by CMS", "HI , PFA readable certificates list", "cmsAdmin", cuid, ccList,CMSProperties.getString("readableFiles"));
            cmsMail.sendMessWithAttach("UnReadable Files by CMS", "HI , PFA Unreadable certificates list", "cmsAdmin", cuid, ccList,CMSProperties.getString("unReadableFiles"));
            ///to move unreadable files
            String[] unReadFileNames=unValid.split("\n");
            for(int i=0;i<unReadFileNames.length-1;i++){
                toolUtil.moveFile(crtDir.getPath()+"/"+unReadFileNames[i], CMSProperties.getString("unReadDir"));
            }
           
           // ArrayList appList=dao.getAppList(cuid);         
            session.setAttribute("map", map);
           // session.setAttribute("tool_appList", appList);
            session.setAttribute("savemap", savemap);
          /*  Set  keyset= map.keySet();
            Iterator ir=keyset.iterator();
            while(ir.hasNext()){String pathfile=ir.next().toString();
            ParseX509Certificate crt=(ParseX509Certificate) map.get(pathfile);
            System.out.println("crritgg -- >"+crt.getNotAfter());
            }*/
          //  if(appList.size()>0){
            	return mapping.findForward("disCrtList");
           /* }else{
                session.setAttribute("errmsg", "noAppName");
                return mapping.findForward("loadFail");   
            }*/
        } catch (SQLException e) {
			logger.error("SQL Exception in Tools - Display Cert List  "+e.getMessage());
			actionErrors.add("db error", new ActionMessage("error.dbError"));
			saveErrors(request, actionErrors);
			return mapping.findForward("editProfAuthCheck");
		}catch (Exception e) {
			logger.error("Exception in Tools - Display Cert List "+e.getMessage());
			actionErrors.add("error", new ActionMessage("error.message"));
			saveErrors(request, actionErrors);
			return mapping.findForward("editProfAuthCheck");
		}	
        
   
    }
    public ActionForward loadCrt(ActionMapping mapping, 
			   ActionForm form, HttpServletRequest request, 
			   HttpServletResponse response) throws ParseException, CertificateException, IOException {
        HttpSession session=request.getSession();
        HashMap batchCrt=new HashMap();
        HashMap batchList=new HashMap();
        HashSet hostAppSet=new HashSet();    
        ToolsDao dao=new ToolsDao();
        String cuid=((String)session.getAttribute("login")).toUpperCase();
        HashMap map=(HashMap)session.getAttribute("map");
        System.out.println("total no of crts ==> "+map.size());
       // Map.Entry set=(Map.Entry)map.entrySet();
        Set pathkey=map.keySet();
        Iterator ir=pathkey.iterator();
        HashMap ownerMap = new HashMap();
        ArrayList insertAlarmList = new ArrayList();
        try {
        while(ir.hasNext()){
            String path=(String)ir.next();
            System.out.println("path "+path);
        ParseX509Certificate crt=(ParseX509Certificate)map.get(path);
        System.out.println("crt "+crt.getIssuerCN());
        String cerFileName=new File(path).getName();
        StringTokenizer str=new StringTokenizer(cerFileName,CMSProperties.getString("delimiter"));
        System.out.println(str);
              
          String  server=str.nextToken().trim();
          String  appUser=str.nextToken().trim();
          String crtname=str.nextToken().trim();
      
          /*********** amanila - Insert app owner data   ********/
          
          System.out.println("server name:  "+server+"   app cuid:   "+appUser+ " crtname:  "+crtname);
          
          CmsToolUtil toolUtil = new CmsToolUtil();
          String insertAlarmQuery = null;
          String[] ownerDetails = toolUtil.getAppOwner(appUser);  
                   
          String ownerCuid = ownerDetails[0];
          String ownerName = ownerDetails[1];
          String managerCuid = ownerDetails[2];
          String managerName = ownerDetails[3];
          
            
		  System.out.println("[] Owner Name ="+ownerName+"......"+managerName);
		  
		  if(!hostAppSet.contains(server.toUpperCase()+"~"+appUser.toUpperCase())){
	          hostAppSet.add(server.toUpperCase()+"~"+appUser.toUpperCase()); 
	          insertAlarmList.add("INSERT INTO "+CmsDbTable.HOST_CERT_CREATOR+" VALUES ("+"'"+server.toUpperCase()+"','"+appUser.toUpperCase()+"','"+cuid+"')" );
	          
		  
	          if ( (ownerCuid != null) && !(ownerCuid.equals("") )  ){
              //if ( !dao.checkRowAuto(server, appUser)  ){
        	  insertAlarmQuery = "insert into "+CmsDbTable.CERT_AUTO_ALARM+" values (" +
        	  		"'"+server.toUpperCase()+"','"+appUser.toUpperCase()+"','"+ownerCuid.toUpperCase()+"','"+ownerName.toUpperCase()+"','"+managerCuid.toUpperCase()+"','"+managerName.toUpperCase()+"','"+CMSProperties.getString("alaramFreq")+"')";
              insertAlarmList.add(insertAlarmQuery);
              // }
	          	}else {
	              // if(!dao.checkRowManual(server, appUser) ){
        	  insertAlarmQuery = "insert into "+CmsDbTable.CERT_MANUAL_ALARM+" values ('"+server.toUpperCase()+"','"+appUser.toUpperCase()+"','"+CMSProperties.getString("manAlaramFreq")+"')";
              insertAlarmList.add(insertAlarmQuery);
              //  }
	          }
		  }
          System.out.println("insertAlarmQuery ==>"+insertAlarmQuery);
         
          
          
          /************ end ***********/	
          
          
          /************ code to add paths ipatan***********/	
          HashMap hostPathMap=new HashMap();
          File root=new File(CMSProperties.getString("pathCsv"));
          //File root=new File(CMSProperties.getString("CRT_file_path"));
          System.out.println("root .... "+root);
          File[] hosts=root.listFiles();
          for(int i=0;i<hosts.length;i++){      
              
   	        BufferedReader br=new BufferedReader(new FileReader(hosts[i]));
   	        // BufferedReader br=new BufferedReader(new FileReader(new File("C:\\Documents and Settings\\ipatan\\Desktop\\sate-wkspace\\CMS\\report_csv\\test.csv")));
   	        String line = null;
   	        int lineNumber=0;
   	        while( (line=br.readLine())!=null){            
   	            lineNumber++;
   	            if(lineNumber>1){
   	                String vals[]=line.split(",");                
   	           // System.out.println(" line "+vals[0]+"~"+vals[1]+"== "+vals[str.length-1]);
   	            if(!hostPathMap.containsKey(vals[0].trim()+"~"+vals[1].trim())){
   	                ArrayList paths=new ArrayList();
   	                paths.add(vals[vals.length-1].trim());
   	            hostPathMap.put(vals[0].trim()+"~"+vals[1].trim(),paths);
   	            }else{                
   	                ((ArrayList)hostPathMap.get(vals[0].trim()+"~"+vals[1].trim())).add(vals[vals.length-1].trim());
   	            	}
   	            }
   	        }
              
              br.close();
           }
          /************ end ***********/
        	  System.out.println("TRYING....." +insertAlarmList.size());
        	  if(!dao.checkRow(crt,appUser,appUser,server,"1.1.1.1")){
        	      String abslPath="";
        	      ArrayList list= (ArrayList) hostPathMap.get(server+"~"+appUser);
        	      if(list!=null && list.size()>0){
        	      for(int i=0;i<list.size();i++){
        	          String csvpath=list.get(i).toString();
        	          String csvpathcrt=csvpath.substring(csvpath.lastIndexOf('/')+1, csvpath.length());
        	          String crtnameval="";
        	          try{
        	              int val=Integer.parseInt(crtname.substring(crtname.lastIndexOf('.')+1, crtname.length()));
        	              crtnameval=crtname.substring(0, crtname.lastIndexOf('.'));
        	          }catch(NumberFormatException e){
        	              crtnameval=crtname;
        	          }
        	          if(csvpathcrt.equalsIgnoreCase(crtnameval)){
        	              abslPath=(String)list.get(i);
        	              break;
        	          }
        	      }
        	      }
        	        batchCrt.put(cerFileName,dao.insertCrtStmt(crt,appUser,appUser,server,"1.1.1.1",cuid,server+"-"+appUser,"EXTERNAL","this is from: "+server+" with user: "+appUser+" name: "+crtname+" and Path: "+abslPath,abslPath));
        	        if(!dao.checkRow(crt)){
        	            batchList.put(cerFileName,dao.insertStmt(crt,new File(path)));        	            
        	          }
        	  }  
        	  
        }  
        
        
        ArrayList faildcrtlist=new ArrayList();
        ArrayList faildlist=new ArrayList();
        
        System.out.println("batchCrt= "+batchCrt.size());
        if(batchList.size()>0)
            faildcrtlist=dao.insertSqlMap(batchList);
        if(batchCrt.size()>0)
            faildlist=dao.insertSqlMap(batchCrt);
        if ( insertAlarmList.size() > 0 ){        	
         dao.insertAutoAlarm(insertAlarmList);
          // boolean inserts = dao.insertSql(insertAlarmList);
        	System.out.println("Inserted for Alarm ");
        }
       
        
        
        Iterator itr=pathkey.iterator();
        CmsToolUtil toolUtil=new CmsToolUtil();
        while(itr.hasNext()){
            String path=((String)itr.next());
            File crtDir= new File(path.substring(0, path.lastIndexOf("/")));   
            File[] crts = crtDir.listFiles();
           System.out.println(" path exp before read moved "+path);
           for(int i=0;i<crts.length;i++)
               toolUtil.moveFile(crts[i].getPath(),CMSProperties.getString("readDir"));
           break;
        }
        System.out.println("status of Master = "+faildlist.size()+" faildcrtlist ="+faildcrtlist.size());
        session.setAttribute("faildlist", faildlist);
        } catch (Exception e) {
            e.printStackTrace();
			System.out.println(e.getMessage());
		}	
        return mapping.findForward("loadSuc");
    }
    

        
  
    public ActionForward tool(ActionMapping mapping, 
			   ActionForm form, HttpServletRequest request, 
			   HttpServletResponse response) throws Exception {
			 
			  System.out.println("Tool - Tool Action *********");
			  HttpSession session=request.getSession();
			  CMSToolAction toolAction = new CMSToolAction();
			  boolean noCerts = true;
			  
			  //noCerts = toolAction.dirList(mapping, form, request, response);
			  if(noCerts == false){
				  session.setAttribute("noCerts", "noCertificates");
			  }else{
				  session.setAttribute("noCerts", "Certificates");
			  }
			  return mapping.findForward("tool");
	}
    
	public ActionForward reqform(ActionMapping mapping, 
			   ActionForm form, HttpServletRequest request, 
			   HttpServletResponse response) throws Exception {
			
			logger.info("Tools - Request Form Action *********");
			HttpSession session=request.getSession();
			actionErrors.clear();
			String cuid=(String)session.getAttribute("login");
			if ( (cuid == null) || (cuid.equals(null) || (cuid.equals(""))) ){
				  logger.error("Login Id in Edit Prof is null");
				  actionErrors.add("errMess", new ActionError("error.message"));
				  saveErrors(request, actionErrors);				  
				  return mapping.findForward("editProfAuthCheck");
			  }
			ArrayList appList=new ToolsDao().getAppList(cuid);         
			session.setAttribute("tool_appList", appList);       
			return mapping.findForward("reqform");
			}
	
	
	public ActionForward csrform(ActionMapping mapping, 
			   ActionForm form, HttpServletRequest request, 
			   HttpServletResponse response) throws Exception {
			 
			  //System.out.println("creat Pvt key calling");
			logger.info("Tools - CSR Form Action *********");
			return mapping.findForward("csrform");
			}
	
	public ActionForward creatCrt(ActionMapping mapping, 
			   ActionForm form, HttpServletRequest request, 
			   HttpServletResponse response) throws Exception {
			 
			  System.out.println("creat Pvt key calling");
			  logger.info("Tools - Create Cert Action *********");
			  return mapping.findForward("creatCrt");
			 }
	
	public ActionForward sendReq(ActionMapping mapping, 
			   ActionForm form, HttpServletRequest request, 
			   HttpServletResponse response) throws Exception {
	    	
		logger.info("Tools - Send Req Action ************");
		HttpSession session=request.getSession();	
		CMSToolForm toolForm = (CMSToolForm)form;
		actionErrors.clear();
		String cuid = (String)session.getAttribute("login");
		if ( (cuid == null) || (cuid.equals(null) || (cuid.equals(""))) ){
			  logger.error("Login Id in Edit Prof is null");
			  actionErrors.add("errMess", new ActionError("error.message"));
			  saveErrors(request, actionErrors);				  
			  return mapping.findForward("editProfAuthCheck");
		}
		try {
		    CmsMail cmsMail = new CmsMail();
		    String toList = null;
		    String fromList = cuid;
		    String subject = null;
		    String message = null;
		    String ccName = cuid;
		    String appName = null;
		    String appServer = null;
		    String aipCuid = null;
		    String notes = null;
		    
		    appName = toolForm.getAppName();
		    appServer = toolForm.getAppServer();
		    aipCuid = toolForm.getAipName();		    
		    notes = toolForm.getNotes();
		    toList = aipCuid.toUpperCase();	   
			String[] cclist = {ccName};
			subject = CMSProperties.getString("AIP_mail_sub");
			//message = toolForm.getMailMessage();
			message = "\n\n" + CMSProperties.getString("AIP_mail_body1") + " - " + appServer + "\n";
			message = message + "\n\n" + CMSProperties.getString("AIP_mail_body2") +
				"\n" + CMSProperties.getString("AIP_mail_body3") + 
				"\n" + CMSProperties.getString("AIP_mail_body4") +
				"\n" + CMSProperties.getString("AIP_mail_body5") +
				"\n" + CMSProperties.getString("AIP_mail_body6") +
				"\n" + CMSProperties.getString("AIP_mail_body7");
			message = message + "\n\n"+"NOTES from the Requester: "+notes+"\n\n"+"***This is an autogenerated mail.  Please do not reply. ***" ;
			//String fileAttachment =CMSProperties.getString("Script_path");
			String fileAttachment =CMSProperties.getString("searchScript");
			System.out.println("fileAttachment Location..... "+fileAttachment);
			cmsMail.sendMessWithAttach(subject, message, fromList, toList, cclist,fileAttachment);
			System.out.println("Sending mail........"+appName +appServer +aipCuid +subject+message);
			logger.debug("Tools -Send Req - Mail details for Req Form - "+appName +appServer +aipCuid +fromList +toList +cclist +subject +message);
	/*			 String from=(String)session.getAttribute("login")+"@qwest.com";
				String to=(String)request.getParameter("aipCuid");
				// String to="ipatan";
				 String subject="HI run the script";
				 String body=" "+(String)request.getParameter("note");
				 CmsMail cmsMail=new CmsMail();
				 System.out.println("Before sending mail");
				 try{
				cmsMail.sendMessage(subject, body, from, to);
				 }catch(Exception e){
				     System.out.println(" i exp "+e.getMessage());
				     e.printStackTrace();
				 }
				  System.out.println("sendReq is calling"+request.getParameter("AppName")+" "+request.getParameter("note"));
	*/		 return mapping.findForward("susMsg");		
			}catch (Exception e) {
			logger.error("Exception in Send Request "+e.getMessage());
			actionErrors.add("error", new ActionMessage("error.mail"));
			saveErrors(request, actionErrors);
			return mapping.findForward("editProfAuthCheck");
			}
	    
	}
	
	public ActionForward genKeypair(ActionMapping mapping, 
			   ActionForm form, HttpServletRequest request, 
			   HttpServletResponse response) throws Exception {
		
			   logger.info("Tools - Generate Key Pair ***********");
			   try {
				   CMSToolForm keyForm=(CMSToolForm)form;
		           KeyPair keyPair=null;
				   actionErrors.clear();

				   if(keyForm.getKeyAlg().toString().equals("RSA")){
					   keyPair= KeyPairUtil.generateKeyPair(KeyPairType.RSA, 1024);
				   }else if(keyForm.getKeyAlg().toString().equals("DSA")){
					   //System.out.println(" in DSA");
				       keyPair= KeyPairUtil.generateKeyPair(KeyPairType.DSA, 1024); 
				  }
				  System.out.println("creat Pvt key calling"+keyForm.getKeyAlg()+"  "+keyForm.getKeyName()+"  "+keyForm.getKeySize());
				  System.out.println(" key pair public key "+keyPair.getPublic()+"\n private key ==>"+keyPair.getPrivate());
				  HttpSession session=request.getSession();
				  ArrayList info=new ArrayList();
				  info.add("'"+keyForm.getKeyName()+"' Key Pair has been Generated Successfully ");
				  session.setAttribute("info", info);
				  return mapping.findForward("keyform");
			    }catch (Exception e) {
					logger.error("Exception in genKeypair "+e.getMessage());
					actionErrors.add("error", new ActionError("error.request"));
					saveErrors(request, actionErrors);
					return mapping.findForward("editProfAuthCheck");
			    }	           
		 }
	
	public ActionForward creatCsr(ActionMapping mapping, 
			   ActionForm form, HttpServletRequest request, 
			   HttpServletResponse response) throws Exception {
	           CMSToolForm csrForm=(CMSToolForm)form;
	           try {
	        	   KeyPair keyPair=null;
		           PKCS10CertificationRequest csr=null;
		           HttpSession session=request.getSession();
		           actionErrors.clear();
		           String cuid=(String)session.getAttribute("login");
		           if ( (cuid == null) || (cuid.equals(null) || (cuid.equals(""))) ){
						  logger.error("Login Id in Edit Prof is null");
						  actionErrors.add("errMess", new ActionError("error.message"));
						  saveErrors(request, actionErrors);				  
						  return mapping.findForward("editProfAuthCheck");
					  }
		           /// System.out.println("creatNewCsr calling  "+csrForm.getCert_validity());
		           String temp="E="+csrForm.getEmail()+",C="+csrForm.getCountry()+",ST="+csrForm.getState()+",L="+csrForm.getLocName()+",O="+csrForm.getOrgName()+",OU="+csrForm.getOrgUnit()+",CN="+csrForm.getComName();
		           X509Name subject = new X509Name(temp);
		           if(csrForm.getSigAlgorithm().equals("RSA")){
				   keyPair= KeyPairUtil.generateKeyPair(KeyPairType.RSA, 1024);
				   csr=new PKCS10CertificationRequest("MD2withRSA", subject, keyPair.getPublic(), null,keyPair.getPrivate());
		           }
		           if(csrForm.getSigAlgorithm().equals("DSA")){
					   keyPair= KeyPairUtil.generateKeyPair(KeyPairType.DSA, 1024);
					   csr=new PKCS10CertificationRequest("SHA1withDSA", subject, keyPair.getPublic(), null,keyPair.getPrivate());
			       }			  
			        //X509Name subject = new X509Name("E=ipatan@qwest.com,C=US,ST=UKP,L=US,O=QWEST,OU=localhost,CN=localhost");
			       	
		        	           
			        new ExportUtil().exportHeadCsrOnlyPem(csr,cuid);		        
			        ArrayList tempcsr=new ArrayList();
			        tempcsr.add(csr);
				session.setAttribute("tempcsr", tempcsr);
							
				/*String createdCsr = ExportUtil.readCsr(cuid);
				System.out.println("============================== "+createdCsr);
				*/
				
					//System.out.println(" csr has been created");
					return mapping.findForward("dispCsr");	          
	   			}catch (Exception e) {
	   				logger.error("Exception in Creat Csr "+e.getMessage());
	   				actionErrors.add("error", new ActionError("error.request"));
	   				saveErrors(request, actionErrors);
	   				return mapping.findForward("editProfAuthCheck");
	   			}
	}	
	
	public ActionForward createCsrFile(ActionMapping mapping, 
		   ActionForm form, HttpServletRequest request, 
		   HttpServletResponse response) throws Exception {
	    
	    System.out.println("------------- pubkey --------------- "+request.getParameter("pubkey"));
		
	    	StringBuffer csrBuffer = new StringBuffer("============ Certificate Signing Request ============");
		csrBuffer.append("\n");
		
		String csvData = request.getParameter("pubkey");
		response.setContentType("application/x-x509-ca-cert");
		response.setHeader ("Content-Disposition", "attachment; filename=csr.der");
              	//response.addHeader("Content-Disposition", "attachment;filename=csr.txt");
              	response.setContentLength(csvData.getBytes().length);
		OutputStream os = response.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os);
		osw.write(csvData);
		osw.flush();
		osw.close();
		os.close();
		
		
	    	return mapping.findForward("dispCsr");
	}
	
	public ActionForward creatSSCrt(ActionMapping mapping, 
			   ActionForm form, HttpServletRequest request, 
			   HttpServletResponse response) throws Exception {
		
			   logger.info("Tools - Create SS Cert *********");
	           CMSToolForm csrForm=(CMSToolForm)form;
	           HttpSession session=request.getSession();
	           actionErrors.clear();
	           String cuid=(String)session.getAttribute("login");
	           if ( (cuid == null) || (cuid.equals(null) || (cuid.equals(""))) ){
					  logger.error("Login Id in Edit Prof is null");
					  actionErrors.add("errMess", new ActionError("error.message"));
					  saveErrors(request, actionErrors);				  
					  return mapping.findForward("editProfAuthCheck");
				  }
	           KeyPair keyPair=null;
	           KeyFactory rsaKeyFac=null;
	           X509Certificate crt=null;
	           try{ 
				 //System.out.println("creatNewcrt calling  ==>"+csrForm.getCert_validity());
				// KeyPair keyPair= KeyPairUtil.generateKeyPair(KeyPairType.DSA, 1024);
			 
			 
	        	   if(csrForm.getPubKey()!=null&&csrForm.getPriKey()!=null){
	        		   byte []pubKeyBit=csrForm.getPubKey().getBytes();
	        		   byte []priKeyBit=csrForm.getPriKey().getBytes();
	        		   X509EncodedKeySpec pubkeySpec = new X509EncodedKeySpec(pubKeyBit);
	        		   X509EncodedKeySpec prikeySpec = new X509EncodedKeySpec(priKeyBit);
	        		   if(csrForm.getSigAlgorithm().equals("RSA")){
	        			   rsaKeyFac = KeyFactory.getInstance("RSA");
	        			   DSAPublicKey pubKey = (DSAPublicKey )rsaKeyFac.generatePublic(pubkeySpec);
	        			   DSAPrivateKey priKey=(DSAPrivateKey)rsaKeyFac.generatePrivate(prikeySpec);
	        			   crt=X509CertUtil.generateCert(csrForm.getComName(),csrForm.getOrgUnit(),csrForm.getOrgName(),csrForm.getLocName(),
	        			   csrForm.getState(),csrForm.getCountry(),csrForm.getEmail(),
			               Integer.parseInt(csrForm.getCert_validity()),pubKey,priKey,SignatureType.RSA_MD2);
	        		   }
	        		   if(csrForm.getSigAlgorithm().equals("DSA")){
	        			   rsaKeyFac = KeyFactory.getInstance("DSA");
	        			   RSAPublicKey pubKey = (RSAPublicKey )rsaKeyFac.generatePublic(pubkeySpec);
	        			   RSAPrivateKey priKey=(RSAPrivateKey)rsaKeyFac.generatePrivate(prikeySpec);
	        			   crt=X509CertUtil.generateCert(csrForm.getComName(),csrForm.getOrgUnit(),csrForm.getOrgName(),csrForm.getLocName(),
				           csrForm.getState(),csrForm.getCountry(),csrForm.getEmail(),
				           Integer.parseInt(csrForm.getCert_validity()),pubKey,priKey,SignatureType.DSA_SHA1);
	        		   }
	        	   	   }else if(csrForm.getSigAlgorithm().equals("DSA")){
	        	   		   keyPair= KeyPairUtil.generateKeyPair(KeyPairType.DSA, 1024);		   
			 
	        	   		   //String temp="E="+csrForm.getEmail()+",C="+csrForm.getCountry()+",ST="+csrForm.getState()+",L="+csrForm.getLocName()+",O="+csrForm.getOrgName()+",OU="+csrForm.getOrgUnit()+",CN="+csrForm.getComName();
	        	   		   //X509Name subject = new X509Name("E=ipatan@qwest.com,C=US,ST=UKP,L=US,O=QWEST,OU=localhost,CN=localhost");
	        	   		   // X509Name subject = new X509Name(temp);
			 
	        	   		   crt=X509CertUtil.generateCert(csrForm.getComName(),csrForm.getOrgUnit(),csrForm.getOrgName(),csrForm.getLocName(),
	        	   				   csrForm.getState(),csrForm.getCountry(),csrForm.getEmail(),
	        	   				   Integer.parseInt(csrForm.getCert_validity()),keyPair.getPublic(),keyPair.getPrivate(),SignatureType.DSA_SHA1);
	        	   		   // X509Certificate crt=X509CertUtil.generateCert("localhost","localhost","QWEST","US",  "UKP","US","ipatan@qwest.com",365,keyPair.getPublic(),keyPair.getPrivate(),            SignatureType.DSA_SHA1);
	        	   	   }else if(csrForm.getSigAlgorithm().equals("RSA")){
	        	   		   keyPair= KeyPairUtil.generateKeyPair(KeyPairType.RSA, 1024);
	        	   		   crt=X509CertUtil.generateCert(csrForm.getComName(),csrForm.getOrgUnit(),csrForm.getOrgName(),csrForm.getLocName(),
	        	   				   csrForm.getState(),csrForm.getCountry(),csrForm.getEmail(),
	        	   				   Integer.parseInt(csrForm.getCert_validity()),keyPair.getPublic(),keyPair.getPrivate(),SignatureType.RSA_MD2);
	        	   	   }
	        	   		// System.out.println("creatNewcrt calling 2 ==>"+csrForm.getCert_validity());
	        	   		new ExportUtil().exportHeadCertOnlyPem(crt,cuid);		        
	        	   		ArrayList tempcrt=new ArrayList();
	        	   		tempcrt.add(crt);
	        	   		session.setAttribute("tempcrt", tempcrt);
	        	   		System.out.println(" csr has been created");
	        	   		logger.debug("Tools - Create SS Cert - CSR has been created. ");
	        	   		actionErrors.clear();
	        	   		return mapping.findForward("dispCrt");
	           		}catch(CryptoException crtExp){
	           			System.out.println(" Exception in creatSSCrt "+crtExp.getMessage());
	           			crtExp.printStackTrace();
	           			logger.error("Exception in Creat Csr "+crtExp.getMessage());
		   				actionErrors.add("error", new ActionError("error.request"));
		   				saveErrors(request, actionErrors);
		   				return mapping.findForward("editProfAuthCheck");
	           			//return mapping.findForward("dispCrt");
	           		}
	           		catch(Exception ex){
	        		  System.out.println(" creatSSCrt "+ex.getMessage());
	        		  ex.printStackTrace();
	        		  logger.error("Exception in Creat Csr "+ex.getMessage());
		   			  actionErrors.add("error", new ActionError("error.request"));
		   			  saveErrors(request, actionErrors);
		   			  return mapping.findForward("editProfAuthCheck");
	        		  //return mapping.findForward("dispCrt");
	           		}
	           		//  PKCS10CertificationRequest csr=new PKCS10CertificationRequest(csrForm.getSigAlgorithm(), subject, keyPair1.getPublic(), null,keyPair1.getPrivate());
		        
	}
	
	public ActionForward impPvtKey(ActionMapping mapping, 
			   ActionForm form, HttpServletRequest request, 
			   HttpServletResponse response) throws Exception {
	      	
			logger.info("Tools -- Import Private Key **********");
			CMSToolForm csrForm=(CMSToolForm)form;
			System.out.println("creat Pvt key calling");
			return mapping.findForward("impPvtKey");
	}
	
	public ActionForward creatNewCsrFromOld(ActionMapping mapping, 
			   ActionForm form, HttpServletRequest request, 
			   HttpServletResponse response) throws Exception {
		      
			 System.out.println("creat Pvt key calling");
			 logger.info("Tools -- Create New CSR from Old **********");
			 return mapping.findForward("crsFromCrt");
	}
	public ActionForward creatNewCsrtFromOld(ActionMapping mapping, 
			   ActionForm form, HttpServletRequest request, 
			   HttpServletResponse response) throws Exception {
		      
			 System.out.println("creat Pvt key calling");
			 logger.info("Tools -- Create New CSR from Old **********");
			 return mapping.findForward("crstFromCrt");
	}
	
	public ActionForward addCertToAcc(ActionMapping mapping, 
		   ActionForm form, HttpServletRequest request, 
		   HttpServletResponse response) throws Exception {
	      
		 System.out.println("creat Pvt key calling");
		 logger.info("Tools -- Create New CSR from Old **********");
		 return mapping.findForward("addcert");
}
	
	public ActionForward getCertDetails(ActionMapping mapping, 
               ActionForm form, HttpServletRequest request, 
               HttpServletResponse response) throws Exception {
        
        logger.info("Tools -- Add certificate to my account **********");
        System.out.println("Inside addCerttoac --------------");
        try{ 
            CMSToolForm cmsForm=(CMSToolForm)form;
            System.out.println("reaching...");
            HttpSession session=request.getSession();
            String serialNo = (String) session.getAttribute("serialNo");
            String loginId = (String) session.getAttribute("login");
            ParseX509Certificate parsedCrt=null;
            actionErrors.clear();
            GenericDAO dao=new GenericDAO();
            String status=null;

            if(cmsForm.getCrtfile()!=null){
                try {
                   
                   session.removeAttribute("noFile");
                    FormFile myFile = cmsForm.getCrtfile();
		    System.out.println(" file name is --- "+myFile+"  "+myFile.getFileName());
		    String contentType = myFile.getContentType();
		    String fileName    = myFile.getFileName();
		    System.out.println("fileName in cmsForm.getCrtfile()!=null ..... "+fileName);
		    
		      
		    session.setAttribute("fileName",fileName);
		    int fileSize       = myFile.getFileSize();
		    FileOutputStream fos = null;
		    InputStream fin = null;         
		    byte[] fileData  = myFile.getFileData();
		    fin = myFile.getInputStream();
		    int byteCount = 0;
		    //String temp=CMSProperties.getString("CSR_file_path1")+fileName;
		  //Production 
		    String temp = CMSProperties.getString("readDir")+fileName;
		    File tempFile = new File(temp);
		    fos = new FileOutputStream(tempFile);
		    session.setAttribute("tempFile", tempFile);
		    	while ((byteCount = fin.read(fileData, 0, fileData.length)) > -1){ 
	            	//use full read() method for GZIPInputStream to be treated correctly
	                fos.write(fileData, 0, byteCount); 
	            }
		    	fos.close();
		    try {
			parsedCrt =new ParseX509Certificate(tempFile);
			System.out.println("Version 22==> "+parsedCrt.getVersion());
			System.out.println("Subject: -->" +parsedCrt.getSubject("Subject"));
			System.out.println("SubjectDN : "+parsedCrt.getSubjectDN());
			System.out.println("Subject :EmailAddress "+parsedCrt.getSubject("EmailAddress"));
			System.out.println("Subject :CN " +parsedCrt.getSubject("CN"));
			System.out.println("Subject :OU " +parsedCrt.getSubject("OU"));
			System.out.println("Subject :O " +parsedCrt.getSubject("O"));
			System.out.println("Subject :L " +parsedCrt.getSubject("L"));
			System.out.println("Subject :ST " +parsedCrt.getSubject("ST"));
			System.out.println("Subject :C " +parsedCrt.getSubject("C"));
			System.out.println("IssuerDN: " +parsedCrt.getIssuerDN());
			System.out.println("Issuer:EmailAddress " +parsedCrt.getIssuer("EmailAddress"));
			System.out.println("Issuer :CN" +parsedCrt.getIssuer("CN"));
			System.out.println("Issuer :OU " +parsedCrt.getIssuer("OU"));
			System.out.println("Issuer :O  " +parsedCrt.getIssuer("O"));
			System.out.println("Issuer :L " +parsedCrt.getIssuer("L"));
			System.out.println("Issuer :ST " +parsedCrt.getIssuer("ST"));
			System.out.println("Issuer :C " +parsedCrt.getIssuer("C"));
			System.out.println("Version: "+parsedCrt.getVersion());
			System.out.println("SerialNumber: "+parsedCrt.getSerialNumber(4, ' '));
			System.out.println("SigAlgOID :"+parsedCrt.getSigAlgOID());
			System.out.println("from date: "+parsedCrt.getNotBefore());
			System.out.println("To date: "+parsedCrt.getNotAfter());
			System.out.println("hashcode: "+parsedCrt.hashCode());
			System.out.println("SigAlgName: "+parsedCrt.getSigAlgName());
			System.out.println("SigAlgParams: "+parsedCrt.getSigAlgParams());
			System.out.println("Signature : "+parsedCrt.getSignature());
			System.out.println();
			System.out.println("public Key: "+parsedCrt.getPublicKey());
			System.out.println();
			System.out.println("cetificate : "+parsedCrt.toString());
		    } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		    }
            
		    	CMSBO bo=new CMSBO();;
		  
			bo.setSubject_DN(parsedCrt.getSubjectDN());
			bo.setCert_version(parsedCrt.getVersion());
			bo.setSubject(parsedCrt.getSubject("EmailAddress"));
			bo.setSubject_CN(parsedCrt.getSubject("CN"));
			bo.setSubject_OU(parsedCrt.getSubject("OU"));
			bo.setSubject_O(parsedCrt.getSubject("O"));
			bo.setSubject_L(parsedCrt.getSubject("L"));
			bo.setSubject_S(parsedCrt.getSubject("ST"));
			bo.setSubject_C(parsedCrt.getSubject("C"));
			bo.setIssuer(parsedCrt.getIssuerDN());
			bo.setIssuer_E(parsedCrt.getIssuer("EmailAddress"));
			bo.setIssuer_CN(parsedCrt.getIssuer("CN"));
			bo.setIssuer_OU(parsedCrt.getIssuer("OU"));
			bo.setIssuer_O(parsedCrt.getIssuer("O"));
			bo.setIssuer_L(parsedCrt.getIssuer("L"));
			bo.setIssuer_S(parsedCrt.getIssuer("ST"));
			bo.setIssuer_C(parsedCrt.getIssuer("C"));
			bo.setSerialNo(parsedCrt.getSerialNumber(4, ' '));
			bo.setID(parsedCrt.getSigAlgOID());
			bo.setNotBefore(parsedCrt.getNotBefore());
			bo.setNotAfter(parsedCrt.getNotAfter());
			bo.setHashCode(parsedCrt.hashCode());
			bo.setSignature_algo(parsedCrt.getSigAlgName());
			bo.setSigAlgParams(parsedCrt.getSigAlgParams());
			bo.setSignature(parsedCrt.getSignature());
			bo.setPublic_key(parsedCrt.getPublicKey());
			bo.setCertificate(parsedCrt.toString());
			String certOwner=(String)session.getAttribute("login");
		        bo.setCert_owner(certOwner);

		    DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		    java.util.Date date = new java.util.Date();
		    String datetime = dateFormat.format(date);
		    System.out.println("Current Date Time : " + datetime);
		    
		    
		    String compName="QWEST";
		    bo.setCompany_name(compName);
		    
		    /*if(parsedCrt.getNotAfter()<datetime){
		        status="ACTIVE";
		        bo.setCert_status(status);
		    }else{
		        status="EXPIRED";
		        bo.setCert_status(status);
		    }*/
		    
		    
		    String date1=parsedCrt.getNotAfter();
	            System.out.println("date1: " +date1);
	              
	                       
	              int compresultm=date1.substring(0,1).compareTo(datetime.substring(0,1));
	              int compresultd=date1.substring(3,4).compareTo(datetime.substring(3,4));
	              int compresulty=date1.substring(6,9).compareTo(datetime.substring(6,9));
	              
	              if(compresulty>0)
	              {
	                  status="ACTIVE";  
	              }
	              else{
	                  status="EXPIRED"; 
	              }
	              
	              if(compresulty==0)
	              {
	               if(compresultm>0){
	                   status="ACTIVE";  
	               }
	               else{
	                   status="EXPIRED";     
	               }
	                  
	              }
	              
	              if((compresulty==0)&&(compresultm>0)){
	 
	                  if(compresultd>0){
	                      status="ACTIVE";  
	                  }
	                  else{
	                      status="EXPIRED";     
	                  }
	                     
	                    
	              }
		    
		    
		   // status="EXPIRED";
		    bo.setCert_status(status.toUpperCase());
		    System.out.println("status ===> "+status);
		    
		    ArrayList parsedCrtList=new ArrayList();
		    parsedCrtList.add(bo);
		    session.setAttribute("parsedCrtList", parsedCrtList);
		    System.out.println("parsedCrtList size ---- "+parsedCrtList.size());
		    
		    ArrayList appList=new ArrayList();
		    ArrayList acroList=new ArrayList();
		    ArrayList sortedList=new ArrayList();
		    
		    String appAcroNymList="SELECT DISTINCT APPLICATION_NAME, ACRONYM FROM "+CmsDbTable.TBL_CMS_MAL+"";
		    HashMap map = (HashMap)dao.getAppAcroList(appAcroNymList);
		    session.setAttribute("map", map);
		    System.out.println("Map Size in ToolAction ====> "+map.size());
		    
		    Set appSet = map.keySet();
		    Iterator setItr = appSet.iterator();
		    
		          while (setItr.hasNext()) {
		        	  sortedList.add(setItr.next());
		          }
		          java.util.Collections.sort(sortedList);
		          
		          Iterator it = sortedList.iterator();
		 
		    
			while(it.hasNext()){
			    String appName= it.next().toString();
			    CMSBO cmsbo = new CMSBO();
			    	cmsbo.setAppName(appName);
			    	appList.add(cmsbo);
				
			    	ArrayList acroList1 = (ArrayList)map.get(appName);
				for(int i=0;i<acroList1.size();i++){
				CMSBO cms = new CMSBO();
				cms.setAppName(appName);
				cms.setAcronym(acroList1.get(i).toString());
				acroList.add(cms);
				}
			    			    
			}
			System.out.println("appList size --------------- "+appList.size());
			session.setAttribute("appList",appList);
			session.setAttribute("acroList",acroList);
			session.removeAttribute("acroName");
       
        }catch (Exception e) {
            logger.error("Exception in CreatNewCsr "+e.getMessage());
            System.out.println("forwarding to toolerror");
           // actionErrors.add("error", new ActionError(e.getMessage()));
            actionErrors.add("errMess", new ActionError("error.invalidFile"));
            saveErrors(request, actionErrors);
            return mapping.findForward("toolError");
        }
   }else if(cmsForm.getCrttest()!=null){
      
       String crtTxt=cmsForm.getCrttest();
       session.setAttribute("crtTxt", crtTxt);
              
       try {
            parsedCrt =new ParseX509Certificate(crtTxt);
            /*System.out.println("Version 22==> "+parsedCrt.getVersion());
        //  System.out.println("Subject: -->" +parsedCrt.getSubject("Subject"));
            System.out.println("SubjectDN : "+parsedCrt.getSubjectDN());
            System.out.println("Subject :EmailAddress "+parsedCrt.getSubject("EmailAddress"));
            System.out.println("Subject :CN " +parsedCrt.getSubject("CN"));
            System.out.println("Subject :OU " +parsedCrt.getSubject("OU"));
            System.out.println("Subject :O " +parsedCrt.getSubject("O"));
            System.out.println("Subject :L " +parsedCrt.getSubject("L"));
            System.out.println("Subject :ST " +parsedCrt.getSubject("ST"));
            System.out.println("Subject :C " +parsedCrt.getSubject("C"));
            System.out.println("IssuerDN: " +parsedCrt.getIssuerDN());
            System.out.println("Issuer:EmailAddress " +parsedCrt.getIssuer("EmailAddress"));
            System.out.println("Issuer :CN" +parsedCrt.getIssuer("CN"));
            System.out.println("Issuer :OU " +parsedCrt.getIssuer("OU"));
            System.out.println("Issuer :O  " +parsedCrt.getIssuer("O"));
            System.out.println("Issuer :L " +parsedCrt.getIssuer("L"));
            System.out.println("Issuer :ST " +parsedCrt.getIssuer("ST"));
            System.out.println("Issuer :C " +parsedCrt.getIssuer("C"));
            System.out.println("Version: "+parsedCrt.getVersion());
            System.out.println("SerialNumber: "+parsedCrt.getSerialNumber(4, ' '));
            System.out.println("SigAlgOID :"+parsedCrt.getSigAlgOID());
            System.out.println("from date: "+parsedCrt.getNotBefore());
            System.out.println("To date: "+parsedCrt.getNotAfter());
            System.out.println("hashcode: "+parsedCrt.hashCode());
            System.out.println("SigAlgName: "+parsedCrt.getSigAlgName());
            System.out.println("SigAlgParams: "+parsedCrt.getSigAlgParams());
            System.out.println("Signature : "+parsedCrt.getSignature());
            System.out.println();
            System.out.println("public Key: "+parsedCrt.getPublicKey());
            System.out.println();
            System.out.println("cetificate : "+parsedCrt.toString());*/
            } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            }
            
            CMSBO bo=new CMSBO();;
          
            bo.setSubject_DN(parsedCrt.getSubjectDN());
            bo.setCert_version(parsedCrt.getVersion());
            bo.setSubject(parsedCrt.getSubject("EmailAddress"));
            bo.setSubject_CN(parsedCrt.getSubject("CN"));
            bo.setSubject_OU(parsedCrt.getSubject("OU"));
            bo.setSubject_O(parsedCrt.getSubject("O"));
            bo.setSubject_L(parsedCrt.getSubject("L"));
            bo.setSubject_S(parsedCrt.getSubject("ST"));
            bo.setSubject_C(parsedCrt.getSubject("C"));
            bo.setIssuer(parsedCrt.getIssuerDN());
            bo.setIssuer_E(parsedCrt.getIssuer("EmailAddress"));
            bo.setIssuer_CN(parsedCrt.getIssuer("CN"));
            bo.setIssuer_OU(parsedCrt.getIssuer("OU"));
            bo.setIssuer_O(parsedCrt.getIssuer("O"));
            bo.setIssuer_L(parsedCrt.getIssuer("L"));
            bo.setIssuer_S(parsedCrt.getIssuer("ST"));
            bo.setIssuer_C(parsedCrt.getIssuer("C"));
            bo.setSerialNo(parsedCrt.getSerialNumber(4, ' '));
            bo.setID(parsedCrt.getSigAlgOID());
            bo.setNotBefore(parsedCrt.getNotBefore());
            bo.setNotAfter(parsedCrt.getNotAfter());
            bo.setHashCode(parsedCrt.hashCode());
            bo.setSignature_algo(parsedCrt.getSigAlgName());
            bo.setSigAlgParams(parsedCrt.getSigAlgParams());
            bo.setSignature(parsedCrt.getSignature());
            bo.setPublic_key(parsedCrt.getPublicKey());
            bo.setCertificate(parsedCrt.toString());
            String certOwner=(String)session.getAttribute("login");
                bo.setCert_owner(certOwner);

            DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            java.util.Date date = new java.util.Date();
            String datetime = dateFormat.format(date);
            System.out.println("Current Date Time : " + datetime);
            
            
            String compName=CMSProperties.getString("compName");
            bo.setCompany_name(compName);
          
            String date1=parsedCrt.getNotAfter();
            System.out.println("date1: " +date1);
              
            
                  int compresultm=date1.substring(0,1).compareTo(datetime.substring(0,1));
                  int compresultd=date1.substring(3,4).compareTo(datetime.substring(3,4));
                  int compresulty=date1.substring(6,9).compareTo(datetime.substring(6,9));
                  
                  if(compresulty>0)
                  {
                      status="ACTIVE";  
                  }
                  else{
                      status="EXPIRED"; 
                  }
                  
                  if(compresulty==0)
                  {
                   if(compresultm>0){
                       status="ACTIVE";  
                   }
                   else{
                       status="EXPIRED";     
                   }
                      
                  }
                  
                  if((compresulty==0)&&(compresultm>0)){
     
                      if(compresultd>0){
                          status="ACTIVE";  
                      }
                      else{
                          status="EXPIRED";     
                      }
            }
        
            bo.setCert_status(status.toUpperCase());
            System.out.println("status ===> "+status);
            
            ArrayList parsedCrtList=new ArrayList();
            parsedCrtList.add(bo);
            session.setAttribute("parsedCrtList", parsedCrtList);
            System.out.println("parsedCrtList size ---- "+parsedCrtList.size());
            
            ArrayList appList=new ArrayList();
            ArrayList acroList=new ArrayList();
            
            String appAcroNymList="SELECT DISTINCT APPLICATION_NAME, ACRONYM FROM D_TBL_CMS_MAL";
            HashMap map = (HashMap)dao.getAppAcroList(appAcroNymList);
            session.setAttribute("map", map);
            System.out.println("Map Size in ToolAction ====> "+map.size());
            
            Set appSet = map.keySet();
            Iterator it = appSet.iterator();
            while(it.hasNext()){
                String appName= it.next().toString();
                CMSBO cmsbo = new CMSBO();
                    cmsbo.setAppName(appName);
                    appList.add(cmsbo);
                
                    ArrayList acroList1 = (ArrayList)map.get(appName);
                for(int i=0;i<acroList1.size();i++){
                CMSBO cms = new CMSBO();
                cms.setAppName(appName);
                cms.setAcronym(acroList1.get(i).toString());
                acroList.add(cms);
                }
                                
            }
            System.out.println("appList size --------------- "+appList.size());
            session.setAttribute("appList",appList);
        
                 
           session.setAttribute("noFile","FileName is NULL ..");
           System.out.println("FileName is NULL ..");
              
            session.setAttribute("acroList",acroList);
            session.removeAttribute("acroName");
    
        }
 } catch (Exception e) {
        logger.error("Exception in CreatNewCsr "+e.getMessage());
        actionErrors.add("error", new ActionError("error.invalidFile"));
        saveErrors(request, actionErrors);
        return mapping.findForward("toolError");
    }
    return mapping.findForward("getattributes"); 
    }
  

	public ActionForward getAcroNym(ActionMapping mapping, 
		ActionForm form, HttpServletRequest request, 
		HttpServletResponse response) throws Exception {
	    
	    System.out.println("inside getAcroNym =========== ");
	    String appName = request.getParameter("appName");
	    System.out.println("appName ======================= "+appName);
	    ArrayList acroList = new ArrayList();
	    String acroName=null;
	    HttpSession session = request.getSession();
	    HashMap map = (HashMap)session.getAttribute("map");
	    System.out.println("Map size in getAppNAme action ================== "+map.size());
	    CMSBO bo = new CMSBO();
	    bo.setAppName(appName);
	    	ArrayList acroList2 = (ArrayList)map.get(appName);
		for(int i=0;i<acroList2.size();i++){
			CMSBO cms = new CMSBO();
			cms.setAppName(appName);
			cms.setAcronym(acroList2.get(i).toString());
			acroList.add(cms);
			System.out.println("acroList2 ########## "+cms.getAcronym());
			acroName=cms.getAcronym();
		}
		
		System.out.println("acroName ouside loop "+acroName);
		/*String fileName=(String)session.getAttribute("fileName");
		System.out.println("fileName ........ "+fileName);
		session.setAttribute("file", "setNullValue");*/
		session.setAttribute("acroName", acroName);
		//session.setAttribute("acroList", acroList);
	    
	    return mapping.findForward("getattributes");
	}
	
  
    public ActionForward addCertToHome(ActionMapping mapping, 
               ActionForm form, HttpServletRequest request, 
                   HttpServletResponse response) throws Exception {
            try{ 
        	System.out.println("Inside AddCert ========================");
                CMSToolForm cmsForm = (CMSToolForm)form;
                HttpSession session=request.getSession();
                actionErrors.clear();
             
                String appName=(String)request.getParameter("appName");
                String netPin=(String)request.getParameter("netPin");
                String acroNym=(String)request.getParameter("acroNym");
                System.out.println("application name ==============> " +appName);
                System.out.println("netpin =========> " +netPin);
                System.out.println("acroNym =============> "+acroNym);
                String status=null;
                String rawCert=null;
                GenericDAO dao=new GenericDAO();
                
               CMSBO cmsbo=new CMSBO();
               
               try {
		HashMap map = (HashMap)com.qwest.cms.utils.NETGroupDataClient.getGroupPinDetails(netPin);
		   session.setAttribute("netmap", map);
	    
		  String fileName=(String)session.getAttribute("fileName");
		   System.out.println("fileName from session... "+fileName);
		  		   
		   if(session.getAttribute("noFile")!=null){
		       fileName=(String)request.getParameter("fileName");
		       System.out.println("fileName from request ... "+fileName);
		   }
		   
		   
                if(appName!=null && netPin!=null && fileName!=null){
                    rawCert=appName + "#" + acroNym + "#" + netPin + "#" +fileName ;
                    cmsbo.setRaw_certificate(rawCert);
                    System.out.println("rawcert in function action "+rawCert);
                }
                else{
                    rawCert="NONE";
                    cmsbo.setRaw_certificate(rawCert);
                    System.out.println("rawCert is NONE ----");
                }
            
                try {
		   // String tempFile=(String)session.getAttribute("tempFile");
		  //  System.out.println("tempFile......... "+tempFile);
		    
                    String crtTxt=(String)session.getAttribute("crtTxt");
		    System.out.println("crtTxt ... "+crtTxt);
		    
		    Writer output = null;
		    File file = new File(CMSProperties.getString("CSR_file_path1")+fileName);
		    
		    //Production 
            // File file = new File(CMSProperties.getString("readDir")+fileName);
		    
		    output = new BufferedWriter(new FileWriter(file));
		    output.write(crtTxt);
		    output.close();
		    System.out.println("Your file has been written");
		} catch (Exception e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		} 
              
                String subjectDN=null;
                String certVersion=null;
                String subject=null;
                String subject_CN=null;
                String subject_OU=null;
                String subject_O=null;
                String subject_L=null;
                String subject_S=null;
                String subject_C=null;
                String issuer=null;
                String issuer_E=null;
                String issuer_CN=null;
                String issuer_OU=null;
                String issuer_O=null;
                String issuer_L=null;
                String issuer_S=null;
                String issuer_C=null;
                String serialNo=null;
                String sigAlgOID=null;
                String notBefore=null;
                String notAfter=null;
                int hashCode = 0;
                String signature_algo=null;
                String sigAlgParams=null;
                String signature=null;
                String public_key=null;
                String certificate=null;
                String certStatus=null;
                String compName=null;
                String certOwner=null;
                
                
                ArrayList parsedCrt=(ArrayList)session.getAttribute("parsedCrtList");
                System.out.println("parsedCrt Array in ToolAction "+parsedCrt.size());
                
                
                DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		    java.util.Date date = new java.util.Date();
		    String datetime1 = dateFormat.format(date);
		    System.out.println("Current Date Time : " + datetime1);
		    Date date1=dateFormat.parse(datetime1);
		    System.out.println("After Parsing ==== "+date1);
		    SimpleDateFormat sdfDestination = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");
		    String datetime = sdfDestination.format(date1);
		    System.out.println("After Convering ===== "+datetime);
		    
		    String cert_status="";
	    
		    for(int i=0;i<parsedCrt.size();i++){
	                    CMSBO bo = (CMSBO)parsedCrt.get(i);
	                    subjectDN= bo.getSubject_DN();
	                    certVersion= bo.getCert_version();
	                    subject= bo.getSubject();
	                    subject_CN =bo.getSubject_CN();
	                    subject_OU=bo.getSubject_OU();
	                    subject_O=bo.getSubject_O();
	                    subject_L=bo.getSubject_L();
	                    subject_S=bo.getSubject_S();
	                    subject_C=bo.getSubject_C();
	                    issuer=bo.getIssuer();
	                    issuer_E=bo.getIssuer_E();
	                    issuer_CN=bo.getIssuer_CN();
	                    issuer_OU=bo.getIssuer_OU();
	                    issuer_O=bo.getIssuer_O();
	                    issuer_L=bo.getIssuer_L();
	                    issuer_S=bo.getIssuer_S();
	                    issuer_C=bo.getIssuer_C();
	                    serialNo=bo.getSerialNo();
	                    sigAlgOID=bo.getID();
	                    notBefore=bo.getNotBefore();
	                    notAfter=bo.getNotAfter();
	                    hashCode=bo.getHashCode();
	                    signature_algo=bo.getSignature_algo();
	                    sigAlgParams=bo.getSigAlgParams();
	                    signature=bo.getSignature();
	                    public_key=bo.getPublic_key();
	                    certificate=bo.getCertificate();
	                    certStatus=bo.getCert_status();
	                    compName=bo.getCompany_name();
	                    certOwner=bo.getCert_owner();
	                    
	                }                     
	                System.out.println("serialNo of Cert ... "+serialNo);
            
		   try {
	     if(!notAfter.equals("") || !notAfter.equals(null)){
		    if(!montht && !dayt){
		    	  System.out.println("reaching first if");  
		    	  compresultm=notAfter.substring(0,1).compareTo(datetime.substring(0,2));
		    	  compresultd=notAfter.substring(2,3).compareTo(datetime.substring(3,5));
		    	  compresulty=notAfter.substring(4,8).compareTo(datetime.substring(6,10));
		      }
		      else if(montht && !dayt){
		    	  System.out.println("reaching second if"); 
		    	      compresultm=notAfter.substring(0,2).compareTo(datetime.substring(0,2));
		              compresultd=notAfter.substring(3,4).compareTo(datetime.substring(3,5));
		              compresulty=notAfter.substring(5,9).compareTo(datetime.substring(6,10));  
		      }
		      
		      else if(!montht && dayt){
		    	  System.out.println("reaching third if"); 
		    	  compresultm=notAfter.substring(0,1).compareTo(datetime.substring(0,2));
		              compresultd=notAfter.substring(2,4).compareTo(datetime.substring(3,5));
		              compresulty=notAfter.substring(5,9).compareTo(datetime.substring(6,10));  
		      }
		      
		      else if(montht && dayt){
		    	  System.out.println("reaching fourth if"); 
		    	      compresultm=notAfter.substring(0,2).compareTo(datetime.substring(0,2));
		              compresultd=notAfter.substring(3,5).compareTo(datetime.substring(3,5));
		              compresulty=notAfter.substring(6,10).compareTo(datetime.substring(6,10));  
		      }
         
		    if(compresulty>0){
		        cert_status="ACTIVE";  
		    }
		    else{
		        cert_status="EXPIRED"; 
		    }
   
		    if(compresulty==0)
		    {
		        if(compresultm>0){
		    	cert_status="ACTIVE";  
		        }
		        else{
		    	cert_status="EXPIRED";     
		        }           
		    }
   
		    if((compresulty==0)&&(compresultm==0)){
		        if(compresultd>0){
		    	cert_status="ACTIVE";  
		        }
		        else{
		    	cert_status="EXPIRED";     
		        }
		    }
		    cmsbo.setCert_status(cert_status);
		    System.out.println("CertStatus in addCertToHome ToolAction *********** "+cert_status);
		    
	     }
		    
		} catch (RuntimeException e) {
		    System.out.println("exception in cmsToolAction "+e.getMessage());
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		} 
                
              
		    System.out.println("Version 22==> "+certVersion);
		    System.out.println("SubjectDN : "+subjectDN);
		    System.out.println("Subject :EmailAddress "+subject);
		    System.out.println("Subject :CN " +subject_CN);
		    System.out.println("Subject :OU " +subject_OU);
		    System.out.println("Subject :O " +subject_O);
		    System.out.println("Subject :L " +subject_L);
		    System.out.println("Subject :ST " +subject_S);
		    System.out.println("Subject :C " +subject_C);
		    System.out.println("IssuerDN: " +issuer);
		    System.out.println("Issuer:EmailAddress " +issuer_E);
		    System.out.println("Issuer :CN" +issuer_CN);
		    System.out.println("Issuer :OU " +issuer_OU);
		    System.out.println("Issuer :O  " +issuer_O);
		    System.out.println("Issuer :L " +issuer_L);
		    System.out.println("Issuer :ST " +issuer_S);
		    System.out.println("Issuer :C " +issuer_C);
		    System.out.println("SerialNumber: "+serialNo);
		    System.out.println("SigAlgOID :"+sigAlgOID);
		    System.out.println("from date: "+notBefore);
		    System.out.println("To date: "+notAfter);
		    System.out.println("hashcode: "+hashCode);
		    System.out.println("SigAlgName: "+signature_algo);
		    System.out.println("SigAlgParams: "+sigAlgParams);
		    System.out.println("Signature : "+signature);
		    System.out.println("public Key: "+public_key);
		    System.out.println("certStatus: "+cert_status);
		    System.out.println("cetificate : "+certificate); 
		    System.out.println("compName : "+compName); 
		    System.out.println("CertOwner: "+certOwner);
                      
                String checkCertDetails = "select * from "+CmsDbTable.TBL_CMS_CERT_DETAILS+" where SERIALNO = '"+serialNo+"'";    
                System.out.println("checkCertDetails Query ======= "+checkCertDetails);
                
                ArrayList strArr=(ArrayList)dao.getCertDetailsData(checkCertDetails);
                System.out.println("strArr size from CERT_DETAILS table   "+strArr.size());
                
                if(strArr.size()>0){
                    System.out.println("Duplicate Entry of Serial No... ");
                    System.out.println("Inserting it to TBL_CMS_CERTIFICATES... ");
                    logger.info("Duplicate Entry of Serial No in TBL_CMS_CERT_DETAILS... ");
                    logger.info("Inserting it to TBL_CMS_CERTIFICATES... ");
                    
                 // Inserting into D_TBL_CMS_CERTIFICATES table
                    
                  String certSeqNoQuery="select max(CERT_SEQ_NU +1) from "+CmsDbTable.TBL_CMS_CERTIFICATES+"";
                   // String certSeqNoQuery="select max(CERT_SEQ_NU +1) from TBL_CMS_CERTIFICATES";
                    String certSeqNo=dao.getAcronym(certSeqNoQuery);
                    System.out.println("certSeqNo ----------- >> "+certSeqNo);
                    
                    String hostID=(String)request.getParameter("hostID");
                    String hostIP="1.1.1.1";
                    String certNickName=(String)request.getParameter("certNickName");
                    String certType="EXTERNAL";
                    String notes=(String)request.getParameter("notes");
                    String certPathServer=(String)request.getParameter("certPathServer");
                    String alarmFlag="TO BE DONE";
                    certStatus = cert_status;
                               
                    String insertCertDetailsQuery="INSERT INTO "+CmsDbTable.TBL_CMS_CERTIFICATES+" values  (" +
                    //String insertCertDetailsQuery="INSERT INTO TBL_CMS_CERTIFICATES values  (" +
                    "'"+appName+"'," +
                    "'"+acroNym+"'," +      
                    "'"+hostID+"'," +
                    "'"+hostIP+"'," +
                    "'"+serialNo+"'," +
                    "'"+issuer+"'," +
                    "'"+certOwner+"'," +
                    "'"+certNickName+"'," +
                    "to_date('"+datetime+"','MM-DD-YYYY  HH24:MI:SS')," +
                    "to_date('"+notAfter+"','MM-DD-YYYY  HH24:MI:SS')," +
                    "'"+certStatus+"'," +
                    "'"+certSeqNo+"'," +
                    "'"+certType+"'," +
                    "'"+certOwner+"'," +
                    "'"+notes+"'," +
                    "'"+certPathServer+"'," +
                    "'"+alarmFlag+"')" ;
                    
                    System.out.println("insertCertDetailsQuery ===========> "+insertCertDetailsQuery);
                   dao.insertCertDet(insertCertDetailsQuery);
                       System.out.println("insert successful"); 
                    
                }else{
              
            String insertCertQuery="INSERT INTO "+CmsDbTable.TBL_CMS_CERT_DETAILS+" values  (" +
            //String insertCertQuery="INSERT INTO TBL_CMS_CERT_DETAILS values  (" +
            "'"+rawCert+"'," +
            "'"+serialNo+"'," +      
            "'"+certOwner+"'," +
            "'"+compName+"'," +
            "'"+certStatus+"'," +
            "'"+certVersion+"'," +
            "'"+subjectDN+"'," +
            "'"+subject_CN+"'," +
            "'"+subject_O+"'," +
            "'"+subject_OU+"'," +
            "'"+subject_L+"'," +
            "'"+subject_S+"'," +
            "'"+subject_C+"'," +
            "'"+subject+"'," +
            "'"+issuer+"'," +
            "'"+issuer_CN+"'," +
            "'"+issuer_O+"',"+
            "'"+issuer_OU+"'," +
            "'"+issuer_L+"'," +
            "'"+issuer_S+"'," +
            "'"+issuer_C+"'," +
            "'"+issuer_E+"'," +
            "'"+public_key+"'," +
            "'"+signature_algo+"'," +
            "'"+signature+"'," +
            "to_date('"+notBefore+"','MM-DD-YYYY  HH24:MI:SS')," +
            "to_date('"+notAfter+"','MM-DD-YYYY  HH24:MI:SS')," +
            "to_date('"+datetime+"','MM-DD-YYYY  HH24:MI:SS')," +
            "to_date('"+datetime+"','MM-DD-YYYY  HH24:MI:SS') )" ;
            
               
             System.out.println("insertCertQuery ---> "+insertCertQuery);
             dao.insertCertDet(insertCertQuery);
               
             // Inserting into D_TBL_CMS_CERTIFICATES table
             
             String certSeqNoQuery="select max(CERT_SEQ_NU +1) from "+CmsDbTable.TBL_CMS_CERTIFICATES+"";
             //String certSeqNoQuery="select max(CERT_SEQ_NU +1) from TBL_CMS_CERTIFICATES";
             String certSeqNo=dao.getAcronym(certSeqNoQuery);
             System.out.println("certSeqNo ----------- >> "+certSeqNo);
             
             String hostID=(String)request.getParameter("hostID");
             String hostIP="1.1.1.1";
             String certNickName=(String)request.getParameter("certNickName");
             String certType="EXTERNAL";
             String notes=(String)request.getParameter("notes");
             String certPathServer=(String)request.getParameter("certPathServer");
             String alarmFlag="TO BE DONE";
             
                          
             String insertCertDetailsQuery="INSERT INTO "+CmsDbTable.TBL_CMS_CERTIFICATES+" values  (" +
             //String insertCertDetailsQuery="INSERT INTO TBL_CMS_CERTIFICATES values  (" +
             "'"+appName+"'," +
             "'"+acroNym+"'," +      
             "'"+hostID+"'," +
             "'"+hostIP+"'," +
             "'"+serialNo+"'," +
             "'"+issuer+"'," +
             "'"+certOwner+"'," +
             "'"+certNickName+"'," +
             "to_date('"+datetime+"','MM-DD-YYYY  HH24:MI:SS')," +
             "to_date('"+notAfter+"','MM-DD-YYYY  HH24:MI:SS')," +
             "'"+certStatus+"'," +
             "'"+certSeqNo+"'," +
             "'"+certType+"'," +
             "'"+certOwner+"'," +
             "'"+notes+"'," +
             "'"+certPathServer+"'," +
             "'"+alarmFlag+"')" ;
             
             System.out.println("insertCertDetailsQuery ===========> "+insertCertQuery);
            dao.insertCertDet(insertCertDetailsQuery);
                System.out.println("insert successful"); 
               
               /*CMSAction cms=new CMSAction();
               return cms.certInAccount(mapping, form, request, response);
               */
                }
             } catch (Exception exception) {
			if(exception.getMessage().indexOf("NullPointerException")!=-1){
			logger.error("NET-PIN is INCORRECT");
			actionErrors.clear();
			actionErrors.add("errMessnet", new ActionError("error.netpin"));
			saveErrors(request, actionErrors);
			System.out.println("Net Tool Pin is not valid");
			return mapping.findForward("toolError");
			}
				
		    else{
			  exception.printStackTrace();
			  logger.error("NET-PIN is INCORRECT");
			  System.out.println("Inside else block... "+exception.getMessage());
			  actionErrors.add("errMessnet", new ActionError("error.netpin"));
			  saveErrors(request, actionErrors);
			  return mapping.findForward("toolError");
			  
		    }
	}           
          
            }catch (Exception e) {
        	System.out.println("Inside else block.......................... "+e.getMessage());
                logger.error("Exception in CreatNewCsr "+e.getMessage());
                actionErrors.add("error", new ActionError(e.getMessage()));
                saveErrors(request, actionErrors);
                return mapping.findForward("editProfAuthCheck");
            }  
            //return mapping.findForward("home");
            CMSAction cms=new CMSAction();
	    return cms.certInAccount(mapping, form, request, response);
        }

    public ActionForward loadCertFromExcel(ActionMapping mapping, 
		   ActionForm form, HttpServletRequest request, 
		   HttpServletResponse response) throws Exception {
	
		System.out.println("Inside loadCertFromExcel ");
		return mapping.findForward("loadCerts");
    }
    
    public ActionForward loadFromExcel(ActionMapping mapping, 
		   ActionForm form, HttpServletRequest request, 
		   HttpServletResponse response) throws Exception {
	
	try {
		System.out.println("inside loadFromExcel $$$$$$$$$$$$$$$$$$$$$");
		/*String path=(String)request.getParameter("path");
		System.out.println("path ------> "+path);*/
		
		    actionErrors.clear();
		    CMSToolForm cmsForm=(CMSToolForm)form;
		    FormFile myFile = cmsForm.getXlFile();
		    System.out.println("File name is --- "+myFile+"  "+myFile.getFileName());
		    HttpSession session=request.getSession();
		
		    if(myFile.getFileName().equals("")){
			  System.out.println("Invalid File...");
			  logger.info("Invalid File.....");
			  actionErrors.add("errMess", new ActionError("error.invalidFile"));
		          saveErrors(request, actionErrors);
		          return mapping.findForward("toolError");
		    }
		    
		    int fileSize = myFile.getFileSize();
		    FileOutputStream fos = null;
		    InputStream fin = null;         
		    byte[] fileData  = myFile.getFileData();
		    fin = myFile.getInputStream();
		    int byteCount = 0;
		    String temp=CMSProperties.getString("tempfile");
		    File tempFile = new File(temp);
		    fos = new FileOutputStream(tempFile);
		    while ((byteCount = fin.read(fileData, 0, fileData.length)) > -1){ 
		        	fos.write(fileData, 0, byteCount); 
		    }
		    fos.close();
    
		     ArrayList list=new ArrayList();
    //  BufferedReader inputStream = new BufferedReader(new FileReader("C:/shilpa.txt"));
		    BufferedReader inputStream = new BufferedReader(new FileReader(tempFile));
		    String line;
		    GenericDAO dao=new GenericDAO();
		    
		     String reqID="";
		     String reqName="";
		     String binaryCert="";
		     String certTemp="";
		     String serialNo="";
		     String certEffDate="";
		     String certExpDate="";
		     String issuedCountry="";
		     String issuedOrg="";
		     String issuedOrgUnit="";
		     String issuedCommonName="";
		     String issuedCity="";
		     String issuedState="";
		     String issuedEmail="";
		     String status="";
		     String alarmFlag="";
		     
		     DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		     java.util.Date date = new java.util.Date();
		    String datetime = dateFormat.format(date);
		    System.out.println("Current Date Time : " + datetime);
		    
		   
		        while ((line = inputStream.readLine())!= null){
		            //sb.append(line) ;
		           System.out.println("******************************** "+line);
		           String[] elements=line.split(",");
		           CMSToolForm cms=new CMSToolForm();
		           
		           if(elements.length>0)
		    	   cms.setReqID(elements[0]);
		           if(elements.length>1)
		    	   cms.setReqName(elements[1]);
		           if(elements.length>2)
		    	   cms.setBinaryCert(elements[2]);
		           if(elements.length>3)
		    	   cms.setCertTemp(elements[3]);
		           if(elements.length>4)
		    	   cms.setSerialNo(elements[4]);
		           if(elements.length>5)
		    	   cms.setCertEffDate(elements[5]);
		           if(elements.length>6)
		    	   cms.setCertExpDate(elements[6]);
		           if(elements.length>7)
		    	   cms.setIssuedCountry(elements[7]);
		           if(elements.length>8)
		    	   cms.setIssuedOrg(elements[8]);
		           if(elements.length>9)
		    	   cms.setIssuedOrgUnit(elements[9]);
		           if(elements.length>10)
		    	   cms.setIssuedCommonName(elements[10]);
		           if(elements.length>11)
		    	   cms.setIssuedCity(elements[11]);
		           if(elements.length>12)
		    	   cms.setIssuedState(elements[12]);
		           if(elements.length>13)
		    	   cms.setIssuedEmail(elements[13]);
		           
		           System.out.println("cms.getCertExpDate() =====> "+cms.getCertExpDate());
		           
		           if(elements.equals("")){
		               System.out.println("Elements in Excel contains some null values &&&&&&&&&&&&&&&&&");
		           }
		           
		    		           		
		           try {	                           	        	   
		           
			    if(!cms.getCertExpDate().equals("") || !cms.getCertExpDate().equals(null)){
				
			          /*int compresultm=cms.getCertExpDate().substring(0,1).compareTo(datetime.substring(0,1));
			              int compresultd=cms.getCertExpDate().substring(3,4).compareTo(datetime.substring(3,4));
			              int compresulty=cms.getCertExpDate().substring(6,9).compareTo(datetime.substring(6,9));
			              
			              if(compresulty>0){
			                  status="ACTIVE";  
			              }
			              else{
			                  status="EXPIRED"; 
			              }
			              
			              if(compresulty==0)
			              {
			               if(compresultm>0){
			                   status="ACTIVE";  
			               }
			               else{
			                   status="EXPIRED";     
			               }
			                  
			              }
			              
			              if((compresulty==0)&&(compresultm>0)){
  
			                  if(compresultd>0){
			                      status="ACTIVE";  
			                  }
			                  else{
			                      status="EXPIRED";     
			                  }
			              }*/
				    
				/*    String expDate=cms.getCertExpDate();
				    System.out.println("expdate from bean ........ "+expDate);
				    System.out.println("Current Date Time : " + datetime);
				    
				    Date d1=null;
				    Date d2=null;
					
					try {
					    DateFormat df = new SimpleDateFormat("mm/dd/yyyy");
					    d1 = df.parse(expDate);
					    d2 = df.parse(datetime);
					    System.out.println("d1 after parsing "+d1);
					    System.out.println("d2 after parsing "+d2);
					} catch (ParseException e) {
					    // TODO Auto-generated catch block
					    e.printStackTrace();
					}

					if (d1.equals(d2))
					      status = "ACTIVE";
					else if (d1.before(d2))
					      status = "EXPIRED";
					else
					      status = "ACTIVE";

				System.out.println("The status of cert is ... "+status);
			            cms.setStatus(status);  
			      }*/
			      
			     // System.out.println("the date is h****** .... "+cms.getCertExpDate());
		        	   if(!(cms.getCertExpDate().equals("Certificate Expiration Date"))){
		        		    
		        	   String[]dateafter=cms.getCertExpDate().split(" ");
		        	   System.out.println("the split string is h****** .... "+dateafter[0]);
		        	   System.out.println("the lenght is "+cms.getCertExpDate().length());
		        	   System.out.println("the split string is h****** .... "+dateafter[0].length());
		        	   String[]datefinal=dateafter[0].split("/");
		        	   System.out.println(datefinal[0]);
		        	   System.out.println(datefinal[1]);
		        	   System.out.println(datefinal[2]);
		        	   int monlen=datefinal[0].length();
		        	   
		        	   int daylen=datefinal[1].length();
		        	   System.out.println("monlen value is "+monlen);
		        	   System.out.println("daylen value is "+daylen);
		        	   if(monlen ==1){
		        		   montht=false; 
		        	   }else if(monlen ==2){
		        		   montht=true;    
		        	   }
		        	   if(daylen ==1){
		        		   dayt=false; 
		        	   }else if(daylen ==2){
		        		   dayt=true;    
		        	   }else{
		        		   dayt=false;  
		        		   montht=false; 
		        	   }
		        	   System.out.println("the flag values month " +montht ); 
	        		   System.out.println("the flag values day " +dayt );  
		        	   }
		        	   
		        		  
		        		  if(!montht && !dayt){
		        			  System.out.println("reaching first if");  
		        			compresultm=cms.getCertExpDate().substring(0,1).compareTo(datetime.substring(0,2));
		        			compresultd=cms.getCertExpDate().substring(2,3).compareTo(datetime.substring(3,5));
		        			compresulty=cms.getCertExpDate().substring(4,8).compareTo(datetime.substring(6,10));
		        		  }
		        		  else if(montht && !dayt){
		        			  System.out.println("reaching second if"); 
		        			  compresultm=cms.getCertExpDate().substring(0,2).compareTo(datetime.substring(0,2));
					          compresultd=cms.getCertExpDate().substring(3,4).compareTo(datetime.substring(3,5));
					          compresulty=cms.getCertExpDate().substring(5,9).compareTo(datetime.substring(6,10));  
		        		  }
		        		  
		        		  else if(!montht && dayt){
		        			  System.out.println("reaching third if"); 
		        			  compresultm=cms.getCertExpDate().substring(0,1).compareTo(datetime.substring(0,2));
					          compresultd=cms.getCertExpDate().substring(2,4).compareTo(datetime.substring(3,5));
					          compresulty=cms.getCertExpDate().substring(5,9).compareTo(datetime.substring(6,10));  
		        		  }
		        		  
		        		  else if(montht && dayt){
		        			  System.out.println("reaching fourth if"); 
		        			  compresultm=cms.getCertExpDate().substring(0,2).compareTo(datetime.substring(0,2));
					          compresultd=cms.getCertExpDate().substring(3,5).compareTo(datetime.substring(3,5));
					          compresulty=cms.getCertExpDate().substring(6,10).compareTo(datetime.substring(6,10));  
		        		  }
			              if(compresulty>0){
			                  status="ACTIVE";  
			              }
			              else{
			                  status="EXPIRED"; 
			              }
			              
			              if(compresulty==0)
			              {
			               if(compresultm>0){
			                   status="ACTIVE";  
			               }
			               else{
			                   status="EXPIRED";     
			               }
			                  
			              }
			              
			              if((compresulty==0)&&(compresultm==0)){
  
			                  if(compresultd>0){
			                      status="ACTIVE";  
			                  }
			                  else{
			                      status="EXPIRED";     
			                  }
			              }
			            cms.setStatus(status);  
			      } 
			      
			} catch (NullPointerException e) {
			    // TODO Auto-generated catch block
			    e.printStackTrace();
			    logger.info("NullPointerException ..... "+e.getMessage());
			}
		           
		           
		           list.add(cms); 
		        }
		        
		        StringBuffer csvBuffer = new StringBuffer("RequestID , RequesterName, SerialNumber, Certificate Effective Date, Certificate Expiration Date, Issued Country/Region, Issued Organization, Issued Organization Unit, Issued Common Name, Issued City, Issued State");
			csvBuffer.append("\n");
			String csvFileData="";
		        
		        for(int i=1;i<list.size();i++){
		        try{
		            CMSToolForm bean=(CMSToolForm)list.get(i);
		            reqID=bean.getReqID();
		            reqName=bean.getReqName().toUpperCase();
		            binaryCert=bean.getBinaryCert();
		            certTemp=bean.getCertTemp();
		            serialNo=bean.getSerialNo();
		            certEffDate=bean.getCertEffDate();
		            certExpDate=bean.getCertExpDate();
		            issuedCountry=bean.getIssuedCountry();
		            issuedOrg=bean.getIssuedOrg();
		            issuedOrgUnit=bean.getIssuedOrgUnit();
		            issuedCommonName=bean.getIssuedCommonName().toUpperCase();
		            issuedCity=bean.getIssuedCity();
		            issuedState=bean.getIssuedState();
		            issuedEmail=bean.getIssuedEmail();
		            status=bean.getStatus();
		            alarmFlag="TO BE DONE";
		         		        
		            System.out.println("status .... "+status);
		            
		            certEffDate= certEffDate.substring(0, 14);
		            certExpDate=certExpDate.substring(0, 14);
		            
		            if((reqName.indexOf('\\'))!=-1){
		    	    	System.out.println("String contains AD\\ ... "+reqName);
		    	    	reqName= reqName.substring(reqName.lastIndexOf("\\")+1,reqName.length()).toUpperCase();
		    	    	System.out.println("Substring... "+reqName);
		    	    
		    		}
		          
		            if(reqID.equals("") || reqName.equals("")|| serialNo.equals("") || certEffDate.equals("")|| certExpDate.equals("") || issuedCountry.equals("")
		        	 || issuedOrg.equals("")|| issuedOrgUnit.equals("")|| issuedCommonName.equals("") || issuedCity.equals("")
		        	 || issuedState.equals("") ){
		        	
		        	System.out.println("Excel contains some NULL values ");
		        			        	
				csvBuffer.append(reqID+","+reqName+","+serialNo+","+certEffDate+","+certExpDate+","+issuedCountry+","+issuedOrg+","+issuedOrgUnit+","+issuedCommonName+","+issuedCity+","+issuedState+"");
				csvBuffer.append("\n");
				   
				csvFileData = csvBuffer.toString();
		                System.out.println("csvFileData length ************* "+csvFileData.length());
		
		            }else{	        	
		            
		        	String insertQuery="INSERT INTO "+CmsDbTable.LOAD_CERTS_FROM_EXCEL+" values  (" +
		                "'"+reqID+"'," +
		                "'"+reqName+"'," +      
		                "'"+binaryCert+"'," +
		                "'"+certTemp+"'," +
		                "'"+serialNo+"'," +
		                "to_date('"+certEffDate+"','MM-DD-YYYY  HH24:MI:SS')," +
		                "to_date('"+certExpDate+"','MM-DD-YYYY  HH24:MI:SS')," +
		                "'"+issuedCountry+"'," +
		                "'"+issuedOrg+"'," +
		                "'"+issuedOrgUnit+"'," +
		                "'"+issuedCommonName+"'," +
		                "'"+issuedCity+"'," +
		                "'"+issuedState+"'," +
		                "'"+issuedEmail+"'," +
		                "'"+status+"',"+
		                "'"+alarmFlag+"')" ;
		    	    
		        	System.out.println("insertQuery  ---> "+insertQuery);
		                dao.insertCertDet(insertQuery);
		            
		                session.setAttribute("loadAck", "The Data Has Been Loaded SuccessFully ...");
		            }
		           
		        	}catch(NullPointerException nullexp){
		                System.out.println(" having null");
		        	} 		        			        	
		        }
		        System.out.println("csvFileData size outside for loooooooop ********* "+csvFileData.length());
		        
		        if(csvFileData.length()>0){
	        	    //FileWriter fstream = new FileWriter("C:\\unread.csv");
		            String cuid=(String)session.getAttribute("login");
		       //    FileWriter fstream = new FileWriter("C:\\ExcelWithNullValues_"+cuid+".csv");
		           FileWriter fstream = new FileWriter(CMSProperties.getString("excelNullDataPath")+"_"+cuid+".csv");
	        	    BufferedWriter out = new BufferedWriter(fstream);
	        	    System.out.println("writing values to csv");
	        	    out.write(csvFileData);
	        	    out.flush();
    			    out.close();
    			    
    			    System.out.println("Null values are written in excel... sending mail $$$$$$$$$$$$ ");
    			    CmsMail cmsMail = new CmsMail();
    			    String toList = "jrearde";
    			    String fromList = "cmsAdmin@qwest.com";
    			    String subject = "Excel Containing NULL Values";
    			    String message = "Please find the attachment";
    			    String[] cclist = {"sxram12","nkganes", "hxkuma5"};
    			    
    			    
    			//String fileAttachment ="C:\\ExcelWithNullValues_"+cuid+".csv";
    			String fileAttachment =CMSProperties.getString("excelNullDataPath")+"_"+cuid+".csv";
    			System.out.println("fileAttachment Location..... "+fileAttachment);
			cmsMail.sendMessWithAttach(subject, message, fromList, toList, cclist,fileAttachment);
    			System.out.println("@@@@@@@@@@@@ Mail Sent @@@@@@@@@@@@@@@@@@@");
    			    
	        	}
		} catch (Exception e) {
			logger.error("Exception in Reading File ");
			e.printStackTrace();
			System.out.println(" exp == "+e.getMessage());
			actionErrors.add("error", new ActionError("error.invalidFile"));
			saveErrors(request, actionErrors);
			return mapping.findForward("toolError");
		}
		return mapping.findForward("tool");
    }
    
       
    public ActionForward creatNewCsr(ActionMapping mapping, 
			   ActionForm form, HttpServletRequest request, 
			   HttpServletResponse response) throws Exception {
		
		logger.info("Tools -- Create New CSR **********");
	    try{ 
	    	CMSToolForm cmsForm=(CMSToolForm)form;
	    	ParseX509Certificate parsedCrt=null;
        	actionErrors.clear();

	        if(cmsForm.getCrtfile()!=null){
	        	FormFile myFile = cmsForm.getCrtfile();
	        	System.out.println(" file is ss there or not "+myFile+"  "+myFile.getFileName());
	        	String contentType = myFile.getContentType();
	        	String fileName    = myFile.getFileName();
	        	int fileSize       = myFile.getFileSize();
	        	FileOutputStream fos = null;
	        	InputStream fin = null;		    
		    	byte[] fileData    = myFile.getFileData();
		    	fin = myFile.getInputStream();
		    	int byteCount = 0;
		    	String temp=CMSProperties.getString("tempfile");
		    	File tempFile = new File(temp);
		    	fos = new FileOutputStream(tempFile);
		    	while ((byteCount = fin.read(fileData, 0, fileData.length)) > -1){ 
	            	//use full read() method for GZIPInputStream to be treated correctly
	                fos.write(fileData, 0, byteCount); 
	            }
		    	fos.close();
		    	// System.out.println("creat Pvt key calling");
		    	System.out.println("success read tha crt");
		    	parsedCrt =new ParseX509Certificate(tempFile);
	        	}else if(cmsForm.getCrttest()!=null){
	        		String crtTxt=cmsForm.getCrttest();
	        		parsedCrt =new ParseX509Certificate(crtTxt);	             
	        	}
	        	logger.debug("Tools -- CreateNew Csr -- Parsing Cert "+parsedCrt);
	        	System.out.println(" paparsing "+parsedCrt.getSubjectCN());
	        	System.out.println(" subjet "+parsedCrt.getSubjectDN().toString());
	        	System.out.println(" subjet 2 "+parsedCrt.getSubjectC());
	        	KeyPair keyPair=KeyPairUtil.generateKeyPair(KeyPairType.RSA, 1024);
	        	if(parsedCrt.getSigAlgName().indexOf("RSA")!=-1){
			  	   keyPair= KeyPairUtil.generateKeyPair(KeyPairType.RSA, 1024);
	        	}else if(
	        		parsedCrt.getSigAlgName().indexOf("DSA")!=-1){
	        		keyPair= KeyPairUtil.generateKeyPair(KeyPairType.DSA, 1024);
	        	}
	        	// String temp="E="+csrForm.getEmail()+",C="+csrForm.getCountry()+",ST="+csrForm.getState()+",L="+csrForm.getLocName()+",O="+csrForm.getOrgName()+",OU="+csrForm.getOrgUnit()+",CN="+csrForm.getComName();
	        	X509Name subject = new X509Name(parsedCrt.getSubjectDN().toString());
	        	PKCS10CertificationRequest csr=new PKCS10CertificationRequest(parsedCrt.getSigAlgName(), subject, keyPair.getPublic(), null,keyPair.getPrivate());
	        	HttpSession session=request.getSession();
	        	String cuid=(String)session.getAttribute("login");
	        	if ( (cuid == null) || (cuid.equals(null) || (cuid.equals(""))) ){
					  logger.error("Login Id in Edit Prof is null");
					  actionErrors.add("errMess", new ActionError("error.message"));
					  saveErrors(request, actionErrors);				  
					  return mapping.findForward("editProfAuthCheck");
				  }
	        	new ExportUtil().exportHeadCsrOnlyPem(csr,cuid);
		      
	        	ArrayList tempNewcsr=new ArrayList();
	        	tempNewcsr.add(csr);
				session.setAttribute("tempNewcsr", tempNewcsr);
				// new ExportUtil().exportHeadCsrOnlyPem(csr,cuid);
				return mapping.findForward("dispNewCsr");
	      }catch(CertificateException e){
		        request.setAttribute("error", "invalid certificate data");
		        return mapping.findForward("crsFromCrt");
	      } catch (CMSBaseException e) {
				logger.error("Exception in CreatNewCsr  "+e.getMessage());
				actionErrors.add("db error", new ActionError("error.dbError"));
				saveErrors(request, actionErrors);
				return mapping.findForward("editProfAuthCheck");
			}catch (Exception e) {
				logger.error("Exception in CreatNewCsr "+e.getMessage());
				actionErrors.add("error", new ActionError(e.getMessage()));
				saveErrors(request, actionErrors);
				return mapping.findForward("editProfAuthCheck");
			}
	}
	
	public ActionForward creatNewCsrt(ActionMapping mapping, 
			   ActionForm form, HttpServletRequest request, 
			   HttpServletResponse response) throws Exception {
		
		logger.info("Tools -- Create New CSR **********");
	    try{ 
	    	CMSToolForm cmsForm=(CMSToolForm)form;
	    	HttpSession session=request.getSession();
	    	ParseX509Certificate parsedCrt=null;
     	actionErrors.clear();

	        if(cmsForm.getCrtfile()!=null){
	        	FormFile myFile = cmsForm.getCrtfile();
	        	System.out.println(" file is ss there or not "+myFile+"  "+myFile.getFileName());
	        	String contentType = myFile.getContentType();
	        	String fileName    = myFile.getFileName();
	        	int fileSize       = myFile.getFileSize();
	        	FileOutputStream fos = null;
	        	InputStream fin = null;		    
		    	byte[] fileData    = myFile.getFileData();
		    	fin = myFile.getInputStream();
		    	int byteCount = 0;
		    	String temp=CMSProperties.getString("tempfile");
		    	File tempFile = new File(temp);
		    	fos = new FileOutputStream(tempFile);
		    	while ((byteCount = fin.read(fileData, 0, fileData.length)) > -1){ 
	            	//use full read() method for GZIPInputStream to be treated correctly
	                fos.write(fileData, 0, byteCount); 
	            }
		    	fos.close();
		    	// System.out.println("creat Pvt key calling");
		    	System.out.println("success read tha crt");
		    	parsedCrt =new ParseX509Certificate(tempFile);
	        	}else if(cmsForm.getCrttest()!=null){
	        		String crtTxt=cmsForm.getCrttest();
	        		parsedCrt =new ParseX509Certificate(crtTxt);	             
	        	}
	        	
	        	session.setAttribute("parsedCrt", parsedCrt);
	        	return mapping.findForward("crtformpage");
	      }catch(CertificateException e){
		        request.setAttribute("error", "invalid certificate data");
		        return mapping.findForward("crsFromCrt");
	      } catch (CMSBaseException e) {
				logger.error("Exception in CreatNewCsr  "+e.getMessage());
				actionErrors.add("db error", new ActionError("error.dbError"));
				saveErrors(request, actionErrors);
				return mapping.findForward("editProfAuthCheck");
			}catch (Exception e) {
				logger.error("Exception in CreatNewCsr "+e.getMessage());
				actionErrors.add("error", new ActionError(e.getMessage()));
				saveErrors(request, actionErrors);
				return mapping.findForward("editProfAuthCheck");
			}
	}
	

	public ActionForward getPubKey(ActionMapping mapping, 
			   ActionForm form, HttpServletRequest request, 
			   HttpServletResponse response) throws Exception {
		
		 logger.info("Tools -- Get Public Key **********");
	     System.out.println(" before calling object of bean");
	     HttpSession session=request.getSession();
	     CMSToolForm bean=(CMSToolForm)form;
	     System.out.println("view pub Key calling  "+bean.getPubKeyCrtPath());
	     String path=bean.getPubKeyCrtPath();
/*//	 if(path.indexOf("\\")!=-1)
//			  path.replaceAll("\\", "/");
//			  System.out.println(" the exact path ==> "+path);
			  File filename=new File("C:/RMS/certsample/adfad.cer");
			//File filename=bean.getPubKeyCrt();
			  System.out.println(" file name ==> "+filename.getName());
			  FileInputStream fis = new FileInputStream(filename);
			  BufferedInputStream bis = new BufferedInputStream(fis);

			  CertificateFactory cf = CertificateFactory.getInstance("X.509");
			  //String pubKey = null;
			  while (bis.available() > 0) {
			      X509Certificate cert = (X509Certificate) cf.generateCertificate(bis);
			      System.out.println(" publi key ==> "+cert.getPublicKey());
			      ArrayList al=new ArrayList();
			      al.add(cert.getPublicKey());
                  session.setAttribute("pubKey", al);
			  }*/
			  // String pubkey= CertInfo.getPubKey(path);
			  String pubkey= new ParseX509Certificate(path).getPublicKey();
			  
			 ArrayList al=new ArrayList();
			 al.add(pubkey);
			 session.setAttribute("al", al);
			 System.out.println(" in action pubkey ="+pubkey);
			 logger.debug("Tools -- Get Pub Key - Pub Key is "+pubkey);
			 return mapping.findForward("viewPubKey");
		}
	
		
	
	
}
