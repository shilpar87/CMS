

package com.qwest.cms.action;

import java.security.KeyPair;
import java.security.cert.X509Certificate;
import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.util.MessageResources;
import org.bouncycastle.asn1.pkcs.CertificationRequestInfo;
import org.bouncycastle.asn1.x509.X509Name;
import org.bouncycastle.jce.PKCS10CertificationRequest;
import java.io.*;
import java.security.*;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Hashtable;
import com.qwest.cms.BO.BOClass;
import com.qwest.cms.BO.CMSBO;
import com.qwest.cms.actionForm.*;
import com.qwest.cms.utils.*;
import com.qwest.cms.dao.*;
/**
 * @author amanila
 *
 * Function Action -- This class deals with all the activities 
 * related to the Functions module of CMS.
 * Window - Preferences - Java - Code Style - Code Templates
 */


public class CMSFunctionAction extends  CMSAction {	
 
	Logger logger = Logger.getLogger(CMSFunctionAction.class);
	private X509Certificate     x509cert;
	private Principal           subject;
	private Hashtable           subjectTable;
	private Principal           issuer;
	private Hashtable           issuerTable;
	private String              notDefined;
	private String              rawCert;
	ActionErrors actionErrors = new ActionErrors();
	   	   	
	public ActionForward FMenu(ActionMapping mapping, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) throws Exception {				 
	   System.out.println("Transfer Cerficate Page**********");
	   logger.info("Function Action -----  Transfer Cerficate Page**********");
	   return mapping.findForward("FMenu");
				 
	}
		
	public ActionForward export(ActionMapping mapping, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) throws Exception {				 
		
		String eventName = "";
		String actionForward = "";
		HttpSession session = request.getSession();
		eventName = (String)request.getParameter(RequestKeys.EVENT_NAME);
		System.out.println(RequestKeys.EVENT_NAME);
		System.out.println("Export a Certificate**********");
		System.out.println(eventName+FunctionsUtil.FUNCTIONS_EXPORT);
		FuntionsDAO dao  = new FuntionsDAO();
		BOClass boObject = new BOClass();
		session = request.getSession();
		//String id=request.getParameter
		//session.getAttribute(Rawcert).toString());	
		System.out.println("object in Actino class for export "+boObject.getRawcert());
		//String ss =dao.getCertificate();
		//dao.getCertificate();
		CMSFunctionAction download = new CMSFunctionAction();
				System.out.println("values from database**********");
		  if(FunctionsUtil.FUNCTIONS_EXPORT.equals(eventName))
			 {
			  	
			  	System.out.println("In Export **Functions page*****");
			  	
			  	System.out.println("aruna==========Export functions==if==eventName==>"+eventName);
			  	//FuntionsDAO dao1  = new FuntionsDAO();
				//CMSFunctionForm form1=(CMSFunctionForm)form;
				//dao1.getCertificate();
				actionForward = FunctionsActionForwardKeys.FUNCTIONS_EXPORT;
			  	
			 }
	
		return mapping.findForward("export");
				 
	}
	
	public ActionForward doDownload(ActionMapping mapping, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) throws Exception {
	
		
		CMSFunctionForm form1=(CMSFunctionForm)form;
		String s = form1.getSelectCertType();
		System.out.println("checking in Action class for export Arunaaaaaaa INSIDE ************"+s);
		actionErrors.clear();
		//if (s.equals("binary"))
		//{
		try{
			System.out.println("comming to try block");
			HttpSession session = request.getSession();
			
				
			String seqnum =session.getAttribute("checkedRadioValue").toString();
			System.out.println("in dodown load  checkedRadioValue************"+seqnum);
			String cuid= session.getAttribute("login").toString();
			System.out.println("User Cuid in dodownload class**************"+cuid);
			CMSBO cmsbo = new CMSBO();
			String serial="";
			String issuer ="";
			if(session.getAttribute("DetailInfo") != null)
			{
				System.out.println("inside detailinfo-----");
				cmsbo=(CMSBO)session.getAttribute("DetailInfo");
				serial = cmsbo.getSerialNo();
				System.out.println("Serial Noin CMS Functions action class--"+serial);
				issuer = cmsbo.getIssuer();
				System.out.println("Issuer in CMS Functions action class----- "+issuer);	
				
			}			
			FuntionsDAO dao02 = new FuntionsDAO();
			String certfile=  dao02.getCertificate(cuid, seqnum,serial,issuer);
			System.out.println("File location in action ... "+certfile);
			//String certfile = "/opt/weblogic/user_projects/domains/CERTMGMT_PROD/applications/cms/crts/read_crts/csr.der";
			
			//String certfile="C:\\hplwp035#bin#VeriSign_TSA_CA.pem.1";
			System.out.println("checking file name in ation class"+certfile);
			System.out.println("printing file name ****************"+certfile);
			File   f  = new File(certfile);
			System.out.println("printing f "+f);	
			String fileType=certfile;	
									
			int size1 = fileType.lastIndexOf(".");
			System.out.println("Index of certificate*****"+fileType.lastIndexOf(".") );
			String substring = fileType.substring(size1);
			System.out.println("Substring after . extension "+substring);
			System.out.println("substring.length().... "+substring.length());
			
			if(substring.equalsIgnoreCase(".com")){
			    logger.error("This is a MSCert Certificate..");
			    System.out.println("This is a MSCert Certificate..");
			    actionErrors.add("error", new ActionError("error.msCertExportMessage"));
			    saveErrors(request, actionErrors);
			    return mapping.findForward("editProfAuthCheck");
			    
			}
	        
			//response.setContentType("application/pkix-cert");
			//response.setContentType("application/x-pkcs12");
			//response.setContentType("application/pkix-cert");
			//response.setHeader ("Content-Disposition", "attachment; filename=\f");
			
			else{
				FileInputStream fin = new FileInputStream(f);
				int size = fin.available();
			     	response.setContentLength(size);
				byte[] ab = new byte[size];
				OutputStream os = response.getOutputStream();
				
				
				if (substring.equalsIgnoreCase(".p12"))
				{
					System.out.println("fileType.trim().equalsIgnoreCase"+ fileType.trim().equalsIgnoreCase("p12"));
					response.setContentType("application/x-pkcs12");
					response.setHeader ("Content-Disposition", "attachment; filename="+cuid+"");
				}
				else if (substring.equalsIgnoreCase(".jks"))
				{
					response.setContentType("application/octet-stream");
					response.setHeader ("Content-Disposition", "attachment; filename="+cuid+".jks");
				}
				else if (substring.equalsIgnoreCase(".der"))
				{
					response.setContentType("application/x-x509-ca-cert");
					response.setHeader ("Content-Disposition", "attachment; filename="+cuid+".der");
					System.out.println("filename ... ");
				}
				else if (substring.equalsIgnoreCase(".pem"))
				{
					response.setContentType("application/octet-stream");
					response.setHeader ("Content-Disposition", "attachment; filename="+cuid+".pem");
				}
				else if (substring.equalsIgnoreCase(".p7b"))
				{
					response.setContentType("application/application/x-pkcs7-certificates");
					response.setHeader ("Content-Disposition", "attachment; filename="+cuid+".p7b");
				}				
				
				else 
				{
					response.setContentType("application/pkix-cert");
					response.setHeader ("Content-Disposition", "attachment; filename="+cuid+"");
				}
				
				int bytesread;
				do{
					bytesread = fin.read(ab,0,size);
					if(bytesread >-1)
						os.write(ab,0,bytesread );
					}while(bytesread >-1);
				fin.close();
				os.flush();
				os.close();
			
			
		/*else if (s.equals("Base-64"))
		{
			System.out.println("inside Base 64 *******");
			FuntionsDAO dao01 = new FuntionsDAO();
			String certfile = dao01.getCertificate();
			File   filename  = new File(certfile);
		    rawCert = s;
		    x509cert = null;
		    subject = null;
		    subjectTable = null;
		    issuer = null;
		    issuerTable = null;
		    notDefined = "NotDefined";
		    System.out.println(" filename.exists()  "+filename.exists());
		    if(filename.exists()){
		    	System.out.println("this is file");
		    }
		    try{
				  FileInputStream fis = new FileInputStream(new File("C:/Documents and Settings/aadeppa/Desktop/Base64.cer"));
			        BufferedInputStream bis = new BufferedInputStream(fis);
			        CertificateFactory cf = CertificateFactory.getInstance("X.509");
			        System.out.println("value of file issssss*****-----------01");
			         X509Certificate  x509cert = (X509Certificate)cf.generateCertificate(bis);
			        System.out.println("value of file issssss*****----------02");
			        new ExportUtil().exportHeadCertOnlyPem(x509cert);
			        //FileInputStream fi = new FileInputStream("C:/aruna.txt"); 
			        //InputStreamReader in = new InputStreamReader(fis, "UTF-8");
			         BufferedReader inputStream = null;
			         PrintWriter outputStream = null;
			         StringBuffer sb=new StringBuffer();
			         inputStream = new BufferedReader(new FileReader("C:/aruna.txt"));
			         String l;
			         while ((l = inputStream.readLine())!= null){
			     		sb.append(l) ;
			         }
			         System.out.println("Content of aruna.txt file in action class :-)"+sb);
			         
			         /* InputStream is = new ByteArrayInputStream(sb.toString().trim().getBytes());
			         Base64InputStream base64inputstream = new Base64InputStream(is);
			         System.out.println("Base-64 value in ACTION CLASS BY ARUNA"+base64inputstream.toString());
			         int i = ((InputStream) (base64inputstream)).available();
			         byte abyte0[] = new byte[i];
			         base64inputstream.read(abyte0, 0, abyte0.length);
			          CertificateFactory cf01 = CertificateFactory.getInstance("X.509");
			         x509cert = (X509Certificate)cf01.generateCertificate(base64inputstream);
			         System.out.println("x509cert");
			         is.close(); */
			         
			         //System.out.println(new BASE64Encoder().encode(new BASE64Decoder().decodeBuffer(sb.toString())));
			        
			         
			         /*File filename01=new File("C:/Documents and Settings/aadeppa/Desktop/DER.cer");
			         FileOutputStream fout=new FileOutputStream(new File("C:/dub.txt"));
			         FileInputStream fis01 = new FileInputStream(filename01);
			         InputStream is =new FileInputStream(filename01);
			         InputStream fis001 = new ByteArrayInputStream(sb.toString().trim().getBytes());
			         Base64InputStream base64inputstream = new Base64InputStream(fis001);
			         Base64InputStream base64inputstream01 = new Base64InputStream(fis01);
			         //String S= fis01.toString();
			         //String str=base64inputstream01.read().toString();
			         //System.out.println("The file content in the  *"+S);
			         System.out.println("Base 64 content *"+base64inputstream01); */
			         
			         
			         
			         // BufferedReader inputStream01 = null;
			        // PrintWriter outputStream01 = null; 
			         //inputStream = new BufferedReader(new FileReader(S));
			       //  outputStream01 =new PrintWriter(new FileWriter("base64.cer"));
			         //System.out.println("content ofoutputStream01 "+outputStream01);
			        // String n;
			        /* while ((n = inputStream.readLine()) != null) {
			                         outputStream.println(n) ;
			                  }
			                  outputStream.println ( n);*/  
			         //File base64file = new File(base64inputstream01);
			         //outputStream01.println(S) ; 

					}
				}catch(Exception exp){
				    System.out.println("Exception in function action....");
					System.out.println(" in exp == "+exp.getMessage());
					exp.printStackTrace();
					return mapping.findForward("doDownload");
				}
			
				CMSAction cms = new CMSAction(); 
				return cms.certInAccount(mapping, form, request, response);
				//return mapping.findForward("home");	
	
	}		
	
