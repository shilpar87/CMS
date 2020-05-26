package com.qwest.cms.actionForm;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;


public class LogonFormBean extends ActionForm {

	/**
	 *  
	 */
	private static final long serialVersionUID = 1L;
	
	private String loginId;
	private String password;
	private String role;
	private String name;
	
	
	public String getLoginId() {
		System.out.println("inside formBean");
		return loginId;
	}
	public void setLoginId(String loginId) {System.out.println("inside formBean");
		this.loginId = loginId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public void reset(ActionMapping arg0, HttpServletRequest arg1) {
		// TODO Auto-generated method stub
		//super.reset(arg0, arg1);
		this.loginId = "";
		this.password = "";
	}

    /**
     * To perform form level validation
     */
    public ActionErrors validate(ActionMapping mapping,HttpServletRequest request) {

        ActionErrors errors = new ActionErrors();	
        if(this.loginId == null ||this.loginId.equals("") || this.loginId.trim().length() == 0){
	                errors.add("Login" , new ActionError("error.login"));
	         }
	            
        return errors;
    }
	/**
	 * @return Returns the name.
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name The name to set.
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return Returns the role.
	 */
	public String getRole() {
		return role;
	}
	/**
	 * @param role The role to set.
	 */
	public void setRole(String role) {
		this.role = role;
	}
}
