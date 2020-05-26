package com.qwest.cms.utils;


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;

import com.qwest.cms.actionForm.CMSFormBean;
//import com.sun.istack.internal.ByteArrayDataSource;


import java.util.StringTokenizer;
import java.util.Vector;


/*import com.rms.Messages;
import com.swat.jdbc.GetData;
import com.swat.util.SwatConstants;
import com.swatinfo.bean.ResBean;*/




public class CmsMail extends Thread{
    
    
	int count = 0;
	
	private String to = "";
	//private String[] ccList = null;//{ "rojit.wahengbam@gmail.com", "rokzit@yahoo.com"};
	private String[] ccList = null;
	private String cc="";
	private String from = "";
	private String subject = "";
	private String[] toList=null;
	private String body = "";
	private String host = "mailgate.uswc.uswest.com";
	private String name ="" ;
	private String notes = "";
	
	
    public CmsMail() {
    }
	
    public CmsMail(String str) {
        super(str);
    }

    public void setCmsMail(String from,String []toList) {
    	this.from=from;
    	this.toList=toList;
		System.out.println("inside setCmsMail------>"+this.from);
		System.out.println("inside setCmsMail------>"+this.toList[0]);
		//System.out.println("inside setCmsMail------>"+this.ccList[0]);
		//System.out.println("inside setCmsMail------>"+this.ccList[1]);
    }
    public void setCmsMail(String from,String to,String []ccList) {
    	this.from=from;
    	this.to=to+"@qwest.com";
		this.ccList=ccList; 
		System.out.println("inside setCmsMail------>"+this.from);
		System.out.println("inside setCmsMail------>"+this.to);
		System.out.println("inside setCmsMail------>0 "+this.ccList);
//		System.out.println("inside setCmsMail------>1 "+this.ccList[1]);
//		System.out.println("inside setCmsMail------>2 "+this.ccList[2]);
//		System.out.println("inside setCmsMail------>3 "+this.ccList[3]);
    }
    public void setCmsMail(String from,String[] toList,String cc) {
    	this.from=from;
    	//this.to=to+"@qwest.com";
		this.cc=cc+"@qwest.com"; 
		this.toList=toList;
		System.out.println("inside setCmsMail------>"+this.from);
		//System.out.println("inside setCmsMail------>"+this.to);
		System.out.println("inside setCmsMail------>"+this.toList[0]);
		//System.out.println("inside setCmsMail------>"+this.toList[1]);
    }
	 public void setCmsMail(String from,String to) {
	    	this.from=from;
	    	this.to=to+"@qwest.com";
			
			System.out.println("inside setCmsMail from------>"+this.from);
			System.out.println("inside setCmsMail to ------>"+this.to);
			//System.out.println("inside setCmsMail------>"+this.ccList[0]);
			//System.out.println("inside setCmsMail------>"+this.ccList[1]);
	    }
	
    
    public void setSubject(String subject){
    	this.subject=subject;
		System.out.println("inside Pafmail subject-------->"+this.subject);
    }
    
   /* public void setBody(String subject,String body){
    	this.setSubject("Escalation:-"+subject);
    	this.body="\nSubject:-"+subject
				  +"\n\n"+body
				  +"\n\nPLEASE TAKE NECESSARY ACTION";  
    }  */  
	
	public void setNotes(String notes){
    	    	this.notes = notes;
    	    	System.out.println("in set notes --------->"+notes);
				  
    }
	
	public void setBody(String body){
	    	
	    	this.body="\n\n"+body;
	    	System.out.println("in set body --------->"+body);
					  
	    }
	