	public ActionForward renewCert(ActionMapping mapping, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) throws Exception {				 
				  
		System.out.println("Renewal of a Certificate**********");		
		logger.info("Function Action ----- Renewal of a Certificate**********");
		System.out.println("renewal=======================");
		MessageResources messageResources = getResources(request); 
		HttpSession session = request.getSession();
		CMSFunctionForm functionForm = (CMSFunctionForm)form; 
		CMSBO cmsBO = new CMSBO();
		GenericDAO gendao = new GenericDAO();
		ArrayList certDetList = new ArrayList();
		ArrayList certData = new ArrayList();
		String serialNo = null;
		String appName = null;
		String acronym = null;
		actionErrors.clear();
		try {
			String loginId = (String) session.getAttribute("login");
			if ( (loginId == null) || (loginId.equals(null) || (loginId.equals(""))) ){
				  logger.error("Login Id in Edit Prof is null");
				  actionErrors.add("errMess", new ActionError("error.message"));
				  saveErrors(request, actionErrors);				  
				  return mapping.findForward("editProfAuthCheck");
			  }
			if(session.getAttribute("DetailInfo") != null)
			{
				cmsBO=(CMSBO)session.getAttribute("DetailInfo");
				appName = (String)cmsBO.getAppName();
				serialNo = (String)cmsBO.getSerialNo();	
				System.out.println("appName in auth type =====>>>>>> "+appName);
				acronym = cmsBO.getAcronym();
			}
			
			System.out.println("Detailinfo is null*************************");
			String netPin = gendao.getAuthType(appName, acronym, loginId);
			System.out.println("netpin in function =========> "+netPin);
			System.out.println("login id is --------------> "+loginId);
			
			    HashMap map = (HashMap)com.qwest.cms.utils.NETGroupDataClient.getGroupPinDetails(netPin);
			    session.setAttribute("authNetPin", map);
			    System.out.println("NETGroupDataClient $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$4");
			    String[] cuids=(String[])map.get("GroupMembersCuid");
			      String result="false";
			      for(int i=0;i<cuids.length;i++){
			          if(loginId.equals(cuids[i])){
			              result="true";
			              break;
			          }
			      }
			      System.out.println("result================== "+result);
			      			
			logger.debug("Function Action ----- Login Id -- "+loginId);
			if( result=="true" ){
				  
					String certSeqNo = (String) session.getAttribute("checkedRadioValue");
					session.setAttribute("appName", appName);
					session.setAttribute("serialNo", serialNo);
					session.setAttribute("acronym", acronym);
					functionForm.setApplicationName(appName);
					functionForm.setAcronym(acronym);
					functionForm.setSerialNo(serialNo);
					System.out.println("cert seq no is >>>>>>>>>>>>"+certSeqNo);
					logger.debug("Function Action ----- Cert seq no is >>>>>>>>>>>>"+certSeqNo);
					
					session.setAttribute("certSeqNoforMail", certSeqNo);
					certData = gendao.getAppNameSerialNo(certSeqNo);
					for( int i=0;i<certData.size();i++) {
						String[] strArr1 = (String[])certData.get(i);
						functionForm.setApplicationName(strArr1[0]);
						functionForm.setSerialNo(strArr1[1]);
					}
					
					serialNo = functionForm.getSerialNo();
					appName = functionForm.getApplicationName();
					System.out.println("SERIAL NO AND APPN NAME ******"+serialNo+appName+acronym);
					certDetList=gendao.getCertDetails(serialNo);			
					int i = certDetList.size();
					System.out.println("size of cert data"+certData.size());
					logger.debug("Function Action ----- Certificate details size..... "+i);
					logger.debug("Function Action -----  SERIAL NO AND APPN NAME ****** ..... "+serialNo+appName);
					
					for( i=0;i<certDetList.size();i++) {
						String[] strArr = (String[])certDetList.get(i);
						functionForm.setRaw_certificate(strArr[0]);
						functionForm.setSerialNo(strArr[1]);
						functionForm.setCert_owner(strArr[2]);
						functionForm.setCompany_name(strArr[3]);
						functionForm.setCert_status(strArr[4]);
						functionForm.setCert_version(strArr[5]);
						functionForm.setSubject(strArr[6]);
						functionForm.setSubject_CN(strArr[7]);
						functionForm.setSubject_O(strArr[8]);
						functionForm.setSubject_OU(strArr[9]);
						functionForm.setSubject_L(strArr[10]);
						functionForm.setSubject_S(strArr[11]);
						functionForm.setSubject_C(strArr[12]);
						functionForm.setSubject_E(strArr[13]);
						functionForm.setIssuer(strArr[14]);
						functionForm.setIssuer_CN(strArr[15]);
						functionForm.setIssuer_O(strArr[16]);
						functionForm.setIssuer_OU(strArr[17]);
						functionForm.setIssuer_L(strArr[18]);
						functionForm.setIssuer_S(strArr[19]);
						functionForm.setIssuer_C(strArr[20]);
						functionForm.setIssuer_E(strArr[21]);
						functionForm.setPublic_key(strArr[22]);
						functionForm.setSignature_algo(strArr[23]);
						functionForm.setSignature(strArr[24]);
						functionForm.setFrom_dt(strArr[25]);
						functionForm.setExpiry_dt(strArr[26]);
						functionForm.setCreate_dt(strArr[27]);
						functionForm.setMod_dt(strArr[28]);
					}
					
					System.out.println("in gen csr value....."+functionForm.getSubject()+functionForm.getIssuer());
					String sub=functionForm.getSubject();
					session.setAttribute("sub", sub);
					return mapping.findForward("renewCert");
			 }
			  else{
				  System.out.println("netPin is ......"+netPin);
				  logger.error("Function Action ----- Auth type for login Id "+loginId+" is "+netPin);
				  actionErrors.add("errMess", new ActionError("error.renewCertMember"));
				  saveErrors(request, actionErrors);
				  return mapping.findForward("editProfAuthCheck");

			  }
		} catch (SQLException e) {
			logger.error("SQL Exception in Renew Cert "+e.getMessage());
			actionErrors.add("db error", new ActionError("error.dbError"));
			saveErrors(request, actionErrors);
			return mapping.findForward("editProfAuthCheck");
		}catch (Exception e) {
			logger.error("Exception in Renew Cert "+e.getMessage());
			actionErrors.add("error", new ActionError("error.renewCertMember"));
			saveErrors(request, actionErrors);
			return mapping.findForward("editProfAuthCheck");
		}	
						 
	}	
	
