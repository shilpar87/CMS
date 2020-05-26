/*
 * FPortecle.java
 * This file is part of Portecle, a multipurpose keystore and certificate tool.
 *
 * Copyright © 2004 Wayne Grant, waynedgrant@hotmail.com
 *             2004-2007 Ville Skyttä, ville.skytta@iki.fi
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301, USA.
 */

/*import net.sf.portecle.crypto.CryptoException;
import net.sf.portecle.crypto.KeyPairType;
import net.sf.portecle.crypto.KeyStoreType;
import net.sf.portecle.crypto.KeyStoreUtil;
import net.sf.portecle.crypto.ProviderUtil;
import net.sf.portecle.crypto.X509CertUtil;
import net.sf.portecle.gui.JMenuItemRecentFile;
import net.sf.portecle.gui.JMenuRecentFiles;
import net.sf.portecle.gui.LastDir;
import net.sf.portecle.gui.SwingHelper;
import net.sf.portecle.gui.WSplash;
import net.sf.portecle.gui.about.DAbout;
import net.sf.portecle.gui.crypto.DProviderInfo;
import net.sf.portecle.gui.error.DThrowable;
import net.sf.portecle.gui.help.FHelp;
import net.sf.portecle.gui.jar.DJarInfo;
import net.sf.portecle.gui.password.DChangePassword;
import net.sf.portecle.gui.password.DGetNewPassword;
import net.sf.portecle.gui.password.DGetPassword;
import net.sf.portecle.gui.statusbar.StatusBar;
import net.sf.portecle.gui.statusbar.StatusBarChangeHandler;
import net.sf.portecle.gui.theme.LightMetalTheme;
import net.sf.portecle.version.JavaVersion;
import net.sf.portecle.version.VersionException;*/
package com.qwest.cms.utils;
import com.qwest.cms.utils.X509CertUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.cert.X509Certificate;

import javax.servlet.http.HttpServletRequest;

import org.bouncycastle.jce.PKCS10CertificationRequest;
import org.bouncycastle.openssl.PEMWriter;



/**
 * Start class and main frame of the keystore GUI application.
 */