    public void run() {
	
	
    		System.out.println("Inside Run() method $$$$$$$$$$$$$$$$$$$$$$$$$");
		Properties props = new Properties();
		this.body=this.body.replaceAll("<br>","\\n");
		// need to specify which host to send it to
		props.put("mail.smtp.host", host);
		// To see what is going on behind the scene
		props.put("mail.debug", "false");
		
		Session session = Session.getInstance(props);
		
		try {
			// Instantiatee a message
			Message msg = new MimeMessage(session);
//			String approvers=Messages.getString("approver_List");
			
			//Set message attributes
			msg.setFrom(new InternetAddress(this.from));
			if(cc!="")
			{
			InternetAddress[] address = { new InternetAddress(this.cc) };
			msg.setRecipients(Message.RecipientType.CC, address);
			}
			if(to!="")
			{
			InternetAddress[] address = { new InternetAddress(this.to) };
			msg.setRecipients(Message.RecipientType.TO, address);
			}
			if(ccList!=null){
				InternetAddress[] cc= new InternetAddress[ccList.length];
				System.out.println("lenght of cclist "+ ccList.length );
				try {
				    for (count = 0; count < ccList.length; count++){
				    	cc[count] = new InternetAddress(ccList[count].toString()+"@qwest.com");
				        System.out.println("The mail id for cclist in run()   "+ccList[count].toString()+"@qwest.com");
				    }
				} catch (Exception e) {
				    // TODO Auto-generated catch block
				    e.printStackTrace();
				}
				try {
				    msg.setRecipients(Message.RecipientType.CC, cc);
				    System.out.println("the mail id here is inn setRecipients----> "+ cc[0]);
				} catch (RuntimeException e) {
				    // TODO Auto-generated catch block
				    e.printStackTrace();
				}
				
			}
			if(toList!=null){
				InternetAddress[] to= new InternetAddress[toList.length];
				System.out.println("lenght of tolist"+ toList.length );
				for (count = 0; count < toList.length; count++){
					to[count] = new InternetAddress(toList[count].toString()+"@qwest.com");
				    System.out.println("The mail id for tolist in run()  "+toList[count].toString()+"@qwest.com");
				}
				msg.setRecipients(Message.RecipientType.TO, to);
				System.out.println("the mail id here is----> "+ to[0]);
			}
			//System.out.println("subject in run"+subject+body);
			msg.setSubject(subject);
			//System.out.println("Inside run method------------->"+msg.getSubject());
			msg.setSentDate(new Date());
			//msg.setText(this.body+"\n\nTest messages from PAD\n\n Please ignore it \n\nDon't Reply");
			msg.setText(this.body+this.notes);
			Transport.send(msg);
		} catch (MessagingException mex) {
			
			mex.printStackTrace();
		}

    	
    }
	/**
	 * @param args
	 */
	public void sendMessage(String sub,String body,String from,String to,String[] cc) {
		// TODO Auto-generated method stub
		
 		CMSFormBean cmsBean=null;
 		
 		//while(i<absent.size()){
 			
 			CmsMail cm=new CmsMail();
 			cm.setCmsMail(from,to,cc);
			cm.setSubject(sub);
			cm.setBody(body);
 			cm.start();
// 			i++;
 		//}

	    System.out.println("done");
	    
	}
	public void sendMessage(String sub,String body,String from,String[] cc,String to, String notes) throws MessagingException {
		// TODO Auto-generated method stub
		
 		CMSFormBean cmsBean=null;
 		 Properties props = System.getProperties();

 		 System.out.println("cc size *************  "+cc.length+ " ddddddd "+ cc.toString());
		    // Setup mail server
		    props.put("mail.smtp.host", host);

		    // Get session
		    Session session = Session.getInstance(props, null);
 
		    	CmsMail cm=new CmsMail();
 			cm.setCmsMail(from,to,cc);
			cm.setSubject(sub);
			cm.setBody(body);
			cm.setNotes(notes);
			cm.start();
// 			i++;
			
			/*MimeMessage message = new MimeMessage(session);
			
	 		Multipart multipart = new MimeMultipart("related");
	 		MimeBodyPart messageBodyPart = new MimeBodyPart();
	 		    
	 		    //fill message
	 		messageBodyPart.setContent(" For any queries contact CMS helpdesk: "+"<a href='mailto:osstools@qwest.com'><b>osstools@qwest.com</b></a>"+"\n\n\n\n\n" 
	 			    + "***This is an autogenerated mail.  Please do not reply. ***", "text/html; charset=ISO-8859-1");
	 			
	 		  multipart.addBodyPart(messageBodyPart);
	 		  message.setContent(multipart);

	 		    // Send the message
	 		    Transport.send( message );*/
 		//}
			System.out.println("----------------- "+cm.notes);
	    System.out.println("done");
    
	}
	
	
	
	public void sendMessage(String sub,String body,String from,String[] to) {
		// TODO Auto-generated method stub
		
 		CMSFormBean cmsBean=null;
 		
 		//while(i<absent.size()){
 			
 			CmsMail cm=new CmsMail();
 			cm.setCmsMail(from,to);
			cm.setSubject(sub);
			cm.setBody(body);
 			cm.start();
// 			i++;
 		//}

	    System.out.println("done");
	    
	}
	public void sendMessage(String sub,String body,String from,String to) {
		// TODO Auto-generated method stub
		//Vector absent=gd.getAbsentees(today, yest);
 		int i=0;
 		CMSFormBean cmsBean=null;
 		
 		//while(i<absent.size()){
 			
 			CmsMail cm=new CmsMail();
			cm.setSubject(sub);
			cm.setBody(body);
		
			
 			cm.setCmsMail(from,to);
			
 			cm.start();
 			i++;
 		//}

	    System.out.println("done");
	    
	}
	