	public ActionForward generateCSR(ActionMapping mapping, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) throws Exception {
				 
		System.out.println("Generate CSR *******");
		logger.info("Function Action -----  Generate CSR *******");
		CMSFunctionForm functionForm = (CMSFunctionForm)form; 
		HttpSession session = request.getSession();
		GenericDAO genDAO = new GenericDAO();
		CMSBO cmsBO = new CMSBO();
		actionErrors.clear();
		String applicationName = null;	
		String acronym = null;
		String pubKeyCrtPath = null;  
		String raw_certificate = null;
		String serialNo = null;
		String cert_owner = null;
		String company_name = null;
		String cert_status = null;
		String cert_version = null;
		String subject = null;
		String subject_CN = null;
		String subject_O = null;
		String subject_OU = null;
		String subject_L = null;
		String subject_S = null;
		String subject_C = null;
		String subject_E = null;
		String issuer = null;
		String issuer_CN = null;
		String issuer_O = null;
		String issuer_OU = null;
		String issuer_L = null;
		String issuer_S = null;
		String issuer_C = null;
		String issuer_E = null;
		String public_key = null;
		String signature_algo = null;
		String signature = null;
		String from_dt = null;
		String expiry_dt = null;
		String create_dt = null;
		String mod_dt = null;	
		String csrInfo = null;		
			
		String toList = null;
		String ccList = null;
		String mail_subject = null;
		String message = null;
		String notes = null;
		String fromId = " ";
		String rcbsMgrCuid = null;
		String nickName = null;
		boolean updates = false;
		
		try {
			String loginId = (String) session.getAttribute("login");
			if ( (loginId == null) || (loginId.equals(null) || (loginId.equals(""))) ){
				  logger.error("Login Id in Edit Prof is null");
				  actionErrors.add("errMess", new ActionError("error.message"));
				  saveErrors(request, actionErrors);				  
				  return mapping.findForward("editProfAuthCheck");
			  }
			applicationName = (String) session.getAttribute("appName");
			acronym = (String) session.getAttribute("acronym");
			System.out.println("AppName in CMSFunction%%%%%%%%%%%%%%%%%%%%%%%%%%%"+applicationName);
			logger.debug("Function Action ----- Gen CSR - AppName -- "+applicationName);
			//String authType = genDAO.getAuthType(applicationName, acronym, loginId);
			  System.out.println("login id is "+loginId);
			 HashMap map = (HashMap)session.getAttribute("authNetPin");
			 //System.out.println("map size()()())))))))))))))))) "+map.size());
			 String[] cuids=(String[])map.get("GroupMembersCuid");
			 			  
			 		subject=functionForm.getSubject();
			 		
			 		if(request.getParameter("subject")==null || subject==null){
			 		    System.out.println("================ Both are Null ===================");
			 		    subject=(String)session.getAttribute("sub");
			 		   	functionForm.setSubject(subject);
			 		}
			 		
			 		if(request.getParameter("subject")!=null){
			 		    subject=(String)request.getParameter("subject");
			 		    System.out.println("subject from jsp "+(String) request.getParameter("subject"));
			 		    functionForm.setSubject(subject);
			 		}
			 		
			 		//subject=(String)request.getParameter("subject");
					System.out.println("in gen csr value....."+subject);
				
					String modCertquery = "update "+CmsDbTable.TBL_CMS_CERT_DETAILS+" set SUBJECT="
				  			+ "\'"
				  			+ functionForm.getSubject()	  			
				  			+"' where SERIALNO='"
				  			+functionForm.getSerialNo()
				  			+"'";
					
					genDAO.insertCertDet(modCertquery);
							
					subject_C = functionForm.getSubject_C();
					subject_CN = functionForm.getSubject_CN();
					subject_E = functionForm.getSubject_E();
					subject_L = functionForm.getSubject_L();
					subject_O = functionForm.getSubject_O();
					subject_OU = functionForm.getSubject_OU();
					subject_S = functionForm.getSubject_S();
					signature_algo = functionForm.getSignature_algo();
					applicationName = functionForm.getApplicationName().toUpperCase();
					acronym = ((String) session.getAttribute("acronym")).toUpperCase();
					cert_status = (String) session.getAttribute("checkedRadioValue");
					if(session.getAttribute("login") != null){
					    fromId = (String)session.getAttribute("login");
					    for(int i=0;i<cuids.length;i++){
						fromId = fromId + "," + cuids[i];
						System.out.println("fromId=============== "+fromId);
					    }
					    
					}
										
					else{
						System.out.println("Your session has expired.....");
					}
					
					String certSeqNo= (String)session.getAttribute("certSeqNoforMail");
					System.out.println("certSeqNo in generate CSr "+certSeqNo );
					session.setAttribute("certSeqNo", certSeqNo);
					
					System.out.println("from outside loooop "+fromId);						
					nickName = genDAO.getCertNickName(cert_status, applicationName);
					rcbsMgrCuid = genDAO.getRcbsManager(nickName, acronym);	
					
					System.out.println("Rcbs manager Cuid and NIck name...."+rcbsMgrCuid+"," +nickName);
					logger.debug("Function Action ----- RCBS MGR Cuid and Cert Nickname are -- "+rcbsMgrCuid+" "+nickName);
					
					System.out.println("SUBJECT attributes <><><><><>"+subject_C+subject_CN+subject_E+subject_L+subject_O+subject_OU);
					System.out.println("Key pair TYPE --------------"+KeyPairType.getKeyPairType(signature_algo));
					KeyPair keyPair1;
					try {
					    logger.debug("Function Action ----- Gen CSR -- Key Pair Type - "+KeyPairType.getKeyPairType(signature_algo));
					    keyPair1 = KeyPairUtil.generateKeyPair(KeyPairType.getKeyPairType(signature_algo), 1024);
					    System.out.println("keyPair1 ======> "+keyPair1);
					    X509Name certSubject = new X509Name(subject);
					        PKCS10CertificationRequest csr=new PKCS10CertificationRequest(signature_algo, certSubject, keyPair1.getPublic(), null,keyPair1.getPrivate());
					        System.out.println("keyPair1.getPublic() ------- "+keyPair1.getPublic());
					        System.out.println("keyPair1.getPrivate() ------- "+keyPair1.getPrivate());
					        new ExportUtil().exportHeadCsrOnlyPem(csr,fromId);
					        CertificationRequestInfo info = csr.getCertificationRequestInfo();
					} catch (Exception e) {
					    // TODO Auto-generated catch block
					    e.printStackTrace();
					    System.out.println("exception =========> "+e.getMessage());
					}
			        //X509Name certSubject = new X509Name("E="+subject_E+",C="+subject_C+",ST="+subject_S+",L="+subject_L+",O="+subject_O+",OU="+subject_OU+",CN="+subject_CN);
			        
			       
			        //ExportUtil.readCsr(fromId);
			        
					functionForm.setCsrInfo(ExportUtil.readCsr(fromId));		
					functionForm.setToList(rcbsMgrCuid);		
					functionForm.setCcList(fromId);
					functionForm.setMail_subject(CMSProperties.getString("Mail_subject")+" [CERT NICKNAME-- \""+nickName+"\""+" APP NAME/ACRONYM--3 "+functionForm.getApplicationName()+"/"+acronym+"]");
					functionForm.setFromId(fromId);
					functionForm.setMessage(functionForm.getCsrInfo());
					
					//message = functionForm.getMessage();
					System.out.println("Actual ccList"+functionForm.getMail_subject());
					System.out.println("From  in approval mail"+functionForm.getFromId());
				
					return mapping.findForward("generateCSR");
			 
		} catch (SQLException e) {
			logger.error("SQL Exception in Generate Cert "+e.getMessage());
			actionErrors.add("db error", new ActionError("error.dbError"));
			saveErrors(request, actionErrors);
			return mapping.findForward("editProfAuthCheck");
		}catch (Exception e) {
			logger.error("Exception in Generate Cert "+e.getMessage());
			actionErrors.add("error", new ActionError("error.request"));
			saveErrors(request, actionErrors);
			return mapping.findForward("editProfAuthCheck");
		}	
		
	}
	
