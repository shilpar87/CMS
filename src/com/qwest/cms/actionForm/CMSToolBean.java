/*
 * Created on Feb 20, 2008
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */ 
package com.qwest.cms.actionForm;


import java.io.File;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;

/**
 * @author ipatan
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class CMSToolBean extends ValidatorForm{
    
String pubKeyCrtPath;
    
    
    
    
	public void reset(ActionMapping arg0, HttpServletRequest arg1) {
		// TODO Auto-generated method stub
		//super.reset(arg0, arg1);
		//this.setCuid("");
		//this.password = "";
		this.pubKeyCrtPath = null;
	}

    /**
     * To perform form level validation
     */
    public ActionErrors validate(ActionMapping mapping,HttpServletRequest request) {

        ActionErrors errors = new ActionErrors();	
       /* if(this.getCuid() == null ||this.getCuid().equals("") || this.getCuid().trim().length() == 0){
	                errors.add("Login" , new ActionError("error.login"));
	         }*/
	            
        return errors;
    }

 /**
     * @return Returns the pubKeyCrt.
     */
    public String getPubKeyCrtPath() {
              return pubKeyCrtPath;
    }
    /**
     * @param pubKeyCrt The pubKeyCrt to set.
     */
    public void setPubKeyCrtPath(String pubKeyCrtPath) {
             this.pubKeyCrtPath = pubKeyCrtPath;
    }
}