	public void sendMessWithAttach(String sub,String body,String from,String to,String[] ccList,String fileAttachment) {
		// TODO Auto-generated method stub
		
 		CMSFormBean cmsBean=null;
 		

 		//String fileAttachment = "C:\\crts\\Load_Script.txt";
 		
 			// Get system properties
 		    Properties props = System.getProperties();

 		    // Setup mail server
 		    props.put("mail.smtp.host", host);

 		    // Get session
 		    Session session = 
 		    Session.getInstance(props, null);

 			// Define message
 		    try {
 		    	    MimeMessage message = new MimeMessage(session);
 	 		    message.setFrom( new InternetAddress("cmsAdmin@qwest.com"));
 	 		    message.addRecipient(Message.RecipientType.TO, new InternetAddress(to+"@qwest.com"));
 	 		    if(ccList!=null){
 					InternetAddress[] cc= new InternetAddress[ccList.length];
 					System.out.println("lenght of cclist"+ ccList.length );
 					for (count = 0; count < ccList.length; count++){
 						cc[count] = new InternetAddress(ccList[count].toString()+"@qwest.com");
 					    System.out.println("The mail id for cclist "+ccList[count].toString()+"@qwest.com");
 					}
 					message.setRecipients(Message.RecipientType.CC, cc);
 					//System.out.println("the mail id here is---->"+ cc[0]);
 				}
 	 		    message.setSubject(sub);
 	 		   // message.setText(body);
 	 		    
 	 		    System.out.println("In send with attachment");
 	 		     // create the message part 
 	 		    Multipart multipart = new MimeMultipart("related");
 	 		    MimeBodyPart messageBodyPart = new MimeBodyPart();
 	 		    
 	 		    //fill message
// 	 		   messageBodyPart.setContent(body+"\n\n\n"+". For any queries contact CMS helpdesk: "+"<a href='mailto:osstools@qwest.com'><b>osstools@qwest.com</b></a>"+"\n\n\n\n\n" 
// 	 			    + "***This is an autogenerated mail.  Please do not reply. ***", "text/html; charset=ISO-8859-1");
 	 			
 	 		  messageBodyPart.setText(body);
 	 		  multipart.addBodyPart(messageBodyPart);
 	 		  
 	 		 		  
 	 		    // Part two is attachment
 	 		    messageBodyPart = new MimeBodyPart();
 	 		    DataSource source = new FileDataSource(fileAttachment);
 	 		    messageBodyPart.setDataHandler(new DataHandler(source)); 	 		  	 		  
 	 		    messageBodyPart.setFileName(new java.io.File(fileAttachment).getName());
 	 		   // messageBodyPart.setFileName(fileAttachment);
 	 		    multipart.addBodyPart(messageBodyPart);
 	 		    
 	 		    // Put parts in message
 	 		    message.setContent(multipart);

 	 		    // Send the message
 	 		    Transport.send( message );
			} catch (MessagingException e) {
				// TODO: handle exception\
				System.out.println("Mailing Exception ......"+e);
				
			}
 		    

	    System.out.println("done");
	    
	}
	
	
	public void sendReminderMsg(String sub,String body,String from,String to,String[] ccList) {
		// TODO Auto-generated method stub
		
		CMSFormBean cmsBean=null;
		
		System.out.println("inside sendReminderMsg+++++++++++++ ");
		//String fileAttachment = "C:\\crts\\Load_Script.txt";
		
			// Get system properties
		    Properties props = System.getProperties();

		    // Setup mail server
		    props.put("mail.smtp.host", host);

		    // Get session
		    Session session = 
		    Session.getInstance(props, null);

			// Define message
		    try {
		    	    MimeMessage message = new MimeMessage(session);
	 		    message.setFrom( new InternetAddress("cmsAdmin@qwest.com"));
	 		    message.addRecipient(Message.RecipientType.TO, new InternetAddress(to+"@qwest.com"));
	 		    if(ccList!=null){
					InternetAddress[] cc= new InternetAddress[ccList.length];
					System.out.println("lenght of cclist"+ ccList.length );
					for (count = 0; count < ccList.length; count++){
						cc[count] = new InternetAddress(ccList[count].toString()+"@qwest.com");
					    System.out.println("The mail id for cclist"+ccList[count].toString()+"@qwest.com");
					}
					message.setRecipients(Message.RecipientType.CC, cc);
					//System.out.println("the mail id here is---->"+ cc[0]);
				}
	 		    message.setSubject(sub);
	 		    
	 		   // message.setText(this.body);
	 		    
	 		    System.out.println("getText message... ===? "+this.body);
	 		    
	 		    System.out.println("In send with attachment");
	 		     // create the message part 
	 		    Multipart multipart = new MimeMultipart("related");
	 		    MimeBodyPart messageBodyPart = new MimeBodyPart();
	 	    
	 		    //text
	 		    StringBuffer sb=new StringBuffer();
	 		    sb.append(body);
	 		    /*sb.append("\n\n");
	 		    sb.append("For any queries contact CMS helpdesk: "+"<a href='mailto:osstools@qwest.com'><b>osstools@qwest.com</b></a>");
	 		    sb.append("\n\n ***This is an autogenerated mail.  Please do not reply. ***");*/
	 		    messageBodyPart.setText(sb.toString());
	 		    multipart.addBodyPart(messageBodyPart);
	 		  
	 		 //html		
	 		   /*MimeBodyPart htmlPart = new MimeBodyPart();
	 		   String html="For any queries contact CMS helpdesk: "+"<a href='mailto:osstools@qwest.com'><b>osstools@qwest.com</b></a>"+"\n\n\n\n\n" 
			    + "***This is an autogenerated mail.  Please do not reply. ***";
	 		   htmlPart.setText(html,"text/html;charset=UTF-8");
	 		  // htmlPart.setText(this.body);
	 		  multipart.addBodyPart(htmlPart);*/
	 		    
	 		    // html
	 		    /*MimeBodyPart text=new MimeBodyPart();
	 		    
	 		    text.setContent(body,"text/plain;charset=ISO-8859-1");
	 		   // messageBodyPart.setFileName(fileAttachment);
	 		    mp.addBodyPart(text);*/
	 		    
	 		    // Put parts in message
	 		   message.setContent(multipart);

	 		    // Send the message
	 		    Transport.send( message );
			} catch (MessagingException e) {
				// TODO: handle exception\
				System.out.println("Mailing Exception ......"+e);
				
			}
		    

	    System.out.println("done");
	    
	}
	
	
	