	public ActionForward addCert(ActionMapping mapping, ActionForm form, 
		HttpServletRequest request, HttpServletResponse response) throws Exception {
	    
	    System.out.println("Inside CMSFunctionAction addCert ..");
	    HttpSession session=request.getSession();
	    GenericDAO genericDAO=new GenericDAO();
	    	    
	    String appName=null;
	    String acroNym=null;
	    String hostID=null;
	    String hostIP=null;
	    String serailNo=null;
	    String issuer=null;
	    String creatorCuid=null;
	    String cerNickName=null;
	    String createOn=null;
	    String expireOn=null;
	    String status=null;
	    String certSeqNo=null;
	    String certType=null;
	    String modifiedCuid=null;
	    String notes=null;
	    String certPathServer=null;
	    String alarmFlag=null;
	    
	    certSeqNo=(String)session.getAttribute("checkedRadioValue");
	    System.out.println("certSeqNo in FuctionAction .... "+certSeqNo);
	    String loginId = (String) session.getAttribute("login");
	   
	    StringBuffer sb=new StringBuffer("select APPLICATION_NAME, ACRONYM, HOST_ID, HOST_IP, SERIAL_NO, ISSUER, CREATOR_CUID, CERT_NICKNAME, ");
	    sb.append(" to_char(CREATE_ON,'mm/dd/yyyy HH24:MI:SS'),to_char(EXPIRE_ON,'mm/dd/yyyy HH24:MI:SS'), ");
	    sb.append(" STATUS, CERT_SEQ_NU, CERT_TYPE, MODIFIED_CUID, NOTES,CERT_PATH_SERVER ");
	    sb.append(" from "+CmsDbTable.TBL_CMS_CERTIFICATES+" WHERE CERT_SEQ_NU='"+certSeqNo+"'");
	    
	    String certDataQuery=sb.toString();
	    System.out.println("certDataQuery =======> "+certDataQuery);
	    
	    ArrayList certData1=(ArrayList)genericDAO.getCertSeqNoData(certDataQuery);
	    System.out.println("size of arraylist in function action ==== "+certData1.size());
	    ArrayList certData=new ArrayList();
	 
	    for(int i=0;i<certData1.size();i++){
		String[] strArr=(String[])certData1.get(i); 
		CMSBO cmsbo=new CMSBO();
		cmsbo.setAppName(strArr[0]);
		cmsbo.setAcronym(strArr[1]);
		cmsbo.setHostId(strArr[2]);
		cmsbo.setHostIp(strArr[3]);
		cmsbo.setSerialNo(strArr[4]);
		cmsbo.setIssuer(strArr[5]);
		cmsbo.setCreatorCuid(strArr[6]);
		cmsbo.setCertNickname(strArr[7]);
		cmsbo.setCreateOn(strArr[8]);
		cmsbo.setExpireOn(strArr[9]);
		cmsbo.setStatus(strArr[10]);
		cmsbo.setCertSeqNo(strArr[11]);
		cmsbo.setCertType(strArr[12]);
		cmsbo.setModifiedCuid(strArr[13]);
		cmsbo.setNotes(strArr[14]);
		cmsbo.setCertPathServer(strArr[15]);
		certData.add(cmsbo);
	    }
		        
	    /*
	    SimpleDateFormat sdfDestination = new SimpleDateFormat("mm-dd-yyyy hh:mm:ss");
	    expireOn = sdfDestination.format(expireOn);
	    //expBefDate = sdfDestination.format(datebef);
	    System.out.println("expireOn -----------------> "+expireOn);*/
	    
	    String checkQuery="SELECT CREATOR_CUID FROM "+CmsDbTable.TBL_CMS_CERTIFICATES+" WHERE CERT_SEQ_NU='"+certSeqNo+"'";
		String getCheckQueryData=genericDAO.checkDuplicates(checkQuery);
		System.out.println("Duplicate Arraylist Size in function action .......  "+getCheckQueryData);
		logger.info("Duplicate Arraylist Size in function action .......  ");
		
		
				    
		if(getCheckQueryData.length()>0 && getCheckQueryData.equals(loginId)){
		    	System.out.println("####### This Certificate is Already There in Your Account.. Please Choose different Certificate. #######");
			session.setAttribute("dupData", "This Certificate is Already There in Your Account.. Please Choose different Certificate.");
			CMSAction cms = new CMSAction(); 
			cms.certInAccount(mapping, form, request, response);
			return mapping.findForward("home");		    
		}else{		    
		    	for(int j=0;j<certData.size();j++){			
			String certSeqNoQuery="select max(CERT_SEQ_NU +1) from "+CmsDbTable.TBL_CMS_CERTIFICATES+"";
		        String certMaxSeqNo=genericDAO.getAcronym(certSeqNoQuery);
		        System.out.println("Max of certSeqNo ----------- >> "+certMaxSeqNo);
		            
			CMSBO bo=(CMSBO)certData.get(j);
			appName=bo.getAppName();
			acroNym=bo.getAcronym();
			hostID=bo.getHostId();
			hostIP=bo.getHostIp();
			serailNo=bo.getSerialNo();
			issuer=bo.getIssuer();
			creatorCuid=loginId;
			cerNickName=bo.getCertNickname();
			createOn=bo.getCreateOn();
			expireOn=bo.getExpireOn();
			status=bo.getStatus();
			certSeqNo=certMaxSeqNo;
			certType=bo.getCertType();
			modifiedCuid=loginId;
			notes=bo.getNotes();
			certPathServer=bo.getCertPathServer();	
			alarmFlag="TO BE DONE";
			
		    }
	        
		    String insertQuery = "INSERT INTO "+CmsDbTable.TBL_CMS_CERTIFICATES+" values  (" +
		
		"'"+appName+"'," +
		"'"+acroNym+"'," +		
		"'"+hostID+"'," +
		"'"+hostIP+"'," +
		"'"+serailNo+"'," +
		"'"+issuer+"'," +
		"'"+creatorCuid+"'," +
		"'"+cerNickName+"'," +
		"to_date('"+createOn+"','MM-DD-YYYY  HH24:MI:SS')," +
		"to_date('"+expireOn+"','MM-DD-YYYY  HH24:MI:SS')," +
		"'"+status+"'," +
		"'"+certSeqNo+"'," +
		"'"+certType+"'," +
		"'"+modifiedCuid+"'," +
		"'"+notes+"'," +
		"'"+certPathServer+"'," +
		"'"+alarmFlag+"')" ;
	 
		    System.out.println("insertQuery ====> "+insertQuery);
		    genericDAO.insertCertDet(insertQuery);
		    
		    session.setAttribute("addAck", "The Chosen Certificate has Been Added To Your Account");
		    System.out.println("getAttribute ... "+session.getAttribute("addAck"));
	
		
	    CMSAction cms = new CMSAction(); 
	    cms.certInAccount(mapping, form, request, response);

	    return mapping.findForward("home");
		}
		
	}
	
