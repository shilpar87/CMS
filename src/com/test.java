/*
 * Created on Feb 3, 2009
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.KeyStore;
import java.security.cert.CertificateException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import com.qwest.cms.utils.CMSProperties;
import com.qwest.cms.utils.ParseX509Certificate;
/**
 * @author ipatan
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class test {
    
    public static void main(String[] args) {/*
        String status="";
        Calendar today= Calendar.getInstance();
        DateFormat df = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
        Date expday = df.parse("20/01/2009");  
        System.out.println(today.getTime().compareTo(expday));
        if(today.getTime().compareTo(expday)>0){
             status = "EXPIRED";
        }else{
         status = "ACTIVE";
        }
        String path="/opt/weblogic/user_projects/domains/CERTMGMT/applications/cms/crts/ALLSERVER/ALLUSER/suomp20j#imaixg#wls47671.pem.20";
        path= path.substring(0, path.lastIndexOf("/"))+"/*"; 
        String cerFileName="suomt76i#abcd#interop2.jks";
        StringTokenizer str=new StringTokenizer(cerFileName,"#");
        //  while(str.hasMoreTokens()){
            String  server=str.nextToken();
            String  appUser=str.nextToken();
            String crtname=str.nextToken();
            System.out.println(path );
    
        String readSuc="";
        String unValid="";
        String crt_home=CMSProperties.getString("crt_home"); 
        File crtDir=new File(crt_home);
        if(crtDir.isDirectory()) { 
            File[] crts = crtDir.listFiles();
            for(int i=0;i<crts.length;i++){
                File file=crts[i]; 
                try {
            	    String filePath=file.getPath();
            	    if(filePath.endsWith(".p12") || filePath.endsWith(".pfx") || filePath.endsWith(".p7b")||filePath.endsWith("jks")){
            	        String format = "PKCS12";   
                        if(filePath.endsWith("jks"))
                         		format = "JKS";
                        KeyStore keyStore = KeyStore.getInstance(format);
                        FileInputStream fis = new FileInputStream(file);
                        keyStore.load(fis,null);
                        Enumeration e = keyStore.aliases();
                        int numJ=1;
                        while(e.hasMoreElements()){
                            String aliasName = (String)e.nextElement(); 
                            ParseX509Certificate crt=new ParseX509Certificate(aliasName,keyStore);
                            if(crt.getX509cert()!=null){
                         		map.put(file.getPath()+"."+numJ++, crt);
                         		readSuc=readSuc+file.getName().replaceAll(CMSProperties.getString("delimiter"), ",")+","+crt.getNotBefore()+","+crt.getNotAfter()+"\n";
                        }else{
                 		    list.add(file.getPath());
                  		   unValid=unValid+file.getName()+"\n";    
                  		   }
                        }
                        fis.close();
            	    }else{
            		ParseX509Certificate crt=new ParseX509Certificate(file);
            		 if(crt.getX509cert()!=null){
                 		map.put(file.getPath(), crt);
                 		readSuc=readSuc+file.getName().replaceAll(CMSProperties.getString("delimiter"), ",")+","+crt.getNotBefore()+","+crt.getNotAfter()+"\n";
            		 }else{
                 		    list.add(file.getPath());
                 		   unValid=unValid+file.getName()+"\n";
             		}
            	    }
            	}catch(CertificateException crtExp){
            		System.out.println(" File"+file.getPath()+" Cannot parse Certficate  \n Exp Message: "+crtExp.getMessage());
            		logger.error("Tools -Display Cert List -- Certificate Parse Error  - "+crtExp);                    		
            		unValid=unValid+file.getName()+"\n";                    		
            	}catch(IOException exp){
            		System.out.println(" File"+file.getPath()+" IO EXPN \n Exp Message: "+exp.getMessage());
            		logger.error("Tools -Display Cert List -- Cert IOException - "+exp);                    		
            		unValid=unValid+file.getName()+"\n";                    		
            	}
            }
        }
    */}
}