	public void sendMessWithAttach(String sub,String body,String from,String to,String[] ccList) {
		// TODO Auto-generated method stub
		
		CMSFormBean cmsBean=null;
		Properties props = System.getProperties();

		  // Setup mail server
		props.put("mail.smtp.host", host);

		  // Get session
		    Session session = 
		    Session.getInstance(props, null);

			// Define message
		    try {
		    	    MimeMessage message = new MimeMessage(session);
	 		    message.setFrom( new InternetAddress("cmsAdmin@qwest.com"));
	 		    message.addRecipient(Message.RecipientType.TO, new InternetAddress(to+"@qwest.com"));
	 		    if(ccList!=null){
					InternetAddress[] cc= new InternetAddress[ccList.length];
					System.out.println("lenght of cclist"+ ccList.length );
					for (count = 0; count < ccList.length; count++){
						cc[count] = new InternetAddress(ccList[count].toString()+"@qwest.com");
					    System.out.println("The mail id for cclist"+ccList[count].toString()+"@qwest.com");
					}
					message.setRecipients(Message.RecipientType.CC, cc);
					//System.out.println("the mail id here is---->"+ cc[0]);
				}
	 		    message.setSubject(sub);
	 		    
	 		    System.out.println("In send with attachment");
	 		     // create the message part 
	 		    MimeBodyPart messageBodyPart = new MimeBodyPart();

	 		    //fill message
	 			messageBodyPart.setText(body);
	 			
	 			Multipart multipart = new MimeMultipart();
	 		    multipart.addBodyPart(messageBodyPart);

	 		    // Part two is attachment
	 		    messageBodyPart = new MimeBodyPart();
	 		  //  DataSource source = new FileDataSource(fileAttachment);
	 		 //   messageBodyPart.setDataHandler(new DataHandler(source));
	 		//  messageBodyPart.setFileName(new java.io.File(fileAttachment).getName());
	 		   // messageBodyPart.setFileName(fileAttachment);
	 		    multipart.addBodyPart(messageBodyPart);
	 		    
	 		    // Put parts in message
	 		    message.setContent(multipart);

	 		    // Send the message
	 		    Transport.send( message );
			} catch (MessagingException e) {
				// TODO: handle exception\
				System.out.println("Mailing Exception ......"+e);
				
			}
		    

	    System.out.println("done");
	    
	}

}