	public ActionForward approvalMail(ActionMapping mapping, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) throws Exception {
				 
		System.out.println("Approval mail *******");
		logger.info("Function Action ----- Approval Mail ***********");
		System.out.println("approvalmail======================================");
		CMSFunctionForm functionForm = (CMSFunctionForm)form; 
		HttpSession session = request.getSession();
		GenericDAO genDAO = new GenericDAO();
		
		String toList = null;
		String ccList = null;
		String mail_subject = null;
		String message = null;
		String notes = null;
		String fromId = null;
		boolean updates = false;
		String appName = null;
		
		actionErrors.clear();	
		try {
			fromId = (String) session.getAttribute("login");
			if ( (fromId == null) || (fromId.equals(null) || (fromId.equals(""))) ){
				  logger.error("Login Id in Edit Prof is null");
				  actionErrors.add("errMess", new ActionError("error.message"));
				  saveErrors(request, actionErrors);				  
				  return mapping.findForward("editProfAuthCheck");
			  }
			
			toList = functionForm.getToList();
			ccList = functionForm.getCcList();
			mail_subject = functionForm.getMail_subject();
			notes = "\n"+"\n"+"Notes:   "+functionForm.getNotes()+"\n\n\n\n" + "***This is an autogenerated mail.  Please do not reply. ***";
			
			appName = mail_subject.substring(25, mail_subject.length()-1);	
			//System.out.println("appName... "+appName);
			System.out.println("ccList in approvalMail ....... "+ccList);
			System.out.println("toList in approvalMail ....... "+toList);
			
			String certSeqNo = (String)session.getAttribute("certSeqNo");
			//System.out.println("certSeqNo in approval Mail .... "+certSeqNo);
			String expQuery="SELECT EXPIRE_ON FROM D_TBL_CMS_CERTIFICATES WHERE CERT_SEQ_NU = '"+certSeqNo+"'";
			String expDate = (String) genDAO.getExpDate(expQuery);
			System.out.println("expDate in approval mail ... "+expDate);
			
			message = "\n" + "Hello" +" " + toList + "," +"\n\n";
			message = message + "\t\t" + "The Certificate " + "'"+appName+ "'" +"\n";
			message = message + " will expire on " +"'"+ expDate + "'" +"." +"\n\n";
			message = message + CMSProperties.getString("renewCertMessage1")+ "\n";
			message = message + CMSProperties.getString("renewCertMessage2")+ "\n";
			message = message + "\n\n" + CMSProperties.getString("renewCertMessage3")+"\n";
			message = message + "\n\n" + functionForm.getMessage();
			
			

			functionForm.setMessage(message+functionForm.getNotes());
			
			//System.out.println("\ngetmessage------------------- "+functionForm.getNotes());
			
			//System.out.println("Message in ApprovalMail.... "+message);
			
			try {
			    CmsMail cmsMail = new CmsMail();		
			    String[] cclist = functionForm.getCcList().split(",");
			    cmsMail.sendMessage(mail_subject, message, fromId+"@qwest.com", cclist, toList,notes);
			} catch (Exception e) {
			    // TODO Auto-generated catch block
			    e.printStackTrace();
			}        
			//SendMail.sendMailWithSubject("ipatan", "amanila@qwest.com", "HIIIII", "subject");
			
			updates = genDAO.updateCertificate("Renew", (String)session.getAttribute("checkedRadioValue"));
			CMSAction cms2 = new CMSAction(); 
			cms2.certInAccount(mapping, form, request, response);
			return mapping.findForward("approvalMail");
		} catch (SQLException e) {
			logger.error("SQL Exception in Approval Mail "+e.getMessage());
			actionErrors.add("db error", new ActionError("error.dbError"));
			saveErrors(request, actionErrors);
			return mapping.findForward("editProfAuthCheck");
		}catch (Exception e) {
			logger.error("Exception in Approval Mail "+e.getMessage());
			actionErrors.add("error", new ActionError("error.request"));
			saveErrors(request, actionErrors);
			return mapping.findForward("editProfAuthCheck");
		}	
		
	}

