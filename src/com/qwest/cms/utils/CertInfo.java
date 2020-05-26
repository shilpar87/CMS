/*
 * Created on Jun 6, 2008
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.qwest.cms.utils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.security.cert.Certificate;

import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Date;

/**
 * @author ipatan
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class CertInfo {
 
    public static String getPubKey(String path){
    try{//path="C:/RMS/certsample/adfad.cer";
    String pubkey=null;
    File filename=new File(path);
    FileInputStream fis = new FileInputStream(filename);
    BufferedInputStream bis = new BufferedInputStream(fis);

    CertificateFactory cf = CertificateFactory.getInstance("X.509");

    while (bis.available() > 0) {
    	X509Certificate cert = (X509Certificate) cf.generateCertificate(bis);
    	System.out.println(cert.toString());
    	System.out.println(" version == "+cert.getVersion());
    	Date expiryDate =new Date((System.currentTimeMillis()+(1000*60*60*24)));
    	System.out.println(expiryDate.toString());
    	cert.checkValidity(expiryDate);
    	System.out.println(" checkValidity == "+cert.getNotAfter()+"  "+cert.getNotBefore() );
    	System.out.println(" serial no == "+cert.getSerialNumber());
    	System.out.println(" cert type == "+cert.getPublicKey());
    	pubkey=cert.getPublicKey().toString();
    }
    return pubkey;
    }catch(Exception e){
        System.out.println(e.getMessage());
        return "";
    }


}
}
