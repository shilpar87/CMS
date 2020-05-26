package com.qwest.cms.action;

import java.util.Hashtable;

import com.qwest.appsec.actrl.AccessControl;
import com.qwest.appsec.actrl.AccessControlFactory;
import com.qwest.appsec.actrl.CTAccessControl;
import com.qwest.appsec.actrl.exception.AccessCtrlConfigException;
import com.qwest.cms.utils.LDAPSecurity;

public class testing {

public static void main(String b[]){
System.out.println("in the main method");
String cuid = "sbhowmi";
String passwd = "";
String sc="";
String sn="";
try {
    if(!LDAPSecurity.authenticate(cuid,passwd)){
        sc=testing.getSupervisorCuid("sbhowmi");
        //sn=LDAPSecurity.getUserName("hxkuma5");
       System.out.println("Supervisor:-"+sc);
       //System.out.println("Supervisour Name:-"+sn);
      // System.out.println("Groupowners Next Hierarchy's Cuid:-:-"+getSupervisourCuid(sc));
       //System.out.println("Groupowners Next Hierarchy's Name:-"+getUserName(getSupervisourCuid(sc)));
       
    }
} catch (Exception e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
}

public static String getSupervisorCuid(String cuid)
throws ExceptionInInitializerError, LinkageError,
ClassNotFoundException, AccessCtrlConfigException, Exception {
System.out.println("ctrl in get supervisor method");
AccessControl accessControl = null;
System.out.println("1111");
//String passwd = "";
//String cuid1 = "hxkuma5";
try {
 /*if(!LDAPSecurity.authenticate(cuid1,passwd)){
	 System.out.println("in tryfjhjfjf block");
 }*/
accessControl = AccessControlFactory.getInstance();
System.out.println("in try block");
} catch (Exception e) {
System.out.println("catch block");
System.out.println("1234");
// TODO Auto-generated catch block
e.printStackTrace();
}
// Get the user properties
System.out.println("2222");
Hashtable properties = accessControl.getUserProperties(cuid, CTAccessControl.MANAGER_PROPERTY);
System.out.println("3333");
String[] ownerCuid = (String[]) properties.get(CTAccessControl.MANAGER_PROPERTY[0]);
System.out.println("3333");
System.out.println(ownerCuid[0].split(",")[0].split("=")[1]);

return ownerCuid[0].split(",")[0].split("=")[1];
}



}