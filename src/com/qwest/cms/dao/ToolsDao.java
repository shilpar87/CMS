/*
 * Created on Jul 22, 2008
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.qwest.cms.dao;

import com.qwest.cms.BO.CMSBO;
import com.qwest.cms.dbconnection.DBConnection;
import com.qwest.cms.utils.CMSProperties;
import com.qwest.cms.utils.CmsDbTable;
import com.qwest.cms.utils.ParseX509Certificate;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


/**
 * @author ipatan
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ToolsDao {
   private Connection             conn            = null;
    private Statement              stmt            = null;
    private static final String    WHERE           = " WHERE ";
    private static final String    AND             = " AND ";
    private static final String    UNION             = " UNION ";
    DBConnection dbConn = DBConnection.getInstance();
    //private Connection conn = DBConnection.getInstance().getConn(true);
 /*   ToolsDao(){
        try{
        conn=DBConnection.getInstance().getConn(true);
        }catch(SQLException sqlexp){
            
        }
       
    }*/
    public ArrayList getAppList(String cuid){
        ArrayList appList=new ArrayList();
        String slectQury="select distinct APPLICATION_NAME ,ACRONYM from "+CmsDbTable.TBL_CMS_APP_MEMBER+""+WHERE+"upper(MEMBER_CUID)" +
        		"=upper('"+cuid+"')"+UNION+"select distinct APPLICATION_NAME ,ACRONYM from "+CmsDbTable.TBL_CMS_APP_OWNER+""+WHERE+
        				"upper(CREATOR_CUID)=upper('"+cuid+"')";
        System.out.println("getApplist Query in ToolsDAO.... "+slectQury);
        try{    
         conn = dbConn.getConn(true);
          stmt = conn.createStatement();         
          ResultSet rs=stmt.executeQuery(slectQury);
          while(rs.next()){
              CMSBO bo=new CMSBO();
              bo.setAppName(rs.getString(1));
              bo.setAcronym(rs.getString(2));
              appList.add(bo);
          }           
        }
        catch (SQLException e)
        {
            
          System.out.println("SQL E is " +e);
          try {
           conn.rollback();
             // logger.log(LEVEL_SQL_EXC, CommonErr.formatST(MSG_SQL_EXC, sql, e));
       } catch (SQLException e1) {
           // TODO Auto-generated catch block
           e1.printStackTrace();
       }
        }
        catch (Exception e)
        {
          System.out.println("SLE E is " +e);
        //  logger.log(LEVEL_SVC_LOCATOR_EXC, CommonErr.formatST(MSG_SVC_LOCATOR_EXC,ServiceLocator.DATA_SOURCE_JNDI_NAME, e));
        }
        finally
        {
          if (conn != null)
          {
            try
            {
              if (stmt != null)
                stmt.close();
              conn.close();
            }
            catch (SQLException e1)
            {System.out.println("SQLException E is " +e1);
              //logger.log(LEVEL_SQL_EXC, CommonErr.formatST(MSG_SQL_EXC, e1));
            }
          }
        }
        
      
        return appList;
    }
    public boolean checkRow(ParseX509Certificate crt){
        boolean exist=true;
        String ISSUER=crt.getIssuerDN();
        String SERIALNO=crt.getSerialNumber(2,' '); 
        String query="select 1 from "+CmsDbTable.TBL_CMS_CERT_DETAILS+" where ISSUER ='"+ISSUER+"' and SERIALNO ='"+SERIALNO+"'";
        System.out.println(" Select string exin check Row for D_TBL_CMS_CERT_DETAILS ==> \n"+query);
        try{
         conn = dbConn.getConn(true);
         stmt = conn.createStatement();         
         ResultSet rs=stmt.executeQuery(query);
         exist=rs.next();
         
         }catch (SQLException e){           
          System.out.println("SQL E is : in checkRow(): " +e);
          e.printStackTrace();
       
        } finally
        {
            if (conn != null)
            {
              try
              {
                if (stmt != null)
                  stmt.close();
                conn.close();
              }
              catch (SQLException e1)
              {System.out.println("SQLException E is " +e1);
                //logger.log(LEVEL_SQL_EXC, CommonErr.formatST(MSG_SQL_EXC, e1));
              }
            }
          }           
      
        return exist;
    }
    
    public boolean checkRow(ParseX509Certificate crt,String appName,String acronym,String host_id,String host_ip){
        boolean exist=true;
        String SERIAL_NO=crt.getSerialNumber(2, ' ');
        String ISSUER=crt.getIssuerDN();
        appName=appName.toUpperCase();
        acronym=acronym.toUpperCase();
        host_id=host_id.toUpperCase();
        String query="select 1 from "+CmsDbTable.TBL_CMS_CERTIFICATES+" where APPLICATION_NAME='"+appName+"'"+AND+"ACRONYM='"+acronym+"'"+AND+"HOST_ID='"+host_id+"'"+AND+" HOST_IP ='"+host_ip+"'"+AND+" SERIAL_NO='"+SERIAL_NO+"'"+ AND+" ISSUER ='"+ISSUER+"'";
        System.out.println(" Select string exin check Row for crts ==> \n"+query);
        try{
         conn = dbConn.getConn(true);
         stmt = conn.createStatement();         
         ResultSet rs=stmt.executeQuery(query);
         exist=rs.next();
       //  System.out.println(" the status of the given row of cer is "+exist);
         }catch (SQLException e){           
          System.out.println("SQL E is: in checkRow(): " +e);
       
        } finally
        {
            if (conn != null)
            {
              try
              {
                if (stmt != null)
                  stmt.close();
                conn.close();
              }
              catch (SQLException e1)
              {System.out.println("SQLException E is " +e1);
              e1.printStackTrace();
                //logger.log(LEVEL_SQL_EXC, CommonErr.formatST(MSG_SQL_EXC, e1));
              }
            }
          }           
      
        return exist;
    }
    
    public String insertCrtStmt(ParseX509Certificate crt,String appName,String acronym,String host_id,String host_ip,String cuid,String crt_nname,String CrtType,String note,String abspath)throws ParseException{
        System.out.println(" in dao loade ");
        String COMPANYNAME="company";
        String status = "ACTIVE";
        appName=appName.toUpperCase();
        acronym=acronym.toUpperCase();
        host_id=host_id.toUpperCase();
        crt_nname=crt_nname.toUpperCase();
        String ser_no = crt.getSerialNumber(2, ' '); 
        String isur = crt.getIssuerDN(); 
        String valid_from = crt.getNotBefore(); 
        String valid_to = crt.getNotAfter(); 
        
        Calendar today= Calendar.getInstance();
        DateFormat df = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
        Date expday = df.parse(valid_to);  
        System.out.println(today.getTime().compareTo(expday));
        if(today.getTime().compareTo(expday)>0){
             status = "EXPIRED";
        }
                
       String insertQuery="INSERT INTO "+CmsDbTable.TBL_CMS_CERTIFICATES+" ( APPLICATION_NAME, ACRONYM, HOST_ID, HOST_IP, SERIAL_NO, ISSUER,CREATOR_CUID, CERT_NICKNAME, CREATE_ON, EXPIRE_ON, STATUS, CERT_SEQ_NU,CERT_TYPE,MODIFIED_CUID,NOTES,CERT_PATH_SERVER ) " +
       		"VALUES ('"+appName+"', '"+acronym+"', '"+host_id+"', '"+host_ip+"', '"+ser_no+"', '"+isur+"', '"+cuid+"', '"+crt_nname+"',   to_date('"+valid_from+"','MM-DD-YYYY  HH24:MI:SS'),  to_date('"+valid_to+"','MM-DD-YYYY  HH24:MI:SS'), '"+status+"', 100, '"+CrtType+"','"+cuid+"','"+note+"','"+abspath+"')";
        
       System.out.println(" inser stmt of CrtStmt ==> \n"+insertQuery);
       return insertQuery;    
                             
    }
    
    public String insertStmt(ParseX509Certificate crt,File file)throws ParseException  {
       System.out.println(" in dao loade ");
        String COMPANYNAME="QWEST";
        String status = "ACTIVE";
        String raw_cert = crt.getRawCert(); 
        String subj = crt.getSubjectDN(); 
        String subj_cn = crt.getSubject("CN"); 
        String subj_org = crt.getSubject("O"); 
        String subj_orgUnit = crt.getSubject("OU"); 
        String subj_location = crt.getSubject("L"); 
        String subj_state = crt.getSubject("ST"); 
        String subj_country = crt.getSubject("C"); 
        String subj_email = crt.getSubject("EmailAddress"); 
        String version =crt.getVersion(); 
        String ser_no = crt.getSerialNumber(2, ' ');  
        String isur = crt.getIssuerDN(); 
        String isur_cn = crt.getIssuer("CN"); 
        String isur_org = crt.getIssuer("O"); 
        String isur_orgUnit = crt.getIssuer("OU"); 
        String isur_location = crt.getIssuer("L"); 
        String isur_state = crt.getIssuer("ST"); 
        String isur_country = crt.getIssuer("C"); 
        String isur_email = crt.getIssuer("EmailAddress"); 
        String valid_from = crt.getNotBefore(); 
        String valid_to = crt.getNotAfter(); 
        String public_key = crt.getPublicKey();
        String sig_alg=crt.getSigAlgName();
       String signatur=crt.getSignature();
      
       Calendar today= Calendar.getInstance();
       DateFormat df = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
       Date expday = df.parse(valid_to);  
       System.out.println(today.getTime().compareTo(expday));
       if(today.getTime().compareTo(expday)>0){
            status = "EXPIRED";
       }
       
       
        String insert="INSERT INTO "+CmsDbTable.TBL_CMS_CERT_DETAILS+" ( RAW_CERTIFICATE, SERIALNO, CERT_QWNER, COMPANY_NAME,STATUS," +
        		"CERT_VERS, SUBJECT, SUBJECT_CN, SUBJECT_O, SUBJECT_OU, SUBJECT_L, SUBJECT_S, SUBJECT_C, SUBJECT_E," +
        		"ISSUER, ISSUER_CN, ISSUER_O, ISSUER_OU, ISSUER_L, ISSUER_S, ISSUER_C, ISSUER_E, " +
        		"PUBLIC_KEY,SIGNATURE_ALGO, SIGNATURE,  FROM_DT, EXPIRY_DT, CREATE_DT,MOD_DT )" +
        		"VALUES ('"+CMSProperties.getString("readDir")+file.getName()+"','"+ser_no+"',NULL,'"+COMPANYNAME+"', '"+status+"', '"+version+"',' " +
        				""+subj+"' ,'"+subj_cn+"', '"+subj_org+"', '"+subj_orgUnit+"', '"+subj_location+"', '"+subj_state+"','" +
        			   ""+subj_country+"',' "+subj_email+"', '"+isur+"', '"+isur_cn+"', '"+isur_org+"'," +
        		" '"+isur_orgUnit+"', '"+isur_location+"', '"+isur_state+"', '"+isur_country+"', '"+isur_email+"', " +
        				"'"+public_key+"', '"+sig_alg+"', '"+signatur+"', to_date('"+valid_from+"','MM-DD-YYYY  HH24:MI:SS'), to_date('"+valid_to+"','MM-DD-YYYY  HH24:MI:SS'), NULL, NULL) ";
               
        System.out.println(" insert Script in master table== "+insert);
       return insert;
       
       
        
               
        
    }
    public ArrayList insertSqlMap(HashMap batchStmt){
        boolean ret = true;
        ArrayList faildlist=new ArrayList();
        try
        {    
          conn = dbConn.getConn(true);
          stmt = conn.createStatement();
          Set set=batchStmt.keySet();
          Iterator ir=set.iterator();
          while(ir.hasNext()){
              String file=(String)ir.next();
              try{
              stmt.execute(batchStmt.get(file).toString());
              }catch(SQLException e){
                  faildlist.add(file);
                  System.out.println(" no able to execute file = "+file);
                  e.printStackTrace();
              }
          }
        }catch (SQLException e)
        {
            e.printStackTrace();
        } finally
        {
            if (conn != null)
            {
              try
              {
                if (stmt != null)
                  stmt.close();
                conn.close();
              }
              catch (SQLException e1)
              {System.out.println("SQLException E is " +e1);
              e1.printStackTrace();
                //logger.log(LEVEL_SQL_EXC, CommonErr.formatST(MSG_SQL_EXC, e1));
              }
            }
          } 
        return faildlist;
    }
    
    public boolean insertSql(ArrayList batchStmt)
    {
     boolean ret = true;
     try
     {    
       conn = dbConn.getConn(true);
       ///conn.setAutoCommit(false);
       stmt = conn.createStatement();
       System.out.println(" batchStmt size == "+batchStmt.size());
       for(int i=0;i<batchStmt.size();i++){
           System.out.println(" adding stmet == "+batchStmt.get(i).toString());
           stmt.addBatch(batchStmt.get(i).toString());
       }
       int[] i = stmt.executeBatch();
       System.out.println(" insert crt status ==> "+i.length);
       for(int j=0;j<i.length;j++){
          // System.out.println(" in for loop "+i[j]);
            
           if(i[j]!=1)
           ret = false;
       }
       if(ret){
           System.out.println(" it is comming  fully");
           //conn.setAutoCommit(true);
       }else{
           
       }
     }
     catch (SQLException e)
     {
        ret = false;
       System.out.println("SQL E is " +e.getMessage());
     //  e.printStackTrace();
       try {
        conn.rollback();
          // logger.log(LEVEL_SQL_EXC, CommonErr.formatST(MSG_SQL_EXC, sql, e));
    } catch (SQLException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
    }
     }
     catch (Exception e)
     {
       System.out.println("SLE E is " +e);
     //  logger.log(LEVEL_SVC_LOCATOR_EXC, CommonErr.formatST(MSG_SVC_LOCATOR_EXC,ServiceLocator.DATA_SOURCE_JNDI_NAME, e));
     }
     finally
     {
       if (conn != null)
       {
         try
         {
           if (stmt != null)
             stmt.close();
           conn.close();
         }
         catch (SQLException e1)
         {System.out.println("SQLException E is " +e1);
           //logger.log(LEVEL_SQL_EXC, CommonErr.formatST(MSG_SQL_EXC, e1));
         }
       }
     }
     return ret;
   }
  
    
    public boolean checkRowAuto(String hostId, String appUser){
        boolean exist = false;
 
        appUser=appUser.toUpperCase();
        hostId=hostId.toUpperCase();
        String query="select 1 from "+CmsDbTable.CERT_AUTO_ALARM+" where APP_CUID='"+appUser+"' "+ "AND" +" HOST_ID='"+hostId+"'";
        System.out.println(" ==> \n"+query);
        try{
         conn = dbConn.getConn(true);
         stmt = conn.createStatement();         
         ResultSet rs=stmt.executeQuery(query);
         exist=rs.next();
       //  System.out.println(" the status of the given row of cer is "+exist);
         }catch (SQLException e){           
          System.out.println("SQL E is: in checkRow(): " +e);
       
        } finally
        {
            if (conn != null)
            {
              try
              {
                if (stmt != null)
                  stmt.close();
                conn.close();
              }
              catch (SQLException e1)
              {System.out.println("SQLException E is " +e1);
              e1.printStackTrace();
                //logger.log(LEVEL_SQL_EXC, CommonErr.formatST(MSG_SQL_EXC, e1));
              }
            }
          }           
      
        return exist;
    }
    
    public boolean checkRowManual(String hostId, String appUser){
        boolean exist = false;
 
        appUser=appUser.toUpperCase();
        hostId=hostId.toUpperCase();
        String query="select 1 from "+CmsDbTable.CERT_MANUAL_ALARM+" where APP_CUID='"+appUser+"' "+ "AND" +" HOST_ID='"+hostId+"'";
        System.out.println(" ==> \n"+query);
        try{
         conn = dbConn.getConn(true);
         stmt = conn.createStatement();         
         ResultSet rs=stmt.executeQuery(query);
         exist=rs.next();
       //  System.out.println(" the status of the given row of cer is "+exist);
         }catch (SQLException e){           
          System.out.println("SQL E is: in checkRow(): " +e);
       
        } finally
        {
            if (conn != null)
            {
              try
              {
                if (stmt != null)
                  stmt.close();
                conn.close();
              }
              catch (SQLException e1)
              {System.out.println("SQLException E is " +e1);
              e1.printStackTrace();
                //logger.log(LEVEL_SQL_EXC, CommonErr.formatST(MSG_SQL_EXC, e1));
              }
            }
          }           
      
        return exist;
    }
    
    public void insertAutoAlarm(ArrayList insertAlarmList)throws ParseException{
    
           System.out.println(" in dao insert alarm ");
           String insertQuery = null;
           //int inserts = 0;
           try {
        	   conn = dbConn.getConn(true);
               stmt = conn.createStatement(); 
               
             /*  for(int i=0;i<batchStmt.size();i++){
                   System.out.println(" adding stmet == "+batchStmt.get(i).toString());
                   stmt.addBatch(batchStmt.get(i).toString());
               }
               inserts = stmt.executeBatch();*/
               for (int i = 0; i < insertAlarmList.size(); i++) {
            	   insertQuery = (String) insertAlarmList.get(i); 
            	   try{
                    stmt.executeUpdate(insertQuery);
            	   }catch (SQLException e){
            	       System.out.println("SQL E is " +e.getMessage());
            	   }
               }
           } catch (SQLException e)
           {          
              System.out.println("SQL E is " +e.getMessage());            
            } catch (Exception e)
            {
              System.out.println("SLE E is " +e.getMessage());
            //  logger.log(LEVEL_SVC_LOCATOR_EXC, CommonErr.formatST(MSG_SVC_LOCATOR_EXC,ServiceLocator.DATA_SOURCE_JNDI_NAME, e));
            }
            finally
            {
              if (conn != null)
              {
                try
                {
                  if (stmt != null)
                    stmt.close();
                  conn.close();
                }
                catch (SQLException e1)
                {System.out.println("SQLException E is " +e1);
                  //logger.log(LEVEL_SQL_EXC, CommonErr.formatST(MSG_SQL_EXC, e1));
                }
              }
            }
    
    
    }

}
