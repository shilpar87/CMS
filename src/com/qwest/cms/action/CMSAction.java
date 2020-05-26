/*
 * Created on Feb 20, 2008
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.qwest.cms.action;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

import javax.activation.DataHandler;
import javax.mail.internet.MimeBodyPart;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.*;
import javax.swing.event.HyperlinkEvent;
import javax.swing.table.AbstractTableModel;

import jxl.Hyperlink;

import org.apache.commons.beanutils.converters.SqlDateConverter;
import org.apache.commons.beanutils.locale.converters.SqlDateLocaleConverter;
import org.apache.log4j.Logger;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.upload.FormFile;
import org.apache.struts.util.MessageResources;
import org.jgroups.blocks.Link;

import com.qwest.cms.BO.CMSBO;
import com.qwest.cms.actionForm.CMSFormBean;
import com.qwest.cms.actionForm.CMSToolForm;
import com.qwest.cms.dao.GenericDAO;
import com.qwest.cms.dao.SearchDAO;
import com.qwest.cms.exception.CMSBaseException;
import com.qwest.cms.utils.CMSProperties;
import com.qwest.cms.utils.CmsDbTable;
import com.qwest.cms.utils.CmsMail;
//import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;
import com.qwest.cms.utils.LDAPSecurity;


/**
 * @author ipatan
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class CMSAction extends  DispatchAction {
	Logger logger = Logger.getLogger(CMSAction.class);
	ActionErrors actionErrors = new ActionErrors();
	 public String Serialnorr = null;
	  public String issuerrr = null;

   	public ActionForward home(ActionMapping mapping,
			   ActionForm form, HttpServletRequest request,
			   HttpServletResponse response) throws Exception {
		  System.out.println("I am here==check in setUp=");
		/* System.out.println("I am here==check in setUp=" + methodToCall);
						 if(transfer.equals(methodToCall)){
				 System.out.println("I am not ");
				 actionForward="transfer";
			 }*/
		  	  
			  return mapping.findForward("home");			  
			  
			 }
   	
	public ActionForward tool(ActionMapping mapping,
			   ActionForm form, HttpServletRequest request,
			   HttpServletResponse response) throws Exception {

			  System.out.println("tool calling");
			  return mapping.findForward("tool");
			 }
	
	public ActionForward keyform(ActionMapping mapping,
			   ActionForm form, HttpServletRequest request,
			   HttpServletResponse response) throws Exception {

			  System.out.println("creat Pvt key calling");
			  return mapping.findForward("keyform");
			 }
	
	public ActionForward csrform(ActionMapping mapping,
			   ActionForm form, HttpServletRequest request,
			   HttpServletResponse response) throws Exception {

			  System.out.println("creat Pvt key calling");
			  return mapping.findForward("csrform");
			 }
	
	public ActionForward viewCsr(ActionMapping mapping,
			   ActionForm form, HttpServletRequest request,
			   HttpServletResponse response) throws Exception {

			  System.out.println("creat Pvt key calling");
			  return mapping.findForward("viewCsr");
			 }
	
	public ActionForward viewPubKey(ActionMapping mapping,
			   ActionForm form, HttpServletRequest request,
			   HttpServletResponse response) throws Exception {

			  System.out.println("creat Pvt key calling");
			  return mapping.findForward("viewPubKey");
			 }
	
	public ActionForward creatNewCsr(ActionMapping mapping,
			   ActionForm form, HttpServletRequest request,
			   HttpServletResponse response) throws Exception {

			  System.out.println("creat Pvt key calling");
			  return mapping.findForward("creatNewCsr");
			 }
	public ActionForward impPvtKey(ActionMapping mapping,
			   ActionForm form, HttpServletRequest request,
			   HttpServletResponse response) throws Exception {

			  System.out.println("creat Pvt key calling");
			  return mapping.findForward("impPvtKey");
			 }
	public ActionForward AutoDisc(ActionMapping mapping,
			   ActionForm form, HttpServletRequest request,
			   HttpServletResponse response) throws Exception {

			  System.out.println("creat Pvt key calling");
			  System.out.println("testing");
			  return mapping.findForward("AutoDisc");
			 }
	public ActionForward status(ActionMapping mapping, 
			   ActionForm form, HttpServletRequest request, 
			   HttpServletResponse response) throws Exception {
			 
			  System.out.println("I am here== status=");
			  logger.info("CMS Action -- Status ***************");
			  logger.debug("Hi---------> , inside status");
			  HttpSession session = request.getSession();
			  session.setAttribute("pageToCall","status");		
			   CMSBO bo=new CMSBO();
			  GenericDAO genDAO=new GenericDAO();
			  String certSeqNo = (String)session.getAttribute("checkedRadioValue");
			  String certStatus= genDAO.getCertStatus(certSeqNo);
			  bo.setCert_status(certStatus);
			  System.out.println("getCertStatus ========== "+bo.getCert_status());
			  System.out.println("Forwarding to Home JSP "+certStatus);
			  session.setAttribute("certStatus", certStatus);
			 // session.removeAttribute("addCertTrue");
			  return mapping.findForward("home");
			 }
			 
	 public ActionForward Reminderlink(ActionMapping mapping, 
			ActionForm form, HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		System.out.println("THE CTRL IS REACHING");
	   String  Serialno =(String)request.getParameter("Serialnumber");
	   String  issuer =(String)request.getParameter("Issuer"); 
	   System.out.println("the serial no is " +Serialno);
	   
	   System.out.println("the issuer is" +issuer);
	   Serialnorr = Serialno;
	   issuerrr = issuer;
		return mapping.findForward("Rlink123");
	
	}
	
	
	public ActionForward insertreply(ActionMapping mapping, 
			ActionForm form, HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		System.out.println("THE CTRL123 IS REACHING");
		  HttpSession session = request.getSession();
		
          Date  date = new Date();
	      
	      System.out.println("today's date is" +date );
	      
	      SimpleDateFormat  Form =new SimpleDateFormat("MM/dd/yyyy");
	      
	      String d = Form.format(date);
	      System.out.println("date "+d);
		
	    String Reply =(String)request.getParameter("rad_val");
		System.out.println("the chosen reply is " +Reply);
		GenericDAO dao = new GenericDAO();
		String updateAllCertsAlarmQuery="UPDATE NOTES_LOG SET NOTES= '"+Reply+"' , REPLY_DATE=to_date('"+d+"','mm-dd-yyyy')  WHERE SERIAL_NUMBER= "+Serialnorr+" AND ISSUER = "+issuerrr+"' ";
		System.out.println("Update AllCertsAlarm Query... "+updateAllCertsAlarmQuery);
		dao.updateGroup(updateAllCertsAlarmQuery);
		return mapping.findForward("home");
	
	}
	
	public ActionForward details(ActionMapping mapping, 
			   ActionForm form, HttpServletRequest request, 
			   HttpServletResponse response) throws Exception {
			 
			  System.out.println("I am here== Details=");
			  logger.info("CMS Action -- Details ***************");
			  HttpSession session = request.getSession();
			  String certSeqNO = (String)session.getAttribute("checkedRadioValue");
			  System.out.println("checkedRadioValue in details action "+certSeqNO);
			  String cuid = (String) session.getAttribute("login");
			  System.out.println("login id in details "+cuid);
			  String appName = (String) session.getAttribute("appName");
			  System.out.println("appname in details action "+appName);
			  
			  StringBuffer sb = new StringBuffer("select distinct SUPPORT_DIRECTOR, SUPPORT_MANAGER,SUPPORT_PROJECT_MANAGER,DEVELOPMENT_DIRECTOR, DEVELOPMENT_MANAGER,DEVELOPMENT_PROJECT_MANAGER");
			  sb.append(" from "+CmsDbTable.MAL_APP_HIERARCHY+" where NAME = '"+appName+"' ");
			 // sb.append(" (select distinct ID from CSC_APP_INFO where SERVER_NAME = ");
			  //sb.append(" (select distinct a.HOST_ID from D_TBL_CMS_CERTIFICATES a where CERT_SEQ_NU= '"+certSeqNO+"' ))");
			  String rcbsQuery = sb.toString();
			  
			  GenericDAO dao = new GenericDAO();
			  ArrayList rcbsList = new ArrayList();
			  ArrayList rcbsList1 = new ArrayList();
			  rcbsList1 = dao.getRcbsList(rcbsQuery);
			  System.out.println("size of rcbsList array in detais =========== "+rcbsList1.size());
			  
			  for(int i=0;i<rcbsList1.size();i++){
					  String[] strArr = (String[])rcbsList1.get(i);
					  CMSBO cms = new CMSBO();
						cms.setSuppDir(strArr[0]);
						cms.setSuppMgr(strArr[1]);
						cms.setSuppProjMgr(strArr[2]);
						cms.setDevDirector(strArr[3]);
						cms.setDevMnanger(strArr[3]);
						cms.setDevProjMgr(strArr[5]);
						rcbsList.add(cms);
					
				  }
				  session.setAttribute("rcbsList", rcbsList);
				  System.out.println("rcbsList size %%%%%%%  "+rcbsList.size());
			
				StringBuffer ab = new StringBuffer("select  b.RAW_CERTIFICATE ,A.CERT_NICKNAME, B.SIGNATURE_ALGO  from "+CmsDbTable.TBL_CMS_CERTIFICATES+" a, "+CmsDbTable.TBL_CMS_CERT_DETAILS+" b ");
				  ab.append(" where A.SERIAL_NO = B.SERIALNO and a.ISSUER = b.ISSUER and A.CERT_SEQ_NU= '"+certSeqNO+"' ");
				  String certdetails = ab.toString();
				  ArrayList certDetails1 = new ArrayList();
				  ArrayList certDetails = new ArrayList();
				  
				  certDetails1 = (ArrayList)dao.getCertNames(certdetails);
				  
				  for (int j=0;j<certDetails1.size();j++){
					  String[] strArr = (String[])certDetails1.get(j);
					  CMSBO cms = new CMSBO();
					  cms.setRaw_certificate(strArr[0]);
					  cms.setCertNickname(strArr[1]);
					  cms.setSignature_algo(strArr[2]);
					  certDetails.add(cms);
					  System.out.println("getSignature_algo "+cms.getSignature_algo());
					  System.out.println("getCertNickname "+cms.getCertNickname());
					  System.out.println("getRaw_certificate "+cms.getRaw_certificate());
				  }
				  session.setAttribute("certDetails", certDetails);
			
		         // session.removeAttribute("addCertTrue");	  
			  session.setAttribute("pageToCall","details");		
			  return mapping.findForward("home");
			 }
	
	
	public ActionForward summary(ActionMapping mapping, 
			   ActionForm form, HttpServletRequest request, 
			   HttpServletResponse response) throws Exception {
			 
			  System.out.println("I am here== status=");
			  logger.info("CMS Action -- Summary ***************");
			  HttpSession session = request.getSession();
			  session.setAttribute("pageToCall","summary");
			 // session.removeAttribute("addCertTrue");
			  return mapping.findForward("home");
			 }
