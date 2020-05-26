package com.qwest.cms.utils;

import java.rmi.RemoteException;
import java.util.HashMap;

import com.qwest.cms.webservice.NETGroupData.NETGroupData;
import com.qwest.cms.webservice.NETGroupData.NETGroupDataServiceLocator;
import com.qwest.cms.webservice.net.GroupDataRequest;
import com.qwest.cms.webservice.net.GroupDataResponse;


/**
 * 
 * @author Babu Visvanathan
 *
 */
public class NETGroupDataClient
{
   public static void main(String args[]) 
   {
	    try {
	    	getGroupPinDetails("77209");
	    	} catch (Exception exception) {
	    		if(exception instanceof RemoteException)
	    			if(exception.getMessage().indexOf("NullPointerException")!=-1)
	    				System.out.println("Net Tool Pin is not valid");
			    else exception.printStackTrace();
		}
   }
   
   /**
    * This metod gets the net tool group pin and prints details 
    * (i.e, group members,group name,group type etc)
    * of that group
    * @param groupPin
    * @throws Exception
    */
   public static HashMap getGroupPinDetails(String groupPin) throws Exception{
	   
       System.out.println("netgroup=========================");
	   	  GroupDataRequest request   = new GroupDataRequest();
	   	  GroupDataResponse response = null;
	   	  HashMap map=new HashMap();
	   	
	      request.setGroupPin(groupPin);
	      NETGroupDataServiceLocator netGroupDataServiceLocator = new NETGroupDataServiceLocator();
	      //NETGroupDataSoapBindingStub groupDataSoapBindingStub = new NETGroupDataSoapBindingStub();
	      NETGroupData netGroupData =netGroupDataServiceLocator.getNETGroupData();
	      //response = groupDataSoapBindingStub.getData(request);
		    response = netGroupData.getData(request);
			  if (response != null)
		      { 
		       map.put("GroupName", response.getGroupName());
		       map.put("GroupType", response.getGroupType());
		       map.put("GroupOwner", response.getGroupOwnerName());
		       map.put("PrimaryOncall", response.getPrimaryName());
		       map.put("BackupOncall", response.getBackupName());
		       map.put("FirstEscalation", response.getFirstEscName());
		       map.put("SecondEscalation", response.getSecondEscName());
		       String[] membrs=response.getGroupMembersAll();
		       String[] membrsCuid=response.getGroupMembersCuidAll();
		         //  new String[response.getGroupMembersAll().length];
		    	 System.out.println("Group Name - "+response.getGroupName());
		         System.out.println("Group Type - "+response.getGroupType());
		         System.out.println("Group Owner - "+response.getGroupOwnerName());
		         System.out.println("Primary Oncall - "+response.getPrimaryName());
		         System.out.println("Backup Oncall - "+response.getBackupName());
		         System.out.println("First Escalation - "+response.getFirstEscName());
		         System.out.println("Second Escalation - "+response.getSecondEscName());
		         /*for (int index = 0; index < response.getGroupMembersAll().length; index++)
		         {
		            System.out.println("Group Member "+(index+1)+"-"+response.getGroupMembersAll()[index]);
		            membrs[index]=response.getGroupMembersAll()[index];
		            
		         }*/
		         map.put("GroupMembers",membrs);
		         map.put("GroupMembersCuid",membrsCuid);
		      }
			  return map;
   }
}
