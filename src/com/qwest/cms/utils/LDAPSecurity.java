package com.qwest.cms.utils;

import java.util.Hashtable;

import org.apache.log4j.Logger;

import com.qwest.appsec.actrl.AccessControl;
import com.qwest.appsec.actrl.AccessControlFactory;
import com.qwest.appsec.actrl.BasicCredential;
import com.qwest.appsec.actrl.CTAccessControl;
import com.qwest.appsec.actrl.exception.AccessCtrlConfigException;
import com.qwest.appsec.actrl.exception.AuthenticationException;

/**
 * @author Babu Visvanathan
 *
 */
public class LDAPSecurity {

/**
 * 
 * This class provides user authentication via ClearTrust. Provide methods
 * to get a authenticated user's info and supervisours info.
 * 
 * @author Babu Visvanathan
 *
 */
static Logger logger = Logger.getLogger(LDAPSecurity.class);

public LDAPSecurity() {

}
/**
 * This method does authentication via clear trust
 * @param cuid
 * @param passwd
 * @return true/false
 */
public static boolean authenticate(String cuid, String passwd){
    
    /* Move this stuff into env file */
    System.setProperty("com.qwest.appsec.actrl.applName", "CMS");
    System.setProperty("com.qwest.appsec.actrl.ctenv", "employee.dev");
    //for prod add below stuff instead of above
    //System.setProperty("com.qwest.appsec.actrl.ctenv", "employee.prod");
    AccessControl accessControl = null;
    BasicCredential basicCred = null;
    boolean authen = false;
    try {
        accessControl = AccessControlFactory.getInstance();
        basicCred = new BasicCredential(cuid, passwd);
        accessControl.authenticate(basicCred);
        authen=true;
    } catch (AuthenticationException authExc) {
        String msg = "An error occurred while logging in due to an incorrect CUID or AD password.";
        logger.info(msg);
    } catch (ExceptionInInitializerError e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } catch (LinkageError e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } catch (AccessCtrlConfigException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

    return authen;
}

/**
 * This method gives the full name
 * @param cuid
 * @return "FullName"
 * @throws ExceptionInInitializerError
 * @throws LinkageError
 * @throws ClassNotFoundException
 * @throws AccessCtrlConfigException
 * @throws Exception
 */
public static String getUserName(String cuid)
        throws ExceptionInInitializerError, LinkageError,
        ClassNotFoundException, AccessCtrlConfigException, Exception {
    
    System.out.println("Inside Getusername *********************");
    
    AccessControl accessControl = null;
    accessControl = AccessControlFactory.getInstance();
    // Get the user properties
    Hashtable properties = accessControl.getUserProperties(cuid,
            CTAccessControl.PERSONAL_INFO_PROPERTIES);
    String[] firstName = (String[]) properties
            .get(CTAccessControl.PERSONAL_INFO_PROPERTIES[0]);
    String[] lastName = (String[]) properties
            .get(CTAccessControl.PERSONAL_INFO_PROPERTIES[1]);
   System.out.println("firstName[0] *************** "+firstName[0]);
   System.out.println("lastName[0] ################# "+lastName[0]);
    return firstName[0]+" "+lastName[0];
}

/**
 * This method gives the supervisour cuid
 * @param cuid
 * @return "Supervisour's cuid"
 * @throws ExceptionInInitializerError
 * @throws LinkageError
 * @throws ClassNotFoundException
 * @throws AccessCtrlConfigException
 * @throws Exception
 */
public static String getSupervisourCuid(String cuid)
        throws ExceptionInInitializerError, LinkageError,
        ClassNotFoundException, AccessCtrlConfigException, Exception {
    
    System.setProperty("com.qwest.appsec.actrl.applName", "CMS");
    System.setProperty("com.qwest.appsec.actrl.ctenv", "employee.dev");
    
    System.out.println("Inside getSupervisourCuid #################");
    String[] ownerCuid=null;
    AccessControl accessControl = null;

    String passwd = "";
    String cuid1 = "sxram12";
    try {
   	 if(!LDAPSecurity.authenticate(cuid1,passwd)){
   		 System.out.println("in tryfjhjfjf block");
        }
		accessControl = AccessControlFactory.getInstance();
		System.out.println("in try block");
	} catch (Exception e) {
		System.out.println("catch block");
		System.out.println("1234");
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

    return ownerCuid[0].split(",")[0].split("=")[1];
}

/**
 * just for testing purpose
 */
/*public static void main(String b[]){

    String cuid = "sxram12";
    String passwd = "";
    String sc="";
    String sn="";
    try {
        if(!LDAPSecurity.authenticate(cuid,passwd)){
            sc=LDAPSecurity.getSupervisourCuid("sxram12");
            sn=LDAPSecurity.getUserName(sc);
           System.out.println("Supervisour:-"+sc);
           System.out.println("Supervisour Name:-"+sn);
           System.out.println("Groupowners Next Hierarchy's Cuid:-:-"+getSupervisourCuid(sc));
           System.out.println("Groupowners Next Hierarchy's Name:-"+getUserName(getSupervisourCuid(sc)));
           
        }
    } catch (ExceptionInInitializerError e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } catch (LinkageError e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } catch (AccessCtrlConfigException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}*/
}