	public ActionForward updateCert(ActionMapping mapping, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) throws Exception {
				 
		System.out.println("Function- Update Screen*******");
		logger.info("Function Action ----- Update Cert *******");
		MessageResources messageResources = getResources(request); 
		HttpSession session = request.getSession();		
		actionErrors.clear();
		CMSBO cmsBO = new CMSBO();
		CMSFunctionForm functionForm = (CMSFunctionForm)form; 
		GenericDAO genDAO = new GenericDAO();
		String appName = null;
		String acronym = null;
		String serialNo = null;
		String certStatus = null;
		String result="false";
		String loginId = (String) session.getAttribute("login");
		if ( (loginId == null) || (loginId.equals(null) || (loginId.equals(""))) ){
			  logger.error("Login Id in Edit Prof is null");
			  actionErrors.add("errMess", new ActionError("error.message"));
			  saveErrors(request, actionErrors);				  
			  return mapping.findForward("editProfAuthCheck");
		  }
		//String certSeqNo = (String) session.getAttribute("checkedRadioValue");

		if(session.getAttribute("DetailInfo") != null)
		{
			cmsBO=(CMSBO)session.getAttribute("DetailInfo");
			appName = (String)cmsBO.getAppName();
			serialNo = (String)cmsBO.getSerialNo();	
			acronym = cmsBO.getAcronym();
			certStatus = cmsBO.getStatus();
			session.setAttribute("appName", appName);
			session.setAttribute("serialNo", serialNo);
			session.setAttribute("acronym", acronym);
			session.setAttribute("certStatus", certStatus);
		}
		
		try {
			String netPin = genDAO.getAuthType(appName, acronym, loginId);
			//System.out.println("login id is "+loginId);
			System.out.println("netPin is --------> "+netPin);
			
			HashMap map = (HashMap)com.qwest.cms.utils.NETGroupDataClient.getGroupPinDetails(netPin);
			    session.setAttribute("authNetPin", map);
			    System.out.println("NETGroupDataClient in updatecert ...........");
			    String[] cuids=(String[])map.get("GroupMembersCuid");
			      result="false";
			      for(int i=0;i<cuids.length;i++){
			          if(loginId.equals(cuids[i])){
			              System.out.println("cuids in map *********  "+cuids);
			              result="true";
			              break;
			          }
			      }
			      System.out.println("result================== "+result);
			      
			if(result.equals("true")){
			    	String certSeqNo = (String) session.getAttribute("checkedRadioValue");
			    	System.out.println("certseqno in update cert .......... "+certSeqNo);
				certStatus = genDAO.getCertStatus(certSeqNo);
			  	functionForm.setCertStatus(certStatus);
				return mapping.findForward("updateCert");				
								  	
			 }
			 else{
				  System.out.println("Auth type is ......"+netPin);
				  logger.debug("Function Action ----- UpdateCert - Auth type for login Id "+loginId+" is "+netPin);
				  actionErrors.add("errMess", new ActionError("error.update"));
				  saveErrors(request, actionErrors);
				  return mapping.findForward("editProfAuthCheck");
			 }	 	
		} catch (SQLException e) {
			logger.error("SQL Exception in Update Cert "+e.getMessage());
			actionErrors.add("db error", new ActionError("error.dbError"));
			saveErrors(request, actionErrors);
			return mapping.findForward("editProfAuthCheck");
		}catch (Exception e) {
			logger.error("Exception in Update Cert "+e.getMessage());
			actionErrors.add("error", new ActionError("error.renewCert"));
			saveErrors(request, actionErrors);
			return mapping.findForward("editProfAuthCheck");
		}	
			
		
	}
	public ActionForward updateCertDetails(ActionMapping mapping, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) throws Exception {
				 
		System.out.println("Function- Updating Cert Details *******");
		logger.info("Function Action ----- Updating Cert Details *******");
		
		CMSFunctionForm functionForm = (CMSFunctionForm)form; 
		CMSBO cmsBO = new CMSBO();
		GenericDAO genDAO = new GenericDAO();
		ArrayList certDataList = new ArrayList();
		ArrayList certDetList = new ArrayList();		
		actionErrors.clear();
		HttpSession session = request.getSession();
		boolean updated = false;
		String certSeqNo = (String) session.getAttribute("checkedRadioValue");
		String appName = ((String) session.getAttribute("appName")).toUpperCase();
		String acronym = ((String) session.getAttribute("acronym")).toUpperCase();
		String serialNo = (String) session.getAttribute("serialNo");
		String loginId = (String) session.getAttribute("login");
		if ( (loginId == null) || (loginId.equals(null) || (loginId.equals(""))) ){
			  logger.error("Login Id in Edit Prof is null");
			  actionErrors.add("errMess", new ActionError("error.message"));
			  saveErrors(request, actionErrors);				  
			  return mapping.findForward("editProfAuthCheck");
		  }
		String rawCertPath = null;
		String selCertDataQuery = null;
		String deleteCertQuery = null;
		String result=null;
		
		try {
			String certInfo = functionForm.getCertInfo();
			//String selCertDetQuery = "SELECT * FROM TBL_CMS_CERT_DETAILS where SERIALNO='"+serialNo+"'";
			
			selCertDataQuery = "SELECT * FROM "+CmsDbTable.TBL_CMS_CERTIFICATES+" where (" +
					"CERT_SEQ_NU='"+certSeqNo+"' AND " +
					"APPLICATION_NAME='"+appName+"' AND " +
					"ACRONYM='"+acronym+"')";
			certDataList = genDAO.getCertificateData(selCertDataQuery);
			
			for(int i=0;i<certDataList.size();i++) {
				String[] strArr = (String[])certDataList.get(i);
				cmsBO.setAppName(strArr[0]);
				cmsBO.setAcronym(strArr[1]);
				cmsBO.setHostId(strArr[2]);
				cmsBO.setHostIp(strArr[3]);
				cmsBO.setSerialNo(strArr[4]);
				cmsBO.setIssuer(strArr[5]);
				cmsBO.setCreatorCuid(strArr[6]);
				cmsBO.setCertNickname(strArr[7]);
				cmsBO.setCreateOn(strArr[8]);
				cmsBO.setExpireOn(strArr[9]);
				cmsBO.setStatus(strArr[10]);
				cmsBO.setCertSeqNo(strArr[11]);
				cmsBO.setCertType(strArr[12]);
				cmsBO.setModifiedDate(strArr[13]);
				cmsBO.setNotes(strArr[14]);			
			}			
			System.out.println("CMSBO -----  cert data....."+cmsBO.getSerialNo()+cmsBO.getAppName()+cmsBO.getCertSeqNo());
			
			certDetList = genDAO.getCertDetails(serialNo);
			for(int i=0;i<certDetList.size();i++) {
				String[] strArr = (String[])certDetList.get(i);
				functionForm.setRaw_certificate(strArr[0]);
				functionForm.setSerialNo(strArr[1]);
				functionForm.setCert_owner(strArr[2]);
				functionForm.setCompany_name(strArr[3]);
				functionForm.setCert_status(strArr[4]);
				functionForm.setCert_version(strArr[5]);
				functionForm.setSubject(strArr[6]);
				functionForm.setSubject_CN(strArr[7]);
				functionForm.setSubject_O(strArr[8]);
				functionForm.setSubject_OU(strArr[9]);
				functionForm.setSubject_L(strArr[10]);
				functionForm.setSubject_S(strArr[11]);
				functionForm.setSubject_C(strArr[12]);
				functionForm.setSubject_E(strArr[13]);
				functionForm.setIssuer(strArr[14]);
				functionForm.setIssuer_CN(strArr[15]);
				functionForm.setIssuer_O(strArr[16]);
				functionForm.setIssuer_OU(strArr[17]);
				functionForm.setIssuer_L(strArr[18]);
				functionForm.setIssuer_S(strArr[19]);
				functionForm.setIssuer_C(strArr[20]);
				functionForm.setIssuer_E(strArr[21]);
				functionForm.setPublic_key(strArr[22]);
				functionForm.setSignature_algo(strArr[23]);
				functionForm.setSignature(strArr[24]);
				functionForm.setFrom_dt(strArr[25]);	
				functionForm.setExpiry_dt(strArr[26]);
				functionForm.setCreate_dt(strArr[27]);
				functionForm.setMod_dt(strArr[28]);	
			}
			
			String cert = functionForm.getCertInfo().toString();
			ParseX509Certificate parseCert = new ParseX509Certificate(cert.replaceAll("\\r\n",""));
			System.out.println("parse cert obj ..#$$%$$$$$$$."+parseCert.getSerialNumber());
			rawCertPath = genDAO.getRawCert(serialNo);
			String certString = "-----BEGIN CERTIFICATE-----"+"\n"+certInfo+"\n"+"-----END CERTIFICATE-----";
			System.out.println("rawCert============> "+rawCert);
			System.out.println("CertString and rawcert .........."+certString+rawCert);
			logger.debug("Function Action ----- Update Cert Details - CertString is - "+certString);
			ExportUtil.updateRawCert(parseCert.getX509cert(), rawCertPath);
			System.out.println("Parse details "+parseCert.getNotAfter()+parseCert.getNotBefore());

			DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
			java.util.Date date = new java.util.Date();
			String datetime = dateFormat.format(date);
			System.out.println("Current Date Time : " + datetime);
			
			deleteCertQuery = "DELETE FROM "+CmsDbTable.TBL_CMS_CERTIFICATES+" where (" +
					"APPLICATION_NAME='"+appName+"' AND " +
					"ACRONYM='"+acronym+"' AND " +
					"HOST_ID='"+cmsBO.getHostId()+"' AND " +
					"HOST_IP='"+cmsBO.getHostIp()+"' AND " +
					"CERT_SEQ_NU='"+certSeqNo+"'" +
					")";		
			
			String insertCertDetQuery = "INSERT INTO "+CmsDbTable.TBL_CMS_CERT_DETAILS+" values  (" +
			"'"+functionForm.getRaw_certificate()+"'," +
			"'"+parseCert.getSerialNumber()+"'," +		
			"'"+functionForm.getCert_owner()+"'," +
			"'"+functionForm.getCompany_name()+"'," +
			"'"+functionForm.getCertStatus()+"'," +
			"'"+parseCert.getVersion()+"'," +
			"'"+functionForm.getSubject()+"'," +
			"'"+parseCert.getSubjectCN()+"'," +
			"'"+parseCert.getSubjectO()+"'," +
			"'"+parseCert.getSubjectOU()+"'," +
			"'"+parseCert.getSubjectL()+"'," +
			"'"+parseCert.getSubjectST()+"'," +
			"'"+parseCert.getSubjectC()+"'," +
			"'"+parseCert.getSubjectEmail()+"'," +
			"'"+functionForm.getIssuer()+"'," +
			"'"+parseCert.getIssuerCN()+"'," +
			"'"+parseCert.getIssuerO()+"',"+
			"'"+parseCert.getIssuerOU()+"'," +
			"'"+parseCert.getIssuerL()+"'," +
			"'"+parseCert.getIssuerST()+"'," +
			"'"+parseCert.getIssuerC()+"'," +
			"'"+parseCert.getIssuerEmail()+"'," +
			"'"+functionForm.getPublic_key()+"'," +
			"'"+parseCert.getSigAlgName()+"'," +
			"'"+parseCert.getSignature()+"'," +
			"to_date('"+parseCert.getNotBefore()+"','MM-DD-YYYY  HH24:MI:SS')," +
			"to_date('"+parseCert.getNotAfter()+"','MM-DD-YYYY  HH24:MI:SS')," +
			"to_date('"+datetime+"','MM-DD-YYYY  HH24:MI:SS')," +
			"to_date('"+datetime+"','MM-DD-YYYY  HH24:MI:SS') )" ;
		
			String updateCertQuery = "UPDATE "+CmsDbTable.TBL_CMS_CERTIFICATES+" set " +
					"SERIAL_NO='"+parseCert.getSerialNumber()+"'," +
					"MODIFIED_CUID='"+loginId+"'," +
					"STATUS='ACTIVE'," +
					"CREATE_ON=to_date('"+parseCert.getNotBefore()+"','MM-DD-YYYY  HH24:MI:SS')," +
					"EXPIRE_ON=to_date('"+parseCert.getNotAfter()+"','MM-DD-YYYY  HH24:MI:SS')," +				
					"CREATOR_CUID='"+loginId+"'" +
					" where (" +
					"APPLICATION_NAME='"+appName+"' AND " +
					"ACRONYM='"+acronym+"' AND " +
					"HOST_ID='"+cmsBO.getHostId()+"' AND " +
					"HOST_IP='"+cmsBO.getHostIp()+"' AND " +
					"CERT_SEQ_NU='"+certSeqNo+"'" +
					")";	
			
			String netPin = genDAO.getAuthType(appName, acronym, loginId);
			System.out.println("login id is "+loginId);
			
			
			if(!netPin.equals(null) || netPin!=null ){
			    		    
			    	updated = genDAO.insertCertDet(insertCertDetQuery);
				if ( updated == true ){
					System.out.println("Renew Certificate Details inserted successfully ");
					logger.debug("Function Action ----- Update Cert Details - Renew Certificate Details inserted successfully");
					updated = genDAO.updateRenewCertDet(updateCertQuery);
								
					if(updated){
						System.out.println("Certificate data updated successfully");
						logger.debug("Function Action ----- Update Cert Details - Certificate data updated successfully");
					}
					else{
						System.out.println("Certificate data not updated successfully");
						logger.debug("Function Action ----- Update Cert Details - Certificate data not updated successfully");
					}				
				}
				else{
					System.out.println("Certificate Details not inserted successfully");
					logger.debug("Function Action ----- Update Cert Details - Certificate Details not inserted successfully");
				}
				CMSAction cms2 = new CMSAction(); 
				cms2.certInAccount(mapping, form, request, response);
				return mapping.findForward("updateCertDetails");
			}
			else{
			    	  System.out.println("############ Not a member of this application ############");
				  logger.debug("Function Action ----- Update Cert Details - Not a member of this application - "+loginId+"" );
				  actionErrors.add("error", new ActionError("error.update"));
				  saveErrors(request, actionErrors);
				  return mapping.findForward("editProfAuthCheck");
			  }	    
		}catch (SQLException e) {
			logger.error("SQL Exception in Update Cert Details "+e.getMessage());
			actionErrors.add("db error", new ActionError("error.dbError"));
			saveErrors(request, actionErrors);
			return mapping.findForward("editProfAuthCheck");
		}catch (Exception e) {
			logger.error("Exception in Update Cert Details "+e.getMessage());
			actionErrors.add("error", new ActionError("error.renewCert"));
			saveErrors(request, actionErrors);
			return mapping.findForward("editProfAuthCheck");
		}	
		
		
	}
	
