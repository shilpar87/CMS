package com.qwest.cms.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.log4j.Logger;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import com.qwest.cms.actionForm.LogonFormBean;
import com.qwest.cms.utils.EmployeeDetails;
import com.qwest.cms.utils.Employeedata;
import com.qwest.cms.utils.LDAPSecurity;



public class LogonAction extends Action {

	Logger logger = Logger.getLogger(LogonAction.class);

	ActionErrors errors = new ActionErrors();

	// static Category cat = Category.getInstance(LogonAction.class.getName());

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		logger.debug("LOGON ACTION ************");
		String role = "";
		String loginId = "";
		String password = "";
		String forward = "end_user";
		String name="";
		HttpSession session = req.getSession();
		errors.clear();
		LogonFormBean lform=(LogonFormBean)form;
		try {
			System.out.println("inside LogonAction---");
			// Code to get username from CUID

			
			/*
			 * AuthenticationServicesSoap aservice1 = alocator1
			 * .getAuthenticationServicesSoap(); System.out.println("Result of
			 * authenticateUser : " + aservice1.authenticateUser("axkhatr", "",
			 * AuthenticationRealm.LDAP));
			 */

			/*OfficeInfoLocator olocator = new OfficeInfoLocator();
			OfficeInfoSoap oservice = olocator.getOfficeInfoSoap();
			// System.out.println("Result of getNextInHierarchy : "
			// + oservice.getNextInHierarchy("axkhatr"));

			// The initial code strats here
			// ActionErrors errors = new ActionErrors();

			AuthorizationServicesLocator alocator = new AuthorizationServicesLocator();
			AuthorizationServicesSoap aservice = alocator
					.getAuthorizationServicesSoap();
*/
			loginId = (String) PropertyUtils.getSimpleProperty(form, "loginId");
			password = (String) PropertyUtils.getSimpleProperty(form,"password");
			//loginId=lform.getLoginId();
			
			/*EmployeeDetails oservice = null;
			Employeedata empDetails = null;
			String nextHierarchy = "";
			oservice = new EmployeeDetails();
			empDetails = oservice.getEmployeeDetails(loginId);
			nextHierarchy = empDetails.getImmSupCuid();
			System.out.println("The Next Hierarchy *************is :"+nextHierarchy);*/
			//logger.info(request.getRemoteHost()+"The Next Hierarchy is :"+nextHierarchy);
			
			System.out.println("loginId is --->" + loginId.toUpperCase());
			System.out.println("user type:---"+ forward);
			logger.debug("LOGON ACTION -- Login id is "+loginId.toUpperCase());
			
			System.out.println("LOGON ACTION -- Login id is "+loginId.toUpperCase());
			
			System.out.println("before getting name ");
			try {
			    LDAPSecurity ldapSec = new LDAPSecurity();
			    LDAPSecurity.getSupervisourCuid(loginId);
			    
			    System.out.println("ldapSec.getSupervisourCuid(loginId); "+ldapSec.getSupervisourCuid(loginId));
			} catch (Exception e) {
			    // TODO Auto-generated catch block
			    e.printStackTrace();
			} catch (LinkageError e) {
			    // TODO Auto-generated catch block
			    e.printStackTrace();
			}
			
			/*Employeedata ed = oservice.getEmployeeDetails(loginId);
			
			System.out.println("Result of getEmployeeDetails : name -> " + ed.getName());
			name = ed.getName();*/
			// cat.info("Result of getEmployeeDetails : name -> " +// ed.getName());

			/*logger.info("Result of getEmployeeDetails : name -------> "+ ed.getName());*/
			//name = "jyoti jena";			

			/*boolean bResult = aservice.authorizeUser(loginId, password,
					AuthorizationRealm.LDAP);
			contactLdap contactLdap=new contactLdap();
			boolean bResult =contactLdap.authenticateUser(loginId,password);
			LDAPSecurity.authenticate(loginId, password);*/
			boolean bResult = true; // disable once testing is done.			

			if (bResult == false) {
				logger.error("Failed authentication");
				/*errors.add(ActionErrors.GLOBAL_ERROR, new ActionError(
						"error.login"));*/
				errors.add("errMess", new ActionError("error.login"));
				saveErrors(req, errors);
				return mapping.findForward("failure");
			}
		} catch (Exception e) {
			logger.error("Exception during login");
			errors.add("db error", new ActionError("error.noLogin"));
		}
//		 if (!errors.isEmpty()) {
//		 saveErrors(req, errors);
//		 return (mapping.getInputForward());
//		 }
		/*
		 * if(loginId.equalsIgnoreCase("approver")){ System.out.println("here
		 * approver===>"+loginId); //session.setAttribute("approver",loginId);
		 * return mapping.findForward("approver");
		 *  } else{ System.out.println("here===>"+loginId); return
		 * mapping.findForward("success"); }
		 */
		session.setAttribute("login", loginId.toUpperCase());
		session.setAttribute("role", role);
		session.setAttribute("name", name);
		System.out.println("in logonAction: "+ forward);
		return mapping.findForward(forward);

	}

}
