package com.qwest.cms.cron;

import java.util.GregorianCalendar;

import com.qwest.cms.action.CMSAction;


public class AllCertsCron {
	
public static void main(String a[]){
	GregorianCalendar gc=new GregorianCalendar();
	System.out.println(" inside AllCertsCron:::Jcron at :-"+gc.getTime().toString());
	CMSAction.AllCertsReminderQuery();

}

}