	public ActionForward updatedCert(ActionMapping mapping, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) throws Exception {
				 
		System.out.println("Function- Edit Section*******");
		logger.debug("Function Action ----- Cert Details Updated  ********");
		return mapping.findForward("updatedCert");
	}
	
	public ActionForward changeCertStatus(ActionMapping mapping, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) throws Exception {
				 
		System.out.println("Changing status*******");
		logger.debug("Function Action ----- Change Cert Status  ***********");
		MessageResources messageResources = getResources(request); 
		CMSFunctionForm functionForm = (CMSFunctionForm)form; 
		HttpSession session = request.getSession();
		actionErrors.clear();
		GenericDAO genDAO = new GenericDAO();
		CMSBO cmsBO = new CMSBO();
		String certStatus = null;
		String appName = null;
		String serialNo = null;
		String acronym = null;
		String result=null;
		String certSeqNo = (String)session.getAttribute("checkedRadioValue");
		String loginId = (String)session.getAttribute("login");
		if ( (loginId == null) || (loginId.equals(null) || (loginId.equals(""))) ){
			  logger.error("Login Id in Edit Prof is null");
			  actionErrors.add("errMess", new ActionError("error.message"));
			  saveErrors(request, actionErrors);				  
			  return mapping.findForward("editProfAuthCheck");
		  }
		try {
			if(session.getAttribute("DetailInfo") != null)
			{
				cmsBO=(CMSBO)session.getAttribute("DetailInfo");
				appName = (String)cmsBO.getAppName();
				serialNo = (String)cmsBO.getSerialNo();	
				acronym = cmsBO.getAcronym();
			}		
			
			session.setAttribute("appName", appName);
			session.setAttribute("serialNo", serialNo);
			session.setAttribute("acronym", acronym);
			
			String netPin = genDAO.getAuthType(appName, acronym, loginId);
			System.out.println("netPin is --------> "+netPin);
			
			HashMap map = (HashMap)com.qwest.cms.utils.NETGroupDataClient.getGroupPinDetails(netPin);
			    session.setAttribute("authNetPin", map);
			    System.out.println("NETGroupDataClient in updatecert ...........");
			    String[] cuids=(String[])map.get("GroupMembersCuid");
			      result="false";
			      for(int i=0;i<cuids.length;i++){
			          if(loginId.equals(cuids[i])){
			              System.out.println("cuids in map *********  "+cuids);
			              result="true";
			              break;
			          }
			      }
			      
			      System.out.println("result================== "+result);
			    
			    if(result=="true"){
				
				certStatus= genDAO.getCertStatus(certSeqNo);		
				functionForm.setCertStatus(certStatus);
				functionForm.setApplicationName(appName);
				functionForm.setSerialNo(serialNo);
				
				logger.debug("Function Action ----- Change Cert Status - Cert Status to be changed to "+functionForm.getCertStatus());
				return mapping.findForward("changeCertStatus");
					
			 }
			
			 else{
				  System.out.println("netPin is ......"+netPin);
				  logger.debug("Function Action ----- Change Cert Status - Auth type for login Id "+loginId+" is "+netPin);
				  actionErrors.add("errMess", new ActionError("error.changeCertStatus"));
				  saveErrors(request, actionErrors);
				  return mapping.findForward("editProfAuthCheck");
			 }
		} catch (SQLException e) {
			logger.error("SQL Exception in Change Cert Status "+e.getMessage());
			actionErrors.add("db error", new ActionError("error.dbError"));
			saveErrors(request, actionErrors);
			return mapping.findForward("editProfAuthCheck");
		}catch (Exception e) {
			logger.error("Exception in Change Cert Status "+e.getMessage());
			actionErrors.add("error", new ActionError("error.changeCertStatus"));
			saveErrors(request, actionErrors);
			return mapping.findForward("editProfAuthCheck");
		}			 	
		
	}
	