public class ExportUtil{
    public boolean exportHeadCertOnlyPem(X509Certificate cert){
        
       /*String basename = X509CertUtil.getCertificateAlias(cert);
        if (basename.length() == 0) {
            basename = sEntryAlias;
        }
       String basename="aruna";*/
        // Let the user choose the export cert file
        File fExportFile =new File("C:/aruna.txt");
        System.out.println("in Export util writing to aruna.txt");
        if (fExportFile == null) {
            return false;
        }
/*
        if (!confirmOverwrite(fExportFile, getTitle())) {
            return false;
        }*/

        PEMWriter pw = null;
        try {
            pw = new PEMWriter(new FileWriter(fExportFile));
            pw.writeObject(cert);
            //m_lastDir.updateLastDir(fExportFile);
            return true;
        }
        catch (FileNotFoundException ex) {
           /* String sMessage = MessageFormat.format(
                m_res.getString("FPortecle.NoWriteFile.message"),
                new String[] { fExportFile.getName() });
            JOptionPane.showMessageDialog(this, sMessage, getTitle(),
                JOptionPane.WARNING_MESSAGE);*/
            return false;
        }
        catch (IOException ex) {
            //displayException(ex);
            return false;
        }
        finally {
            if (pw != null) {
                try {
                    pw.close();
                }
                catch (IOException ex) {
                    //displayException(ex);
                }
            }
        }
    }
    public boolean exportHeadCertOnlyPem(X509Certificate cert,String cuid){
        
       // String basename = X509CertUtil.getCertificateAlias(cert);
         /*if (basename.length() == 0) {
             basename = sEntryAlias;
         }*/

         // Let the user choose the export cert file
        System.out.println(" in the her crt ");
        String path=CMSProperties.getString("CRT_file_path")+cuid+".txt";
         File fExportFile =new File(path);
         if (fExportFile == null) {
             return false;
         }
 /*
         if (!confirmOverwrite(fExportFile, getTitle())) {
             return false;
         }*/

         PEMWriter pw = null;
         try {
             pw = new PEMWriter(new FileWriter(fExportFile));
             pw.writeObject(cert);
             //m_lastDir.updateLastDir(fExportFile);
             return true;
         }
         catch (FileNotFoundException ex) {
            /* String sMessage = MessageFormat.format(
                 m_res.getString("FPortecle.NoWriteFile.message"),
                 new String[] { fExportFile.getName() });
             JOptionPane.showMessageDialog(this, sMessage, getTitle(),
                 JOptionPane.WARNING_MESSAGE);*/
             return false;
         }
         catch (IOException ex) {
             //displayException(ex);
             return false;
         }
         finally {
             if (pw != null) {
                 try {
                     pw.close();
                 }
                 catch (IOException ex) {
                     //displayException(ex);
                 }
             }
         }
     }
    
    
        public boolean exportHeadCsrOnlyPem(PKCS10CertificationRequest csr) throws IOException{
           //String basename = X509CertUtil.getCertificateAlias(cert);
            /*if (basename.length() == 0) {
                basename = sEntryAlias;
            }*/

            // Let the user choose the export cert file
            //String path=request.getContextPath()+"/temp/newcsr.csr";
            //File fExportFile =new File("C:\\Tomcat 5.0\\webapps\\CERTMGMT\\temp\\newcsr.csr");
        	//String loginId = session.get;
        	String csrFilePath = CMSProperties.getString("CSR_file_path")+"aman"+".txt";
        	System.out.println(csrFilePath + "is the csr file path");
        	File fExportFile =new File(csrFilePath);
        	if(!fExportFile.exists()){
        	      fExportFile.createNewFile();        	      
        	}
            if (fExportFile == null) {
                return false;
            }
    /*
            if (!confirmOverwrite(fExportFile, getTitle())) {
                return false;
            }*/

            PEMWriter pw = null;
            try {
                
                pw = new PEMWriter(new FileWriter(fExportFile));
                pw.writeObject(csr);
                //m_lastDir.updateLastDir(fExportFile);
                return true;
            }
            catch (FileNotFoundException ex) {
               /* String sMessage = MessageFormat.format(
                    m_res.getString("FPortecle.NoWriteFile.message"),
                    new String[] { fExportFile.getName() });
                JOptionPane.showMessageDialog(this, sMessage, getTitle(),
                    JOptionPane.WARNING_MESSAGE);*/
            	System.out.println(ex);
                return false;
            }
            catch (IOException ex) {
                //displayException(ex);
                return false;
            }
            finally {
                if (pw != null) {
                    try {
                        pw.close();
                    }
                    catch (IOException ex) {
                        //displayException(ex);
                    }
                }
            }
        
    }
        public boolean exportHeadCsrOnlyPem(PKCS10CertificationRequest csr, String loginId) throws IOException{
 
             // Let the user choose the export cert file

         	String csrFilePath = CMSProperties.getString("CSR_file_path")+loginId+".txt";
         	System.out.println(csrFilePath + "is the csr file path");
         	File fExportFile =new File(csrFilePath);
         	if(!fExportFile.exists()){
         	      fExportFile.createNewFile();        	      
         	}
             if (fExportFile == null) {
                 return false;
             }
     /*
             if (!confirmOverwrite(fExportFile, getTitle())) {
                 return false;
             }*/

             PEMWriter pw = null;
             try {
                 
                 pw = new PEMWriter(new FileWriter(fExportFile));
                 pw.writeObject(csr);
                 //m_lastDir.updateLastDir(fExportFile);
                 return true;
             }
             catch (FileNotFoundException ex) { 
             	System.out.println(ex);
                 return false;
             }
             catch (IOException ex) {
                 return false;
             }
             finally {
                 if (pw != null) {
                     try {
                         pw.close();
                     }
                     catch (IOException ex) {
                     }
                 }
             }
         
     }
    
