/*
 * Created on Feb 23, 2009
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.qwest.cms.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;



/**
 * @author ipatan
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class CmsToolUtil {

    public void writeFile(File file,String msg) throws IOException{
       
        Writer writer = new BufferedWriter(new FileWriter(file));
       
        writer.write(msg);
     
        writer.close();
     
    }
    public void mailPwdCrt(ArrayList list,String cuid)throws IOException{
        System.out.println(" list.size() == > "+list.size());
    	if(list.size()>0){
    	    for(int s=0;s<list.size();s++){
    	        
    	        String fromId = "cmsAdmin";    	              
    	       String   toList = cuid;
    	       String  ccList[] = {};
    	       String subject =CMSProperties.getString("NOT_SUP_SUB");
    	       String message = "\n"+"\n"+"HI "+toList+",\n"+"\n"+CMSProperties.getString("NOT_SUP_MESS");
    	       String fileAttachment=(String)list.get(s);
    	       CmsMail cmsMail = new CmsMail();
    	       cmsMail.sendMessWithAttach(subject, message, fromId, toList, ccList,fileAttachment);
    	       
    	    }
    	}
    }
    
    public boolean moveFile(String src,String dest){
		try {
			int i=0;
			Runtime	run=Runtime.getRuntime();
			System.out.println(" runtime created");
	    File fe=new	File(src);
	    String cmd="mv ";
		    run.exec(cmd+fe+" "+dest).waitFor();
		    System.out.println("exec == "+cmd+fe+" "+dest);			
			return true;
	     }
		catch (Exception ex) {
		   // logger.error(0, ex,	"ReadRequestFile: Failed in moveFile()");
			ex.printStackTrace();
			//run.exit(1);
			return false;
		  }
	   }
    public String[] getAppOwner(String groupName){
    	
String ownerCuid;
String ownerName;
String managerCuid;
String managerName;
List ownerList = null ;	
String[] ownerDetails = new String[4];
//Set mapKey=ownerMap.keySet();
//Iterator ir=mapKey.iterator();
//HashMap noOwnerMap = new HashMap();
//HashMap ownerNameMap = new HashMap();

try {				
	ownerCuid = LDAPSecurity.getSupervisourCuid(groupName);
	ownerName = LDAPSecurity.getUserName(ownerCuid);
	managerCuid = LDAPSecurity.getSupervisourCuid(ownerCuid);
	managerName = LDAPSecurity.getUserName(managerCuid);
	//System.out.println("Owner Name ="+ownerName+"......"+managerName);
			
	ownerDetails[0] = ownerCuid;
	ownerDetails[1] = ownerName;
	ownerDetails[2] = managerCuid;
	ownerDetails[3] = managerName;
	//ownerList.add(ownerDetails);
	
	//return ownerList;
	
}catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	//noOwnerMap.put(hostId, ownerCuid);
}
return ownerDetails;       


}
}
