/*
 * Created on Oct 28, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.qwest.cms.action;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;




/**
 * @author vineeth k
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class LogoutAction extends Action {
	
	Logger logger=Logger.getLogger(LogoutAction.class);
	
	
    public ActionForward execute(ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response) {
        	
			System.out.println("inside logout...");
        // to invalidate session and log off.
			HttpSession session = request.getSession();
			if(session != null){
				session.invalidate();
			}
			logger.info("user logged off...");
			return mapping.findForward("success");
    }
}
