package com.qwest.cms.utils;

import java.util.Properties;
import java.util.StringTokenizer;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {
	public static void sendMail(String fromAddr, String toAddr,String messg) throws MessagingException{
		Properties props = new Properties();
		
			props.put("mail.smtp.host", "mailgate.uswc.uswest.com");
			Session s = Session.getInstance(props, null);
			MimeMessage message = new MimeMessage(s);
			InternetAddress from = new InternetAddress(fromAddr+"@qwest.com");
			message.setFrom(from);
			InternetAddress to = new InternetAddress(toAddr+"@qwest.com");
			message.addRecipient(Message.RecipientType.TO, to);
			message.setSubject("Resource request");
			message.setText(messg);
			message.setContent(messg, "text/html");
			Transport.send(message);
	}
	public static void sendMailWithSubject(String fromAddr, String toAddr,String messg,String subject) throws MessagingException{
			StringTokenizer strToAddr = new StringTokenizer(toAddr,";");
			while(strToAddr.hasMoreTokens()){
				Properties props = new Properties();
				props.put("mail.smtp.host", "mailgate.uswc.uswest.com");
				Session s = Session.getInstance(props, null);
				MimeMessage message = new MimeMessage(s);
				InternetAddress from = new InternetAddress(fromAddr+"@qwest.com");
				message.setFrom(from);
				InternetAddress to = new InternetAddress(strToAddr.nextToken());
				System.out.println("Mail id--->"+to.toString());
				message.addRecipient(Message.RecipientType.TO, to);
				message.setSubject(subject);
				message.setText(messg);
				message.setContent(messg, "text/html");
				Transport.send(message);				
			}
	}	
}