        public static String  readCsr(){
            //String path=request.getContextPath()+"/temp/newcsr.csr";
            try{
                StringBuffer sb=new StringBuffer();
                //BufferedReader br=new BufferedReader(new FileReader(new File("C:\\Tomcat 5.0\\webapps\\CERTMGMT\\temp\\newcsr.csr")));
                //BufferedReader br=new BufferedReader(new FileReader(new File(CMSProperties.getString("CSR_file_path"))));
                File csrFile = new File(CMSProperties.getString("CSR_file_path").trim()+"aman"+".txt");
                BufferedReader br=new BufferedReader(new FileReader(csrFile));

                String line;
                while((line = br.readLine()) != null){
                sb.append(line);
                sb.append("\n");
                }
                if ( csrFile.exists() ) {
                	csrFile.deleteOnExit();              
                }
                System.out.println("csrFile.exists()"+csrFile.exists());
                return sb.toString();
            	}catch(IOException ie){
            		System.out.println(ie);
            		return ie.getMessage();  
            	}
            
        	}
        
        public static String  readCsr( String loginId){
 
            try{
                StringBuffer sb=new StringBuffer();               

                File csrFile = new File(CMSProperties.getString("CSR_file_path").trim()+loginId+".txt");
                BufferedReader br=new BufferedReader(new FileReader(csrFile));

                String line;
                while((line = br.readLine()) != null){
                sb.append(line);
                sb.append("\n");
                }
                br.close();
                
                if ( csrFile.exists() ) {
                	System.out.println("here deleting==> "+csrFile.delete());
                	              
                }
                //System.out.println("csrFile.exists()===> "+csrFile+csrFile.exists());
                return sb.toString();
            	}catch(IOException ie){
            		System.out.println("*************************"+ie.getMessage());
            		ie.printStackTrace();
            		return ie.getMessage();  
            	}
            
        	}
        public static String  readCrt( String loginId){
            
                       try{
                           StringBuffer sb=new StringBuffer();               

                           File csrFile = new File(CMSProperties.getString("CRT_file_path").trim()+loginId+".txt");
                           BufferedReader br=new BufferedReader(new FileReader(csrFile));

                           String line;
                           while((line = br.readLine()) != null){
                           sb.append(line);
                           sb.append("\n");
                           }
                           br.close();
                           
                           if ( csrFile.exists() ) {
                           	System.out.println("here deleting readCrt==> "+csrFile.delete());
                           	              
                           }
                           //System.out.println("csrFile.exists()===> "+csrFile+csrFile.exists());
                           return sb.toString();
                       	}catch(IOException ie){
                       		System.out.println("*************************"+ie.getMessage());
                       		ie.printStackTrace();
                       		return ie.getMessage();  
                       	}
                       
                   	}
        
        public static boolean updateRawCert(X509Certificate certInfo, String certPath) throws IOException{

         	String csrFilePath = CMSProperties.getString("CSR_file_path")+"IPATAN"+".txt";
        	
        	//String csrFilePath = certPath;
         	System.out.println(csrFilePath + "  is the csr file path");
         	File fExportFile =new File(csrFilePath);
         	if(!fExportFile.exists()){
         	      fExportFile.createNewFile();
         	      System.out.println("File does not exist......");
         	}
             if (fExportFile == null) {
            	 System.out.println("File exist......");
                 return false;
             }
     /*
             if (!confirmOverwrite(fExportFile, getTitle())) {
                 return false;
             }*/

             PEMWriter pw = null;
             try {
             
                 pw = new PEMWriter(new FileWriter(fExportFile));
                 pw.writeObject(certInfo);
                 System.out.println("In PEM writer......."+fExportFile);
                 //m_lastDir.updateLastDir(fExportFile);
                 return true;
             }
             catch (FileNotFoundException ex) {
             	System.out.println(ex);
                 return false;
             }
             catch (IOException ex) {
                 //displayException(ex);
            	 ex.printStackTrace();
                 return false;
             }
             finally {
                 if (pw != null) {
                     try {
                         pw.close();
                     }
                     catch (IOException ex) {
                         //displayException(ex);
                     }
                 }
             }
         
     }
    

   
    

}