/*	
	public ActionForward addCertsToMyAccount(ActionMapping mapping, 
		   ActionForm form, HttpServletRequest request, 
		   HttpServletResponse response) throws Exception {
		 
		  System.out.println("I am here== addCertsToMyAccount=");
		  logger.info("CMS Action -- addCertsToMyAccount ***************");
		 
		  HttpSession session = request.getSession();
		  session.setAttribute("pageToCall","addCertsToMyAccount");	
		  return mapping.findForward("home");
		 }
	
	public ActionForward addCert(ActionMapping mapping, ActionForm form, 
		HttpServletRequest request, HttpServletResponse response) throws Exception {
	    
	    System.out.println("Inside CMSAction addCert ..");
	    HttpSession session=request.getSession();
	    GenericDAO genericDAO=new GenericDAO();
	    session.removeAttribute("addCertTrue");
	    
	    String certSeqNo=(String)session.getAttribute("checkedRadioValue");
	    System.out.println("certSeqNo in FuctionAction .... "+certSeqNo);
	    String loginId = (String) session.getAttribute("login");
	   
	    String updateQuery = "UPDATE  D_TBL_CMS_CERTIFICATES SET CREATOR_CUID='"+loginId+"' where CERT_SEQ_NU="+certSeqNo+"";
	    System.out.println("updateQuery --> "+updateQuery);
	    genericDAO.getAppInfo(updateQuery);
	    certInAccount(mapping, form, request, response);
	    return mapping.findForward("home");
	}*/
	
	
	public ActionForward history(ActionMapping mapping, 
			   ActionForm form, HttpServletRequest request, 
			   HttpServletResponse response) throws Exception {
			 
		  System.out.println("I am here== history=");
		  logger.info("CMS Action -- History ***************");
		  
		  try {
			  actionErrors.clear();
			  HttpSession session = request.getSession();
			  session.setAttribute("pageToCall","history");	
			 // session.removeAttribute("addCertTrue");
			  System.out.println("checked value:::::::::::::"+ session.getAttribute("checkedRadioValue").toString());
			  String history_query=CMSProperties.getString("history_query") + session.getAttribute("checkedRadioValue").toString();
			  System.out.println("Inside History: Query is-->"+history_query );
			  
			  GenericDAO genericDAO = new GenericDAO();
			  ArrayList historyList = new ArrayList();
			  ArrayList historyList1 = new ArrayList();//(ArrayList)genericDAO.getData("");
			  historyList1=genericDAO.getHistList(history_query.toString());
			  System.out.println("List extracted for History");
			  logger.debug("List extracted for History");
			  int i = historyList1.size();
			  System.out.println("No. of records in history "+i);
			  logger.debug("No. of records in history "+i);
			  for( i=0;i<historyList1.size();i++) {
					String[] strArr = (String[])historyList1.get(i);
					
					CMSBO cms = new CMSBO();
					
					cms.setModifiedDate(strArr[0]);
					cms.setModifiedCuid(strArr[1]);
					cms.setModifiedAction(strArr[2]);
					
					System.out.println(strArr[0]);
					System.out.println(strArr[1]);
					System.out.println(strArr[2]);
					historyList.add(cms);
					
						
				}
			  
			  session.setAttribute("historyList", historyList);
			  
			  return mapping.findForward("home");
		  }  catch (SQLException e) {
				logger.error("SQL Exception in History "+e.getMessage());
				actionErrors.add("db error", new ActionError("error.dbError"));
				saveErrors(request, actionErrors);
				return mapping.findForward("editProfAuthCheck");
			}catch (Exception e) {
				logger.error("Exception in History "+e.getMessage());
				actionErrors.add("error", new ActionError("error.request"));
				saveErrors(request, actionErrors);
				return mapping.findForward("editProfAuthCheck");
			}
		  
		 }
	
	public ActionForward notes(ActionMapping mapping, 
			   ActionForm form, HttpServletRequest request, 
			   HttpServletResponse response) throws Exception {
			 
			  System.out.println("I am here== status=");
			  logger.info("CMS Action -- Notes ***************");
			  HttpSession session = request.getSession();
			  session.setAttribute("pageToCall","notes");	
			  //session.removeAttribute("addCertTrue");
			  return mapping.findForward("home");
			 }
	
	public ActionForward Functions(ActionMapping mapping, 
			   ActionForm form, HttpServletRequest request, 
			   HttpServletResponse response) throws Exception {
			 
			System.out.println("Functions TAB <><><><><>");
			logger.info("CMS Action -- Functions TAB ***************");
			HttpSession session = request.getSession();
			GenericDAO genDAO = new GenericDAO();
			CMSBO bo = new CMSBO();
			String certSeqNo = (String)session.getAttribute("checkedRadioValue");
			String certStatus= genDAO.getCertStatus(certSeqNo);
			bo.setCert_status(certStatus);
			System.out.println("getCertStatus ========== "+bo.getCert_status());
			System.out.println("certstatus in cmsaction .............. "+certStatus);
			
			String addCertTrue=(String)session.getAttribute("addCertTrue");
			System.out.println("addCertTrue value in Functions "+addCertTrue);
			
			session.setAttribute("certStatus", certStatus);
			session.setAttribute("pageToCall","functions");	
			//session.removeAttribute("addCertTrue");
			return mapping.findForward("home");
			 }
	
	public ActionForward edit_profile(ActionMapping mapping, 
			   ActionForm form, HttpServletRequest request, 
			   HttpServletResponse response) throws Exception {
			 
			  logger.info("CMS Action -- Edit Profile ***************");
			  HttpSession session = request.getSession();
			  actionErrors.clear();
			  session.removeAttribute("groupList") ;
			  session.removeAttribute("groupListSize");
			  try {
				  HashMap appHash = new HashMap();
				  GenericDAO genDao = new GenericDAO();
				  ArrayList appAllList = new ArrayList();
				  ServletContext context =servlet.getServletContext();
				  ArrayList sortedList = new ArrayList();
				  //  appList1 = (ArrayList)genDao.getGroupList("select APPLICATION_NAME, ACRONYM from D_TBL_CMS_MAL");
			 	  if ( context.getAttribute("appAllList") == null ){
			 		  System.out.println("SETTING context ....... null");
			 		  appHash = (HashMap)genDao.getGroupList("select APPLICATION_NAME, ACRONYM from "+CmsDbTable.TBL_CMS_MAL+" order by APPLICATION_NAME");
				 	  
					  Set set = appHash.keySet();
					  
			          Iterator setItr = set.iterator();
			          while (setItr.hasNext()) {
			        	  sortedList.add(setItr.next());
			          }
			          java.util.Collections.sort(sortedList);
			          
			          Iterator it = sortedList.iterator();
					  while (it.hasNext()) {
				          /*  Map.Entry entry = (Map.Entry) it.next();
				            //System.out.println(entry.getKey() + " : " + entry.getValue());
				            CMSBO bo = new CMSBO();
							//System.out.println("str arr"+strArr.toString());
							bo.setAppName(entry.getKey().toString());
							bo.setAcronym(entry.getValue().toString());*/
						  CMSBO bo = new CMSBO();
						 String key= it.next().toString();
							bo.setAppName(key);
							bo.setAcronym(appHash.get(key).toString());
							appAllList.add(bo);
				          }
					  /*for( int i=0; i<appList1.size();i++) {
							String[] strArr = (String[])appList1.get(i); 
							CMSBO bo = new CMSBO();
							//System.out.println("str arr"+strArr.toString());
							bo.setAppName(strArr[0]);
							bo.setAcronym(strArr[1]);
							appList.add(bo);
					  }*/
					  context.setAttribute("appAllList",appAllList);
					  
					  
			 	  }		  
				  return mapping.findForward("edit_profile");
			  }  catch (SQLException e) {
					logger.error("SQL Exception in Edit_Profile "+e.getMessage());
					actionErrors.add("db error", new ActionError("error.dbError"));
					saveErrors(request, actionErrors);
					return mapping.findForward("editProfAuthCheck");
				}catch (Exception e) {
					logger.error("Exception in Edit_Profile "+e.getMessage());
					actionErrors.add("error", new ActionError("error.request"));
					saveErrors(request, actionErrors);
					return mapping.findForward("editProfAuthCheck");
			  }			  
	} 
	
	public ActionForward deleteGroup(ActionMapping mapping, 
			   ActionForm form, HttpServletRequest request, 
			   HttpServletResponse response) throws Exception {
			 
			  logger.info("CMS Action -- Edit Prof - DeleteGroup ***************");
			  HttpSession session = request.getSession();
			  actionErrors.clear();
			  CMSFormBean cmsForm = (CMSFormBean)form; 
			  GenericDAO genDao  = new GenericDAO();
			  boolean deleted = false;
			  HashMap groupHash = new HashMap();
			  HashMap newGroupHash = new HashMap();
			  try {
				  String selectedApp = request.getParameter("selectGroup");
				  String selelctedAcronym = request.getParameter("selAcronym");
				  System.out.println("inside ********* deleteGroup ********");
				  System.out.println("%%%%%%%%%%%%%%%%%%% Selected app and acronym......"+selectedApp+selelctedAcronym);
				  session.getAttribute("groupList");
				  deleted = genDao.deleteAppDAO(selectedApp, selelctedAcronym);			  
				  cmsForm.setAppName(selectedApp);
				  cmsForm.setAcronym(selelctedAcronym);
				  if ( deleted){
					  groupHash = (HashMap)session.getAttribute("appHash");
					  groupHash.remove(selectedApp);
					  session.setAttribute("appHash",groupHash);
				  }
				  editProfile(mapping, form, request, response);
				  
				  return mapping.findForward("edit_profile");
			  }  catch (SQLException e) {
					logger.error("SQL Exception in Delete Group "+e.getMessage());
					actionErrors.add("db error", new ActionError("error.dbError"));
					saveErrors(request, actionErrors);
					return mapping.findForward("editProfAuthCheck");
				}catch (Exception e) {
					logger.error("Exception in Delete Group "+e.getMessage());
					actionErrors.add("error", new ActionError("error.request"));
					saveErrors(request, actionErrors);
					return mapping.findForward("editProfAuthCheck");
			  }
			  
	} 
	
	public static void Reminder_query() {
		
	 	try{			
			//String query="select A.APPLICATION_NAME ,A.ACRONYM ,B.RCBS_MGR_CUID ,A.CERT_NICKNAME ,A.ISSUER ,A.SERIAL_NO ,A.EXPIRE_ON from VW_CMS_ALRM_NOTIFY A ,"+CmsDbTable.TBL_CMS_APP_OWNER+" B where A.APPLICATION_NAME =B.APPLICATION_NAME ANd A.ACRONYM =B.ACRONYM";
			String query="select distinct A.CERT_SEQ_NU, A.APPLICATION_ID ,B.RCBS_MGR_CUID ,A.ISSUER ,A.SERIAL_NO ,A.EXPIRE_ON, A.ALARM_FLAG from VW_CMS_ALRM_NOTIFY A ,"+CmsDbTable.TBL_CMS_APP_OWNER+" B where A.APPLICATION_ID =B.APPLICATION_NAME AND A.APPLICATION_ID =B.ACRONYM";
			System.out.println("Reminder_query -----> "+query);
			GenericDAO genericDAO = new GenericDAO();
			ArrayList appList = new ArrayList();
			appList=genericDAO.reminder_app(query);
			String alarmFlag=null;
			String certSeqNo=null;
			System.out.println("List extracted for reminder mails Query Size "+appList.size());
			
			int i = appList.size();
			System.out.println("No. of records "+i);
				     
			for( i=0;i<appList.size();i++) {
				String[] strArr = (String[])appList.get(i);
				System.out.println("RcbsMgr Cuid"+ strArr[2]);
				System.out.println("Serial No "+strArr[4]);
				System.out.println("Issuer "+strArr[3]);
				//System.out.println("subject "+ strArr[4]);
				System.out.println("Expires on .."+strArr[5]);
				System.out.println("Alarm Flag... "+strArr[6]);
				System.out.println("CertSeqNo ... "+strArr[0]);
				alarmFlag=strArr[6];
				certSeqNo=strArr[0];
				
				//String mem_query="select A.MEMBER_CUID from "+CmsDbTable.TBL_CMS_APP_MEMBER+" A where A.APPLICATION_NAME ='" +strArr[1]+ "' AND A.ACRONYM ='"+strArr[1]+"'";
				String mem_query="select A.MEMBER_CUID from "+CmsDbTable.TBL_CMS_APP_MEMBER+" A where A.ACRONYM ='"+strArr[1]+"'";
				System.out.println("mem_query Query--- "+mem_query);
				System.out.println(mem_query);
				ArrayList memArray=genericDAO.memList(mem_query);
				String[] membList=new String[memArray.size()];
				for (int j=0;j < membList.length;j++)
				{
					membList[j]= memArray.get(j).toString();
					System.out.println("array elements-->"+membList[j]);
				}
				
				System.out.println("alarmFlag.equals....."+alarmFlag.equals("TO BE DONE"));
				//System.out.println("alarmFlag.equals....."+alarmFlag=="TO BE DONE");

					
				
			if(alarmFlag.equals("TO BE DONE")||alarmFlag=="TO BE DONE" && alarmFlag!=null){
				System.out.println("alarmFlag is set to TO BE DONE... send mail.");
				CmsMail cmsmail=new CmsMail();
								
				String sub="Reminder mail for the Certificate going to expire on  "+ strArr[5];
				StringBuffer sb= new StringBuffer();
				sb.append("Hi,\n\n\n The following certificate is going to expire on "+ strArr[5]);
				sb.append("\n\n Acronym:  " + strArr[1]);
				sb.append("\n\n Issuer: " + strArr[3]);
				sb.append("\n\n Serial Number:  " + strArr[4]);
				sb.append("\n\n\n Please do the needful.");
				sb.append("\n\n For any queries contact CMS helpdesk: ");
				/*Link ln = new Link("mailto:osstools@qwest.com",0, "", 0);
				sb.append(ln);
				
				sb.append("\n\n\n\n\n\n *** This is an auto-generated mail.Please donot reply. ***");*/
				
				String body = sb.toString();
				
				cmsmail.setBody(body);
								
				String cc=null;
				String[] toList=null;
				String toListTest= "sxram12";
				String[] ccListTest={"sxram12","sxram12"};
				String from="cmsAdmin@qwest.com";
				String notes="";
				
				if(CMSProperties.getString("Net_Edit").equals("test")){
				    //ccListTest=CMSProperties.getString("autoAlarmCCList");
				    cmsmail.sendMessage(sub,body,from,ccListTest,toListTest,notes);
				    System.out.println("Sending.............");
				  // cmsmail.sendReminderMsg(sub,body,from,toListTest,ccListTest);
				}
				else{
				    toList = membList;
				    cc=strArr[1];
				    cmsmail.sendMessage(sub,body,from,toList,cc,notes);
				}
				
				String updateAlarmQuery="UPDATE D_TBL_CMS_CERTIFICATES SET ALARM_FLAG='DONE' WHERE CERT_SEQ_NU='"+certSeqNo+"'";
				System.out.println("Update Alarm Query... "+updateAlarmQuery);
				genericDAO.updateGroup(updateAlarmQuery);

			   }else if(alarmFlag.equals("DONE")){
			       System.out.println("Alarm Flag is set to DONE... not sending mail.");
			   }else if(alarmFlag.equals(null)){
			       System.out.println("Alarm Flag is set to null...");
			   }
				
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	public static void AllCertsReminderQuery() {
	    System.out.println("inside AllCertsReminderQuery ***********************");
	    ArrayList allCertsExpList = new ArrayList();
	    GenericDAO dao = new GenericDAO();
	    
	    try {
		
		StringBuffer sb = new StringBuffer(" SELECT SERIAL_NO, CERT_EXP_DATE, ISSUED_COMMON_NAME, ISSUED_ORG_UNIT, ISSUED_ORG, ISSUED_STATE, ISSUED_COUNTRY, ALARM_FLAG, REQUESTOR_NAME, REQUEST_ID, CERT_EFF_DATE, CERT_EXP_DATE, ISSUED_EMAIL ");
		sb.append(" FROM LOAD_CERTS_FROM_EXCEL ");
		sb.append(" WHERE ROUND (CERT_EXP_DATE - SYSDATE) <= 90 AND (CERT_EXP_DATE - SYSDATE) >= 0 ");
		String allCertsExpQuery = sb.toString();
		System.out.println("allCertsExpQuery "+allCertsExpQuery);
		allCertsExpList = (ArrayList)dao.allCertsReminder(allCertsExpQuery);
		System.out.println("allCertsExpList1 size +++++++++++ "+allCertsExpList.size());
		
		for(int i=0;i<allCertsExpList.size();i++){
		    String[] strArr = (String[])allCertsExpList.get(i);
		    System.out.println("SERIAL_NO "+strArr[0]);
		    System.out.println("CERT_EXP_DATE "+strArr[1]);
		    System.out.println("ISSUED_COMMON_NAME "+strArr[2]);
		    System.out.println("ISSUED_ORG_UNIT "+strArr[3]);
		    System.out.println("ISSUED_ORG "+strArr[4]);
		    System.out.println("ISSUED_STATE "+strArr[5]);
		    System.out.println("ISSUED_COUNTRY "+strArr[6]);
		    System.out.println("ALARM_FLAG "+strArr[7]);
		    System.out.println("REQUESTOR_NAME "+strArr[8]);
		    System.out.println("REQUESTOR_ID "+strArr[9]);
		    System.out.println("CERT_EFF_DATE "+strArr[10]);
		    System.out.println("CERT_EXP_DATE "+strArr[11]);
		    System.out.println("ISSUED_EMAIL "+strArr[12]);
		    
		    
		  String[] cc = new String[7] ;
			 String sc="";
			 String cuid = strArr[8];
			String passwd = "";
			//String[] cc= {"sxram12","hxkuma5"};
			String toList=null;
			String toListTest= strArr[8];
			//String toListTest= "jrearde";
			String[] ccListTest={"sxram12","nkganes","hxkuma5","scheema","pxpx","jrearde"};
			String from="cmsAdmin@qwest.com";
			String notes="";
			
		  //  String[] cc= {sc,"hxkuma5","jrearde",strArr[8],"nkganes"};
		    
		    try {
			    if(!LDAPSecurity.authenticate(cuid,passwd)){
				sc=testing.getSupervisorCuid(strArr[8]);
				cc[0]= testing.getSupervisorCuid(strArr[8]);
				cc[1]="jrearde";
				cc[2]="nkganes";
				cc[3]="hxkuma5";
				cc[4]="sxram12";
				cc[5]="scheema";
				cc[6]="pxpx";
				System.out.println("Supervisor in cmsaction :-   "+sc);			
			}
			}catch(Exception e){
			    e.printStackTrace();
			}
		    
			ccListTest=cc;
		    
		    if(strArr[7].equals("TO BE DONE")||strArr[7]=="TO BE DONE" && strArr[7]!=null){
			System.out.println("alarmFlag is set to TO BE DONE... send mail.");
			CmsMail cmsmail=new CmsMail();							
			String sub="Reminder mail for the Certificate going to expire on  "+ strArr[1];
			StringBuffer ab= new StringBuffer();
			ab.append("Hi,\n\n\n The following certificate is going to expire on "+ strArr[1]);
			ab.append("\n\n ISSUER= Qwest MS CA: Qwest Microsoft .NET Services "); 
			ab.append("\n\n COMMON NAME (CN) ="+ strArr[2]); 
			ab.append("\n\n ORGANIZATION UNIT (OU)= " + strArr[3] );
			ab.append("\n\n ORGANIZATION (O)= " + strArr[4] );
			ab.append("\n\n ISSUED CITY= " + strArr[7] );
			ab.append("\n\n STATE (ST)=" + strArr[5] );
			ab.append("\n\n COUNTRY (C)= " + strArr[6]  );
			ab.append("\n\n SERIAL NUMBER=  " + strArr[0]);
			ab.append("\n\n REQUESTOR ID= "+strArr[9]);
			ab.append("\n\n CERTIFICATE EFFECTIVE DATE= "+strArr[10]);
			ab.append("\n\n CERTIFICATE EXPIRY DATE= "+strArr[11]);
			ab.append("\n\n ISSUED EMAIL= "+strArr[12]);
			ab.append("\n\n\n Please send us details if this certificate is no longer used or has been replaced.");
			ab.append("\n Otherwise, Please renew this certificate before the expiry date above to prevent an outage.");
			ab.append("\n\n NOTE: For more information on Certificate and its Management, Please contact Stephen Kennedy(SKENNED) Of Risk Management Team");
			ab.append("\nand for any queries contact osstools@qwest.com ");			
			ab.append("\n Please make sure that you reply to this mail by chosing any one of the 3 options using the below link ");
			ab.append( "\n http://10.140.5.92:8084/CERTMGMT/CMSAction.do?methodToCall=Reminderlink&Serialnumber='"+ strArr[0]+"'&Issuer='"+ strArr[2]+"' ");
			ab.append("\n\n\n *** This is an auto-generated mail.Please donot reply. ***");
			
			String body = ab.toString();					
			cmsmail.setBody(body);	    
			    
			//System.out.println("CC in CMS ACTION******************** "+cc[0]+ "1"+cc[1]);
			
									
			if(CMSProperties.getString("Net_Edit").equals("test")){
			    //ccListTest=CMSProperties.getString("autoAlarmCCList");
			  //  cmsmail.sendMessage(sub,body,from,ccListTest,toListTest,notes);
			    System.out.println("Sending.............");
			    cmsmail.sendMessage(sub,body,from,ccListTest,toListTest,notes);
			}
			else{
			    toList = strArr[8];
			    cmsmail.sendMessage(sub,body,from,cc,toList,notes);
			}
			
			/*LDAPSecurity ldapSec = new LDAPSecurity();
			String supCuid = ldapSec.getSupervisourCuid("sxram12");
			System.out.println("supCuid in allcertsremindermail ******** "+supCuid);*/
			
			String updateAllCertsAlarmQuery="UPDATE LOAD_CERTS_FROM_EXCEL SET ALARM_FLAG='DONE' WHERE SERIAL_NO='"+strArr[0]+"' AND REQUESTOR_NAME = '"+strArr[8]+"'";
					
			System.out.println("Update AllCertsAlarm Query... "+updateAllCertsAlarmQuery);
			dao.updateGroup(updateAllCertsAlarmQuery);

			String expDate1=strArr[1];
			if(expDate1.endsWith(".0")){
			    expDate1 = expDate1.substring(0, expDate1.length()-2);
			}else{
			    expDate1=strArr[1];
			}
			System.out.println("expdate 1111111111111111 "+expDate1);
			String insertDataQuery="Insert into NOTES_LOG (SERIAL_NUMBER,ISSUER,REPLY_DATE,NOTES,REQUESTOR_CUID,IM_SUPERVISOR,CERT_EXP_DATE) Values ('"+strArr[0]+"','"+strArr[2]+"', '' ,'','"+strArr[8]+"','"+sc+"',to_date('"+expDate1+"','YYYY-MM-DD HH24:MI:SS'))";
			dao.insertData(insertDataQuery);
		   }else if(strArr[7].equals("DONE")){
		       System.out.println("Alarm Flag is set to DONE... not sending mail.");
		   }else if(strArr[7].equals(null)){
		       System.out.println("Alarm Flag is set to null...");
		   }
		}
		
		
	    } catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }   
	    
	}
	
		
	public void checkAuthNet(ActionMapping mapping,
			   ActionForm form, HttpServletRequest request,
			   HttpServletResponse response)throws Exception{
	    HttpSession session = request.getSession();
	    PrintWriter out=response.getWriter();
		  String cuid = (String) session.getAttribute("login");
		  String netPin=request.getParameter("netPin");
		  System.out.println(" in the ajax call of netpin "+netPin);
		  if ( (cuid == null) || (cuid.equals(null) || (cuid.equals(""))) ){
			  logger.error("Login Id in Edit Prof is null");
			  actionErrors.add("errMess", new ActionError("error.message"));
			  saveErrors(request, actionErrors);				  
			 // return mapping.findForward("sessionExpire");
		  }else{
		      HashMap map = (HashMap)com.qwest.cms.utils.NETGroupDataClient.getGroupPinDetails(netPin);
		      System.out.println("NETGroupDataClient $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$4");
		      String[] cuids=(String[])map.get("GroupMembersCuid");
		      String result="false";
		      for(int i=0;i<cuids.length;i++){
		          if(cuid.equals(cuids[i])){
		              result="true";
		              break;
		          }
		      }
		      
		  }
	   
	    
	}
	public void checkAuth(ActionMapping mapping,
		   ActionForm form, HttpServletRequest request,
		   HttpServletResponse response)throws Exception{
		HttpSession session=request.getSession();
		ArrayList list=(ArrayList)session.getAttribute("appAuthList");
		
		PrintWriter out=response.getWriter();
		String appName=request.getParameter("selAppName").toString();
		String acrName=request.getParameter("selAcronym").toString();
		System.out.println(" in the ajax call of check Auth "+request.getParameter("selectGroup")+"  ");
     
		Iterator ir=list.iterator();
		boolean flg=true;
		while(ir.hasNext()){
			CMSBO bo=(CMSBO)ir.next();
			System.out.println(" app in map == "+appName+" app of request "+acrName+" Bo valued \n "+bo.getAppName()+" "+bo.getAcronym()+" "+bo.getAuthType());
			if(bo.getAppName().equals(appName)){
              if(bo.getAcronym().equals(acrName)){
                  flg=false;
                  out.write(bo.getAuthType());
              }
			}
         }
		 if(flg){
			 //String result=new GenericDAO().checkAuth(,request.getParameter("selAcronym").toString(),session.getAttribute("login").toString());
    
			 out.write("");
		 }
      
	}

	public ActionForward editProfile(ActionMapping mapping,
			   ActionForm form, HttpServletRequest request,
			   HttpServletResponse response) throws Exception {
		
		try {
			  logger.info("CMS Action -- Edit Prof ***************");
			  MessageResources messageResources = getResources(request); 
			  ActionMessages actionMessages = new ActionMessages();
			  actionErrors.clear();
			  CMSFormBean cmsForm = (CMSFormBean)form; 
			  String AppName = cmsForm.getAppName();		  
			  String Acronym = cmsForm.getAcronym();
			  String rcbsCode = cmsForm.getRcbsCode();
			  String rcbsMgrCuid = cmsForm.getRcbsMgrCuid();
			  String alarmTime = cmsForm.getAlarmTime();
			  String alarmFreq = cmsForm.getAlarmFreq();
			  HttpSession session = request.getSession();
			  String cuid = (String) session.getAttribute("login");
			  if ( (cuid == null) || (cuid.equals(null) || (cuid.equals(""))) ){
				  logger.error("Login Id in Edit Prof is null");
				  actionErrors.add("errMess", new ActionError("error.message"));
				  saveErrors(request, actionErrors);				  
				  return mapping.findForward("sessionExpire");
			  }
			  System.out.println("Creator CUID in Action class --- "+cuid);
			  logger.debug("CMS Action -- Edit Prof - Creator CUID - "+cuid);
			  GenericDAO dao = new GenericDAO();
			  
			  ArrayList groupList = new ArrayList();
			 // ArrayList groupList1 = new ArrayList();
			  HashMap hashGroup = new HashMap();
			  GenericDAO genDao=new GenericDAO();
			  int groupListSize;
			  String groupNameString = null;
			  String groupSelectString = null;
			  String  groupName = null;
			  System.out.println("IN EDIT PROFILE ****************   ");
			  String operator = null;
			  //StringBuffer searchGroupQuery = new StringBuffer("SELECT m.APPLICATION_NAME, m.ACRONYM from D_TBL_CMS_APP_OWNER m where m.APPLICATION_NAME ");
			  String searchGroupQuery = "SELECT m.APPLICATION_NAME, m.ACRONYM from "+CmsDbTable.TBL_CMS_APP_OWNER+" m ";
			  groupSelectString = cmsForm.getSelectGroupName();
			  System.out.println("****** groupSelectString ******"+groupSelectString);
			  logger.debug("CMS Action -- Edit Prof - Selected Group"+groupSelectString);
			  groupNameString = cmsForm.getGroupString().toUpperCase();
			  System.out.println("IN EDIT PROFILE ... Group name select and string"+groupSelectString+"  "+groupNameString);
			  
			  
			  ArrayList appGroupList = new ArrayList(); 
			  HashMap appHash = new HashMap();
//			  ServletContext context =servlet.getServletContext();
			  
			  if ( session.getAttribute("appHash") == null ){
		 		  System.out.println("SETTING application context ....... null");
		 		 appHash = (HashMap)genDao.getGroupList(searchGroupQuery);
				 				 
		 		session.setAttribute("appHash",appHash);				  
		 	  }else{
		 	      appHash = (HashMap) session.getAttribute("appHash");
		 	  }	
			  
		      Set appSet = appHash.keySet();
		      Iterator ir = appSet.iterator();
		       
		      if( (groupNameString.equals("")) ){
				  System.out.println("Group string is null");
				  logger.debug("CMS Action -EDIT PROFILE ---- Group Search Criteria not provided ");
				  actionMessages.add("mess", new ActionMessage("message.groupNull"));
				  saveMessages(request, actionMessages);
			  }else{
				  if ( groupSelectString.equals("Starts With" ) ){
					  System.out.println("IN starts with .....");
							  while(ir.hasNext()){
								  groupName =(String)ir.next();
								  System.out.println("While groupname is ......... "+groupName+"     "+groupNameString.toUpperCase());
						          if(groupName.toUpperCase().startsWith(groupNameString.toUpperCase())){
						        	  System.out.println("grp name starts with "+groupSelectString);
						        	  appGroupList.add(groupName) ;
						          }						 
							  }
				  }else if(groupSelectString.equals("Contains") ) {
					  System.out.println("IN Contains .....");
					    	  while(ir.hasNext()){
					    		  groupName =(String)ir.next();
						          if(groupName.toUpperCase().indexOf((groupNameString.toUpperCase()))!=-1){
						        	  System.out.println("grp name contains with "+groupSelectString);
						        	  appGroupList.add(groupName) ;
						          }
					          }				    	  
				  }else if ( groupSelectString.equals("Is Exactly" )){
					  System.out.println("IN is exactly .....");
					    	  while(ir.hasNext()){
					    		  groupName =(String)ir.next();
						          if(groupName.toUpperCase().equals(groupNameString.toUpperCase())){
						        	  System.out.println("grp name equals with "+groupSelectString);
						        	  appGroupList.add(groupName) ;
						          }
					    	  }				    	  
				  }		   	
				  System.out.println("Search Group Query is ......"+searchGroupQuery.toString());		  
				  
					 // groupList1 = (HashMap) genDao.getGroupList(searchGroupQuery.toString());
				  if ( appGroupList.size() == 0 ){
						 
					  actionMessages.add("mess", new ActionMessage("message.noMatch"));
					  saveMessages(request, actionMessages);
				  }else{
						  for (int i = 0; i < appGroupList.size(); i++) {
							  	CMSBO bo = new CMSBO();
								//System.out.println("str arr"+strArr.toString());
								bo.setAppName((String)appGroupList.get(i));
								bo.setAcronym((String)appHash.get((String)appGroupList.get(i)));
								groupList.add(bo);
								
						}
				  }	  
				  logger.debug("CMS Action -EDIT PROFILE -- No of Records for Group search is .... "+appGroupList.size());
				  
				  groupListSize = groupList.size();
				  System.out.println("Edit Profile**********"+request.getParameter("selectGroup"));
				  ArrayList list=(ArrayList)genDao.getAppAuth(cuid);
				  session.setAttribute("appAuthList",list);
				  System.out.println("Group list size is >>>>>>>>>"+groupList.size());
				  session.setAttribute("groupList",groupList);
				  session.setAttribute("groupListSize", new Integer(groupListSize));			  
				  
			  }
		      return mapping.findForward("edit_profile");  
/*			 if( (groupNameString.equals("")) ){
				  System.out.println("Group string is null");
				  logger.debug("CMS Action -EDIT PROFILE ---- Group Search Criteria not provided ");
				  actionMessages.add("mess", new ActionMessage("message.groupNull"));
				  saveMessages(request, actionMessages);
			  }
			  else{
				  if ( groupSelectString.equals("Starts With" ) ){					  
					  operator = "like '";
					  searchGroupQuery.append(operator+groupNameString+"%'");
					  System.out.println("operator is starts with "+searchGroupQuery);
				  }
				  else if(groupSelectString.equals("Contains") ) {
					  operator = "like '";
					  searchGroupQuery.append(operator+"%"+groupNameString+"%'");
					  System.out.println("operator is contains "+searchGroupQuery);
				  }
				  else if ( groupSelectString.equals("Is Exactly" )){
					  operator = "= '";
					  searchGroupQuery.append(operator+groupNameString+"'");
					  System.out.println("operator is exactly "+searchGroupQuery);
				  }*/

				  
				/*  
				  hashGroup = (HashMap) genDao.getGroupList(searchGroupQuery.toString());
				 // int i = groupList1.size();
				  int i = hashGroup.size();
				  if ( i == 0 ){
					  System.out.println("Records extracted-->  "+i);
					  actionMessages.add("mess", new ActionMessage("message.noMatch"));
					  saveMessages(request, actionMessages);
				  }
				  System.out.println("No. of records extracted-->  "+i);*/
				  
			  	 			     
			      
			  
			  /*
				  Set set = hashGroup.entrySet();
		          Iterator it = set.iterator();
		          while (it.hasNext()) {
		            Map.Entry entry = (Map.Entry) it.next();
		            //System.out.println(entry.getKey() + " : " + entry.getValue());
		            CMSBO bo = new CMSBO();
					//System.out.println("str arr"+strArr.toString());
					bo.setAppName(entry.getKey().toString());
					bo.setAcronym(entry.getValue().toString());
					groupList.add(bo);
		          }*/
				/*  for(	 i=0;i<hashGroup.size();i++) {
						String[] strArr = (String[])groupList1.get(i); 
						CMSBO bo = new CMSBO();
						System.out.println("str arr"+strArr.toString());
						bo.setAppName(strArr[0]);
						bo.setAcronym(strArr[1]);
						groupList.add(bo);
				  }*/
				  
		} catch (SQLException e) {
			logger.error("SQL Exception in Edit Prof  "+e.getMessage());
			actionErrors.add("errMess", new ActionError("error.dbError"));
			saveErrors(request, actionErrors);
			System.out.println("action error is .... "+actionErrors.get().toString());
			return mapping.findForward("editProfAuthCheck");
		}catch (Exception e) {
			logger.error("Exception in Edit Prof "+e.getMessage());
			actionErrors.add("errMess", new ActionError("error.message"));
			saveErrors(request, actionErrors);
			System.out.println("action error is .... "+actionErrors.get().toString());
			return mapping.findForward("editProfAuthCheck");
		}
		  
	}
	
	public ActionForward editProfAcronym(ActionMapping mapping,
			   ActionForm form, HttpServletRequest request,
			   HttpServletResponse response) throws Exception {
		try {
			System.out.println(" EditProfAcronym ");
			  logger.info("CMS Action -EDIT PROFILE Acronym ****************");
			  HttpSession session = request.getSession();
			  actionErrors.clear();
			  GenericDAO genDao = new GenericDAO();
			  CMSFormBean cmsForm = (CMSFormBean)form;
			  String selAcronymQuery = null;			  
			  String appName = cmsForm.getAppName();
			  String acronym = null;
			  if ( !(appName.equals("") || appName.equals(null)) ){
				  selAcronymQuery = "SELECT ACRONYM from "+CmsDbTable.TBL_CMS_MAL+" where application_name='" +
			  		appName+"'";
			  	  acronym = genDao.getAcronym(selAcronymQuery);
			  	  cmsForm.setAcronym(acronym);
			  }
			  else {
				  cmsForm.setAcronym(acronym);
			  }
//			  String loginId = (String) session.getAttribute("login");
			  //String authType = genDao.getAuthType(appName, acronym, loginId);
			 // System.out.println("login id is "+loginId);
			//  if( authType.equals("A") ){
			  
			  return mapping.findForward("editProfGroupNew");
			 /* }
			 else{
				  System.out.println("Auth type is ......"+authType);
				  logger.debug("Auth type for login Id "+loginId+" is "+authType);
				  return mapping.findForward("editProfAuthCheck");
			  }*/		
		
		} catch (SQLException e) {
			logger.error("SQL Exception in EDIT PROFILE Acronym  "+e.getMessage());
			actionErrors.add("db error", new ActionError("error.dbError"));
			saveErrors(request, actionErrors);
			return mapping.findForward("editProfAuthCheck");
		}catch (Exception e) {
			logger.error("Exception in EDIT PROFILE Acronym "+e.getMessage());
			actionErrors.add("error", new ActionError("error.message"));
			saveErrors(request, actionErrors);
			return mapping.findForward("editProfAuthCheck");
		}
			  
	}
	
	public ActionForward editProfGroupNew(ActionMapping mapping,
			   ActionForm form, HttpServletRequest request,
			   HttpServletResponse response) throws Exception {

				  System.out.println("I am here== Search=");
				  System.out.println("+++++++++++++++++++ search");
				  logger.info("CMS Action -EDIT PROFILE NEW ****************");
				  MessageResources messageResources = getResources(request); 
			try{
				  actionErrors.clear();
				  GenericDAO genDao = new GenericDAO();
			   	  HttpSession session = request.getSession();
			   	  CMSFormBean cmsForm = (CMSFormBean)form; 
				  ArrayList appList = new ArrayList();
				  ArrayList auth_types = new ArrayList();
				  ArrayList auth_type1 = new ArrayList();
				  ArrayList appList1 = new ArrayList();
				  HashMap appHash = new HashMap();
				  String appName = null;
				  String acronym = null;
				  String cuid = null;
				  String insertAppMemQuery = null;
				  //cuid = (String) session.getAttribute("cuid");				  
				  String cuidLogged= session.getAttribute("login").toString();
				  if ( (cuidLogged == null) || (cuidLogged.equals(null) || (cuidLogged.equals(""))) ){
					  logger.error("Login Id in Edit Prof is null");
					  actionErrors.clear();
					  actionErrors.add("errMess", new ActionError("error.message"));
					  saveErrors(request, actionErrors);				  
					  return mapping.findForward("editProfAuthCheck");
				  }
				  ServletContext context =servlet.getServletContext();
				  if ( context.getAttribute("appAllList") != null ){
				 		 appList = (ArrayList)context.getAttribute("appAllList");
				  }
				  System.out.println("app list"+appList.size());
				  session.setAttribute("appList", appList);  
				  //context.setAttribute("appMap", appHash);
				  
				//  appList1 = (ArrayList)genDao.getGroupList("select APPLICATION_NAME, ACRONYM from D_TBL_CMS_MAL");
			 	 /* if ( context.getAttribute("appList") == null ){
			 		  System.out.println("SETTING context ....... null");
			 		  appHash = (HashMap)genDao.getGroupList("select APPLICATION_NAME, ACRONYM from D_TBL_CMS_MAL");
				 	  
					  Set set = appHash.entrySet();
			          Iterator it = set.iterator();
					  while (it.hasNext()) {
				            Map.Entry entry = (Map.Entry) it.next();
				            //System.out.println(entry.getKey() + " : " + entry.getValue());
				            CMSBO bo = new CMSBO();
							//System.out.println("str arr"+strArr.toString());
							bo.setAppName(entry.getKey().toString());
							bo.setAcronym(entry.getValue().toString());
							appList.add(bo);
				          }
					  for( int i=0; i<appList1.size();i++) {
							String[] strArr = (String[])appList1.get(i); 
							CMSBO bo = new CMSBO();
							//System.out.println("str arr"+strArr.toString());
							bo.setAppName(strArr[0]);
							bo.setAcronym(strArr[1]);
							appList.add(bo);
					  }
					  context.setAttribute("appMap",appList);
			 	  }*/
			 	  
			
				  				  
				//  auth_type1 = (ArrayList)genDAO.getGroupList1("select AUTH_TYPE from D_TBL_CMS_APP_MEMBER");
		/*		  for( int i=0; i<auth_type1.size();i++) {
						String[] strArr = (String[])auth_type1.get(i); 
						 System.out.println("inside for loop----");
						CMSBO bo = new CMSBO();
						System.out.println("str arr"+strArr.toString());
						bo.setAuthType(strArr[0]);
						System.out.println("AUTH_typ -----"+bo.getAuthType().toString());
						auth_types.add(bo);
				  }
				  System.out.println("app list"+auth_types.size());
				  session.setAttribute("auth_types", auth_types);
				  
				  cuid = request.getParameter("hidden");
				  if( cuid!=null ){
					  insertAppMemQuery = "INSERT INTO D_TBL_CMS_APP_MEMBER values ( MEMBER_CUID ='"+cuid.toUpperCase()+"'";
					  genDAO.insertAppMember(insertAppMemQuery);
				  }
				  System.out.println("Member cuid parameter in edit prof..."+cuidLogged);
			*/
				  
				  return mapping.findForward("editProfGroupNew");		
			}catch (Exception e) {
				logger.error("Exception in Edit Profile New Group "+e.getMessage());
				actionErrors.add("error", new ActionError("error.message"));
				saveErrors(request, actionErrors);
				return mapping.findForward("editProfAuthCheck");
			}
		 }
	
	public ActionForward groupExists(ActionMapping mapping,
			   ActionForm form, HttpServletRequest request,
			   HttpServletResponse response) throws Exception {			

		  System.out.println("CMS Action -EDIT PROFILE GROUP EXISTS *******");
		  logger.info("CMS Action -GROUP EXISTS ****************");
		  HttpSession session = request.getSession();
		  CMSFormBean cmsForm = (CMSFormBean)form; 
		  try {
			  actionErrors.clear();
			  String AppName = cmsForm.getAppName().toUpperCase();		  
			  String Acronym = cmsForm.getAcronym().toUpperCase();
			  String rcbsCode = cmsForm.getRcbsCode().toUpperCase();
			  String rcbsMgrCuid = cmsForm.getRcbsMgrCuid().toUpperCase();
			  String alarmTime = cmsForm.getAlarmTime();
			  String alarmFreq = cmsForm.getAlarmFreq();
			  String auth_type = cmsForm.getAuth_type();
			  String cuid = ((String) session.getAttribute("login")).toUpperCase();
			  if ( (cuid == null) || (cuid.equals(null) || (cuid.equals(""))) ){
				  logger.error("Login Id in Edit Prof is null");
				  actionErrors.add("errMess", new ActionError("error.message"));
				  saveErrors(request, actionErrors);				  
				  return mapping.findForward("sessionExpire");
			  }
			  System.out.println("Creator CUID in Action class --- "+cuid);
			  GenericDAO dao = new GenericDAO();		 
			  MessageResources messageResources = getResources(request);	  
			  
			 if(dao.checkOwner(AppName,Acronym) == true)
			 {	  	 
				 actionErrors.add("errMess", new ActionError("error.groupExists"));
				 saveErrors(request, actionErrors);
				 logger.debug("CMS Action -EDIT PROFILE GROUP EXISTS - This Group already exists in owner table");
			     System.out.println("this member  exists in owner table");	
			     return mapping.findForward("editProfGroupNew");
		     }
			 else if(dao.checkRowmember(AppName, Acronym,cuid) == true)
		     {			 
				 actionErrors.add("errMess", new ActionError("error.memberExists"));
				 saveErrors(request, actionErrors);
				 System.out.println("Record exists in Member table");
				 logger.debug("CMS Action -EDIT PROFILE GROUP EXISTS - This row already exists in member table");
				 return mapping.findForward("editProfGroupNew");
			}
			 else if(dao.checkAlaram(AppName,Acronym) == true)
			 {			 
				 actionErrors.add("errMess", new ActionError("error.alarmExists"));
				 saveErrors(request, actionErrors);
				 logger.debug("CMS Action -EDIT PROFILE GROUP EXISTS - This alarm details already exists.");
				 System.out.println("this member  exist in owner table");
				 return mapping.findForward("editProfGroupNew");
		     }		 
			 else
				 return new CMSAction().createNewGroup(mapping, form, request, response);
		    //dao.getCreateGroup(AppName,Acronym,cuid,rcbsCode,rcbsMgrCuid, rcbsMbrCuid,alarmTime,alarmFreq);
		  }  catch (SQLException e) {
				logger.error("SQL Exception in Group Exists "+e.getMessage());
				actionErrors.add("db error", new ActionError("error.dbError"));
				saveErrors(request, actionErrors);
				return mapping.findForward("editProfAuthCheck");
			}catch (Exception e) {
				logger.error("Exception in Group Exists  "+e.getMessage());
				actionErrors.add("error", new ActionError("error.message"));
				saveErrors(request, actionErrors);
				return mapping.findForward("editProfAuthCheck");
		  }
		         
	}	
	
	public ActionForward createNewGroup(ActionMapping mapping,
			   ActionForm form, HttpServletRequest request,
			   HttpServletResponse response) throws Exception {			
		
		  System.out.println("In CERATE NEW GROUP *****************");
		  logger.info("CMS Action -EDIT PROFILE CERATE NEW GROUP *****************");
		  HttpSession session = request.getSession();
		  CMSFormBean cmsForm = (CMSFormBean)form; 
		  actionErrors.clear();
		  String AppName = cmsForm.getAppName().toUpperCase();		  
		  String Acronym = cmsForm.getAcronym().toUpperCase();
		  String rcbsCode = cmsForm.getRcbsCode().toUpperCase();
		  String rcbsMgrCuid = cmsForm.getRcbsMgrCuid().toUpperCase();
		  String alarmTime = cmsForm.getAlarmTime();
		  String alarmFreq = cmsForm.getAlarmFreq();
		  String auth_type = cmsForm.getAuth_type();
		  String appUserName = cmsForm.getAppUserName();
		  String cuid = ((String) session.getAttribute("login")).toUpperCase();
		  if ( (cuid == null) || (cuid.equals(null) || (cuid.equals(""))) ){
			  logger.error("Login Id in Edit Prof is null");
			  actionErrors.clear();
			  actionErrors.add("errMess", new ActionError("error.message"));
			  saveErrors(request, actionErrors);				  
			  return mapping.findForward("sessionExpire");
		  }
		  System.out.println("Creator CUID in Action class --- "+cuid);
		  logger.debug("CMS Action -EDIT PROFILE CERATE NEW GROUP - Creator Cuid - "+cuid);
		  GenericDAO dao = new GenericDAO();
		  HashMap appHash = new HashMap();
		  
		  try {
			  boolean insertStatus = false;
			  insertStatus = dao.createGroup(AppName, Acronym, cuid, rcbsCode, rcbsMgrCuid, alarmTime, alarmFreq, appUserName);
			  if (insertStatus){
				  insertStatus = dao.insertAlarmDet(AppName, Acronym, alarmFreq);
			  }else{
				  actionErrors.add("errMess", new ActionError("error.noInserts"));
				  saveErrors(request, actionErrors);
			  }
			  if (insertStatus){
				  insertStatus=dao.createMember(AppName,Acronym,cuid,auth_type);
			  }else{
				  actionErrors.add("errMess", new ActionError("error.noInserts"));
				  saveErrors(request, actionErrors);
			  }
			  if (insertStatus){
				  if(session.getAttribute("appHash") != null){
					  appHash = (HashMap)session.getAttribute("appHash");
					  appHash.put(AppName, Acronym);
					  session.setAttribute("appHash", appHash);
				  }				  
			  }			  
			 return mapping.findForward("edit_profile");
			 // return new CMSAction().edit_profile(mapping, form, request, response);
		  }catch (SQLException e) {
				logger.error("SQL Exception in EDIT PROFILE CERATE NEW "+e.getMessage());
				actionErrors.add("db error", new ActionError("error.dbError"));
				saveErrors(request, actionErrors);
				return mapping.findForward("editProfAuthCheck");
		  }catch (Exception e) {
				logger.error("Exception in EDIT PROFILE CERATE NEW "+e.getMessage());
				actionErrors.add("error", new ActionError("error.request"));
				saveErrors(request, actionErrors);
				return mapping.findForward("editProfAuthCheck");
		  }
		  
	}
	
	public ActionForward editProfileGroup(ActionMapping mapping,
			   ActionForm form, HttpServletRequest request,
			   HttpServletResponse response) throws Exception {

			  System.out.println("EDIT PROFILE Group ******************");	
			  logger.info("CMS Action -EDIT PROFILE GROUP ******************");
			  MessageResources messageResources = getResources(request); 
			  HttpSession session = request.getSession();
			  CMSFormBean cmsForm = (CMSFormBean)form; 
			  try {
				  actionErrors.clear();
				  String selectedApp = request.getParameter("selectGroup");
				  String selelctedAcronym = request.getParameter("selAcronym");			  
				  String loginId = (String) session.getAttribute("login");
				  if ( (loginId == null) || (loginId.equals(null) || (loginId.equals(""))) ){
					  logger.error("Login Id in Edit Prof is null");
					  actionErrors.add("errMess", new ActionError("error.message"));
					  saveErrors(request, actionErrors);				  
					  return mapping.findForward("editProfAuthCheck");
				  }
				  System.out.println("Selected app and acronym...11..."+selectedApp+selelctedAcronym);
				  if( selectedApp == null || selelctedAcronym == null ){				 
				      selectedApp = (String)session.getAttribute("appName");
				      selelctedAcronym = (String)session.getAttribute("acronym");
				  }
				  //String selectedAcronym = selAcronym.substring(0,(selAcronym.length()-2));
				  System.out.println("Selected app and acronym......"+selectedApp+selelctedAcronym);
				  session.getAttribute("groupList");
				  StringBuffer searchCuidQuery = new StringBuffer("");
				  StringBuffer getGroupDataQuery = new StringBuffer("");			  
				  GenericDAO genDao = new GenericDAO();
				  String appName = null;
				  String acronym = null;
				  String certAlarm = null;
				  String authType = null;

				  ArrayList cuidList = new ArrayList();
				  ArrayList cuidList1 = new ArrayList();
				  ArrayList groupData = new ArrayList();
				  
				  cmsForm.setAppName(selectedApp);
				  cmsForm.setAcronym(selelctedAcronym);			  
				  
				  getGroupDataQuery.append("select * from "+CmsDbTable.TBL_CMS_APP_OWNER+" where(");
				  appName = cmsForm.getAppName();
				  acronym = cmsForm.getAcronym();
				 
				  if( (appName == null) || (acronym == null)){
					 actionErrors.add("errMess", new ActionError("error.data"));
					 saveErrors(request, actionErrors);
					 System.out.println("No Group data");
				  }
				  else {
					  authType = genDao.getAuthType(appName, acronym, loginId);				  
					  //( !(appName.equals(null) || appName.equals("") || acronym.equals(null) || acronym.equals("")) ){
					  getGroupDataQuery.append("APPLICATION_NAME = '"+appName.toUpperCase()+"'");
					  getGroupDataQuery.append("AND ACRONYM = '"+acronym.toUpperCase()+"')");
					  groupData = genDao.getAppOwnerDetail(getGroupDataQuery.toString());
					  for( int i=0; i<groupData.size();i++) {
							String[] strArr = (String[])groupData.get(i); 
							cmsForm.setCreatorCuid(strArr[2]);
							cmsForm.setRcbsCode(strArr[3]);
							cmsForm.setRcbsMgrCuid(strArr[4]);
							cmsForm.setAppUserName(strArr[5]);
					  }
					  certAlarm = genDao.getCertAlarmDetail(appName, acronym);
					  cmsForm.setAlarmTime(certAlarm);
					  
				  }			  
				  searchCuidQuery.append("select MEMBER_CUID from "+CmsDbTable.TBL_CMS_APP_MEMBER+" where (");
				  appName = cmsForm.getAppName();
				  acronym = cmsForm.getAcronym();
		
				  if( (appName == null) || (acronym == null)){
					  actionErrors.add("errMess", new ActionError("error.data"));
					  saveErrors(request, actionErrors);
					  System.out.println("No Cuids");

				  }
				  else {
					  //( !(appName.equals(null) || appName.equals("") || acronym.equals(null) || acronym.equals("")) ){
					  searchCuidQuery.append("APPLICATION_NAME = '"+appName.toUpperCase()+"'");
					  searchCuidQuery.append("AND ACRONYM = '"+acronym.toUpperCase()+"')");
					  cuidList1 = (ArrayList) genDao.getMemberCuidList(searchCuidQuery.toString());
					  for( int i=0; i<cuidList1.size();i++) {
							String[] strArr = (String[])cuidList1.get(i); 
							CMSBO bo = new CMSBO();
							System.out.println("str arr"+strArr.toString());
							bo.setMemberCuid(strArr[0]);						
							cuidList.add(bo);
					  }
				  }			  
				  session.setAttribute("appName", appName.toUpperCase());
				  session.setAttribute("acronym", acronym.toUpperCase());
				  session.setAttribute("cuidList", cuidList);
				  session.setAttribute("authType", authType);
				  return mapping.findForward("editProfileGroup");
			  } catch (SQLException e) {
					logger.error("SQL Exception in Edit Profile Group "+e.getMessage());
					 actionErrors.clear();
					actionErrors.add("db error", new ActionError("error.dbError"));
					saveErrors(request, actionErrors);
					return mapping.findForward("editProfAuthCheck");
				}catch (Exception e) {
					logger.error("Exception in Edit Profile Group  "+e.getMessage());
					 actionErrors.clear();
					actionErrors.add("error", new ActionError("error.request"));
					saveErrors(request, actionErrors);
					return mapping.findForward("editProfAuthCheck");
			  }
			  
		 }
	
	public ActionForward editProfGroupCuid(ActionMapping mapping,
			   ActionForm form, HttpServletRequest request,
			   HttpServletResponse response) throws Exception {

			  System.out.println(" EditProfGroupCuid ");
			  logger.info("CMS Action -EDIT PROFILE GROUP CUID ******************");
			  MessageResources messageResources = getResources(request); 
			  HttpSession session = request.getSession();
			  actionErrors.clear();
			  try {
				  GenericDAO genDao = new GenericDAO();
				  String appName = (String) session.getAttribute("appName");
				  String acronym = (String) session.getAttribute("acronym");			  
				  String loginId = (String) session.getAttribute("login");
				  if ( (loginId == null) || (loginId.equals(null) || (loginId.equals(""))) ){
					  logger.error("Login Id in Edit Prof is null");
					  actionErrors.add("errMess", new ActionError("error.message"));
					  saveErrors(request, actionErrors);				  
					  return mapping.findForward("editProfAuthCheck");
				  }
				  String authType = (String) session.getAttribute("authType");
				  //String authType = genDao.getAuthType(appName, acronym, loginId);
				 // System.out.println("login id is "+loginId);
				  
				  if( !authType.equals("A") ){	
					  actionErrors.add("errMess", new ActionError("error.noAuth"));
					  saveErrors(request, actionErrors);
					  System.out.println("Auth type in is ......"+authType);
					  logger.debug("CMS Action -EDIT PROFILE GROUP CUID - Auth type for login Id "+loginId+" is "+authType);
					  //return mapping.findForward("editProfAuthCheck");
				  }	
				  return mapping.findForward("editProfGroupCuid");
			  } catch (Exception e) {
					logger.error("Exception in Edit Profile Group Cuid "+e.getMessage());
					actionErrors.add("error", new ActionError("error.message"));
					saveErrors(request, actionErrors);
					return mapping.findForward("editProfAuthCheck");
			  }
			  
		 }
	
	public ActionForward editProfCuidInsert(ActionMapping mapping,
			   ActionForm form, HttpServletRequest request,
			   HttpServletResponse response) throws Exception {

			  System.out.println("Edit Group Profile ------ > EditProfCuid");
			  logger.info("CMS Action -EDIT PROFILE CUID INSERT ******************");
			  MessageResources messageResources = getResources(request); 
			  String insertAppMemQuery = null;		
			  CMSFormBean cmsForm = (CMSFormBean)form; 
			  actionErrors.clear();
			  try {
				  CMSBO cmsBO = new CMSBO();
				  GenericDAO genDao = new GenericDAO();
				  HttpSession session = request.getSession();
				  boolean insert = false;
				  boolean memExists = false;
				  String memCuid = null;
				  String appName = ((String) session.getAttribute("appName")).toUpperCase();			  
				  String acronym = ((String) session.getAttribute("acronym")).toUpperCase();			  
				  String loginId = (String) session.getAttribute("login");
				  if ( (loginId == null) || (loginId.equals(null) || (loginId.equals(""))) ){
					  logger.error("Login Id in Edit Prof is null");
					  actionErrors.add("errMess", new ActionError("error.message"));
					  saveErrors(request, actionErrors);				  
					  return mapping.findForward("editProfAuthCheck");
				  }
				  String authType = (String) session.getAttribute("authType");			  
				  memCuid = cmsForm.getMemberCuid();		  
				  
				  //String authType = genDao.getAuthType(appName, acronym, loginId);
				  System.out.println("login id is "+loginId);
				  
				  if( authType.equals("A") ){				  
					  System.out.println("Auth type is "+authType);
					  logger.debug("Auth type for login Id "+loginId+" is "+authType);
					  if( memCuid != null ) { 
						  insertAppMemQuery = "INSERT INTO "+CmsDbTable.TBL_CMS_APP_MEMBER+" values ( '"+appName+"','"+acronym+"','"+memCuid.toUpperCase()+"','"+cmsForm.getAuth_type()+"')";
						  insert=genDao.insertData(insertAppMemQuery);
						  cmsBO.setMemberCuid(memCuid);
						  //cmsBO.setAuthType(authType);
						  System.out.println("Member cuid parameter in edit prof..."+memCuid+insert);
						  logger.debug("CMS Action -EDIT PROFILE GROUP CUID -Member cuid parameter - "+memCuid);
						  ArrayList cuidList =(ArrayList) session.getAttribute("cuidList");
						  cuidList.add(cmsBO);				  
						  System.out.println("Size of the new cuid list is -----"+cuidList.size());
						  logger.debug("CMS Action -EDIT PROFILE GROUP CUID -Size of new Cuid list - "+cuidList.size());

						  session.setAttribute("cuidList", cuidList);
					  }
					  return  new CMSAction().editProfileGroup(mapping, form, request, response);
						 // return mapping.findForward("editProfCuidInsert");
					}
				  	else{
						  System.out.println("Auth type is ......"+authType);
						  actionErrors.add("errMess", new ActionError("error.noAuth"));
						  saveErrors(request, actionErrors);
						  logger.debug("Auth type for login Id "+loginId+" is "+authType);
						  return mapping.findForward("editProfCuidInsert");

					}	  	
			  }  catch (SQLException e) {
					logger.error("SQL Exception in Edit Profile Cuid Insert "+e.getMessage());
					actionErrors.add("db error", new ActionError("error.dbError"));
					saveErrors(request, actionErrors);
					return mapping.findForward("editProfAuthCheck");
				}catch (Exception e) {
					logger.error("Exception in Edit Profile Cuid Insert "+e.getMessage());
					actionErrors.add("error", new ActionError("error.request"));
					saveErrors(request, actionErrors);
					return mapping.findForward("editProfAuthCheck");
			  }
			  
					  /*for( int i=0; i < cuidList.length; i++) {
						  System.out.println("Dont say class cast");
						  String strArr = (String)cuidList[i];
						  if( strArr.equals(memCuid)){
							  memExists = true;
							  System.out.println("cuid list contains "+memCuid);							  
						  }
					  }
					  if(memExists){
						  actionErrors.add("errMess", new ActionError("error.memberExists"));
						  saveErrors(request, actionErrors);
					  }
					  else{
						  insertAppMemQuery = "INSERT INTO D_TBL_CMS_APP_MEMBER values ( '"+appName+"','"+acronym+"','"+cmsForm.getMemberCuid().toUpperCase()+"','"+cmsForm.getAuth_type()+"')";
						  insert=genDao.insertData(insertAppMemQuery);
					  
						  cmsBO.setMemberCuid(cmsForm.getMemberCuid());
						  //cmsBO.setAuthType(authType);
						  System.out.println("Member cuid parameter in edit prof..."+cmsForm.getMemberCuid()+insert);
						  cuidList1.add(cmsBO);	
					  }					  
				  }
				  System.out.println("Size of the new cuid list is -----"+cuidList1.size());
				  session.setAttribute("cuidList", cuidList1);*/
	}
	

	public ActionForward editProfMemDelete(ActionMapping mapping,
			   ActionForm form, HttpServletRequest request,
			   HttpServletResponse response) throws Exception {
			  
			  logger.info("CMS Action -EDIT PROFILE DELETE ******************");
			  System.out.println("I am here== EditProfMemDelete=");
			  MessageResources messageResources = getResources(request); 
			  String deleteMemQuery = null;		
			  CMSFormBean cmsForm = (CMSFormBean)form; 
			  actionErrors.clear();
			  try {
				  SearchDAO genDAO  = new SearchDAO();
				  GenericDAO genDao = new GenericDAO();
				  HttpSession session = request.getSession();
				  boolean insert = false;
				  String memberCuid = request.getParameter("selCuid");

				  String appName = (String) session.getAttribute("appName");
				  String acronym = (String) session.getAttribute("acronym");
				  
				  String loginId = (String) session.getAttribute("login");
				  if ( (loginId == null) || (loginId.equals(null) || (loginId.equals(""))) ){
					  logger.error("Login Id in Edit Prof is null");
					  actionErrors.add("errMess", new ActionError("error.message"));
					  saveErrors(request, actionErrors);				  
					  return mapping.findForward("editProfAuthCheck");
				  }
				  actionErrors.clear();
				  String authType = genDao.getAuthType(appName, acronym, loginId);
				  String[] result ;
				  System.out.println("login id is "+loginId);
				  if( authType.equals("A") ){
					  System.out.println("Delete Memb cuid.... app, acronym, membcuid"+appName+acronym+memberCuid);
					  //ArrayList cuidList =(ArrayList) session.getAttribute("cuidList");
					  // ArrayList cuidNewList=new ArrayList();					  
					  result = memberCuid.split(",");				  
					 // if (result.length > 1){					  
						  for (int x=0; x<result.length; x++){
						         System.out.println("Results....."+result[x]);
						         if ( result[x].equalsIgnoreCase(loginId.toUpperCase()) ){
						        	 System.out.println("login equals cuid");
						        	 logger.debug("CMS Action -EDIT PROFILE DELETE - Login Id is same as Delete Cuid.");
						        	 actionErrors.add("errMess", new ActionError("error.deleteSelfCuid"));
									 saveErrors(request, actionErrors);
						         }
						         else{
						        	 deleteMemQuery="DELETE from "+CmsDbTable.TBL_CMS_APP_MEMBER+" where (" +
						         		"APPLICATION_NAME='"+appName+"' AND " +
						         		"ACRONYM='"+acronym+"' AND " +
						         		"MEMBER_CUID='"+result[x]+"')";
						        	 logger.debug("CMS Action -EDIT PROFILE DELETE - Deleting the Cuid ... "+result[x]);
						         genDao.deleteAppMember(deleteMemQuery);
						         }			     
						  }
					 // }	  
					 /* else{
						  System.out.println("in else");
						  if (memberCuid.equals(loginId.toUpperCase())){
							  System.out.println("login equals cuid  else");
					        	 actionErrors.add("errMess", new ActionError("error.deleteSelfCuid"));
								 saveErrors(request, actionErrors);
					         }
					         else{
					        	 System.out.println("login is not equal .........sooooo");
					        	 deleteMemQuery="DELETE from D_TBL_CMS_APP_MEMBER where (" +
					         		"APPLICATION_NAME='"+appName+"' AND " +
					         		"ACRONYM='"+acronym+"' AND " +
					         		"MEMBER_CUID='"+memberCuid+"')";
					         genDao.deleteAppMember(deleteMemQuery);
					         }			     
					  }*/
					  
	/*					     Iterator ir=cuidList.iterator();
				              while(ir.hasNext()){
				             	 CMSBO bo=(CMSBO)ir.next();

				             	 if((bo.getMemberCuid().equals(result[x]))){
				             		cuidNewList.
				             	 }
				              }
							  }
	*/
					  return  new CMSAction().editProfileGroup(mapping, form, request, response);
					  //return mapping.findForward("editProfileGroup");
				  }
				  else{
					  actionErrors.clear();
					  actionErrors.add("errMess", new ActionError("error.noAuth"));
					  saveErrors(request, actionErrors);
					  System.out.println("Auth type is ......"+authType);
					  logger.debug("Auth type for login Id "+loginId+" is "+authType);
					  return mapping.findForward("editProfAuthCheck");
				  }
			  }catch (SQLException e) {
					logger.error("SQL Exception in Edit Profile Delete "+e.getMessage());
					actionErrors.clear();
					actionErrors.add("db error", new ActionError("error.dbError"));
					saveErrors(request, actionErrors);
					return mapping.findForward("editProfAuthCheck");
			  }catch (Exception e) {
					logger.error("Exception in Edit Profile Delete "+e.getMessage());
					actionErrors.clear();
					actionErrors.add("error", new ActionError("error.request"));
					saveErrors(request, actionErrors);
					return mapping.findForward("editProfAuthCheck");
			  }
			  
			 // System.out.println("Delete cuid result..."+genDao.deleteAppMember(deleteMemQuery));
			 // logger.debug("Hi---------> , inside Search");
			 //session.removeAttribute("cuidList");
			 //return editProfileGroup(mapping,form,request,response);
			  
		 }
	
	public ActionForward editGroupSave(ActionMapping mapping,
			   ActionForm form, HttpServletRequest request,
			   HttpServletResponse response) throws Exception {

			  System.out.println("I am here== EditGroupSave=");
			  logger.info("CMS Action -EDIT GROUP SAVE *************** ");
			  MessageResources messageResources = getResources(request); 
			  String updateAppOwnerQuery = null;
			  String updateCertAlarmQuery = null;	
			  CMSFormBean cmsForm = (CMSFormBean)form; 
			  try {
				  actionErrors.clear();
				  SearchDAO genDAO  = new SearchDAO();
				  GenericDAO genDao = new GenericDAO();
				  HttpSession session = request.getSession();
				  boolean update = false;
				  String appName = (String) session.getAttribute("appName");
				  String acronym = (String) session.getAttribute("acronym");
				  String authType = (String) session.getAttribute("authType");
				 
				  updateAppOwnerQuery = "UPDATE "+CmsDbTable.TBL_CMS_APP_OWNER+" SET " +
				  		"APPLICATION_NAME='"+cmsForm.getAppName()+"'," +
				  		"ACRONYM='"+cmsForm.getAcronym()+"'," +
				  		"CREATOR_CUID='"+cmsForm.getCreatorCuid()+"'," +
				  		"RCBS_CODE='"+cmsForm.getRcbsCode()+"'," +
				  		"RCBS_MGR_CUID='"+cmsForm.getRcbsMgrCuid()+"'," +			  		
				  		"APP_USER_NAMES='"+cmsForm.getAppUserName()+"'" +
				  		" where (" +
				  		"APPLICATION_NAME='"+appName+"' AND " +
				  		"ACRONYM='"+acronym+"'" +
				  		")";			  			  
				  
				  updateCertAlarmQuery = "UPDATE "+CmsDbTable.TBL_CMS_CERT_ALARM+" SET " +
				  	"APPLICATION_NAME='"+cmsForm.getAppName()+"'," +
			  		"ACRONYM='"+cmsForm.getAcronym()+"'," +
			  		"ALARM_FREQ='"+cmsForm.getAlarmTime()+"'" +		  		
			  		" where (" +
			  		"APPLICATION_NAME='"+appName+"' AND " +
			  		"ACRONYM='"+acronym+"'" +
			  		")";
				  
				  if( authType.equals("A") ){
					  logger.debug("CMS Action -EDIT GROUP SAVE - Updating Group Details for "+cmsForm.getMemberCuid());
					  genDao.updateGroup(updateAppOwnerQuery);
					  genDao.updateGroup(updateCertAlarmQuery);				  
					  System.out.println("Member cuid parameter in edit prof..."+cmsForm.getMemberCuid()+update);
				  }
				  else{
					  actionErrors.add("errMess", new ActionError("error.noAuth"));
					  saveErrors(request, actionErrors);
				  }
				 // logger.debug("Hi---------> , inside Search");
				  return mapping.findForward("edit_profile");
			  }  catch (SQLException e) {
					logger.error("SQL Exception in Edit Group Save "+e.getMessage());
					actionErrors.clear();
					actionErrors.add("db error", new ActionError("error.dbError"));
					saveErrors(request, actionErrors);
					return mapping.findForward("editProfAuthCheck");
				}catch (Exception e) {
					logger.error("Exception in Edit Group Save "+e.getMessage());
					actionErrors.clear();
					actionErrors.add("error", new ActionError("error.request"));
					saveErrors(request, actionErrors);
					return mapping.findForward("editProfAuthCheck");
			  }
			  
		 }	
	
	public ActionForward editProfAuthCheck(ActionMapping mapping,
			   ActionForm form, HttpServletRequest request,
			   HttpServletResponse response) throws Exception {

			  System.out.println("I am here== EditProfAuthCheck=");
			  logger.info("CMS Action -EDIT PROF AUTH CHECK ************");
			  
			 // logger.debug("Hi---------> , inside Search");
			  return mapping.findForward("editProfAuthCheck");
		 }		
	
	public ActionForward search(ActionMapping mapping,
				   ActionForm form, HttpServletRequest request,
				   HttpServletResponse response) throws Exception {			

		  System.out.println("I am here== Search=");
		  System.out.println("##########################################");
		  logger.info("CMS Action -SEARCH ************");
		  HttpSession session = request.getSession();
		  session.removeAttribute("totalCert");
		  try{
				actionErrors.clear();
				String cuid= session.getAttribute("login").toString();
				if ( (cuid == null) || (cuid.equals(null) || (cuid.equals(""))) ){
					  logger.error("Login Id in Edit Prof is null");
					  actionErrors.add("errMess", new ActionError("error.message"));
					  saveErrors(request, actionErrors);				  
					  return mapping.findForward("sessionExpire");
				  }
		  }catch(Exception e){
			  
		  }
		  if(!actionErrors.isEmpty()){
				 saveErrors(request,actionErrors);
				 return mapping.findForward("error");
			}
			return mapping.findForward("search");
	}
				/*String distinct_query="select APPLICATION_NAME,ACRONYM,CERT_NICKNAME from "
									  +"D_TBL_CMS_CERTIFICATES where D_TBL_CMS_CERTIFICATES.CREATOR_CUID='ipatan'"
									  +"group by grouping sets((APPLICATION_NAME),(ACRONYM),(CERT_NICKNAME))";

				*/
				//StringBuffer distinct_query=new StringBuffer("select distinct APPLICATION_NAME,ACRONYM from D_TBL_CMS_APP_MEMBER where MEMBER_CUID ='"+cuid+"' ");
				//distinct_query.append("union select distinct APPLICATION_NAME,ACRONYM from D_TBL_CMS_CERTIFICATES where CREATOR_CUID ='"+cuid+"'");
				//distinct_query.append("(select APPLICATION_NAME from D_TBL_CMS_CERTIFICATES where CREATOR_CUID ='"+cuid+"') ");
				//distinct_query.append("group by grouping sets((APPLICATION_NAME),(ACRONYM))");
			/*	System.out.println("new---- Distinct query---->"+distinct_query.toString());
				GenericDAO genericDAO = new GenericDAO();*/
				//ArrayList distinctList = new ArrayList();
				/*ArrayList distinctList1 = new ArrayList();
				distinctList1=genericDAO.getDisntColumn(distinct_query.toString());
				System.out.println("Distinct applications extracted...");*/
				//logger.debug("CMS Action -SEARCH - Distinct applications extracted...");							
				//int i = distinctList1.size();
				//System.out.println("No. of distict records extracted-->  "+i);
				//logger.debug("CMS Action -SEARCH - No. of distinct records extracted-->  "+i);				
				
				/*for( i=0;i<distinctList1.size();i++) {
					String[] strArr = (String[])distinctList1.get(i);					
					CMSBO cms = new CMSBO();					
					cms.setAppName(strArr[0]);					
					System.out.println("inside search action-->"+strArr[0]);				
					distinctList.add(cms);					
				}*/							
				//session.setAttribute("distinctList", distinctList1);				
				/*String totCert =  (session.getAttribute("totalCert")).toString();
				int totlCert = Integer.parseInt(totCert);*/
				//Reminder_query();
			/*}catch(CMSBaseException rbe){
				logger.error("CMS Action -SEARCH - During the List of the PAFs ==>");
				System.out.println("During the List of the PAFs ==>");				
				actionErrors.add("db error", new ActionError("error.message"));			
			
			}catch(SQLException rbe){				
				logger.error("CMS Action -SEARCH - During the List of the PAFs ==>");
				System.out.println("During the List of the PAFs ==>");				
				actionErrors.add("db error", new ActionError("error.dbError"));			
			}
			if(!actionErrors.isEmpty()){
				 saveErrors(request,actionErrors);
				 return mapping.findForward("error");
			}*/
		
	
	public ActionForward mgrAppCrt(ActionMapping mapping, 
			ActionForm form, HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
	    System.out.println("CMS Action -CERT IN ACCOUNT redirect************"+request.getParameter("appName"));
	    //request.setAttribute("appName", request.getParameter("appName"));
	    return mapping.findForward("mgrAppCrt");
	}
	
	public ActionForward certInAccount(ActionMapping mapping, 
			ActionForm form, HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		
		logger.info("CMS Action -CERT IN ACCOUNT *****************");
		System.out.println("========= inside certInAccount ===========");
		
		
		try{
		    
		        actionErrors.clear();
		        String cuid= session.getAttribute("login").toString();
		        if ( (cuid == null) || (cuid.equals(null) || (cuid.equals(""))) ){
					  logger.error("Login Id in Edit Prof is null");
					  actionErrors.clear();
					  actionErrors.add("errMess", new ActionError("error.message"));
					  saveErrors(request, actionErrors);				  
					  return mapping.findForward("sessionExpire");
				  }
		        String crt_home[]=CMSProperties.getString("crt_home").split("/");      
		        
		        /*StringBuffer sb1 = new StringBuffer("SELECT m.application_name,m.creator_cuid,n.HOST_ID,n.STATUS,n.EXPIRE_ON," );
		        sb1.append(" SUBSTR(k.RAW_CERTIFICATE,INSTR(k.RAW_CERTIFICATE,'/',1,"+(crt_home.length+2)+")+1) crt_name " );
		        sb1.append("FROM "+CmsDbTable.TBL_CMS_APP_OWNER+" m, "+CmsDbTable.TBL_CMS_CERTIFICATES+" n, "+CmsDbTable.TBL_CMS_CERT_DETAILS+" k " );
		        sb1.append("WHERE rcbs_mgr_cuid = '"+cuid+"' and n.ISSUER=k.ISSUER(+) and m.application_name = n.application_name(+)");*/
		        
		        StringBuffer sb1=new StringBuffer("SELECT n.application_name,m.MANAGER_CUID,n.HOST_ID,n.STATUS,n.EXPIRE_ON, k.RAW_CERTIFICATE  ");
		        sb1.append("FROM CERT_AUTO_ALARM m, "+CmsDbTable.TBL_CMS_CERTIFICATES+" n, "+CmsDbTable.TBL_CMS_CERT_DETAILS+" k  ");
		        sb1.append("WHERE m.MANAGER_CUID = '"+cuid+"' and n.ISSUER=k.ISSUER and k.SERIALNO = N.SERIAL_NO and M.APP_CUID=N.ACRONYM");
		        String mgrListQuery= sb1.toString();
		        
		        GenericDAO genDAO = new GenericDAO();
		        ArrayList mgrList =genDAO.getMgrList(mgrListQuery);		        
		        StringBuffer aq = new StringBuffer("SELECT a.HOST_ID,a.APPLICATION_NAME,a.SERIAL_NO,a.ISSUER,a.EXPIRE_ON ");
		        aq.append("FROM "+CmsDbTable.TBL_CMS_CERTIFICATES+" a,"+CmsDbTable.CERT_AUTO_ALARM+" b");
		        aq.append(" WHERE (a.APPLICATION_NAME)=b.APP_CUID");
		        aq.append(" AND (b.OWNER_CUID)='"+cuid+"' ORDER BY a.APPLICATION_NAME");
		        String another_query=aq.toString();		
		     
		        GenericDAO genDAO_aq = new GenericDAO();
		        ArrayList another_list =genDAO.getanotherList(another_query);
		    if(mgrList.size()>0){
		       
		        Set s=new HashSet();
		        ArrayList mgrhome =new ArrayList();
		        for(int i=0;i<mgrList.size();i++){
		            String app1=((CMSBO) mgrList.get(i)).getAppName();
		            if(!s.contains(app1)){
		                int count=0;
		                CMSBO tmpbo=new CMSBO();
		                s.add(app1);
		            for(int j=0;j<mgrList.size();j++){
		                if(app1.equals(((CMSBO) mgrList.get(j)).getAppName())){
		                    if(((((CMSBO) mgrList.get(j)).getCert_status()))!=null&&!(((CMSBO) mgrList.get(j)).getCert_status()).equals(""))
		                   count++; 
		                }
		            }
		            tmpbo.setAppName(app1);
		            tmpbo.setCreatorCuid(((CMSBO) mgrList.get(i)).getCreatorCuid());
		            tmpbo.setNoCrtOfApp(Integer.toString(count));
		            mgrhome.add(tmpbo);
		            }
		        }
		        session.setAttribute("mgrList", mgrList);
		        session.setAttribute("mgrhome", mgrhome);
		        return mapping.findForward("home_mgr");
		      }        
		   /* else if(another_list.size()>0){		
		    	System.out.println("entering 1 else if of another list");
		    	Set s=new HashSet();
		        ArrayList another_list_home =new ArrayList();
		       for(int i=0;i<another_list.size();i++){
		            String app1=((CMSBO) another_list.get(i)).getAppName();
		            //if(!s.contains(app1)){
		                int count=0;
		                CMSBO tmpbo=new CMSBO();
		                s.add(app1);
		            for(int j=0;j<another_list.size();j++){
		                if(app1.equals(((CMSBO) another_list.get(j)).getAppName())){
		                    if(((((CMSBO) another_list.get(j)).getAppName()))!=null && !(((CMSBO) another_list.get(j)).getAppName()).equals(""))
		                   count++; 
		                    
		                }
		                System.out.println(i+"i"+"j"+j+"inside another list");
		            }
		                System.out.println(i+"inside  else if of another list");
		            tmpbo.setAppName(app1);
		            tmpbo.setCreatorCuid(((CMSBO) another_list.get(i)).getCreatorCuid());
		            tmpbo.setNoCrtOfApp(Integer.toString(count));
		            another_list_home.add(tmpbo);
		            System.out.println(i+"exiting else if of another list");
		            
		        }
		       System.out.println("leaving");
		        session.setAttribute("another_list", another_list);
		        session.setAttribute("another_list_home", another_list_home);
		        return mapping.findForward("another_home_mgr");
		        
		}*/
		       
		    else{
			actionErrors.clear();
			int totalCert=0;
				
			/*//String cuid= session.getAttribute("login").toString();
			if ( (cuid == null) || (cuid.equals(null) || (cuid.equals(""))) ){
				  logger.error("Login Id in Edit Prof is null");
				  actionErrors.clear();
				  actionErrors.add("errMess", new ActionError("error.message"));
				  saveErrors(request, actionErrors);				  
				  return mapping.findForward("editProfAuthCheck");
			  }*/
			StringBuffer sb = new StringBuffer("select   m.cert_seq_nu,m.APPLICATION_NAME,m.ACRONYM,m.CERT_NICKNAME,m.CERT_TYPE,m.EXPIRE_ON,m.STATUS, n.RAW_CERTIFICATE from "+CmsDbTable.TBL_CMS_CERTIFICATES+" m, "+CmsDbTable.TBL_CMS_CERT_DETAILS+" n ");
			//sb.append("where m.APPLICATION_NAME in (select APPLICATION_NAME from D_TBL_CMS_APP_MEMBER where upper(MEMBER_CUID) ='"+ cuid.toUpperCase()+"') and m.ACRONYM in (select ACRONYM from D_TBL_CMS_APP_MEMBER where upper(MEMBER_CUID) ='"+ cuid.toUpperCase()+ "')");
			//sb.append(" and (n.SERIALNO = m.SERIAL_NO )");
			sb.append("WHERE n.SERIALNO = m.SERIAL_NO and n.ISSUER=m.ISSUER AND upper(m.CREATOR_CUID)='"+ cuid.toUpperCase()+ "'");
			//sb.append("select m.cert_seq_nu,m.APPLICATION_NAME,m.ACRONYM,m.CERT_NICKNAME,m.CERT_TYPE,m.EXPIRE_ON,m.STATUS from D_TBL_CMS_CERTIFICATES m where m.CREATOR_CUID="+"'"+cuid+"'");
			/*sb.append(" select distinct  m.cert_seq_nu,m.APPLICATION_NAME,m.ACRONYM,m.CERT_NICKNAME,m.CERT_TYPE,m.EXPIRE_ON,m.STATUS from D_TBL_CMS_CERTIFICATES m");
			sb.append(" where m.APPLICATION_NAME in (select APPLICATION_NAME from D_TBL_CMS_CERTIFICATES where CREATOR_CUID='"+cuid+"'");
			sb.append(" union select APPLICATION_NAME from D_TBL_CMS_APP_MEMBER where MEMBER_CUID ='"+cuid+"')");
		*/
			
   // for displaying certificates based on hostname and application name from search page
					
			
			//end
			
			String accountListQuery= sb.toString();
			System.out.println("account list query---->"+accountListQuery);
			GenericDAO genericDAO = new GenericDAO();
			ArrayList accountList = new ArrayList();
			ArrayList accountList1 = new ArrayList();
			accountList1=genericDAO.getCertList(accountListQuery);
			session.setAttribute("accountList1", accountList1);
			System.out.println("certificates in the account extracted...");
			logger.debug("CMS Action -CERT IN ACCOUNT - Certificates in the account extracted...");
						
			int i = accountList1.size();
			System.out.println("No. of records extracted-->  "+i);
			logger.debug("CMS Action -CERT IN ACCOUNT - No. of records extracted-->  "+i);
			totalCert = i;
			
			for( i=0;i<accountList1.size();i++) {
				String[] strArr = (String[])accountList1.get(i);
				
				CMSBO cms = new CMSBO();
				System.out.println("serialNO-->"+strArr[0]);
				logger.debug("CMS Action -CERT IN ACCOUNT - Account Details  -->  "+strArr[0]+strArr[1]+strArr[2]+strArr[3]+strArr[4]+strArr[5]+strArr[6]);
				cms.setSerialNo(strArr[0]);	
				cms.setAppName(strArr[1]);
				cms.setAcronym(strArr[2]);
				cms.setNickName(strArr[3]);
				cms.setType(strArr[4]);
				cms.setExpDate(strArr[5]);
				cms.setStatus(strArr[6]);
				/*if ( strArr[7].indexOf('/') != -1)
					cms.setRaw_certificate(strArr[7].substring(strArr[7].lastIndexOf('/')+1,strArr[7].length()).toUpperCase());
				if ( strArr[7].indexOf('\\') != -1)
					cms.setRaw_certificate(strArr[7].substring(strArr[7].lastIndexOf('\\')+1,strArr[7].length()).toUpperCase());*/
				if ( strArr[7].indexOf('#') != -1)
					cms.setRaw_certificate(strArr[7].substring(strArr[7].lastIndexOf('#')+1,strArr[7].length()).toUpperCase());				
				else if ( strArr[7].indexOf('/') != -1)
					cms.setRaw_certificate(strArr[7].substring(strArr[7].lastIndexOf('/')+1,strArr[7].length()).toUpperCase());
				else if ( strArr[7].indexOf('\\') != -1)
					cms.setRaw_certificate(strArr[7].substring(strArr[7].lastIndexOf('\\')+1,strArr[7].length()).toUpperCase());

				/*try{
					String expDateStr = strArr[5];
					Date expDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SS").parse(expDateStr);
					System.out.println("Expiry Date is " + expDate);
					
					Calendar expDateCal = Calendar.getInstance();
					expDateCal.setTime(expDate);
					Calendar todaysDate = Calendar.getInstance();
					System.out.println("Today's Date is " + todaysDate.getTime());
					int daysBetween = 0;
					while (todaysDate.before(expDateCal)) {
						todaysDate.add(Calendar.DAY_OF_MONTH, 1);
						daysBetween++;
					}					
					
					System.out.println("Number of Days = " + daysBetween);
					String days_diff =Integer.toString(daysBetween);
					
					cms.setDaysDiff(days_diff);
					
				}
					catch (ParseException e) {
						e.printStackTrace();	
					}*/
				/*System.out.println(strArr[1]);	
				System.out.println(strArr[2]);	
				System.out.println(strArr[3]);	
				System.out.println(strArr[4]);*/	
				//System.out.println(strArr[5]);
				//System.out.println(strArr[6]);
				//System.out.println("===========");	
				accountList.add(cms);				
			}	
			
			session.setAttribute("accountList", accountList);
			session.setAttribute("totalCert",new Integer(totalCert));
			session.removeAttribute("checkedRadioValue");
			session.removeAttribute("pageToCall");
			//session.removeAttribute("addCertTrue");
			System.out.println("**************** END of CertInAccount ***************");
			//session.removeAttribute("parsedCrtList");
			actionErrors.clear();
			return mapping.findForward("home");	
					
		    }
		    
		} catch (CMSBaseException e) {
			logger.error("Exception in CERT IN ACCOUNT   "+e.getMessage());
			actionErrors.add("db error", new ActionError("error.dbError"));
			saveErrors(request, actionErrors);
			return mapping.findForward("editProfAuthCheck");
		}catch (Exception e) {
			logger.error("Exception in CERT IN ACCOUNT  "+e.getMessage());
			actionErrors.add("error", new ActionError("error.message"));
			saveErrors(request, actionErrors);
			return mapping.findForward("sessionExpire");
		}
		/*}catch(CMSBaseException rbe){
			logger.error("CMS Action -CERT IN ACCOUNT - During the List of the Certs ==>");
			System.out.println("During the List of the Certs ==>");
			
			actionErrors.add("db error", new ActionMessage(rbe.getMessage()));			
		}catch(SQLException rbe){
			
			logger.error("CMS Action -CERT IN ACCOUNT - During the List of the Certs ==>");
			System.out.println("During the List of the Certs ==>");			
			actionErrors.add("db error", new ActionMessage(rbe.getMessage()));			
		}*/
			
/*		if(!actionErrors.isEmpty()){
			 saveErrors(request,actionErrors);
			 return mapping.findForward("error");
		}*/
		//System.out.println("I am here=list=="+mapping.findForward("home"));
		//String login = session.getAttribute("login").toString();
		/* if(login!=null && login.equalsIgnoreCase("approver")){
			 return mapping.findForward("approver");
		 }else{*/
		
				 
		// }		
	}
	
	public ActionForward searchResult(ActionMapping mapping, 
			ActionForm form, HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		
		logger.info("CMS Action - SEARCH RESULT **************** ");
		System.out.println("in searchResult function  ");
		ActionMessages actionMessages = new ActionMessages();
		HttpSession session = request.getSession();
		ArrayList appAcroNym = new ArrayList();
		  ArrayList appAcroNym1 = new ArrayList();
		try{
			actionErrors.clear();
			String cuid=session.getAttribute("login").toString();
			if ( (cuid == null) || (cuid.equals(null) || (cuid.equals(""))) ){
				  logger.error("Login Id in Edit Prof is null");
				  actionErrors.add("errMess", new ActionError("error.message"));
				  saveErrors(request, actionErrors);				  
				  return mapping.findForward("sessionExpire");
			  }
						
			  CMSFormBean cmsForm = (CMSFormBean)form; 
			  String AppSelectString = cmsForm.getAppName();
			  String AcronymSelectString = cmsForm.getAcronym();
			  System.out.println("AppSelectString  "+AppSelectString);
			  System.out.println("AcronymSelectString  "+AcronymSelectString);
			  String AppNameString = cmsForm.getAppList().toUpperCase();
			  System.out.println("AppNameString length  "+AppNameString.length());
			  String AcronymString = cmsForm.getAcronymList().toUpperCase();
			  GenericDAO dao = new GenericDAO();
			  
			  String appAcroname="";
			  StringBuffer sb = new StringBuffer(" SELECT distinct NAME, ACRONYM from "+CmsDbTable.MAL_APP_HIERARCHY+"");
			  //request.setAttribute("AppNameString", AppNameString);	
			  		  
			  			
			  if( (AppNameString.equals("")) && (AcronymString.equals(""))){
				  System.out.println("Application string is null");
				  logger.debug("CMS Action -Search PROFILE ---- Group Search Criteria not provided ");
				  actionMessages.add("mess", new ActionMessage("message.groupNull"));
				  saveErrors(request, actionErrors);				  
				  return mapping.findForward("editProfAuthCheck");
			  }
			  if((AppNameString!= null)&& !(AppNameString.equals("")) && (AcronymString.equals(""))){
				  
				  System.out.println("Application name not null");
				  //StringBuffer sb = new StringBuffer("SELECT distinct APPLICATION_NAME  from D_TBL_CMS_MAL");
				  
				   if ( AppSelectString.equals("Starts With" ) ){
					  System.out.println("IN starts with .....Application Name");
					  sb.append(" WHERE NAME LIKE '"+AppNameString+"%'");
					  
				   }
				  else if(AppSelectString.equals("Is Exactly" )){
					  System.out.println("Is Exactly with .....Application Name");
					  sb.append(" WHERE NAME LIKE '"+AppNameString+"'");
					
				   }
				  else if(AppSelectString.equals("Contains" )){
					  System.out.println("Contains with .....Application Name");
					  sb.append(" WHERE NAME LIKE '%"+AppNameString+"%'");
					  
				  }
					 
			  }
			if( (AppNameString.equals("")) && (AcronymString!=null)&& !(AcronymString.equals(""))){
					  
			  System.out.println("acronym not null");
			  
			   if ( AcronymSelectString.equals("Starts With" ) ){
					  System.out.println("IN starts with .....Acronym");
					  sb.append(" WHERE ACRONYM LIKE '"+AcronymString+"%'");
					  				   }
			   else if( AcronymSelectString.equals("Is Exactly" ) ){
					  System.out.println("IN Is Exactly .....Acronym");
					  sb.append(" WHERE ACRONYM LIKE '"+AcronymString+"'");
					  				   }
			   else if( AcronymSelectString.equals("Contains" ) ){
					  System.out.println("IN Contains.....Acronym");
					  sb.append(" WHERE ACRONYM LIKE '%"+AcronymString+"%'");
					  }
				  
				  
			  }
		
			if( (AppNameString != null) && !(AppNameString.equals(""))   && (AcronymString != null)&& !(AcronymString.equals(""))){
			
			System.out.println("Appname and Acronym are not null");
			
			//StringBuffer ab = new StringBuffer("SELECT distinct ACRONYM  from D_TBL_CMS_MAL");
			
			if ( AppSelectString.equals("Starts With" ) ){
				  System.out.println("IN starts with .....Application Name");
				  sb.append(" WHERE NAME LIKE '"+AppNameString+"%'");
				  }
			  else if(AppSelectString.equals("Is Exactly" )){
				  System.out.println("Is Exactly with .....Application Name");
				  sb.append(" WHERE NAME LIKE '"+AppNameString+"'");
				  }
			  else if(AppSelectString.equals("Contains" )){
				  System.out.println("Contains with .....Application Name");
				  sb.append(" WHERE NAME LIKE '%"+AppNameString+"%'");
				  }
			
			if ( AcronymSelectString.equals("Starts With" ) ){
				  System.out.println("IN starts with .....Acronym");
				  sb.append(" AND ACRONYM LIKE '"+AcronymString+"%'");
				  
			   }
			else if( AcronymSelectString.equals("Is Exactly" ) ){
				  System.out.println("IN Is Exactly .....Acronym");
				  sb.append(" AND ACRONYM LIKE '"+AcronymString+"'");
				
			   }
			else if( AcronymSelectString.equals("Contains" ) ){
				  System.out.println("IN Contains.....Acronym");
				  sb.append(" AND ACRONYM LIKE '%"+AcronymString+"%'");
				 
			   }
		}
			
			appAcroname = sb.toString();
			appAcroNym1 = (ArrayList)dao.getAppAcroNym(appAcroname);
			System.out.println("================== appacronym1 after search ===================="+appAcroNym1.size());
			System.out.println("appAcroNym size  "+appAcroNym1.size());
			if(appAcroNym1.size() == 0){
				actionErrors.add("error", new ActionError("error.search"));
				saveErrors(request, actionErrors);
				return mapping.findForward("searchError");
				//return mapping.findForward("searchError");
			}
				for(int i=0;i<appAcroNym1.size();i++){
					
				    CMSBO bo = new CMSBO();
				    String[] strArr = (String[])appAcroNym1.get(i); 
					bo.setAppName(strArr[0]);
	                System.out.println("getAppName   "+bo.getAppName());
					bo.setAcronym(strArr[1]);
					System.out.println("getAcronym   "+bo.getAcronym());
					appAcroNym.add(bo);
					session.setAttribute("AppList", appAcroNym);
					
					
				}
				 
			
			  }catch(Exception e){
				
			  }
			  
			  if(appAcroNym.size()!=0){
			      return mapping.findForward("http:\\www.google.com");
			  }else{
			      return mapping.findForward("http:\\theq");
			  }
			  //return mapping.findForward("SearchResults");
			  //return mapping.findForward("SearchResults");
			
    }
	

	public ActionForward certdetails(ActionMapping mapping, 
			ActionForm form, HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		
		HttpSession session = request.getSession();
		System.out.println("in certdetails cmsaction  ");
		
		String appName = (String)session.getAttribute("appName");
		System.out.println("appName in certdetails ==================== "+appName);
						    
		    String netPin =(String) request.getParameter("netPin");
		    String appId =(String) request.getParameter("appId");
		   // String firstContact =(String) request.getParameter("firstContact");
		  //  String secondContact =(String) request.getParameter("secondContact");
		    System.out.println("netpin ================  "+netPin);
		    System.out.println("appId ================  "+appId);
		  //  System.out.println("firstContact ================  "+firstContact);
		   // System.out.println("secondContact ================  "+secondContact);
		    ArrayList cscDetails = (ArrayList)session.getAttribute("cscDetails");
		    System.out.println("array size in action "+cscDetails.size());
		    
		    		    
   if ((request.getParameter("netPin") == null)||(request.getParameter("appId") == null)){
			
			for(int i=0;i<cscDetails.size();i++){
			    CMSBO bo = (CMSBO)cscDetails.get(i);
			    netPin = bo.getNetPin();
			    appId = bo.getAppID();
			//    firstContact = bo.getFirstContact();
			 //   secondContact = bo.getSecondContact();
			    System.out.println("netPin from ArrayList "+netPin);
			}
		    }
   
   		  session.setAttribute("appId", appId);
   		 session.setAttribute("netPin", netPin);
   		    
   		 try {
		    HashMap map = (HashMap)com.qwest.cms.utils.NETGroupDataClient.getGroupPinDetails(netPin);
		    session.setAttribute("netmap", map);
		    
		} catch (Exception exception) {
	    		//if(exception instanceof RemoteException)
	    			if(exception.getMessage().indexOf("NullPointerException")!=-1){
	    			System.out.println("Net Tool Pin is not valid");
	    			if ((request.getParameter("netPin") == null)||(request.getParameter("appId") == null)){
	    			request.setAttribute("invalid", "INVALID NET-PIN");
	    			System.out.println("invalid=============");
	    			}else{
	    			request.setAttribute("invalidNet", "INVALID NET-PIN");
	    			System.out.println("invalidNet============");
	    			}
	    			return mapping.findForward("getAppInfo");
	    			}
	    				
			    else{
				exception.printStackTrace();
			    
	    		logger.error("NET-PIN is INCORRECT");
	    		actionErrors.clear();
				  actionErrors.add("errMessnet", new ActionError("error.netpin"));
				  saveErrors(request, actionErrors);
			return mapping.findForward("getAppInfo");	
		}
		}
		    
		    
   		    String app_id = ((String)session.getAttribute("appId")).toUpperCase();
   		    System.out.println("app_id in $$$$$$$$$$$$$$$$$$$ "+app_id);
		     ArrayList idDao1 = (ArrayList) session.getAttribute("iD");
		      for(int j=0;j<idDao1.size();j++){
			CMSBO bo = (CMSBO)idDao1.get(j);
			String idDao = bo.getID();
			System.out.println("idDAo ####################### "+idDao);
		    		
		    StringBuffer ab = new StringBuffer("update "+CmsDbTable.CSC_APP_INFO+" set NETPIN = '"+netPin+"', APPLICATION_ID = '"+appId+"'");
		    ab.append(" where id = '"+idDao+"'");
		    String appInfo = ab.toString();
		    GenericDAO genDao = new GenericDAO();
		    genDao.getAppInfo(appInfo);
		  
		    }
		ActionMessages actionMessages = new ActionMessages();
		//String searchHostIDQuery = " select  m.SERVER_NAME from CSC_APP_INFO m,MAL_APP_HIERARCHY n where n.ID = m.ID and NAME = '"+appName+"'";
		
		String searchHostIDQuery = " select distinct SERVER_NAME from "+CmsDbTable.CSC_APP_INFO+" where APPLICATION_ID =  '"+appId+"' and NETPIN = '"+netPin+"'";
		
		GenericDAO dao = new GenericDAO();
		ArrayList hostList = new ArrayList();
		ArrayList hostList1 = new ArrayList();
		
		hostList=(ArrayList) dao.getHostIDList(searchHostIDQuery);
		System.out.println("hostlist size in getHostIDList &&&&&&&&&&&&&&&&&&&&"+hostList.size());
		if(hostList.size()==0){
		    actionErrors.clear();
			actionErrors.add("error", new ActionError("error.searchApp"));
			saveErrors(request, actionErrors);
			return mapping.findForward("searchError");
		}
		else{
			for (int i=0;i<hostList.size();i++){
			CMSBO bo = new CMSBO();
			String[] hostId = (String[])hostList.get(i);
			bo.setHostId(hostId[0]);
			hostList1.add(bo);
			System.out.println("getHostId   "+bo.getHostId());
			
		}
		
		System.out.println("netpin in else block .... "+netPin);
		String netPin1 = (String)session.getAttribute("net");
		System.out.println("net from session .... "+session.getAttribute("net"));
		String appName1=(String)session.getAttribute("appName");
		System.out.println("appName1 ------------- "+appName1);
		String appIdSession = ((String)session.getAttribute("appId")).toUpperCase();
		System.out.println("appid from session "+appIdSession);
				
		if((!(netPin.equals(netPin1)) && (netPin1!=null))||(!(appId.equals(appIdSession)) && (appIdSession!=null))){
		//if((!(netPin.equals(netPin1)) && (netPin1!=null))){ 
		    System.out.println("netPins are different... Sending Mail ");
		    System.out.println("AppIDs are different... Sending Mail");
		    CmsMail cmsMail = new CmsMail();
		    String subject = null;
		    String message = null;
		    String fromList = "cmsAdmin@qwest.com";
		    String toList = null;
		    String netPinValue = netPin;
		    String[] cuids=null;
		    String[] ccList =null;
		    String[] ccListLocal={CMSProperties.getString("autoAlarmCCList")};
		    
		    	try {
			    HashMap map = (HashMap)com.qwest.cms.utils.NETGroupDataClient.getGroupPinDetails(netPin);
			    cuids=(String[])map.get("GroupMembersCuid");
			    System.out.println("cuids from Map ...... "+cuids.length);
			} catch (RuntimeException e) {
			    // TODO Auto-generated catch block
			    e.printStackTrace();
			}
			
		   String cuid=session.getAttribute("login").toString();
		   System.out.println("Login Cuid =========== "+cuid);
		   toList = cuid;
		   System.out.println("tolist --------- > "+toList);
		   
		   subject = CMSProperties.getString("Net_mail_sub");
		    
		   	    
		        message = "\n\n" + "You have changed the Following Details .. " +"\n";
			message = message + "\n\n" + "NetPin - "+netPin+" "  ;
			message = message + "\n\n" + "Application Name - "+appIdSession+" ";
			message = message + "\n\n" + "***This is an autogenerated mail.  Please do not reply. ***" ;
		
		   
		   
		   if(CMSProperties.getString("Net_Edit").equals("test")){
		       System.out.println("Testing........."+ccListLocal);
		       cmsMail.sendMessage(subject, message, fromList, toList, ccListLocal);
		   }
		   else{
		       ccList = cuids;
		       cmsMail.sendMessage(subject, message, fromList, toList, ccList);
		   }
		    
		    
		
		}
		else{
		    System.out.println("========= Same ==========");
		}
		session.setAttribute("hostList1", hostList1);
		/*HashMap map = new HashMap();
		for(int j=0;j<hostList1.size();j++){
				 CMSBO cmsbo = (CMSBO)hostList1.get(j);
				String hostID=(String)cmsbo.getHostId();
				System.out.println("===== hostId in certdetails........" + hostID);
		
	   String searchUserNameQuery = " select distinct  APPLICATION_NAME from D_TBL_CMS_CERTIFICATES  where HOST_ID = '"+hostID+"'";
		
		ArrayList userDetails = new ArrayList();
		
		GenericDAO gendao = new GenericDAO();
		userDetails=(ArrayList) gendao.getUserDetails(searchUserNameQuery);
		System.out.println("in certdetails username details array size  "+userDetails.size());
		session.setAttribute("userDetails", userDetails);
		map.put(hostID,userDetails);
		
		session.setAttribute("appMap", map);
		System.out.println("size of map   "+map.size());
			}*/
		}
		
		/*CMSBO bo = new CMSBO();
		String netPin = bo.getNetPin();
		System.out.println("net pin in cmsaction   "+netPin);*/
		//return mapping.findForward("getServerDetails");
		return mapping.findForward("getNetGrpDetails");
	}
	
	public ActionForward certSerdetails(ActionMapping mapping, 
			ActionForm form, HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
	    System.out.println("inside new certSerdetails *********************");
	    return mapping.findForward("getServerDetails");
	}

	
	public ActionForward getContactDetails(ActionMapping mapping, 
			ActionForm form, HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
	    
	    CMSBO cmsbo = new CMSBO();
	    System.out.println("inside getContactDetails action *****************88");
	    HttpSession session = request.getSession();
	    GenericDAO dao = new GenericDAO();
	   // if(request.getParameter("appSearch")!=null)
	    session.setAttribute("appName",request.getParameter("appSearch"));
	    String appName = (String)session.getAttribute("appName");
	    String cuid=session.getAttribute("login").toString();
	        String netPin=(String)session.getAttribute("netPin");
	    System.out.println("netPin in getContactDetails    "+netPin);
	    System.out.println("appName in getContactDetails    "+appName);
	    
	    session.setAttribute("net", netPin);
	    session.setAttribute("appName", appName);
	    
	    if(request.getParameter("appSearch")==null){
	    try {
		session.setAttribute("appName",request.getParameter("app_name"));
		System.out.println("inside if appName "+appName);
		HashMap map=(HashMap)session.getAttribute("netmap");
		System.out.println("map size in getContactDetails   " +map.size());
		String[] cuids=(String[])map.get("GroupMembersCuid");
		System.out.println("cuids length  "+cuids.length);
		String result="false";
		
		      for(int i=0;i<cuids.length;i++){
		          if(cuid.equals(cuids[i])){
		              result="true";
		              break;
		          }
		          
		      } 
		      if(result=="true"){
		              return mapping.findForward("getAppInfo");
		          }else{
		              System.out.println("Not a Memeber!!! "+cuid);
		              request.setAttribute("error", "You are not a Member of this Application");
			      return mapping.findForward("getNetGrpDetails");
		          }
				    	
	    } 
	    catch (RuntimeException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	    }
	    }
	    
	    
	  //  System.out.println("login id in contactdetails "+cuid);
	    System.out.println("appName in getContactDetails ==================== "+appName);
	    
		try {
		    StringBuffer sb = new StringBuffer("select distinct Id from "+CmsDbTable.CSC_APP_INFO+" ");
		    sb.append(" where id = (select id from "+CmsDbTable.MAL_APP_HIERARCHY+" where name = '"+appName+"' )");
		    String iD = sb.toString();
		    ArrayList getId1 = new ArrayList();
		    ArrayList getId = new ArrayList();
		    getId1 = (ArrayList)dao.getAppId(iD);
		    System.out.println("Id in cmsaction size  "+getId1.size());
		    for(int i=0;i<getId1.size();i++){
		    CMSBO bo = new CMSBO();
		    String applicationId = (String)getId1.get(i);
		    bo.setID(applicationId);
		   		    getId.add(bo);
		    }
		    session.setAttribute("iD", getId);
		    ArrayList idDao1 = (ArrayList) session.getAttribute("iD");
		    ArrayList cscDetails = new ArrayList();
		      for(int j=0;j<idDao1.size();j++){
			CMSBO bo = (CMSBO)idDao1.get(j);
			String idDao = bo.getID();
			System.out.println("idDAo ####################### "+idDao);
		    
		    String details = "select distinct netpin, APPLICATION_ID from "+CmsDbTable.CSC_APP_INFO+" where id = '"+idDao+"'";
		     
		    String appIdBef=null;
		    
		 ArrayList cscDetails1 = (ArrayList)dao.getCscDetails(details);
		    System.out.println("cscdetails size in action *********************** "+cscDetails1.size());
		    for(int i=0;i<cscDetails1.size();i++){
			String[] strArr = (String[])cscDetails1.get(i);
			cmsbo.setNetPin(strArr[0]);
			cmsbo.setAppID(strArr[1]);
			cscDetails.add(cmsbo);
			System.out.println("CMSACTIOn  "+cmsbo.getNetPin()+" "+cmsbo.getAppID());
			
		    }
	    
		    session.setAttribute("cscDetails", cscDetails);
		    
		    for(int i=0;i<cscDetails.size();i++){
			CMSBO cms = (CMSBO)cscDetails.get(i);
			appIdBef= cms.getAppID();
			System.out.println("appIdBef in for loop ... "+appIdBef);
		    }
		    
		    System.out.println("appIdBefore ... "+appIdBef);
		    session.setAttribute("appIdBef", appIdBef);
		    
		      }
		      if(cscDetails.size()>0&&request.getParameter("app_name")==null){
		         return certdetails( mapping,form, request, response);
		      }else{
		          session.setAttribute("appName",request.getParameter("app_name"));
		          actionErrors.clear();
		          return mapping.findForward("getAppInfo");
		      }
		  /*  for(int j=0;j<appList1.size();j++){
		        CMSBO bo = new CMSBO();
		        String[] strArr = (String[])appList1.get(j);
		       	}*/
		} catch (RuntimeException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		    return mapping.findForward("getAppInfo");
		}	    
	}
	
	public ActionForward getCertDetails(ActionMapping mapping, 
			ActionForm form, HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		
		System.out.println("in getCertDetails cmsaction  ");
		String addCertTrue="true";
		HttpSession session = request.getSession();
		session.setAttribute("serverName", request.getParameter("serverName"));
		String serverName = (String)session.getAttribute("serverName");
		System.out.println("hostId    "+serverName);
		String appName1 = (String)session.getAttribute("appName");
		String app_id = (String)session.getAttribute("appId");
		System.out.println("appName in getCertDetails ==================== "+appName1);
		
		String cuid = (String)session.getAttribute("login");
		System.out.println("Login Cuid in getCertDetails cmsaction "+cuid);
		GenericDAO gendao = new GenericDAO();
		ArrayList certDetails1 = new ArrayList();
		ArrayList certDetails = new ArrayList();
		StringBuffer sb = new StringBuffer( "select  m.cert_seq_nu,m.APPLICATION_NAME,m.ACRONYM,m.CERT_NICKNAME,m.CERT_TYPE,m.EXPIRE_ON,m.STATUS,n.RAW_CERTIFICATE from "+CmsDbTable.TBL_CMS_CERTIFICATES+" m,"+CmsDbTable.TBL_CMS_CERT_DETAILS+" n"); 
		sb.append(" where n.SERIALNO = m.SERIAL_NO and m.HOST_ID ='"+serverName+ "' AND m.ISSUER=n.ISSUER and m.APPLICATION_NAME='"+app_id+"'");
		String certList = sb.toString();
		certDetails1 = (ArrayList)gendao.getSearchCertDetails(certList);
		System.out.println("certDetails array length  "+certDetails1.size());
		
		for(int i=0;i<certDetails1.size();i++){
				String[] strArr = (String[])certDetails1.get(i);
				CMSBO cms = new CMSBO();
				System.out.println("serial no in certDetails =========> "+strArr[0]);
				cms.setSerialNo(strArr[0]);
				cms.setAppName(strArr[1]);
				cms.setAcronym(strArr[1]);
				cms.setNickName(strArr[3]);
				cms.setType(strArr[4]);
				cms.setExpDate(strArr[5]);
				cms.setStatus(strArr[6]);
				if ( strArr[7].indexOf('/') != -1){
					cms.setRaw_certificate(strArr[7].substring(strArr[7].lastIndexOf('#')+1,strArr[7].length()).toUpperCase());
					System.out.println("rawcertificate.../ "+cms.getRaw_certificate());
				}
				if ( strArr[7].indexOf('\\') != -1){
					cms.setRaw_certificate(strArr[7].substring(strArr[7].lastIndexOf('#')+1,strArr[7].length()).toUpperCase());
					System.out.println("rawcertificate...\\ "+cms.getRaw_certificate());
				}
				/*
				System.out.println(strArr[0]);
				System.out.println(strArr[1]);	
				System.out.println(strArr[2]);	
				System.out.println(strArr[3]);	
				System.out.println(strArr[4]);	
				System.out.println(strArr[5]);
				System.out.println(strArr[6]);
				System.out.println(strArr[7]);
				*/
				certDetails.add(cms);			
			}
			session.setAttribute("accountList", certDetails);
			if(certDetails.size()==0){
			   // return new CMSAction().sendReq(mapping, form, request, response);
			    CmsMail cmsMail = new CmsMail();
			    String subject = null;
			    String message = null;
			    String fromList = null;
			    String toList = null;
			    String appName = appName1;
			    String appServer = serverName;
			    toList = cuid.toUpperCase();	   
			    String[] cclist = {cuid};
			    subject = CMSProperties.getString("AIP_mail_sub");
			    String appId = ((String)session.getAttribute("appId")).toUpperCase();
			    System.out.println("appId in getCertDetails in cmsaction "+appId);
			    
			    			    
			    //String fileAttachment =CMSProperties.getString("Script_path");
			    String fileAttachment =CMSProperties.getString("searchScript");
			    message = "\n\n" + CMSProperties.getString("User_mail_body1") + " - " + appServer + "\n";
			    message = message + "\n\n" + "Login with "+app_id+" name and run the script"  ;
			    message = message + "\n\n" + "***This is an autogenerated mail.  Please do not reply. ***"+ "\n\n\n" ;
			   
			    cmsMail.sendMessWithAttach(subject, message, fromList, toList, cclist,fileAttachment);
			    return mapping.findForward("noCerts");			    
			}
			
			session.setAttribute("totalCert", new Integer(certDetails.size()));
			System.out.println("totalcert   "+new Integer(certDetails.size()));
			System.out.println("checkedRadioValue in search   "+session.getAttribute("checkedRadioValue"));
			session.removeAttribute("checkedRadioValue");
			session.removeAttribute("pageToCall");
			session.setAttribute("addCertTrue", addCertTrue);				
		return mapping.findForward("home");
	}
		
	public ActionForward report(ActionMapping mapping, 
		ActionForm form, HttpServletRequest request, 
		HttpServletResponse response) throws Exception {
	    	
	    System.out.println("-----------inside reportGen CMSACTION-------------");
	    HttpSession session = request.getSession();
	    GenericDAO dao = new GenericDAO();
	    String mgrQuery = "SELECT DISTINCT MANAGER_NAME ,APP_CUID FROM "+CmsDbTable.CERT_AUTO_ALARM+"";
	    HashMap map = (HashMap)dao.getMgrNames(mgrQuery);
	    session.setAttribute("map", map);
	    System.out.println("Arraysize mgrList +++++++++ "+map.size());
	    ArrayList appList = new ArrayList();
	    ArrayList mgrList = new ArrayList();
	
	    
	    try {
		Set appSet = map.keySet();
		Iterator it = appSet.iterator();
		while(it.hasNext()){
		    String mgr= it.next().toString();
		    CMSBO bo = new CMSBO();
			bo.setMgrName(mgr);
			mgrList.add(bo);
			
		    	ArrayList appList1 = (ArrayList)map.get(mgr);
			for(int i=0;i<appList1.size();i++){
			CMSBO cmsbo = new CMSBO();
			cmsbo.setMgrName(mgr);
			cmsbo.setAppName(appList1.get(i).toString());
			appList.add(cmsbo);
			}
		    			    
		}
				
		/*String mgrName = (String)request.getParameter("mgrName");
		System.out.println("inside Report Manager Name "+mgrName);*/

		 session.setAttribute("mgrList",mgrList);
		 session.setAttribute("appList",appList);
	    } catch (RuntimeException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	    
	    	
	    /*for(int i=0;i<mgrList1.size();i++){
		String strArr = (String)mgrList1.get(i);
		CMSBO bo = new CMSBO();
		bo.setMgrName(strArr);
		mgrList.add(bo);
	    }*/
	   // session.setAttribute("mgrList", mgrList);
	   // map.put(mgrList, arg1)
	    
	    /*String appQuery = "SELECT DISTINCT APPLICATION_NAME FROM D_TBL_CMS_CERTIFICATES ";
	    ArrayList appNames1 = (ArrayList)dao.getUserDetails(appQuery);
	    ArrayList appNames = new ArrayList();
	    for(int i=0;i<appNames1.size();i++){
		CMSBO bo = new CMSBO();
		String applicationName = (String)appNames1.get(i);
		bo.setAppName(applicationName);
		appNames.add(bo);
	    }
	    
	   // session.setAttribute("appNames", appNames);
	    HashMap map = new HashMap();
	    map.put(mgrList, appNames);
	       	    
	   // ArrayList appNameList = new ArrayList();
	    
	    String mgrName = (String)request.getParameter("mgrName");
	    System.out.println("inside Report Manager NAme "+mgrName);
	    
	    if(request.getParameter("mgrName")!= null){
		Set appSet = map.keySet();
		Iterator it = appSet.iterator();
		while(it.hasNext()){
		    CMSBO bo = new CMSBO();
		    String key= it.next().toString();
			bo.setMgrName(key);
			bo.setAppName(map.get(key).toString());
			appNames.add(bo);
		}
		*/
	    
	    /*String appNameQuery = "SELECT DISTINCT B.APPLICATION_NAME FROM D_TBL_CMS_CERTIFICATES B, D_CERT_AUTO_ALARM A WHERE A.MANAGER_NAME = '"+mgrName+"'";
	    ArrayList appNameList1 = (ArrayList)dao.getUserDetails(appNameQuery);
	   
	    System.out.println("appNameList1 ======>>>> "+appNameList1.size());
	    for(int i=0;i<appNameList1.size();i++){
		CMSBO bo = new CMSBO();
		String appName = (String)appNameList1.get(i);
		bo.setAppName(appName);
		appNameList.add(bo);
		//System.out.println("appName in action "+bo.getAppName());
	    }*/
	   /* } 
	    session.setAttribute("appNames", appNames);*/
	    //session.setAttribute("appNameList", appNameList);
	    return mapping.findForward("report");
	}
	
	public ActionForward getAppName(ActionMapping mapping, 
		ActionForm form, HttpServletRequest request, 
		HttpServletResponse response) throws Exception {
	    
	    String mgrName = request.getParameter("mgrName");
	    System.out.println("mgrName ======================= "+mgrName);
	    ArrayList appList = new ArrayList();
	    HttpSession session = request.getSession();
	    HashMap map = (HashMap)session.getAttribute("map");
	    System.out.println("Map size in getAppNAme action ================== "+map.size());
	    CMSBO bo = new CMSBO();
	    bo.setMgrName(mgrName);
	    	ArrayList appList2 = (ArrayList)map.get(mgrName);
		for(int i=0;i<appList2.size();i++){
			CMSBO cms = new CMSBO();
			cms.setMgrName(mgrName);
			cms.setAppName(appList2.get(i).toString());
			appList.add(cms);
		    }
		session.setAttribute("appList", appList);
	    
	    return mapping.findForward("report");
	}
	
	public ActionForward getDoc(ActionMapping mapping, 
		ActionForm form, HttpServletRequest request, 
		HttpServletResponse response) throws Exception {
	    
	    System.out.println("************* inside getDoc action **************");
	    
	     //String file = CMSProperties.getString("CSR_file_path1")+"certs5-20-09"+".csv";
	    String file = CMSProperties.getString("msCertsCSV")+"certs5-20-09"+".csv";
	     FileInputStream fin = new FileInputStream(file);
	     int size = fin.available();
		response.setContentLength(size);
		byte[] ab = new byte[size];
		OutputStream os = response.getOutputStream();
		response.setContentType("application/csv");
	   	response.setHeader("Content-Disposition","attachment;filename=certs5-20-09.csv");
		int bytesread;
		do{
			bytesread = fin.read(ab,0,size);
			if(bytesread >-1)
				os.write(ab,0,bytesread );
			}while(bytesread >-1);
		fin.close();
		os.flush();
		os.close();
	     
	     return mapping.findForward("report");
	}
	
	public ActionForward getReport(ActionMapping mapping, 
		ActionForm form, HttpServletRequest request, 
		HttpServletResponse response) throws Exception {
	    	
	    try {
		System.out.println("-----------inside getReport CMSACTION-------------");
		String mgrName = (String)request.getParameter("mgrName");
		System.out.println("inside getReport Manager NAme "+mgrName);
		GenericDAO dao = new GenericDAO();
		HttpSession session = request.getSession();
		String selAppName = (String)request.getParameter("appName");
		String expAfterDate = (String)request.getParameter("expAfterDate");
		String expBefDate = (String)request.getParameter("expBefDate");
		
		
		System.out.println("expAfterDate =======> "+expAfterDate);
		System.out.println("expBefDate 111111111111=======> "+expBefDate);
		System.out.println("appName in action "+selAppName);
		StringBuffer sb = new StringBuffer();
		
		if(mgrName!=null && !(mgrName.equals("")) && selAppName.equals("") && expAfterDate.equals("") && expBefDate.equals("")){
		    System.out.println("only if MGR name is not null===============");
		
		sb.append("SELECT b.HOST_ID,b.APPLICATION_NAME,b.ISSUER,c.SUBJECT, b.SERIAL_NO,b.EXPIRE_ON, b.CERT_PATH_SERVER");
		sb.append("  FROM "+CmsDbTable.TBL_CMS_CERTIFICATES+" b ,"+CmsDbTable.TBL_CMS_CERT_DETAILS+" c");
		sb.append(" WHERE b.ISSUER=c.ISSUER AND b.SERIAL_NO=c.SERIALNO AND b.HOST_ID IN");
		sb.append(" (SELECT host_id FROM "+CmsDbTable.CERT_AUTO_ALARM+" a WHERE a.MANAGER_NAME='"+mgrName+"')");
		sb.append(" AND b.APPLICATION_NAME IN(SELECT APP_CUID FROM "+CmsDbTable.CERT_AUTO_ALARM+" a WHERE a.MANAGER_NAME='"+mgrName+"')");
		
		}
		else if(!(expAfterDate.equals(""))&& !(expBefDate.equals("")) && selAppName.equals("") && mgrName.equals("")){
		    
		    try{		   
			   SimpleDateFormat sdfSource  = new SimpleDateFormat("MM/dd/yy");
			   Date dateafter = sdfSource.parse(expAfterDate);
			   Date datebef = sdfSource.parse(expBefDate);
			   
			   SimpleDateFormat sdfDestination = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
			   
			   expAfterDate = sdfDestination.format(dateafter);
			   expBefDate = sdfDestination.format(datebef);
			  }catch(Exception e){
			      e.printStackTrace();
			  }
			   System.out.println("Date is converted from dd/MM/yy format to MM-dd-yyyy hh:mm:ss");  
			   System.out.println("Converted date is expAfter : " + expAfterDate);
			   System.out.println("Converted date is expBef 111111: " + expBefDate);
		    
		    
		   System.out.println("only if expiry date is not null=======================");
		   sb.append("SELECT b.HOST_ID,b.APPLICATION_NAME,b.ISSUER,c.SUBJECT, b.SERIAL_NO,b.EXPIRE_ON, b.CERT_PATH_SERVER");
		   sb.append(" FROM "+CmsDbTable.TBL_CMS_CERTIFICATES+" b ,"+CmsDbTable.TBL_CMS_CERT_DETAILS+" c ");
		   sb.append(" WHERE b.ISSUER=c.ISSUER AND b.SERIAL_NO=c.SERIALNO AND b.EXPIRE_ON ");
		   sb.append(" between to_date('"+expAfterDate+"','MM-DD-YYYY  HH24:MI:SS') and to_date('"+expBefDate+"', 'MM-DD-YYYY  HH24:MI:SS' )");
			   
		}
		else if(!(mgrName.equals(""))  && !(selAppName.equals("")) && !(expAfterDate.equals("")) && !(selAppName.equals(""))){
		    
		    try{		   
			   SimpleDateFormat sdfSource  = new SimpleDateFormat("MM/dd/yy");
			   Date dateafter = sdfSource.parse(expAfterDate);
			   Date datebef = sdfSource.parse(expBefDate);
			   
			   SimpleDateFormat sdfDestination = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
			   
			   expAfterDate = sdfDestination.format(dateafter);
			   expBefDate = sdfDestination.format(datebef);
			  }catch(Exception e){
			      e.printStackTrace();
			  }
			   System.out.println("Date is converted from dd/MM/yy format to MM-dd-yyyy hh:mm:ss");  
			   System.out.println("Converted date is expAfter : " + expAfterDate);
			   System.out.println("Converted date is expBef 111111: " + expBefDate);
		    
		 System.out.println("when all are not null================");
		sb.append("SELECT b.HOST_ID,b.APPLICATION_NAME,b.ISSUER,c.SUBJECT, b.SERIAL_NO,b.EXPIRE_ON, b.CERT_PATH_SERVER ");
		sb.append(" FROM "+CmsDbTable.TBL_CMS_CERTIFICATES+" b ,"+CmsDbTable.TBL_CMS_CERT_DETAILS+" c WHERE b.ISSUER=c.ISSUER AND b.SERIAL_NO=c.SERIALNO AND ");
		sb.append(" b.HOST_ID IN(SELECT host_id FROM "+CmsDbTable.CERT_AUTO_ALARM+" a WHERE a.MANAGER_NAME='"+mgrName+"')");
		sb.append(" AND b.APPLICATION_NAME = '"+selAppName+"' AND b.EXPIRE_ON ");
		sb.append(" between to_date('"+expAfterDate+"','MM-DD-YYYY  HH24:MI:SS') and to_date('"+expBefDate+"', 'MM-DD-YYYY  HH24:MI:SS' )");
		}
		
		else if(!(selAppName.equals(""))&& (expAfterDate.equals(""))&&(mgrName.equals(""))){
		    System.out.println("only if appName is not null====================");
		sb.append("SELECT b.HOST_ID,b.APPLICATION_NAME,b.ISSUER,c.SUBJECT, b.SERIAL_NO,b.EXPIRE_ON, b.CERT_PATH_SERVER FROM ");
		sb.append(" "+CmsDbTable.TBL_CMS_CERTIFICATES+" b ,"+CmsDbTable.TBL_CMS_CERT_DETAILS+" c WHERE b.ISSUER=c.ISSUER AND b.SERIAL_NO=c.SERIALNO ");
		sb.append(" AND b.APPLICATION_NAME = '"+selAppName+"'");
		}
		else if(!(selAppName.equals("")) && !(mgrName.equals("")) && expAfterDate.equals("")){
		    System.out.println("if appname and manager name is not null");
		   sb.append("SELECT b.HOST_ID,b.APPLICATION_NAME,b.ISSUER,c.SUBJECT, b.SERIAL_NO,b.EXPIRE_ON, b.CERT_PATH_SERVER ");
		   sb.append(" FROM "+CmsDbTable.TBL_CMS_CERTIFICATES+" b ,"+CmsDbTable.TBL_CMS_CERT_DETAILS+" c WHERE b.ISSUER=c.ISSUER AND b.SERIAL_NO=c.SERIALNO ");
		   sb.append(" AND b.HOST_ID IN(SELECT host_id FROM "+CmsDbTable.CERT_AUTO_ALARM+" a WHERE a.MANAGER_NAME='"+mgrName+"')");
		   sb.append(" AND b.APPLICATION_NAME IN(SELECT APP_CUID FROM "+CmsDbTable.CERT_AUTO_ALARM+" a WHERE a.MANAGER_NAME='"+mgrName+"')");
		   sb.append(" AND b.APPLICATION_NAME = '"+selAppName+"'");
		    
		}
		else if(!(expAfterDate.equals(""))&& !(expBefDate.equals("")) && selAppName.equals("") && !(mgrName.equals(""))){
		    
		    try{		   
			   SimpleDateFormat sdfSource  = new SimpleDateFormat("MM/dd/yy");
			   Date dateafter = sdfSource.parse(expAfterDate);
			   Date datebef = sdfSource.parse(expBefDate);
			   
			   SimpleDateFormat sdfDestination = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
			   
			   expAfterDate = sdfDestination.format(dateafter);
			   expBefDate = sdfDestination.format(datebef);
			  }catch(Exception e){
			      e.printStackTrace();
			  }
			   System.out.println("Date is converted from dd/MM/yy format to MM-dd-yyyy hh:mm:ss");  
			   System.out.println("Converted date is expAfter : " + expAfterDate);
			   System.out.println("Converted date is expBef 111111: " + expBefDate);
		    
		    
		   System.out.println("if Mgrname and expiry date is not null=======================");
		   sb.append("SELECT b.HOST_ID,b.APPLICATION_NAME,b.ISSUER,c.SUBJECT, b.SERIAL_NO,b.EXPIRE_ON, b.CERT_PATH_SERVER");
		   sb.append(" FROM "+CmsDbTable.TBL_CMS_CERTIFICATES+" b ,"+CmsDbTable.TBL_CMS_CERT_DETAILS+" c ");
		   sb.append(" WHERE b.ISSUER=c.ISSUER AND b.SERIAL_NO=c.SERIALNO AND b.HOST_ID IN ");
		   sb.append(" (SELECT host_id FROM "+CmsDbTable.CERT_AUTO_ALARM+" a WHERE a.MANAGER_NAME='TRENT WEAVER')");
		   sb.append(" AND b.EXPIRE_ON between to_date('"+expAfterDate+"','MM-DD-YYYY  HH24:MI:SS') and to_date('"+expBefDate+"', 'MM-DD-YYYY  HH24:MI:SS' )");
			   
		}
		else if(!(expAfterDate.equals(""))&& !(expBefDate.equals("")) && !(selAppName.equals("")) && mgrName.equals("")){
		    
		    try{		   
			   SimpleDateFormat sdfSource  = new SimpleDateFormat("MM/dd/yy");
			   Date dateafter = sdfSource.parse(expAfterDate);
			   Date datebef = sdfSource.parse(expBefDate);
			   
			   SimpleDateFormat sdfDestination = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
			   
			   expAfterDate = sdfDestination.format(dateafter);
			   expBefDate = sdfDestination.format(datebef);
			  }catch(Exception e){
			      e.printStackTrace();
			  }
			   System.out.println("Date is converted from dd/MM/yy format to MM-dd-yyyy hh:mm:ss");  
			   System.out.println("Converted date is expAfter : " + expAfterDate);
			   System.out.println("Converted date is expBef 111111: " + expBefDate);
		    
		    
		   System.out.println("if Appname and expiry date is not null=======================");
		   sb.append("SELECT b.HOST_ID,b.APPLICATION_NAME,b.ISSUER,c.SUBJECT, b.SERIAL_NO,b.EXPIRE_ON, b.CERT_PATH_SERVER");
		   sb.append(" FROM "+CmsDbTable.TBL_CMS_CERTIFICATES+" b ,"+CmsDbTable.TBL_CMS_CERT_DETAILS+" c ");
		   sb.append(" WHERE b.ISSUER=c.ISSUER AND b.SERIAL_NO=c.SERIALNO ");
		   sb.append(" AND b.APPLICATION_NAME='"+selAppName+"'");
		   sb.append(" AND b.EXPIRE_ON between to_date('"+expAfterDate+"','MM-DD-YYYY  HH24:MI:SS') and to_date('"+expBefDate+"', 'MM-DD-YYYY  HH24:MI:SS' )");
			   
		}
		
		System.out.println("after if===========================");
		String repGenQuery = sb.toString();
		ArrayList csvData1 = (ArrayList)dao.getCsvData(repGenQuery);
		System.out.println("csvData1 size ===========> "+csvData1.size());
		
		if(csvData1.size() > 0){
		ArrayList csvData = new ArrayList();
		for(int i=0;i<csvData1.size();i++){
		CMSBO bo = new CMSBO();
		String[] strArr = (String[])csvData1.get(i);
		bo.setHostId(strArr[0]);
		bo.setAppName(strArr[1]);
		bo.setIssuer(strArr[2]);
		bo.setSubject(strArr[3]);
		bo.setSerialno(strArr[4]);
		bo.setExpireOn(strArr[5]);
		bo.setCertPathServer(strArr[6]);
		csvData.add(bo);
		}
		session.setAttribute("csvData", csvData);
		
		    
		StringBuffer csvBuffer = new StringBuffer("HOSTNAME , APPLICATION USERID, ISSUER, SUBJECT, SERIAL NUMBER, EXPIRY DATE, CERT_PATH_SERVER");
		csvBuffer.append("\n");
		
		for(int j=0;j<csvData.size();j++){
		CMSBO bo = (CMSBO)csvData.get(j);
		String hostId = bo.getHostId();
		String appName = bo.getAppName();
		String issuer = bo.getIssuer();
		String subject = bo.getSubject();
		String serialNo = bo.getSerialno();
		String expireOn = bo.getExpireOn();
		String certPathServer = bo.getCertPathServer();
		
		System.out.println("Expire on "+expireOn);
		
		if(expireOn.indexOf(" ")!=-1){
		      expireOn=expireOn.replaceAll(" ", " / ");
		}
		
		if(bo.getCertPathServer()==null){
		    certPathServer = CMSProperties.getString("noRawcert");
		}
		  
		if( issuer.indexOf(",")!= -1){
		issuer = issuer.replaceAll(",", "_");
		}
		
		if(subject.indexOf(",")!= -1){
		subject = subject.replaceAll(",", "_");
		}
		   
		csvBuffer.append(hostId+","+appName+","+issuer+","+subject+","+serialNo+","+expireOn+","+certPathServer);
		csvBuffer.append("\n");
				
		}
		
			String csvFileData = csvBuffer.toString();
		       	response.setContentType("application/csv");
		   	response.setHeader("Content-Disposition","attachment;filename="+mgrName+"_Report.csv");
			//System.out.println("*************************** "+csvFileData.getBytes().length);
			response.setContentLength(csvFileData.getBytes().length);
			OutputStream os = response.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			osw.write(csvFileData);
			osw.flush();
			osw.close();
			os.close();
	    	}else{
			System.out.println("============== No data found ==============");
			request.setAttribute("error", "No Data Found ..");
			return mapping.findForward("report");
		    }
	    }catch (RuntimeException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	
	    return mapping.findForward("report");
	}
	
	public ActionForward msCertsHome(ActionMapping mapping,
		   ActionForm form, HttpServletRequest request,
		   HttpServletResponse response)throws Exception{
	    
	    	System.out.println("msCertsHome ........ ");
	    	GenericDAO dao=new GenericDAO();
	    	HttpSession session=request.getSession();
	    	actionErrors.clear();
	    	session.removeAttribute("PopUpFilter");
	    		    	
	    	String reqName=null;
	    	String effData=null;
	    	String expData=null;
	    	String issuedOrg=null;
	    	String issuedComName=null;
	    	String status=null;
	    	String reqID=null;
	    	
	    	DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		java.util.Date date = new java.util.Date();
		String datetime = dateFormat.format(date);
		System.out.println("Current Date Time : " + datetime);
	    	
	    	//String detailsQuery="SELECT REQUESTOR_NAME, CERT_EFF_DATE, CERT_EXP_DATE, ISSUED_ORG, ISSUED_COMMON_NAME , REQUEST_ID, STATUS FROM "+CmsDbTable.LOAD_CERTS_FROM_EXCEL+" where rownum < 100 order by REQUEST_ID";
		String detailsQuery="SELECT REQUESTOR_NAME, CERT_EFF_DATE, CERT_EXP_DATE, ISSUED_ORG, ISSUED_COMMON_NAME , REQUEST_ID, STATUS FROM "+CmsDbTable.LOAD_CERTS_FROM_EXCEL+" WHERE STATUS = 'ACTIVE'";
	    	
	    	ArrayList excelData1=(ArrayList)dao.getLoadFromExcelData(detailsQuery);
	    	ArrayList excelData2=new ArrayList();
	    		    	
	    	System.out.println("excelData1.size() ........ "+excelData1.size());
	    	session.setAttribute("excelData1", excelData1);
	    	
	    	if(excelData1.size()==0){
	    	    System.out.println("No MsCerts Data.... ");
	    	    actionErrors.add("error", new ActionError("error.noMsCerts"));
	    	    saveErrors(request, actionErrors);
		    return mapping.findForward("editProfAuthCheck");	    	    
	    	}
   	
	    	for(int i=0;i<excelData1.size();i++){
	    	    String[] strArr=(String[])excelData1.get(i);
	    	    CMSBO bo=new CMSBO();
	    	    bo.setReqName(strArr[0]);
	    	    bo.setIssuedCommonName(strArr[1]);
	    	    bo.setIssuedOrg(strArr[2]);
	    	    bo.setCertEffDate(strArr[3]);
	    	    bo.setCertExpDate(strArr[4]);
	    	    bo.setReqID(strArr[5]);
	    	    bo.setStatus(strArr[6]);
	    	    excelData2.add(bo);
	    	}
	    	    
	    	/*if(strArr[4]!=null || strArr[4].equals(null)){
	                
	                //System.out.println(" before format: " + strArr[4] ); 
	                String  datem=strArr[4].substring(5,7);
	                int month = Integer.valueOf(datem).intValue();
	                String  dated=strArr[4].substring(8,10);
	                int day = Integer.valueOf(dated).intValue();
	                String  datey=strArr[4].substring(0,4);
	                int year = Integer.valueOf(datey).intValue();
	                //String date1= datem + "-" + dated + "-" + datey;
	                //String date1= "08-07-2009";
	               // System.out.println("Current Date format is: " + date1 );
	                String datems=datetime.substring(0,2);
	                int months = Integer.valueOf(datems).intValue();
	                String dateds=datetime.substring(3,5);
	                int days = Integer.valueOf(dateds).intValue();
	                String dateys=datetime.substring(6,10);
	                int years = Integer.valueOf(dateys).intValue();
	       int compresultm=date1.substring(0,2).compareTo(datetime.substring(0,2));
	                int compresultd=date1.substring(3,5).compareTo(datetime.substring(3,5));
	                int compresulty=date1.substring(6,10).compareTo(datetime.substring(6,10));
	                
	                if(year>years){
	                    status="ACTIVE";  
	                }
	                else{
	                    status="EXPIRED"; 
	                }
	                
	                if(year==years)
	                {
	                 if(month>months){
	                     status="ACTIVE";  
	                 }
	                 else{
	                     status="EXPIRED";     
	                 }
	                    
	                }
	                
	                if((year==years)&&(month==months)){
	   
	                    if(day>days){
	                        status="ACTIVE";  
	                    }
	                    else{
	                        status="EXPIRED";     
	                    }
	                }
	              bo.setStatus(status);  
	             //System.out.println("status --------- "+status);
	            }
	      
	             excelData2.add(bo);     
	             
	      }*/

	    	/*String next=(String)request.getParameter("next");
	    	
	    	//int size=excelData1.size()%10;
			    	    	
	    	if(next!=null){
	    	    int count =0;
		    int size=0;
		    if(count!=0)
		       size+=10;
		    else
		       size=0;
		    
		    System.out.println("size ...... "+size);
	    	    
	    	for(int i=size;i<=10;i++){
	    	    String[] strArr=(String[])excelData1.get(i);
	    	    CMSBO bo=new CMSBO();
	    	    bo.setReqName(strArr[0]);
	    	    bo.setIssuedCommonName(strArr[1]);
	    	    bo.setIssuedOrg(strArr[2]);
	    	    bo.setCertEffDate(strArr[3]);
	    	    bo.setCertExpDate(strArr[4]);
	    	    bo.setReqID(strArr[5]);
	    	    bo.setStatus(strArr[6]);
	    	    excelData2.add(bo);
	    	    }
	    	
	    	count++;
	    	size=size+10;
	    	System.out.println("after increament "+size);	   
	    	System.out.println("Count value "+count);
	    	}*/
	  	
	    	for(int j=0;j<excelData2.size();j++){
	    	    CMSBO cms=(CMSBO)excelData2.get(j);
	    	    reqName=cms.getReqName();
	    	    effData=cms.getCertEffDate();
	    	    expData=cms.getCertExpDate();
	    	    issuedOrg=cms.getIssuedOrg();
	    	    issuedComName=cms.getIssuedCommonName();
	    	    status=cms.getStatus();
	    	    reqID=cms.getReqID();
	    	    
	    	}
	    	session.setAttribute("excelData", excelData2);
	    	String filterValue = (String)session.getAttribute("PopUpFilter");
	    	System.out.println("filter Value in mscertsHome... "+filterValue);
   
	    return mapping.findForward("msCertsHome");
	    	
	}

	/*public ActionForward msHomeNext(ActionMapping mapping,
		   ActionForm form, HttpServletRequest request,
		   HttpServletResponse response)throws Exception{
	    
	    	System.out.println("msHomeNext ....");
	    	HttpSession session=request.getSession();
	    
	    	String reqName=null;
	    	String effData=null;
	    	String expData=null;
	    	String issuedOrg=null;
	    	String issuedComName=null;
	    	String status=null;
	    	String reqID=null;
	    	
	    	ArrayList excelData=new ArrayList();
	    	ArrayList excelData1=(ArrayList)session.getAttribute("excelData1");
	    	System.out.println("excelData1 size from session ... "+excelData1.size());
	    
	    	String next=(String)request.getParameter("next");
	    	
	    	//int size=excelData1.size()%10;
			    	    	
	    	if(next!=null){
	    	    int count = 0;
		    int size=0;
		    if(count!=0)
		       size+=10;
		    else
		       size=0;
		    System.out.println("size ...... "+size);
	    	    
	    	for(int i=size;i<=10;i++){
	    	    String[] strArr=(String[])excelData1.get(i);
	    	    CMSBO bo=new CMSBO();
	    	    bo.setReqName(strArr[0]);
	    	    bo.setIssuedCommonName(strArr[1]);
	    	    bo.setIssuedOrg(strArr[2]);
	    	    bo.setCertEffDate(strArr[3]);
	    	    bo.setCertExpDate(strArr[4]);
	    	    bo.setReqID(strArr[5]);
	    	    bo.setStatus(strArr[6]);
	    	    excelData.add(bo);
	    	    }
	    	
	    	count++;
	    	size=size+10;
	    	System.out.println("after increament "+size);	   
	    	System.out.println("Count value "+count);
	    	}
	    	
	    	for(int j=0;j<excelData.size();j++){
	    	    CMSBO cms=(CMSBO)excelData.get(j);
	    	    reqName=cms.getReqName();
	    	    effData=cms.getCertEffDate();
	    	    expData=cms.getCertExpDate();
	    	    issuedOrg=cms.getIssuedOrg();
	    	    issuedComName=cms.getIssuedCommonName();
	    	    status=cms.getStatus();
	    	    reqID=cms.getReqID();
	    	    
	    	}
	    		session.setAttribute("excelData", excelData);

	    	return mapping.findForward("msCertsHome");
	}*/
	
	public ActionForward msStatusFilter(ActionMapping mapping,
		   ActionForm form, HttpServletRequest request,
		   HttpServletResponse response)throws Exception{
	    
	    	System.out.println("msStatusFilter .... ");
	    	
	    	GenericDAO dao=new GenericDAO();
	    	HttpSession session=request.getSession();
	    	actionErrors.clear();
	    	
	    	session.removeAttribute("PopUpFilter");
	    	
	    	String reqName=null;
	    	String effData=null;
	    	String expData=null;
	    	String issuedOrg=null;
	    	String issuedComName=null;
	    	String status=null;
	    	String reqID=null;
	    	
	    	String statusFromReq=(String)request.getParameter("status");
	    	System.out.println("status ..... "+statusFromReq);
	    	
	    	StringBuffer sb=new StringBuffer("SELECT REQUESTOR_NAME,CERT_EFF_DATE, CERT_EXP_DATE, ISSUED_ORG, ISSUED_COMMON_NAME , REQUEST_ID, STATUS");
	    	sb.append(" FROM "+CmsDbTable.LOAD_CERTS_FROM_EXCEL+"");
	    	
	    	if(statusFromReq.equals("ACTIVE") || statusFromReq.equals("EXPIRED")){
	    	    sb.append(" WHERE STATUS = '"+statusFromReq+"'");
	    	}
	    	
	    	String query=sb.toString();
	    	ArrayList list1=(ArrayList)dao.getLoadFromExcelData(query);
	    	
	    	if(list1.size()==0){
	    	    System.out.println("Forwarding to no active accounts found ");
		    actionErrors.add("error", new ActionError("error.noCertForStatus"));
		    saveErrors(request, actionErrors);
		    return mapping.findForward("editProfAuthCheck");
	    	}
	    	
	    	ArrayList list=new ArrayList();
	    	
	    	for(int i=0;i<list1.size();i++){
	    	    String[] strArr=(String[])list1.get(i);
	    	    CMSBO bo=new CMSBO();
	    	    bo.setReqName(strArr[0]);
	    	    bo.setIssuedCommonName(strArr[1]);
	    	    bo.setIssuedOrg(strArr[2]);
	    	    bo.setCertEffDate(strArr[3]);
	    	    bo.setCertExpDate(strArr[4]);
	    	    bo.setReqID(strArr[5]);
	    	    bo.setStatus(strArr[6]);
	    	    list.add(bo);
	    	}
	    	
	    	for(int j=0;j<list.size();j++){
	    	    CMSBO cms=(CMSBO)list.get(j);
	    	    reqName=cms.getReqName();
	    	    effData=cms.getCertEffDate();
	    	    expData=cms.getCertExpDate();
	    	    issuedOrg=cms.getIssuedOrg();
	    	    issuedComName=cms.getIssuedCommonName();
	    	    status=cms.getStatus();
	    	    reqID=cms.getReqID();
	    	    
	    	}
	    	session.setAttribute("excelData", list);
	    		    	
	    	return mapping.findForward("msCertsHome");
	}
	
	public ActionForward popUpFilter(ActionMapping mapping,
		   ActionForm form, HttpServletRequest request,
		   HttpServletResponse response)throws Exception{
	    
	    System.out.println("Inside Pop-Up Filter ........");
	    HttpSession session=request.getSession();
	    return mapping.findForward("popUpFilter");
	    
	}
	
	public ActionForward popUpFilterData(ActionMapping mapping,
		   ActionForm form, HttpServletRequest request,
		   HttpServletResponse response)throws Exception{
	    
	    System.out.println("Inside popUpFilterData ...... ");
	    actionErrors.clear();
	    String selName=(String)request.getParameter("selName");
	    String reqString=(String)request.getParameter("reqString").toUpperCase();
	    String issuedCommonName=(String)request.getParameter("issuedCommonName").toUpperCase();
	    String selCN=(String)request.getParameter("selCN");
	    String expBefDate=(String)request.getParameter("expBefDate");
	    String expAfterDate=(String)request.getParameter("expAfterDate");
	        
	    System.out.println("selName .... "+selName);
	    System.out.println("reqString .... "+reqString);
	    System.out.println("issuedCommonName .. "+issuedCommonName);
	    System.out.println("expAfterDate ... "+expAfterDate);
	    System.out.println("expBefDate .... "+expBefDate);
	    
	    GenericDAO dao=new GenericDAO();
	    HttpSession session=request.getSession();
	    ArrayList list1=new ArrayList();
	    ArrayList list=new ArrayList();
	   
	        
	    String reqName=null;
	    String effData=null;
	    String expData=null;
	    String issuedOrg=null;
	    String issuedComName=null;
	    String status=null;
	    String reqID=null;
	    
	    
 
	    StringBuffer sb=new StringBuffer("SELECT REQUESTOR_NAME,CERT_EFF_DATE, CERT_EXP_DATE, ISSUED_ORG, ISSUED_COMMON_NAME , REQUEST_ID, STATUS ");
	    sb.append(" FROM "+CmsDbTable.LOAD_CERTS_FROM_EXCEL+" ");
	    
	    if((!reqString.equals("")) && (issuedCommonName.equals("")) && (expBefDate.equals("") && expAfterDate.equals(""))){
		System.out.println("ReqNAme is not null .. ");
	    
		if(selName.equals("Starts With")){
		    System.out.println("Starts With ...");
		    sb.append(" WHERE REQUESTOR_NAME LIKE '"+reqString+"%'");
		}
	    
		else if(selName.equals("Is Exactly")){
		    System.out.println("Is Exactly ...");
		    sb.append(" WHERE REQUESTOR_NAME = '"+reqString+"'");
		}
	    
		else if(selName.equals("Contains")){
		    System.out.println("Contains ...");
		    sb.append(" WHERE REQUESTOR_NAME LIKE '%"+reqString+"%'");
		}
	    }
		if((!issuedCommonName.equals("")) && (reqString.equals("")) && (expBefDate.equals("") && expAfterDate.equals(""))){
		    System.out.println("issuedComName not Null ... ");
		    
		    if(selCN.equals("Starts With")){
			System.out.println("selCN Starts With .... ");
			sb.append(" WHERE ISSUED_COMMON_NAME like '"+issuedCommonName+"%'");
		    }
		    
		    else if(selCN.equals("Is Exactly")){
			System.out.println("SelCN Is Exactly .... ");
			sb.append(" WHERE ISSUED_COMMON_NAME = '"+issuedCommonName+"'");
		    }
		    
		    else if(selCN.equals("Contains")){
			System.out.println("selCN Contains ... ");
			sb.append(" WHERE ISSUED_COMMON_NAME = '%"+issuedCommonName+"%'");
		    }
		}
	    	
		if((!issuedCommonName.equals("")) && (!reqString.equals("")) && (expBefDate.equals("") && expAfterDate.equals("")) ){
		    System.out.println("CommonName and reqName is not Null ..");
		    
		    if(selName.equals("Starts With") && selCN.equals("Starts With")){
			System.out.println("Both Starts With");
			sb.append(" WHERE REQUESTOR_NAME LIKE '"+reqString+"%' AND ISSUED_COMMON_NAME like '"+issuedCommonName+"%'");
		    }
		    
		    if(selName.equals("Is Exactly") && selCN.equals("Is Exactly")){
			System.out.println("Both Is Exactly ...");
			sb.append(" WHERE REQUESTOR_NAME LIKE '"+reqString+"' AND ISSUED_COMMON_NAME like '"+issuedCommonName+"'");
		    }
		    
		    if(selName.equals("Contains") && selCN.equals("Contains")){
			System.out.println("Both Contains ...");
			sb.append(" WHERE REQUESTOR_NAME LIKE '%"+reqString+"%' AND ISSUED_COMMON_NAME like '%"+issuedCommonName+"%'");
		    }
		    
		    if(selName.equals("Starts With") && selCN.equals("Is Exactly")){
			System.out.println("Starts With and Is Exactly ...");
			sb.append(" WHERE REQUESTOR_NAME LIKE '"+reqString+"%' AND ISSUED_COMMON_NAME like '"+issuedCommonName+"'");
		    }
		    
		    if(selName.equals("Starts With") && selCN.equals("Contains")){
			System.out.println("Starts With and Contains ...");
			sb.append(" WHERE REQUESTOR_NAME LIKE '"+reqString+"%' AND ISSUED_COMMON_NAME like '%"+issuedCommonName+"%'");
		    }
		    
		    if(selName.equals("Is Exactly") && selCN.equals("Starts With")){
			System.out.println("Is Exactly and Starts With ...");
			sb.append(" WHERE REQUESTOR_NAME = '"+reqString+"' AND ISSUED_COMMON_NAME like '"+issuedCommonName+"%'");
		    }
		    
		    if(selName.equals("Contains") && selCN.equals("Starts With")){
			System.out.println("Contains and Starts With ...");
			sb.append(" WHERE REQUESTOR_NAME = '%"+reqString+"%' AND ISSUED_COMMON_NAME like '"+issuedCommonName+"%'");
		    }
		}
		
		if((!expBefDate.equals("") && !expAfterDate.equals("")) && (issuedCommonName.equals("") && reqString.equals(""))){
		    
		    try{		   
			   SimpleDateFormat sdfSource  = new SimpleDateFormat("MM/dd/yy");
			   Date dateafter = sdfSource.parse(expAfterDate);
			   Date datebef = sdfSource.parse(expBefDate);
			   
			   SimpleDateFormat sdfDestination = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
			   
			   expAfterDate = sdfDestination.format(dateafter);
			   expBefDate = sdfDestination.format(datebef);
			  }catch(Exception e){
			      e.printStackTrace();
			  }
			 		    
		    System.out.println("expBefDate and expAfterDate not Null .... ");
		    sb.append(" WHERE CERT_EFF_DATE BETWEEN to_date('"+expAfterDate+"','MM-DD-YYYY  HH24:MI:SS') AND to_date('"+expBefDate+"','MM-DD-YYYY  HH24:MI:SS')");
		}
		
	if((!expBefDate.equals("") && !expAfterDate.equals("")) && (!issuedCommonName.equals("") && !reqString.equals(""))){
	    System.out.println("All are Not Null ..");
	    
	    try{		   
		   SimpleDateFormat sdfSource  = new SimpleDateFormat("MM/dd/yy");
		   Date dateafter = sdfSource.parse(expAfterDate);
		   Date datebef = sdfSource.parse(expBefDate);
		   
		   SimpleDateFormat sdfDestination = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		   
		   expAfterDate = sdfDestination.format(dateafter);
		   expBefDate = sdfDestination.format(datebef);
		  }catch(Exception e){
		      e.printStackTrace();
		  }
		  
		  if(selName.equals("Starts With") && selCN.equals("Starts With")){
			System.out.println("Both Starts With");
			sb.append(" WHERE REQUESTOR_NAME LIKE '"+reqString+"%' AND ISSUED_COMMON_NAME like '"+issuedCommonName+"%'");
			sb.append(" AND CERT_EFF_DATE BETWEEN to_date('"+expAfterDate+"','MM-DD-YYYY  HH24:MI:SS') AND to_date('"+expBefDate+"','MM-DD-YYYY  HH24:MI:SS')");
		    }
		    
		    if(selName.equals("Is Exactly") && selCN.equals("Is Exactly")){
			System.out.println("Both Is Exactly ...");
			sb.append(" WHERE REQUESTOR_NAME LIKE '"+reqString+"' AND ISSUED_COMMON_NAME like '"+issuedCommonName+"'");
			sb.append(" AND CERT_EFF_DATE BETWEEN to_date('"+expAfterDate+"','MM-DD-YYYY  HH24:MI:SS') AND to_date('"+expBefDate+"','MM-DD-YYYY  HH24:MI:SS')");
		    }
		    
		    if(selName.equals("Contains") && selCN.equals("Contains")){
			System.out.println("Both Contains ...");
			sb.append(" WHERE REQUESTOR_NAME LIKE '%"+reqString+"%' AND ISSUED_COMMON_NAME like '%"+issuedCommonName+"%'");
			sb.append(" AND CERT_EFF_DATE BETWEEN to_date('"+expAfterDate+"','MM-DD-YYYY  HH24:MI:SS') AND to_date('"+expBefDate+"','MM-DD-YYYY  HH24:MI:SS')");
		    }
		    
		    if(selName.equals("Starts With") && selCN.equals("Is Exactly")){
			System.out.println("Starts With and Is Exactly ...");
			sb.append(" WHERE REQUESTOR_NAME LIKE '"+reqString+"%' AND ISSUED_COMMON_NAME like '"+issuedCommonName+"'");
			sb.append(" AND CERT_EFF_DATE BETWEEN to_date('"+expAfterDate+"','MM-DD-YYYY  HH24:MI:SS') AND to_date('"+expBefDate+"','MM-DD-YYYY  HH24:MI:SS')");
		    }
		    
		    if(selName.equals("Starts With") && selCN.equals("Contains")){
			System.out.println("Starts With and Contains ...");
			sb.append(" WHERE REQUESTOR_NAME LIKE '"+reqString+"%' AND ISSUED_COMMON_NAME like '%"+issuedCommonName+"%'");
			sb.append(" AND CERT_EFF_DATE BETWEEN to_date('"+expAfterDate+"','MM-DD-YYYY  HH24:MI:SS') AND to_date('"+expBefDate+"','MM-DD-YYYY  HH24:MI:SS')");
		    }
		    
		    if(selName.equals("Is Exactly") && selCN.equals("Starts With")){
			System.out.println("Is Exactly and Starts With ...");
			sb.append(" WHERE REQUESTOR_NAME = '"+reqString+"' AND ISSUED_COMMON_NAME like '"+issuedCommonName+"%'");
			sb.append(" AND CERT_EFF_DATE BETWEEN to_date('"+expAfterDate+"','MM-DD-YYYY  HH24:MI:SS') AND to_date('"+expBefDate+"','MM-DD-YYYY  HH24:MI:SS')");
		    }
		    
		    if(selName.equals("Contains") && selCN.equals("Starts With")){
			System.out.println("Contains and Starts With ...");
			sb.append(" WHERE REQUESTOR_NAME = '%"+reqString+"%' AND ISSUED_COMMON_NAME like '"+issuedCommonName+"%'");
			sb.append(" AND CERT_EFF_DATE BETWEEN to_date('"+expAfterDate+"','MM-DD-YYYY  HH24:MI:SS') AND to_date('"+expBefDate+"','MM-DD-YYYY  HH24:MI:SS')");
		    }
		    
		}
	
		String query=sb.toString();
		System.out.println("Query ... "+query);
		list1=(ArrayList)dao.getLoadFromExcelData(query);
		
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		java.util.Date date = new java.util.Date();
		String datetime = dateFormat.format(date);
		System.out.println("Current Date Time : " + datetime);		
		
	    if(list1.size()>0){
		
		for(int i=0;i<list1.size();i++){
	    	    String[] strArr=(String[])list1.get(i);
	    	    CMSBO bo=new CMSBO();
	    	    bo.setReqName(strArr[0]);
	    	    bo.setIssuedCommonName(strArr[1]);
	    	    bo.setIssuedOrg(strArr[2]);
	    	    bo.setCertEffDate(strArr[3]);
	    	    bo.setCertExpDate(strArr[4]);
	    	    bo.setReqID(strArr[5]);
	    	    bo.setStatus(strArr[6]);
	    	    
	    	/*if(strArr[4]!=null || strArr[4].equals(null)){
	    	//System.out.println(" before format: " + strArr[4] ); 
	                String  datem=strArr[4].substring(5,7);
	                int month = Integer.valueOf(datem).intValue();
	                String  dated=strArr[4].substring(8,10);
	                int day = Integer.valueOf(dated).intValue();
	                String  datey=strArr[4].substring(0,4);
	                int year = Integer.valueOf(datey).intValue();
	                //String date1= datem + "-" + dated + "-" + datey;
	                //String date1= "08-07-2009";
	               // System.out.println("Current Date format is: " + date1 );
	                String datems=datetime.substring(0,2);
	                int months = Integer.valueOf(datems).intValue();
	                String dateds=datetime.substring(3,5);
	                int days = Integer.valueOf(dateds).intValue();
	                String dateys=datetime.substring(6,10);
	                int years = Integer.valueOf(dateys).intValue();
	       int compresultm=date1.substring(0,2).compareTo(datetime.substring(0,2));
	                int compresultd=date1.substring(3,5).compareTo(datetime.substring(3,5));
	                int compresulty=date1.substring(6,10).compareTo(datetime.substring(6,10));
	                
	                if(year>years){
	                    status="ACTIVE";  
	                }
	                else{
	                    status="EXPIRED"; 
	                }
	                
	                if(year==years)
	                {
	                 if(month>months){
	                     status="ACTIVE";  
	                 }
	                 else{
	                     status="EXPIRED";     
	                 }
	                    
	                }
	                
	                if((year==years)&&(month==months)){
	   
	                    if(day>days){
	                        status="ACTIVE";  
	                    }
	                    else{
	                        status="EXPIRED";     
	                    }
	                }
	              bo.setStatus(status);  
	      
		          }*/
	       	    list.add(bo);	    	    
	    	}
	    	
	    	for(int j=0;j<list.size();j++){
	    	    CMSBO cms=(CMSBO)list.get(j);
	    	    reqName=cms.getReqName();
	    	    effData=cms.getCertEffDate();
	    	    expData=cms.getCertExpDate();
	    	    issuedOrg=cms.getIssuedOrg();
	    	    issuedComName=cms.getIssuedCommonName();
	    	    status=cms.getStatus();
	    	    reqID=cms.getReqID();
	    	    
	    	}
	    	session.setAttribute("excelData", list);
		System.out.println("list sizeeeeeeeeee ....... "+list.size());
		String popUpFilter="true";
		session.setAttribute("PopUpFilter", popUpFilter);
		//System.out.println("popUpFilter value is  .. "+session.getAttribute("PopUpFilter"));
		return mapping.findForward("msCertsHome");
	    }
	    
	    else{
		System.out.println("No Data Found ...");
		actionErrors.add("error", new ActionError("error.data"));
		saveErrors(request, actionErrors);
		return mapping.findForward("msCertsError");
	    }   
	}
	
	public ActionForward getCertUserDetails(ActionMapping mapping,
		   ActionForm form, HttpServletRequest request,
		   HttpServletResponse response)throws Exception{
	    
	    	System.out.println("getCertUserDetails ..... ");
	    	GenericDAO dao=new GenericDAO();
	    	HttpSession session=request.getSession();
	    	
	    	String radioValue=(String)request.getParameter("selectCert");
	    	System.out.println("radioValue ...."+radioValue);
	    	
	    	/*String status=(String)request.getParameter("status");
	    	System.out.println("status ...... "+status);
	    	
	    	session.setAttribute("status", status);*/
	    	session.setAttribute("radioValue", radioValue);
	    	
	    	StringBuffer sb=new StringBuffer("SELECT DISTINCT SERIAL_NO, ");
	    	sb.append(" to_char(CERT_EFF_DATE,'mm/dd/yyyy HH24:MI:SS') effDate, ");
	    	sb.append(" to_char(CERT_EXP_DATE,'mm/dd/yyyy HH24:MI:SS') expDate, ");
	    	sb.append(" REQUESTOR_NAME, ISSUED_COUNTRY, ISSUED_ORG, ");
	    	sb.append(" ISSUED_ORG_UNIT, ISSUED_COMMON_NAME, ISSUED_CITY, ISSUED_STATE, ISSUED_EMAIL, STATUS ");
	    	sb.append(" FROM "+CmsDbTable.LOAD_CERTS_FROM_EXCEL+" WHERE REQUEST_ID='"+radioValue+"'");
	    	
	    	String detailsQuery=sb.toString();
	    	
	    	System.out.println("detailsQuery ====== "+detailsQuery);
	    	ArrayList list1=(ArrayList)dao.getDetailsFromReqID(detailsQuery);
	    	ArrayList list=new ArrayList();
	    
	    	
	    	for(int i=0;i<list1.size();i++){
	    	    String[] strArr=(String[])list1.get(i);
	    	    CMSBO bo=new CMSBO();
	    	    bo.setSerialNo(strArr[0]);
	    	    bo.setCertEffDate(strArr[1]);
	    	    bo.setCertExpDate(strArr[2]);
	    	    bo.setReqName(strArr[3]);
	    	    bo.setIssuedCountry(strArr[4]);
	    	    bo.setIssuedOrg(strArr[5]);
	    	    bo.setIssuedOrgUnit(strArr[6]);
	    	    bo.setIssuedCommonName(strArr[7]);
	    	    bo.setIssuedCity(strArr[8]);
	    	    bo.setIssuedState(strArr[9]);
	    	    bo.setIssuedEmail(strArr[10]);
	    	    bo.setStatus(strArr[11]);
	    	    list.add(bo);
	    	}
	    	
	    	session.setAttribute("list", list);
	    	
	    	   	
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
		    	
	    	return mapping.findForward("certUserDetails");
	}
		
	public ActionForward insertCertData(ActionMapping mapping,
		   ActionForm form, HttpServletRequest request,
		   HttpServletResponse response)throws Exception{
	    
	    	System.out.println("insertCertData ....... ");
	    	HttpSession session=request.getSession();
	    	GenericDAO dao=new GenericDAO();
	    	
	    	actionErrors.clear();
	    	//String status=(String)session.getAttribute("status");
	    	String radioValue=(String)session.getAttribute("radioValue");
	    	
	    	System.out.println("radioValue ... "+radioValue);
	    	
	    	String serialNo="";
	    	String certEffDate="";
	    	String certExpDate="";
	    	String reqName="";
	    	String country="";
	    	String org="";
	    	String orgUnit="";
	    	String comName="";
	    	String city="";
	    	String state="";
	    	String emailID="";
	    	String status="";
	    	
	    	ArrayList list=(ArrayList)session.getAttribute("list");
	    	
	    	for(int j=0;j<list.size();j++){
	    	    CMSBO cms=(CMSBO)list.get(j);
	    	    serialNo=cms.getSerialNo();
	    	    certEffDate=cms.getCertEffDate();
	    	    certExpDate=cms.getCertExpDate();
	    	    reqName=cms.getReqName();
	    	    country=cms.getIssuedCountry();
	    	    org=cms.getIssuedOrg();
	    	    orgUnit=cms.getIssuedOrgUnit();
	    	    comName=cms.getIssuedCommonName();
	    	    city=cms.getIssuedCity();
	    	    state=cms.getIssuedState();
	    	    emailID=cms.getIssuedEmail();
	    	    status=cms.getStatus();
	    	    
	    	}
	    	// Inserting to TBL_CMS_CERTIFICATES table
	         
	    	String appName=(String)request.getParameter("appName");
                String netPin=(String)request.getParameter("netPin");
                String acroNym=(String)request.getParameter("acroNym");
                System.out.println("application name ==============> " +appName);
                System.out.println("netpin =========> " +netPin);
                System.out.println("acroNym =============> "+acroNym);
                String alarmFlag="";
                String rawCert="";
                String issuer="";
		
                issuer=comName+" "+orgUnit+" "+org+" "+emailID+" "+city+" "+state+" "+country;
                
                System.out.println("issuer ########### "+issuer);
                
                
                if(appName!="" && netPin!=""){
                    rawCert=acroNym + CMSProperties.getString("delimiter") + netPin + CMSProperties.getString("delimiter") + comName ;
                    System.out.println("rawcert in function action "+rawCert);
                }
                else{
                    rawCert=CMSProperties.getString("noRawcert");
                    System.out.println("rawCert is NONE ----");
                }
                
                     //String[] cuids=new String[20];
                     String loginCuid=(String)session.getAttribute("login");         
	             String certSeqNoQuery="select max(CERT_SEQ_NU +1) from "+CmsDbTable.TBL_CMS_CERTIFICATES+"";
	             String certSeqNo=dao.getAcronym(certSeqNoQuery);
	             System.out.println("certSeqNo ----------- >> "+certSeqNo);
	             
	             String hostID=(String)request.getParameter("hostID");
	             String hostIP=CMSProperties.getString("hostIP");
	             String certNickName=(String)request.getParameter("certNickName");
	             String certType=CMSProperties.getString("certType");
	             String notes=(String)request.getParameter("notes");
	             String certPathServer=(String)request.getParameter("certPathServer");
	             alarmFlag="TO BE DONE";
	             	             
	             try {
			HashMap map = (HashMap)com.qwest.cms.utils.NETGroupDataClient.getGroupPinDetails(netPin);
			/*String dupDataQuery="SELECT CREATOR_CUID FROM "+CmsDbTable.TBL_CMS_CERTIFICATES+" WHERE APPLICATION_NAME='"+appName+"' and CREATOR_CUID='"+loginCuid+"'";
			 ArrayList getCheckQueryData=(ArrayList)dao.checkDuplicatesCmsAction(dupDataQuery);
			 System.out.println("Duplicate Arraylist Size in cmsAction .......  "+getCheckQueryData.size());
			
			 if(getCheckQueryData.size()>0){
			     System.out.println("Duplicate Entry ....");
			     session.setAttribute("dupData", "This Certificate is Already There in Your Account.. Please Choose different Certificate.");
			     return mapping.findForward("home");
			 }*/
          
			     /** Inserting to D_TBL_CMS_CERT_DETAILS **/
			    String subject="";
			    String certVersion=CMSProperties.getString("certVersion");
			    String signature_algo="";
			    String signature="";
			    String public_key="";
			    
			    if(signature_algo.equals("")){
				System.out.println("signature alg is null... ");
				signature_algo = "SHA1withRSA";
			    }

			    
			    DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
			    java.util.Date date = new java.util.Date();
			    String datetime1 = dateFormat.format(date);
			    System.out.println("Current Date Time : " + datetime1);
			    Date date1=dateFormat.parse(datetime1);
			    System.out.println("After Parsing ==== "+date1);
			    SimpleDateFormat sdfDestination = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");
			    String datetime = sdfDestination.format(date1);
			    System.out.println("After Convering ===== "+datetime);
			    
			    subject=comName+" "+orgUnit+" "+org+" "+emailID+" "+city+" "+state+" "+country;
			    
			    String insertCertQuery="INSERT INTO "+CmsDbTable.TBL_CMS_CERT_DETAILS+" values  (" +
			    "'"+rawCert+"'," +
			    "'"+serialNo+"'," +      
			    "'"+reqName+"'," +
			    "'"+org+"'," +
			    "'"+status+"'," +
			    "'"+certVersion+"'," +
			    "'"+subject+"'," +
			    "'"+comName+"'," +
			    "'"+org+"'," +
			    "'"+orgUnit+"'," +
			    "'"+city+"'," +
			    "'"+state+"'," +
			    "'"+country+"'," +
			    "'"+emailID+"'," +
			    "'"+issuer+"'," +
			    "'"+comName+"'," +
			    "'"+org+"',"+
			    "'"+orgUnit+"'," +
			    "'"+city+"'," +
			    "'"+state+"'," +
			    "'"+country+"'," +
			    "'"+emailID+"'," +
			    "'"+public_key+"'," +
			    "'"+signature_algo+"'," +
			    "'"+signature+"'," +
			    "to_date('"+certEffDate+"','MM-DD-YYYY  HH24:MI:SS')," +
			    "to_date('"+certExpDate+"','MM-DD-YYYY  HH24:MI:SS')," +
			    "to_date('"+datetime+"','MM-DD-YYYY  HH24:MI:SS')," +
			    "to_date('"+datetime+"','MM-DD-YYYY  HH24:MI:SS') )" ;
			    
			    /******** inserting into TBL_CMS_CERTIFICATES *******************/
			    String insertCertDetailsQuery="INSERT INTO "+CmsDbTable.TBL_CMS_CERTIFICATES+" values  (" +
				 "'"+appName+"'," +
				 "'"+acroNym+"'," +      
				 "'"+hostID+"'," +
				 "'"+hostIP+"'," +
				 "'"+serialNo+"'," +
				 "'"+issuer+"'," +
				 "'"+loginCuid+"'," +
				 "'"+certNickName+"'," +
				 "to_date('"+certEffDate+"','MM-DD-YYYY  HH24:MI:SS')," +
				 "to_date('"+certExpDate+"','MM-DD-YYYY  HH24:MI:SS')," +
				 "'"+status+"'," +
				 "'"+certSeqNo+"'," +
				 "'"+certType+"'," +
				 "'"+reqName+"'," +
				 "'"+notes+"'," +
				 "'"+certPathServer+"'," +
				 "'"+alarmFlag+"')" ;
				 
				 System.out.println("insertCertDetailsQuery ===========> "+insertCertDetailsQuery);
				dao.insertCertDet(insertCertDetailsQuery);
				    System.out.println("insert successful"); 
			    
			       
			     System.out.println("insertCertQuery ---> "+insertCertQuery);
			    dao.insertCertDet(insertCertQuery);
			    System.out.println("insert2 successfull ........");
			    return certInAccount(mapping, form, request, response);
			    
		    } catch (Exception e) {
			System.out.println("Invalid NetPin ..");
			logger.info("Invalid NetPin ..");
			actionErrors.add("errMess", new ActionError("error.netpin"));
			saveErrors(request, actionErrors);
			return mapping.findForward("msCertsInvalidNetpin");
		    }
	}
	
	public ActionForward getAcroNym(ActionMapping mapping, 
		ActionForm form, HttpServletRequest request, 
		HttpServletResponse response) throws Exception {
	    
	    System.out.println("inside getAcroNym =========== ");
	    String appName = request.getParameter("appName");
	    System.out.println("appName ======================= "+appName);
	    ArrayList acroList = new ArrayList();
	    String acroName="";
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
			
		session.setAttribute("acroName", acroName);
		//session.setAttribute("acroList", acroList);
	    
	    return mapping.findForward("certUserDetails");
	}
	
	
	public void getHelpDoc(ActionMapping mapping,
		   ActionForm form, HttpServletRequest request,
		   HttpServletResponse response)throws Exception{
	    
	       	System.out.println("*************getHelpDoc*****************");
	    	 String file = CMSProperties.getString("CSR_file_path1")+"CMS™_Help_for _Qwest_users"+".html";
		     FileInputStream fin = new FileInputStream(file);
		     
		     int size = fin.available();
			response.setContentLength(size);
			byte[] ab = new byte[size];
			OutputStream os = response.getOutputStream();
			//response.setContentType("application/msword");
			//response.setHeader("Content-Disposition","attachmen t;filename=CMS™_Help_for _Qwest_users.doc");
			int bytesread;
			do{
				bytesread = fin.read(ab,0,size);
				if(bytesread >-1)
					os.write(ab,0,bytesread );
				}while(bytesread >-1);
			fin.close();
			os.flush();
			os.close();
			
		//return mapping.findForward("search");
	    
	}
	
	public void ajax(ActionMapping mapping, 
			   ActionForm form, HttpServletRequest request, 
			   HttpServletResponse response) throws Exception {
		 
			 String result_query=CMSProperties.getString("query_home_details")+ request.getParameter("selectCert");		  
			 System.out.println("query to execute-->"+result_query );
			 logger.info("CMS Action - AJAX ***************");		 
			 
			/* for(int i=0;i < res.length; i++)
			 {
				 System.out.println(res[i]);
			 }
			*/
			  System.out.println("I am inside ajax: value is-->"+ request.getParameter("selectCert"));
			  logger.debug("CMS Action - AJAX - inside ajax: value is-->"+ request.getParameter("selectCert"));
			  HttpSession session = request.getSession();			 
			  session.setAttribute("checkedRadioValue",request.getParameter("selectCert"));
			  System.out.println("in session "+ session.getAttribute("checkedRadioValue"));
			  logger.debug("CMS Action - AJAX - Selected cert Number is "+session.getAttribute("checkedRadioValue"));
			  GenericDAO genDAO = new GenericDAO();
				 
				 String res[]= genDAO.getAllDetails(result_query);
				 System.out.println("setSerialNo  "+res[2]);
				 CMSBO cms = new CMSBO();
				 cms.setAppName(res[0]);
				 cms.setAcronym(res[1]);
				 cms.setSerialNo(res[2]);
				 cms.setCertNickname(res[3]);
				 cms.setStatus(res[4]);
				 cms.setIssuer(res[5]);
				 cms.setSubject_CN(res[6]);
				 cms.setIssuer_CN(res[7]);
				 cms.setFrom_dt(res[8]);
				 cms.setExpiry_dt(res[9]);
				 if ( res[10].toUpperCase().indexOf('/') != -1)
						cms.setRaw_certificate(res[10].substring(res[10].lastIndexOf('/')+1,res[10].length()).toUpperCase());
				 if ( res[10].indexOf('\\') != -1)
						cms.setRaw_certificate(res[10].substring(res[10].lastIndexOf('\\')+1,res[10].length()).toUpperCase());
				 else
				     cms.setRaw_certificate(res[10]);  
				 //cms.setRaw_certificate(res[10].toUpperCase());
				 cms.setSignature_algo(res[11]);
				 cms.setPublic_key(res[12]);
				 cms.setNotes(res[13]);
				/* cms.setRcbsCode(res[14]);
				 cms.setRcbsMgrCuid(res[15]);*/
				 session.setAttribute("DetailInfo",cms);
				 //logger.debug("I am inside ajax");
			
	}

	public static void remindAlaram() {
		// TODO Auto-generated method stub
		
	}

	
	public ActionForward statusFilter(ActionMapping mapping, 
		ActionForm form, HttpServletRequest request, 
		HttpServletResponse response) throws Exception {
	    
	    try {
		System.out.println("statusFilter in cmsaction");
		HttpSession session=request.getSession();
		GenericDAO genericDAO=new GenericDAO();
		ArrayList accStatusList1=new ArrayList();
		ArrayList accStatusList=new ArrayList();
		actionErrors.clear();
		String selStatus=(String)request.getParameter("status");
		String cuid = (String) session.getAttribute("login");
		System.out.println("selected status from home page "+selStatus);
		
		StringBuffer sb = new StringBuffer("select   m.cert_seq_nu,m.APPLICATION_NAME,m.ACRONYM,m.CERT_NICKNAME,m.CERT_TYPE,m.EXPIRE_ON,m.STATUS,n.RAW_CERTIFICATE ");
		sb.append(" from "+CmsDbTable.TBL_CMS_CERTIFICATES+" m, "+CmsDbTable.TBL_CMS_CERT_DETAILS+" n WHERE n.SERIALNO = m.SERIAL_NO ");
		sb.append(" and n.ISSUER=m.ISSUER AND upper(m.CREATOR_CUID)='"+cuid+"' AND m.STATUS='"+selStatus+"'");
		String accStatusQuery=sb.toString();
			
		if(selStatus!=null){
		    if(selStatus.equals("ACTIVE")){
		    	accStatusList1=(ArrayList)genericDAO.getCertList(accStatusQuery);
			for( int i=0;i<accStatusList1.size();i++) {
				String[] strArr = (String[])accStatusList1.get(i);
				CMSBO cms = new CMSBO();
				System.out.println("serialNO-->"+strArr[0]);
				logger.debug("CMS Action -CERT IN ACCOUNT - Account Details  -->  "+strArr[0]+strArr[1]+strArr[2]+strArr[3]+strArr[4]+strArr[5]+strArr[6]);
				cms.setSerialNo(strArr[0]);	
				cms.setAppName(strArr[1]);
				cms.setAcronym(strArr[2]);
				cms.setNickName(strArr[3]);
				cms.setType(strArr[4]);
				cms.setExpDate(strArr[5]);
				cms.setStatus(strArr[6]);
				if ( strArr[7].indexOf('#') != -1)
					cms.setRaw_certificate(strArr[7].substring(strArr[7].lastIndexOf('#')+1,strArr[7].length()).toUpperCase());				
				else if ( strArr[7].indexOf('/') != -1)
					cms.setRaw_certificate(strArr[7].substring(strArr[7].lastIndexOf('/')+1,strArr[7].length()).toUpperCase());
				else if ( strArr[7].indexOf('\\') != -1)
					cms.setRaw_certificate(strArr[7].substring(strArr[7].lastIndexOf('\\')+1,strArr[7].length()).toUpperCase());
				
				accStatusList.add(cms);

			}
			
		    }
		    if(selStatus.equals("Renew")){
		    	accStatusList1=(ArrayList)genericDAO.getCertList(accStatusQuery);
			for( int i=0;i<accStatusList1.size();i++) {
				String[] strArr = (String[])accStatusList1.get(i);
				CMSBO cms = new CMSBO();
				System.out.println("serialNO-->"+strArr[0]);
				logger.debug("CMS Action -CERT IN ACCOUNT - Account Details  -->  "+strArr[0]+strArr[1]+strArr[2]+strArr[3]+strArr[4]+strArr[5]+strArr[6]);
				cms.setSerialNo(strArr[0]);	
				cms.setAppName(strArr[1]);
				cms.setAcronym(strArr[2]);
				cms.setNickName(strArr[3]);
				cms.setType(strArr[4]);
				cms.setExpDate(strArr[5]);
				cms.setStatus(strArr[6]);
				if ( strArr[7].indexOf('#') != -1)
					cms.setRaw_certificate(strArr[7].substring(strArr[7].lastIndexOf('#')+1,strArr[7].length()).toUpperCase());				
				else if ( strArr[7].indexOf('/') != -1)
					cms.setRaw_certificate(strArr[7].substring(strArr[7].lastIndexOf('/')+1,strArr[7].length()).toUpperCase());
				else if ( strArr[7].indexOf('\\') != -1)
					cms.setRaw_certificate(strArr[7].substring(strArr[7].lastIndexOf('\\')+1,strArr[7].length()).toUpperCase());
				
				accStatusList.add(cms);

			}
		    }
		    
			if(selStatus.equals("INACTIVE")){
			    	accStatusList1=(ArrayList)genericDAO.getCertList(accStatusQuery);
				for( int i=0;i<accStatusList1.size();i++) {
					String[] strArr = (String[])accStatusList1.get(i);
					CMSBO cms = new CMSBO();
					System.out.println("serialNO-->"+strArr[0]);
					logger.debug("CMS Action -CERT IN ACCOUNT - Account Details  -->  "+strArr[0]+strArr[1]+strArr[2]+strArr[3]+strArr[4]+strArr[5]+strArr[6]);
					cms.setSerialNo(strArr[0]);	
					cms.setAppName(strArr[1]);
					cms.setAcronym(strArr[2]);
					cms.setNickName(strArr[3]);
					cms.setType(strArr[4]);
					cms.setExpDate(strArr[5]);
					cms.setStatus(strArr[6]);
					if ( strArr[7].indexOf('#') != -1)
						cms.setRaw_certificate(strArr[7].substring(strArr[7].lastIndexOf('#')+1,strArr[7].length()).toUpperCase());				
					else if ( strArr[7].indexOf('/') != -1)
						cms.setRaw_certificate(strArr[7].substring(strArr[7].lastIndexOf('/')+1,strArr[7].length()).toUpperCase());
					else if ( strArr[7].indexOf('\\') != -1)
						cms.setRaw_certificate(strArr[7].substring(strArr[7].lastIndexOf('\\')+1,strArr[7].length()).toUpperCase());
					
					accStatusList.add(cms);

				}
			}
			
			if(selStatus.equals("EXPIRED")){
			    	accStatusList1=(ArrayList)genericDAO.getCertList(accStatusQuery);
				for( int i=0;i<accStatusList1.size();i++) {
					String[] strArr = (String[])accStatusList1.get(i);
					CMSBO cms = new CMSBO();
					System.out.println("serialNO-->"+strArr[0]);
					logger.debug("CMS Action -CERT IN ACCOUNT - Account Details  -->  "+strArr[0]+strArr[1]+strArr[2]+strArr[3]+strArr[4]+strArr[5]+strArr[6]);
					cms.setSerialNo(strArr[0]);	
					cms.setAppName(strArr[1]);
					cms.setAcronym(strArr[2]);
					cms.setNickName(strArr[3]);
					cms.setType(strArr[4]);
					cms.setExpDate(strArr[5]);
					cms.setStatus(strArr[6]);
					if ( strArr[7].indexOf('#') != -1)
						cms.setRaw_certificate(strArr[7].substring(strArr[7].lastIndexOf('#')+1,strArr[7].length()).toUpperCase());				
					else if ( strArr[7].indexOf('/') != -1)
						cms.setRaw_certificate(strArr[7].substring(strArr[7].lastIndexOf('/')+1,strArr[7].length()).toUpperCase());
					else if ( strArr[7].indexOf('\\') != -1)
						cms.setRaw_certificate(strArr[7].substring(strArr[7].lastIndexOf('\\')+1,strArr[7].length()).toUpperCase());
					
					accStatusList.add(cms);

				}
			}
			
			if(selStatus.equals("ALL")){
			    	StringBuffer ab = new StringBuffer("select   m.cert_seq_nu,m.APPLICATION_NAME,m.ACRONYM,m.CERT_NICKNAME,m.CERT_TYPE,m.EXPIRE_ON,m.STATUS,n.RAW_CERTIFICATE ");
				ab.append(" from "+CmsDbTable.TBL_CMS_CERTIFICATES+" m, "+CmsDbTable.TBL_CMS_CERT_DETAILS+" n WHERE n.SERIALNO = m.SERIAL_NO ");
				ab.append(" and n.ISSUER=m.ISSUER AND upper(m.CREATOR_CUID)='"+cuid+"'");
				String accStatusQueryAll=ab.toString();
				System.out.println("status query ALL--->"+accStatusQueryAll);
				accStatusList1=(ArrayList)genericDAO.getCertList(accStatusQueryAll);
				
				for( int i=0;i<accStatusList1.size();i++) {
					String[] strArr = (String[])accStatusList1.get(i);
					CMSBO cms = new CMSBO();
					System.out.println("serialNO-->"+strArr[0]);
					logger.debug("CMS Action -CERT IN ACCOUNT - Account Details  -->  "+strArr[0]+strArr[1]+strArr[2]+strArr[3]+strArr[4]+strArr[5]+strArr[6]);
					cms.setSerialNo(strArr[0]);	
					cms.setAppName(strArr[1]);
					cms.setAcronym(strArr[2]);
					cms.setNickName(strArr[3]);
					cms.setType(strArr[4]);
					cms.setExpDate(strArr[5]);
					cms.setStatus(strArr[6]);
					System.out.println(strArr[6]);
					if ( strArr[7].indexOf('#') != -1)
						cms.setRaw_certificate(strArr[7].substring(strArr[7].lastIndexOf('#')+1,strArr[7].length()).toUpperCase());				
					else if ( strArr[7].indexOf('/') != -1)
						cms.setRaw_certificate(strArr[7].substring(strArr[7].lastIndexOf('/')+1,strArr[7].length()).toUpperCase());
					else if ( strArr[7].indexOf('\\') != -1)
						cms.setRaw_certificate(strArr[7].substring(strArr[7].lastIndexOf('\\')+1,strArr[7].length()).toUpperCase());
					
					accStatusList.add(cms);

				}
			    }
			
			
		}
		System.out.println("accStatusList arraysize ----> "+accStatusList.size());
		session.setAttribute("accountList", accStatusList);
		session.setAttribute("totalCert",new Integer(accStatusList.size()));
		System.out.println("checkedRadioValue in search   "+session.getAttribute("checkedRadioValue"));
		session.removeAttribute("checkedRadioValue");
		session.removeAttribute("pageToCall");
		
		if(accStatusList.size()==0){
		    System.out.println("Forwarding to no active accounts found ");
		    actionErrors.add("error", new ActionError("error.noCertForStatus"));
		    saveErrors(request, actionErrors);
		    return mapping.findForward("editProfAuthCheck");
		}
		else{
		    return mapping.findForward("home");
		}
		
	    } catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	    return mapping.findForward("home");
	}
	
	
	
	/*public ActionForward reveal_table(ActionMapping mapping,
			   ActionForm form, HttpServletRequest request,
			   HttpServletResponse response) throws Exception{
		
		return mapping.findForward("home.jsp");
	}*/
/*	public ActionForward shilpa(ActionMapping mapping, 
			   ActionForm form, HttpServletRequest request, 
			   HttpServletResponse response) throws Exception {
			 
		CMSFormBean cmsForm = (CMSFormBean)form;
		StringBuffer sb = new StringBuffer("");
		ArrayList addMember = new ArrayList();
		ArrayList addMember1 = new ArrayList();
		GenericDAO dao  = new GenericDAO();
		HttpSession session = request.getSession();
		int addMemberListSize;
		
		session.setAttribute("appOwnerDetList",addMember1);
		String selectQuery= sb.toString();
		addMember1 = (ArrayList) dao.getAppOwnerDetail(selectQuery );
		int i = addMember1.size();
		System.out.println("Size of addMember in shilpa ********"+i);
		for( i=0;i<addMember1.size();i++) {
			String[] strArr = (String[])addMember1.get(i); 
			CMSBO bo = new CMSBO();
			System.out.println("str arr"+strArr.toString());
			bo.setRcbsCode(strArr[3]);
			//bo.setAcronym(strArr[1]);
			//bo.setGroup(strArr[2]);				
			addMember.add(bo);
			System.out.println("**** inside cmsaction sze of addmember"+bo.getRcbsCode());			
	  }		
	  System.out.println("shilpa .........");
	  return mapping.findForward("shilpa");
	 }*/

}


