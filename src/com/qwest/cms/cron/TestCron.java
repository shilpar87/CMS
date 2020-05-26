package com.qwest.cms.cron;

import java.util.GregorianCalendar;

import com.qwest.cms.action.CMSAction;


public class TestCron {
	
public static void main(String a[]){
	GregorianCalendar gc=new GregorianCalendar();
	System.out.println(" inside TestCron:::Jcron at :-"+gc.getTime().toString());
	CMSAction.Reminder_query();
	//CMSAction.remindAlaram();

}

}