	public ActionForward updateCertStatus(ActionMapping mapping, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) throws Exception {
				 
		System.out.println("Updating cert Status *******");
		logger.info("Function Action ----- Update Cert Status**********");
		CMSFunctionForm functionForm = (CMSFunctionForm)form; 
		HttpSession session = request.getSession();
		actionErrors.clear();
		GenericDAO genDAO = new GenericDAO();
		String changeCertStatus= functionForm.getChangeCertStatus();
		try {
			String certSeqNo = (String) session.getAttribute("checkedRadioValue");
			String loginId = (String) session.getAttribute("login");
			if ( (loginId == null) || (loginId.equals(null) || (loginId.equals(""))) ){
				  logger.error("Login Id in Edit Prof is null");
				  actionErrors.add("errMess", new ActionError("error.message"));
				  saveErrors(request, actionErrors);				  
				  return mapping.findForward("editProfAuthCheck");
			  }
			String appName = (String) session.getAttribute("appName");
			String acronym = (String) session.getAttribute("acronym");
			
			String authType = genDAO.getAuthType(appName, acronym, loginId);
			  System.out.println("login id is "+loginId);
			  if( !(authType.equals(null)) || !(authType.equals("")) ){
				  	genDAO.updateCertificate(changeCertStatus,certSeqNo);
					System.out.println("update cert deta result"+genDAO.updateCertificate(functionForm.getChangeCertStatus(),certSeqNo));
					logger.debug("Function Action ----- Update Cert Status - Cert Status updated to "+changeCertStatus);
					CMSAction cms2 = new CMSAction(); 
					cms2.certInAccount(mapping, form, request, response);
					return mapping.findForward("updateCertStatus");
			  }
			  else{
				  System.out.println("Auth type is ......"+authType);
				  logger.debug("Function Action ----- Update Cert Status -Auth type for login Id "+loginId+" is "+authType);
				  return mapping.findForward("editProfAuthCheck");
			  }	    		
		} catch (SQLException e) {
			logger.error("SQL Exception in Update Cert Status "+e.getMessage());
			actionErrors.add("db error", new ActionError("error.dbError"));
			saveErrors(request, actionErrors);
			return mapping.findForward("editProfAuthCheck");
		}catch (Exception e) {
			logger.error("Exception in Update Cert Status "+e.getMessage());
			actionErrors.add("error", new ActionError("error.request"));
			saveErrors(request, actionErrors);
			return mapping.findForward("editProfAuthCheck");
		}	
		
	}	
	

	public ActionForward editCert(ActionMapping mapping, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) throws Exception {
				 
		System.out.println("Function- Edit Section*******");
		logger.info("Function Action ----- Edit Cert *********");
		return mapping.findForward("editCert");
	}
	
	public ActionForward deleteCert(ActionMapping mapping, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) throws Exception {
				 
		System.out.println("Function- Delete Section*******");
		logger.info("Function Action ----- Delete Cert *********");
		return mapping.findForward("deleteCert");
	}
	
	public ActionForward deleteCertificate(ActionMapping mapping, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) throws Exception {
				 
		System.out.println("Function- Delete Section*******");
		System.out.println("Inside deleteCertificate method----");
		logger.info("Function Action ----- Delete Certificate **********");
		actionErrors.clear();
		MessageResources messageResources = getResources(request); 
		CMSBO bo1 = new CMSBO();		
		String s = bo1.getSerialNo();
		HttpSession session = request.getSession(true);
		CMSBO bo = new CMSBO();
		CMSFunctionForm cms =new CMSFunctionForm();
		String appname = cms.getApplicationName();
		System.out.println("application  name in action class----"+appname);
		int i =Integer.parseInt((String) session.getAttribute("checkedRadioValue"));
		System.out.println("in CMSFunction calss checkedRadioValue************"+i);
		String cuid= session.getAttribute("login").toString();
		if ( (cuid == null) || (cuid.equals(null) || (cuid.equals(""))) ){
			  logger.error("Login Id in Edit Prof is null");
			  actionErrors.add("errMess", new ActionError("error.message"));
			  saveErrors(request, actionErrors);				  
			  return mapping.findForward("editProfAuthCheck");
		  }
		System.out.println("User Cuid in action class**************"+cuid);
		
		CMSBO cmsBO = new CMSBO();
		GenericDAO genDAO = new GenericDAO();
		
		String appName = null;
		String acronym = null;
		String serialNo = null;
		String certStatus = null;
		String result=null;
		String loginId = (String) session.getAttribute("login");
		
		String certSeqNo = (String) session.getAttribute("checkedRadioValue");
		try {
			if(session.getAttribute("DetailInfo") != null)
			{
				cmsBO=(CMSBO)session.getAttribute("DetailInfo");
				appName = (String)cmsBO.getAppName();
				serialNo = (String)cmsBO.getSerialNo();	
				acronym = cmsBO.getAcronym();
				session.setAttribute("appName", appName);
				session.setAttribute("serialNo", serialNo);
				session.setAttribute("acronym", acronym);
			}
			System.out.println("App Name ----------------"+appName);
			System.out.println("Acronym ------------------"+acronym);
			FuntionsDAO dao = new FuntionsDAO();
			
			//String netPin = (String)dao.getAuthType(appName,acronym,cuid,i);
			
			String netPin = genDAO.getAuthType(appName, acronym, loginId);
			System.out.println("NetPin in Delete Certificate ---> "+netPin);
			
			HashMap map = (HashMap)com.qwest.cms.utils.NETGroupDataClient.getGroupPinDetails(netPin);
			    session.setAttribute("authNetPin", map);
			    System.out.println("NETGroupDataClient in updatecert ...........");
			    String[] cuids=(String[])map.get("GroupMembersCuid");
			      result="false";
			      for(int j=0;j<cuids.length;j++){
			          if(loginId.equals(cuids[j])){
			              System.out.println("cuids in map *********  "+cuids);
			              result="true";
			              break;
			          }
			      }
			      
			      System.out.println("result================== "+result);
			 			
			//SearchDAO applicationN = new SearchDAO();
			//List list = (List) new ArrayList();
			//list = (List) applicationN.getGroupList();
			//System.out.println("List value 01 in FunctionAction"+list);
			
			//FuntionsDAO dao = new FuntionsDAO();
			
			      if(result=="true"){			
				System.out.println("Member of this NetGroupPin .... ");
				dao.deleteCertDAO(i, cuid);
				CMSAction cms2 = new CMSAction(); 
				cms2.certInAccount(mapping, form, request, response); 
				return mapping.findForward("home");
			      }
			      else{
				  System.out.println("netPin is ......"+netPin);
				  logger.debug("Function Action ----- Change Cert Status - Auth type for login Id "+loginId+" is "+netPin);
				  actionErrors.add("errMess", new ActionError("error.delCert"));
				  saveErrors(request, actionErrors);
				  return mapping.findForward("editProfAuthCheck");
			      }
						
			/*	FuntionsDAO delete = new FuntionsDAO();
			StringBuffer sb = delete.deleteCert();
			System.out.println("the value of serial no in Functions action class is -- "+sb.toString());
			//String issuer = delete.deleteCert().toString();
			//System.out.println("the value of issuer no in Functions action class is -- "+issuer);
			*/
			//CMSAction cms2 = new CMSAction(); 
			//cms2.certInAccount(mapping, form, request, response);  
			 //return mapping.findForward("home");
		} catch (SQLException e) {
			logger.error("SQL Exception in Delete Cert  "+e.getMessage());
			actionErrors.add("db error", new ActionError("error.dbError"));
			saveErrors(request, actionErrors);
			return mapping.findForward("editProfAuthCheck");
		}catch (Exception e) {
			logger.error("Exception in Delete Cert "+e.getMessage());
			actionErrors.add("error", new ActionError("error.delCert"));
			saveErrors(request, actionErrors);
			return mapping.findForward("editProfAuthCheck");
		}
		
	}	

	//*********************************************/
	
		// Aruna's Changes
		
		/* public String execute() throws Exception {

		    return sucess;

		    } */
	/*	  public String getFileCaption() {
		    return fileCaption;
		  }
		  public void setFileCaption(String fileCaption) {
		    this.fileCaption = fileCaption;
		  }
		  public File getUpload() {
		    return upload;
		  }
		  public void setUpload(File upload) {
		    this.upload = upload;
		  }
		  public String getUploadContentType() {
		    return uploadContentType;
		  }
		  public void setUploadContentType(String uploadContentType) {
		    this.uploadContentType = uploadContentType;
		  }
		  public String getUploadFileName() {
		    return uploadFileName;
		  }
		  public void setUploadFileName(String uploadFileName) {
		    this.uploadFileName = uploadFileName;
		  }
		  // END
		  */
		  
	
	
}

		  

