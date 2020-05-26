package com.qwest.cms.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.sql.CallableStatement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

import org.apache.log4j.Logger;
import org.apache.struts.action.ActionErrors;
import com.qwest.cms.BO.CMSBO;
import com.qwest.cms.actionForm.CMSFunctionForm;
import com.qwest.cms.exception.CMSBaseException;
import com.qwest.cms.utils.CmsDbTable;
import com.qwest.cms.utils.ParseX509Certificate;
import com.qwest.cms.dbconnection.DBConnection;
//import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;
/**
* @author amanila
*
*
*/

public class GenericDAO {
	DBConnection dbConn = DBConnection.getInstance();
	//DateFormatter df =new DateFormatter();
	ActionErrors errors = new ActionErrors();
	//Logger logger=Logger.getLogger(PAFAction.class);
	Logger logger=Logger.getLogger(GenericDAO.class);	
	ResultSet result = null;
	Connection conn = null;
	Statement stmt = null;	 	  
	 
	public ArrayList getCertDetails( String serialNo ) throws Exception,	SQLException 
	{
		 ArrayList cert_details = new ArrayList();
		 try
		   {
			String selCertDetQuery = "SELECT * FROM "+CmsDbTable.TBL_CMS_CERT_DETAILS+" where SERIALNO='"+serialNo+"'";
		    conn = dbConn.getConn(true);
		    stmt = conn.createStatement();
			System.out.println("Select "+CmsDbTable.TBL_CMS_CERT_DETAILS+" query...."+selCertDetQuery);
			logger.debug("Get Certificate Details query...."+selCertDetQuery);
			
		    result = stmt.executeQuery(selCertDetQuery);
		    
		    while (result.next())
			     {	
		    		 String[] certDetails = new String[29];	
		    		 
		    		 certDetails[0] = result.getString("RAW_CERTIFICATE");
		    		 certDetails[1] = result.getString("SERIALNO");
		    		 certDetails[2] = result.getString("CERT_QWNER");
		    		 certDetails[3] = result.getString("COMPANY_NAME");
		    		 certDetails[4] = result.getString("STATUS");
		    		 certDetails[5] = result.getString("CERT_VERS");
		    		 certDetails[6] = result.getString("SUBJECT");
		    		 certDetails[7] = result.getString("SUBJECT_CN");
		    		 certDetails[8] = result.getString("SUBJECT_O");
		    		 certDetails[9] = result.getString("SUBJECT_OU");
		    		 certDetails[10] = result.getString("SUBJECT_L");
		    		 certDetails[11] = result.getString("SUBJECT_S");
		    		 certDetails[12] = result.getString("SUBJECT_C");
		    		 certDetails[13] = result.getString("SUBJECT_E");
		    		 certDetails[14] = result.getString("ISSUER");
		    		 certDetails[15] = result.getString("ISSUER_CN");
		    		 certDetails[16] = result.getString("ISSUER_O");
		    		 certDetails[17] = result.getString("ISSUER_OU");
		    		 certDetails[18] = result.getString("ISSUER_L");
		    		 certDetails[19] = result.getString("ISSUER_S");
		    		 certDetails[20] = result.getString("ISSUER_C");
		    		 certDetails[21] = result.getString("ISSUER_E");
		    		 certDetails[22] = result.getString("PUBLIC_KEY");
		    		 certDetails[23] = result.getString("SIGNATURE_ALGO");
		    		 certDetails[24] = result.getString("SIGNATURE");
		    		 certDetails[25] = result.getString("FROM_DT");
		    		 certDetails[26] = result.getString("EXPIRY_DT");
		    		 certDetails[27] = result.getString("CREATE_DT");
		    		 certDetails[28] = result.getString("MOD_DT");

		    		 cert_details.add(certDetails);		    		 
		     	 }

		   }catch (SQLException e) {
				logger.error(e);  
		    	System.out.println(e);
		    	throw  new CMSBaseException(e,"error.db.exception");
			} catch (Exception e) {
				logger.error(e);   
				System.out.println(e);
		    	throw  new CMSBaseException(e,"error.exception");
			}finally {
				if (result != null)
					result.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			}
		return cert_details;		
	}
	
	public ArrayList reminder_app(String reminderQuery) throws  CMSBaseException,
	SQLException {

		ArrayList resList = new ArrayList();
		try {
			conn = dbConn.getConn(true);
			stmt = conn.createStatement();

			result = stmt.executeQuery(reminderQuery);
			logger.info("Get Reminder Query  ....."+reminderQuery);
			while (result.next()) {
				
				String[] data = new String[8];

				data[0] = result.getString(1);
       	 			data[1] = result.getString(2);
				data[2] = result.getString(3);
       	 			data[3] = result.getString(4);
			 	data[4] = result.getString(5);
			 	data[5] = result.getString(6);
				data[6] = result.getString(7);
				//data[7] = result.getString(8);

				for(int j=0; j < data.length; j++)
				{
					System.out.println(data[j]);
					System.out.println("===========================");
				}			 	
				resList.add(data);
			}

		} catch (SQLException e) {
			logger.error(e);      
	    	throw  new CMSBaseException(e,"error.db.exception");
		} catch (Exception e) {
			logger.error(e);      
	    	throw  new CMSBaseException(e,".exception");
		}finally {
			if (result != null)
				result.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
		return resList;
	}
	
	public ArrayList allCertsReminder(String allCertsExpQuery) throws  CMSBaseException,
	SQLException {

		ArrayList resList = new ArrayList();
		try {
			conn = dbConn.getConn(true);
			stmt = conn.createStatement();

			result = stmt.executeQuery(allCertsExpQuery);
			logger.info("Get allCertsExpQuery  ....."+allCertsExpQuery);
			while (result.next()) {
				
				String[] data = new String[13];

				data[0] = result.getString(1);
       	 			data[1] = result.getString(2);
				data[2] = result.getString(3);
       	 			data[3] = result.getString(4);
			 	data[4] = result.getString(5);
			 	data[5] = result.getString(6);
				data[6] = result.getString(7);
				data[7] = result.getString(8);
				data[8] = result.getString(9);
				data[9] = result.getString(10);
				data[10] = result.getString(11);
				data[11] = result.getString(12);
				data[12] = result.getString(13);

				/*for(int j=0; j < data.length; j++)
				{
					System.out.println(data[j]);
					System.out.println("===========================");
				}*/			 	
				resList.add(data);
			}

		} catch (SQLException e) {
			logger.error(e);      
	    	throw  new CMSBaseException(e,"error.db.exception");
		} catch (Exception e) {
			logger.error(e);      
	    	throw  new CMSBaseException(e,".exception");
		}finally {
			if (result != null)
				result.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
		return resList;
	}
	
	public  ArrayList memList(String resQuery) throws  CMSBaseException,
	SQLException {

		ArrayList memList = new ArrayList();
		try {

			conn = dbConn.getConn(true);
			stmt = conn.createStatement();
			logger.debug("Get Member List Query .... "+resQuery);
			result = stmt.executeQuery(resQuery);
			//int row =result.getRow();
			while (result.next()) {				
				
				memList.add(result.getString(1));
			}

		} catch (SQLException e) {
			logger.error(e);
			e.printStackTrace();
	    	throw  new CMSBaseException(e,"error.db.exception");
		} catch (Exception e) {
			logger.error(e);      
	    	throw  new CMSBaseException(e,"error.db.exception");
		}finally {
			if (result != null)
				result.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
	  return memList;
	}
	
	public boolean insertData(String insertQuery) throws CMSBaseException,
	SQLException {

        boolean results = false;
        System.out.println("Insert Query *********"+insertQuery);
        logger.debug("Insert Query .... "+insertQuery);
        try {

                    conn = dbConn.getConn(true);
                    stmt = conn.createStatement();					
                    int inserts = stmt.executeUpdate(insertQuery);
					System.out.println("inserts "+inserts);					
                    if (inserts > 0)
                        results = true;

        } catch (SQLException e) {
    		logger.error(e);      
        	throw  new CMSBaseException(e,"error.db.exception");
    	} catch (Exception e) {
    		logger.error(e);      
        	throw  new CMSBaseException(e,"error.db.exception");
    	}finally {   
    		if (result != null)
				result.close();
    		if (stmt != null)
    			stmt.close();
    		if (conn != null)
    			conn.close();
    	}
    	System.out.println("return result---->" + result);
    	logger.debug("Status of Inserts is .... "+result);
        return results;
      
	}
	
	public boolean insertSql(ArrayList batchStmt) throws CMSBaseException,
	SQLException {

        boolean result = false;
        logger.debug("Insert Query for BatchStmt .... "+batchStmt);
        for(int i=0;i<batchStmt.size();i++){
            result= insertData(batchStmt.get(i).toString());
        }       
        logger.debug("Status of Batch insert Query is .... "+result);
        return result;
	}	
	
	public ArrayList getAppAuth(String cuid) throws CMSBaseException, SQLException{

		try {
		    ArrayList list=new ArrayList();
		    conn = dbConn.getConn(true);
		    stmt = conn.createStatement();
		    String authType="";
		    cuid=cuid.toUpperCase();
		    String query="SELECT m.APPLICATION_NAME,m.ACRONYM,m.auth_type from "+CmsDbTable.TBL_CMS_APP_MEMBER+" m where m.MEMBER_CUID='"+cuid+"'";
		    result = stmt.executeQuery(query);
		    System.out.println(" member auth query ==> "+query);
		    logger.debug("Get Application Authority Query .... "+query);
		    while(result.next()){
		    	CMSBO bo=new CMSBO();
		    	bo.setAppName(result.getString(1));
		    	bo.setAcronym(result.getString(2));
		    	bo.setAuthType(result.getString(3));
		    	list.add(bo);
		    }
		    return list;
		} catch (SQLException e) {
			logger.error(e);      
	    	throw  new CMSBaseException(e,"error.db.exception");
		} catch (Exception e) {
			logger.error(e);      
	    	throw  new CMSBaseException(e,"error.db.exception");
		}finally {
			if (result != null)
				result.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}

	}
	
	public  String[] getAllDetails(String resQuery) throws  CMSBaseException,
	SQLException {

		ArrayList resList = new ArrayList();
		String[] data = new String[16];
		try {

			conn = dbConn.getConn(true);
			stmt = conn.createStatement();
			logger.debug("Get All Certificate Details Query .... "+resQuery);
			result = stmt.executeQuery(resQuery);			
			
			while (result.next()) {			

       	 			data[0] = result.getString(1);
       	 			data[1] = result.getString(2);
       	 			data[2] = result.getString(3);
       	 			data[3] = result.getString(4);
			 	data[4] = result.getString(5);
			 	data[5] = result.getString(6);
				data[6] = result.getString(7);
				data[7] = result.getString(8);
				data[8] = result.getString(9);
				data[9] = result.getString(10);
				data[10] = result.getString(11);
				data[11] = result.getString(12);
				data[12] = result.getString(13);
				data[13] = result.getString(14);
//				data[14] = result.getString(15);
//				data[15] = result.getString(16);
			}

		} catch (SQLException e) {
			logger.error(e);      
	    	throw  new CMSBaseException(e,"error.db.exception");
		} catch (Exception e) {
			logger.error(e);      
	    	throw  new CMSBaseException(e,"error.db.exception");
		}finally {
			if (result != null)
				result.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
	  return data;
	}
	
	

	public  ArrayList getCertSeqNoData(String resQuery) throws  CMSBaseException,
	SQLException {

		ArrayList resList = new ArrayList();
		String[] data = new String[16];
		try {

			conn = dbConn.getConn(true);
			stmt = conn.createStatement();
			logger.debug("Get All Certificate Details Query .... "+resQuery);
			result = stmt.executeQuery(resQuery);			
			
			while (result.next()) {			

       	 			data[0] = result.getString(1);
       	 			data[1] = result.getString(2);
       	 			data[2] = result.getString(3);
       	 			data[3] = result.getString(4);
			 	data[4] = result.getString(5);
			 	data[5] = result.getString(6);
				data[6] = result.getString(7);
				data[7] = result.getString(8);
				data[8] = result.getString(9);
				data[9] = result.getString(10);
				data[10] = result.getString(11);
				data[11] = result.getString(12);
				data[12] = result.getString(13);
				data[13] = result.getString(14);
				data[14] = result.getString(15);
				data[15] = result.getString(16);
				resList.add(data);
			}

		} catch (SQLException e) {
			logger.error(e);      
	    	throw  new CMSBaseException(e,"error.db.exception");
		} catch (Exception e) {
			logger.error(e);      
	    	throw  new CMSBaseException(e,"error.db.exception");
		}finally {
			if (result != null)
				result.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
	  return resList;
	}
	
	
	
	
	public ArrayList getAppNameSerialNo(String certSeqNo) throws SQLException, CMSBaseException {
		
		String selectQuery = "SELECT APPLICATION_NAME, SERIAL_NO from "+CmsDbTable.TBL_CMS_CERTIFICATES+" where CERT_SEQ_NU="+certSeqNo;
		ArrayList certData = new ArrayList();
		
		System.out.println("Select app name and serial no query...."+selectQuery);
		logger.info("Select app name and serial no Query...."+selectQuery);
		
		try {

			conn = dbConn.getConn(true);
			stmt = conn.createStatement();
			result = stmt.executeQuery(selectQuery);			
			
			while (result.next())
		     {	
	    		 String[] data = new String[2];	             
	       	 	 data[0] = result.getString("APPLICATION_NAME");
	       	 	 data[1] = result.getString("SERIAL_NO");
				 certData.add(data);
		     }
		} catch (SQLException e) {
			logger.error(e);
	    	throw  new CMSBaseException(e,"error.db.exception");
	    	
		} catch (Exception e) {
			logger.error(e);      
	    	throw  new CMSBaseException(e,"error.db.exception");

		}finally {
			if (result != null)
				result.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
		return  certData;
	}
	
	public String getExpDate(String expQuery) throws SQLException, CMSBaseException {
		
		String expDate=null;
		
		System.out.println("Select ExpDate from Certificate Table...."+expQuery);
		logger.info("Select ExpDate from Certificate Table...."+expQuery);
		
		try {

			conn = dbConn.getConn(true);
			stmt = conn.createStatement();
			result = stmt.executeQuery(expQuery);			
			while (result.next()){	
	    		 expDate = result.getString("EXPIRE_ON");	       	 	
		     }
			
		} catch (SQLException e) {
			logger.error(e);
	    	throw  new CMSBaseException(e,"error.db.exception");
	    	
		} catch (Exception e) {
			logger.error(e);      
	    	throw  new CMSBaseException(e,"error.db.exception");

		}finally {
			if (result != null)
				result.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
		return  expDate;
	}
	
	
	public ArrayList getHistList(String selectQuery) throws SQLException, CMSBaseException  {

		ArrayList historyList = new ArrayList();
		try {

			conn = dbConn.getConn(true);
			stmt = conn.createStatement();
			result = stmt.executeQuery(selectQuery);
			logger.debug("Get History List Query .... "+selectQuery);
			while (result.next()) {
				
				String[] histData = new String[3];

				histData[0] = result.getString(1);
				histData[1] = result.getString(2);
				histData[2] = result.getString(3);
								
				historyList.add(histData);
			}

		} catch (SQLException e) {
			logger.error(e);
	    	throw  new CMSBaseException(e,"error.db.exception");
	    	
		} catch (Exception e) {
			logger.error(e);      
	    	throw  new CMSBaseException(e,"error.db.exception");
	    	
		}finally {
			if (result != null)
				result.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
		return historyList;
	}
	
	public ArrayList getDisntColumn(String selectQuery) throws  CMSBaseException,
	SQLException {

		ArrayList resList = new ArrayList();

		try {

			conn = dbConn.getConn(true);
			stmt = conn.createStatement();
			logger.debug("Get Disctinct Column Query .... "+selectQuery);
			result = stmt.executeQuery(selectQuery);

			while (result.next()) {
				
				String[] data = new String[3];
				System.out.println(result.getString(1)+ "----" +result.getString(2));
				//data[0]=result.getString(1);
				/*if(data[0]=="")
				{
					System.out.println("returns space");
				}
				if(data[0]== null)
				{
					System.out.println("returns null");
				}*/
				
       	 		data[0] = result.getString(1);
       	 		data[1] = result.getString(2);
       	 		//data[2] = result.getString(3);
				
       	 		/*data[1] = result.getString(2);
				data[2] = result.getString(3);
       	 		data[3] = result.getString(4);
			 	data[4] = result.getString(5);
			 	data[5] = result.getString(6);
				data[6] = result.getString(7);*/
				//System.out.println("inside Generic DAO-- Distinct application name"+ data[0]);

			/*	for(int j=0; j < data.length; j++)
				{
					System.out.println(data[j]);
					System.out.println("===========================");
				} */
				resList.add(data);

			}

		} catch (SQLException e) {
			logger.error(e);      
	    	throw  new CMSBaseException(e,"error.db.exception");
		} catch (Exception e) {
			logger.error(e);      
	    	throw  new CMSBaseException(e,"error.db.exception");
		}finally {
			if (result != null)
				result.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
		return resList;
	}
	
	public String getCertNickName(String certStatus, String appName) throws  CMSBaseException,
	SQLException {

		String nickName = null;
		String getNickNameQuery = "SELECT CERT_NICKNAME from "+CmsDbTable.TBL_CMS_CERTIFICATES+" where ( " +
		"CERT_SEQ_NU='"+certStatus+"' AND " +
		"APPLICATION_NAME='"+appName+"' )";
		
		System.out.println("Get NickName Query ------>"+getNickNameQuery);
		logger.debug("Get Certificate Nickname Query .... "+getNickNameQuery);
		try {
			
			conn = dbConn.getConn(true);
			stmt = conn.createStatement();
			result = stmt.executeQuery(getNickNameQuery);
			result.next();
			if(result.getString(1) !=null ){
				nickName = result.getString(1);
			}
			else{
				nickName = "error";
				//error = "RCBS Manager not found for the Application "+appName;				
			}
				
		} catch (SQLException e) {
			logger.error(e);
	    	throw  new CMSBaseException(e,"error.db.exception");
	    	
		} catch (Exception e) {
			logger.error(e);      
	    	throw  new CMSBaseException(e,"error.db.exception");

		}finally {
			if (result != null)
				result.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
		return  nickName;
	}	
	
	public ArrayList getanotherList(String selectQuery) throws  CMSBaseException,
	SQLException {
	    ArrayList resList = new ArrayList();
	    try {
	    conn = dbConn.getConn(true);
		stmt = conn.createStatement();
		System.out.println(" query is "+selectQuery);
		result = stmt.executeQuery(selectQuery);
		
		while (result.next()) {
		    CMSBO bo=new CMSBO();
		    bo.setAppName(result.getString("APPLICATION_NAME"));
		    bo.setExpireOn(result.getString("EXPIRE_ON")); 
		    bo.setSerialNo(result.getString("SERIAL_NO"));
		    bo.setHostId(result.getString("HOST_ID"));
		    bo.setIssuer(result.getString("ISSUER"));
		    
		    resList.add(bo);
		}
	    return resList;
	    } catch (SQLException e) {
			logger.error(e);      
	    	throw  new CMSBaseException(e,"error.db.exception");
		} catch (Exception e) {
			logger.error(e);      
	    	throw  new CMSBaseException(e,"error.db.exception");
		}finally {
			if (result != null)
				result.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
	}
	public ArrayList getMgrList(String selectQuery) throws  CMSBaseException,
	SQLException {
	    ArrayList resList = new ArrayList();
	    try {
		conn = dbConn.getConn(true);
		stmt = conn.createStatement();
		result = stmt.executeQuery(selectQuery);
		System.out.println(" query is "+selectQuery);
		/*while (result.next()) {
		String[] strArr=new String[7];
		
		strArr[0] = result.getString("APPLICATION_NAME");
		strArr[1] = result.getString("STATUS");
		strArr[2] = result.getString("EXPIRE_ON");
		strArr[3] = result.getString("HOST_ID");
		strArr[4] = result.getString("MANAGER_CUID");
		strArr[5] = result.getString("RAW_CERTIFICATE");
		
		resList.add(strArr);
		CRT_NAME
		}*/
		try {
		    while (result.next()) {
		        CMSBO bo=new CMSBO();
		        bo.setAppName(result.getString("APPLICATION_NAME"));
		        bo.setCert_status(result.getString("STATUS"));
		        bo.setExpDate(result.getString("EXPIRE_ON"));
		        bo.setHostId(result.getString("HOST_ID"));
		        bo.setCreatorCuid(result.getString("MANAGER_CUID"));
		        if ( result.getString("RAW_CERTIFICATE").indexOf('/') != -1)
				bo.setCertNickname(result.getString("RAW_CERTIFICATE").substring(result.getString("RAW_CERTIFICATE").lastIndexOf('/')+1,result.getString("RAW_CERTIFICATE").length()).toUpperCase());
			if ( result.getString("RAW_CERTIFICATE").indexOf('\\') != -1)
				bo.setCertNickname(result.getString("RAW_CERTIFICATE").substring(result.getString("RAW_CERTIFICATE").lastIndexOf('\\')+1,result.getString("RAW_CERTIFICATE").length()).toUpperCase());
		      //  bo.setCertNickname(result.getString("RAW_CERTIFICATE"));
		        resList.add(bo);
		    }
		    System.out.println("inside Generic DAO--  "+ resList.size() );
		} catch (RuntimeException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
		
		
		System.out.println("inside Generic DAO--  "+ resList.size() );
		return resList;
	    } catch (SQLException e) {
			logger.error(e);      
	    	throw  new CMSBaseException(e,"error.db.exception");
		} catch (Exception e) {
			logger.error(e);      
	    	throw  new CMSBaseException(e,"error.db.exception");
		}finally {
			if (result != null)
				result.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
	}
	
	
	public ArrayList getCertList(String selectQuery) throws  CMSBaseException,
	SQLException {

		ArrayList resList = new ArrayList();

		try {

			conn = dbConn.getConn(true);
			stmt = conn.createStatement();
			logger.info("Get Certificate list query ..... "+selectQuery);
			result = stmt.executeQuery(selectQuery);

			while (result.next()) {
				
				String[] data = new String[8];

       	 		data[0] = result.getString(1);
       	 		data[1] = result.getString(2);
				data[2] = result.getString(3);
       	 		data[3] = result.getString(4);
			 	data[4] = result.getString(5);
			 	data[5] = result.getString(6);
				data[6] = result.getString(7);
				data[7] = result.getString(8);
				//System.out.println("inside Generic DAO-- value of SERIAL_NO "+ data[0]);

			/*	for(int j=0; j < data.length; j++)
				{
					System.out.println(data[j]);
					System.out.println("===========================");
				} */			 	
				resList.add(data);
			}

		} catch (SQLException e) {
			logger.error(e);      
	    	throw  new CMSBaseException(e,"error.db.exception");
		} catch (Exception e) {
			logger.error(e);      
	    	throw  new CMSBaseException(e,"error.db.exception");
		}finally {
			if (result != null)
				result.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
		return resList;
	}
	
	public ArrayList getCertData(String selectQuery) throws  CMSBaseException,
	SQLException {

		ArrayList resList = new ArrayList();

		try {

			conn = dbConn.getConn(true);
			stmt = conn.createStatement();
			logger.info("Get Certificate list query ..... "+selectQuery);
			result = stmt.executeQuery(selectQuery);

			while (result.next()) {
				
				String[] data = new String[2];

       	 			data[0] = result.getString(1);
				resList.add(data);
			}

		} catch (SQLException e) {
			logger.error(e);      
	    	throw  new CMSBaseException(e,"error.db.exception");
		} catch (Exception e) {
			logger.error(e);      
	    	throw  new CMSBaseException(e,"error.db.exception");
		}finally {
			if (result != null)
				result.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
		return resList;
	}
	
	public ArrayList getCertificateData(String selectQuery) throws  CMSBaseException,
	SQLException {

		ArrayList certDataList = new ArrayList();

		try {

			conn = dbConn.getConn(true);
			stmt = conn.createStatement();
			System.out.println("Get Certificate Data query for updation ....... "+selectQuery);
		 	logger.info("Get Certificate Data query ....."+selectQuery);

			result = stmt.executeQuery(selectQuery);

			while (result.next()) {
				
				String[] data = new String[15];

       	 		data[0] = result.getString(1);
       	 		data[1] = result.getString(2);
				data[2] = result.getString(3);
       	 		data[3] = result.getString(4);
			 	data[4] = result.getString(5);
			 	data[5] = result.getString(6);
				data[6] = result.getString(7);
				data[7] = result.getString(8);
				data[8] = result.getString(9);
				data[9] = result.getString(10);
				data[10] = result.getString(11);
				data[11] = result.getString(12);
				data[12] = result.getString(13);
				data[13] = result.getString(14);
				data[14] = result.getString(15);

			/*	for(int j=0; j < data.length; j++)
				{
					System.out.println(data[j]);
					System.out.println("===========================");
				} */

			 	certDataList.add(data);

			}

		} catch (SQLException e) {
			logger.error(e);      
	    	throw  new CMSBaseException(e,"error.db.exception");
		} catch (Exception e) {
			logger.error(e);      
	    	throw  new CMSBaseException(e,"error.db.exception");
		}finally {
			if (result != null)
				result.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
		return certDataList;
	}
	
	///////////// New
	
	public ArrayList getCertDetailsData(String selectQuery) throws  CMSBaseException,
	SQLException {

		ArrayList certDataList = new ArrayList();

		try {

			conn = dbConn.getConn(true);
			stmt = conn.createStatement();
		 	logger.info("Get Certificate Data from TBL_CMS_CERT_DETAILS ....."+selectQuery);

			result = stmt.executeQuery(selectQuery);

			while (result.next()) {
				
				String[] data = new String[15];

       	 			data[0] = result.getString(1);
       	 			data[1] = result.getString(2);
				data[2] = result.getString(3);
       	 			
			/*	for(int j=0; j < data.length; j++)
				{
					System.out.println(data[j]);
					System.out.println("===========================");
				} */

			 	certDataList.add(data);

			}

		} catch (SQLException e) {
			logger.error(e);      
	    	throw  new CMSBaseException(e,"error.db.exception");
		} catch (Exception e) {
			logger.error(e);      
	    	throw  new CMSBaseException(e,"error.db.exception");
		}finally {
			if (result != null)
				result.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
		return certDataList;
	}
	
	///////// end
	
	public boolean insertCertDet(String insertCertQuery) throws SQLException, CMSBaseException {

        boolean results = false;
        try {
        			String insertQuery = null;
                    conn = dbConn.getConn(true);
                    stmt = conn.createStatement();
                    insertQuery = insertCertQuery;
					System.out.println("InsertCertDet query ......"+insertQuery);
					logger.info("Insert Certificate Details Query .... "+insertQuery);
                    int inserts = stmt.executeUpdate(insertQuery);
                    if (inserts > 0)
                                results = true;
                    logger.debug("Status of Insert Cert Det is  .... "+results);
        } catch (SQLException e) {
    		logger.error(e);     
	    	throw  new CMSBaseException(e,"error.db.exception");

    	} catch (Exception e) {
    		logger.error(e);     
	    	throw  new CMSBaseException(e,"error.db.exception");

    	}finally {
    		if (result != null)
				result.close();
    		if (stmt != null)
    			stmt.close();
    		if (conn != null)
    			conn.close();
    	}

        return results;

	}
	
	public String getRcbsManager( String appName, String acronym ) throws SQLException, CMSBaseException {
		
//		String selectquery = "select RCBS_MGR_CUID from D_TBL_CMS_APP_OWNER where ( APPLICATION_NAME='"+appName+"' AND ACRONYM='"+acronym+"')";
	    	String selectquery = "SELECT MANAGER_CUID FROM "+CmsDbTable.CERT_AUTO_ALARM+" WHERE APP_CUID = '"+appName+"'";
		String rcbsManager = null;
		String error = null;
		
		System.out.println("Get Rcbs Manager query...."+selectquery);
		logger.info("Get RCBS Manager query ......"+selectquery);
		try {

			conn = dbConn.getConn(true);
			stmt = conn.createStatement();
			result = stmt.executeQuery(selectquery);
			result.next();
			if(result.getString(1) !=null ){
            rcbsManager = result.getString(1);
			}
			else{
				rcbsManager = "error";
				//error = "RCBS Manager not found for the Application "+appName;				
			}
				
		} catch (SQLException e) {
			logger.error(e);
	    	throw  new CMSBaseException(e,"error.db.exception");
	    	
		} catch (Exception e) {
			logger.error(e);      
	    	throw  new CMSBaseException(e,"error.db.exception");

		}finally {
			if (result != null)
				result.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
		return  rcbsManager;
	}
	
	public String getRawCert( String serialNo ) throws SQLException, CMSBaseException {
		
		String selectQuery = "select RAW_CERTIFICATE from "+CmsDbTable.TBL_CMS_CERT_DETAILS+" where " +
				"SERIALNO='"+serialNo+"'";
		String rawCert = null;
		
		System.out.println("Get Raw Cert  query ......"+selectQuery);
		logger.info("Get Raw Cert  Query ..... "+selectQuery);
		try {

			conn = dbConn.getConn(true);
			stmt = conn.createStatement();
			result = stmt.executeQuery(selectQuery);
			result.next();
			rawCert = result.getString(1);
		} catch (SQLException e) {
			logger.error(e);
	    	throw  new CMSBaseException(e,"error.db.exception");
	    	
		} catch (Exception e) {
			logger.error(e);      
	    	throw  new CMSBaseException(e,"error.db.exception");

		}finally {
			if (result != null)
				result.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
		return  rawCert;
	}
	
public String getCertStatus( String certSeqNo ) throws SQLException, CMSBaseException {
		
		String selectQuery = "select STATUS from "+CmsDbTable.TBL_CMS_CERTIFICATES+" where " +
				"CERT_SEQ_NU='"+certSeqNo+"'";
		String certStatus = null;
		
		System.out.println("Get Cert Status query ......"+selectQuery);
		logger.info("Get Certificate Status query ......"+selectQuery);
		try {

			conn = dbConn.getConn(true);
			stmt = conn.createStatement();
			result = stmt.executeQuery(selectQuery);
			result.next();
			certStatus = result.getString(1);
		} catch (SQLException e) {
			logger.error(e);
	    	throw  new CMSBaseException(e,"error.db.exception");
	    	
		} catch (Exception e) {
			logger.error(e);      
	    	throw  new CMSBaseException(e,"error.db.exception");

		}finally {
			if (result != null)
				result.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
		return  certStatus;
	}

	public String getAcronym( String selQuery ) throws SQLException, CMSBaseException {
	
		String acronym = null;
	
		System.out.println("Get Cert Status query ......"+selQuery);
		logger.info("Get Acronym  Query ..... "+selQuery);
		try {
			conn = dbConn.getConn(true);
			stmt = conn.createStatement();
			result = stmt.executeQuery(selQuery);
			result.next();
			acronym = result.getString(1);
		} catch (SQLException e) {
			logger.error(e);
			throw  new CMSBaseException(e,"error.db.exception");
    	
		} catch (Exception e) {
			logger.error(e);      
			throw  new CMSBaseException(e,"error.db.exception");

		}finally {
			if (result != null)
				result.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
		return  acronym;
	}
	
	public boolean updateCertificate(String changeCertStatus, String certSeqNo ) throws SQLException, CMSBaseException {

		boolean results = false;
		try {
                conn = dbConn.getConn(true);
                stmt = conn.createStatement();
				String updateQuery = "update "+CmsDbTable.TBL_CMS_CERTIFICATES+" set " +
						"STATUS='" +
						changeCertStatus+"'"+
						"where "+
						"CERT_SEQ_NU='"+certSeqNo +"'";
				System.out.println(updateQuery);
                int inserts = stmt.executeUpdate(updateQuery);
				System.out.println("inserts "+inserts);
				logger.info("Inserting renewal data for Certificate ......Update query ....."+updateQuery);

                if (inserts > 0)
                   results = true;
                logger.debug("Status of updates for Certificate .... "+results);
		} catch (SQLException e) {
			logger.error(e);   
			throw  new CMSBaseException(e,"error.db.exception");
		} catch (Exception e) {
			logger.error(e);  
			throw  new CMSBaseException(e,"error.db.exception");

		}finally {
			if (result != null)
				result.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}

    return results;

	}
/*
	public boolean deleteCertData(String deleteQuery) throws SQLException, CMSBaseException {

    boolean result = false;
    try {
    			String deleteCertQuery = null;
                conn = dbConn.getConn(true);
                stmt = conn.createStatement();
                deleteCertQuery = deleteQuery;
				System.out.println("InsertCertDet query ......"+deleteCertQuery);
				logger.info("InsertCertDet query ......"+deleteCertQuery);
                int deletes = stmt.executeUpdate(deleteCertQuery);
                System.out.println("After deleting cert data ......"+deletes);
                if (deletes > 0)

                            result = true;

    } catch (SQLException e) {
		logger.error(e);     
    	throw  new CMSBaseException(e,"error.db.exception");

	} catch (Exception e) {
		logger.error(e);     
    	throw  new CMSBaseException(e,"error.db.exception");

	}finally {
				if (result != null)
				result.close();
		if (stmt != null)
			stmt.close();
		if (conn != null)
			conn.close();
	}

    return result;

}
	*/
	public boolean updateRenewCertDet(String updateQuery) throws SQLException, CMSBaseException {

        boolean results = false;
        try {
                    conn = dbConn.getConn(true);
                    stmt = conn.createStatement();
					String updateCertDetQuery = updateQuery;
                    System.out.println("Update Renew cert data query  ......"+updateCertDetQuery);
					logger.info("Updating renewal data for Certificate ......Update query ....."+updateCertDetQuery);
                    int updates = stmt.executeUpdate(updateCertDetQuery);
					System.out.println("updates "+updates);

                    if (updates > 0)
                       results = true;
                    logger.debug("Status of updates for Cert Details .... "+results);
                    
        } catch (SQLException e) {
    		logger.error(e);   
	    	throw  new CMSBaseException(e,"error.db.exception");
    	} catch (Exception e) {
    		logger.error(e);  
	    	throw  new CMSBaseException(e,"error.db.exception");

    	}finally {    		
    		if (result != null)
				result.close();
    		if (stmt != null)
    			stmt.close();
    		if (conn != null)
    			conn.close();
    	}

        return results;

	}
	
	public ArrayList getAppOwnerDetail(String selectQuery) throws  SQLException, CMSBaseException {

		ArrayList appOwnerDetList = new ArrayList();
		System.out.println("Get App Owner Detail Query  -----"+selectQuery);
        logger.debug("Get App Owner Detail Query  .... "+selectQuery);

		try {

			conn = dbConn.getConn(true);
			stmt = conn.createStatement();
			result = stmt.executeQuery(selectQuery);

			while (result.next()) {
				
				String[] appOwnerData = new String[7];

				appOwnerData[0] = result.getString(1);
				appOwnerData[1] = result.getString(2);
				appOwnerData[2] = result.getString(3);
				appOwnerData[3] = result.getString(4);
				appOwnerData[4] = result.getString(5);
				appOwnerData[5] = result.getString(7);
				
				appOwnerDetList.add(appOwnerData);
			}

		} catch (SQLException e) {
			logger.error(e);      
	    	throw  new CMSBaseException(e,"error.db.exception");

		} catch (Exception e) {
			logger.error(e);      
	    	throw  new CMSBaseException(e,"error.db.exception");

		}finally {
			if (result != null)
				result.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
		return appOwnerDetList;
	}
	
	public ArrayList getAppMemberDetail(String selectQuery) throws  SQLException, CMSBaseException {

		ArrayList appMemberDetList = new ArrayList();
		try {
			conn = dbConn.getConn(true);
			stmt = conn.createStatement();
			logger.debug("Get App Member Detail Query  .... "+selectQuery);
			
			result = stmt.executeQuery(selectQuery);

			while (result.next()) {
				
				String[] appMemberData = new String[4];

				appMemberData[0] = result.getString(1);
				appMemberData[1] = result.getString(2);
				appMemberData[2] = result.getString(3);
				appMemberData[3] = result.getString(4);
				
				appMemberDetList.add(appMemberData);
			}

		} catch (SQLException e) {
			logger.error(e);      
	    	throw  new CMSBaseException(e,"error.db.exception");

		} catch (Exception e) {
			logger.error(e);      
	    	throw  new CMSBaseException(e,"error.db.exception");

		}finally {
			if (result != null)
				result.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
		return appMemberDetList;
	}
	
	public boolean deleteAppMember(String deleteQuery ) throws SQLException, CMSBaseException {

	    boolean results = false;
	    try {
	                conn = dbConn.getConn(true);
	                stmt = conn.createStatement();
					String delMemQuery = deleteQuery;
					System.out.println(delMemQuery);
	                int deletes = stmt.executeUpdate(delMemQuery);
					System.out.println("inserts "+deletes);
					logger.info("Deleting App Mem from CMS APP MEMBER ......Update query ....."+deleteQuery);

	                if (deletes > 0)
	                   results = true;
	                logger.debug("Status of App Mem Delete is .... "+results);
	    } catch (SQLException e) {
			logger.error(e);   
	    	throw  new CMSBaseException(e,"error.db.exception");
		} catch (Exception e) {
			logger.error(e);  
	    	throw  new CMSBaseException(e,"error.db.exception");

		}finally {			
			if (result != null)
				result.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}

	    return results;

	}
	
	public boolean updateGroup(String updateQuery ) throws SQLException, CMSBaseException {

	    boolean results = false;
	    try {
	                conn = dbConn.getConn(true);
	                stmt = conn.createStatement();					
					System.out.println(updateQuery);
	                int deletes = stmt.executeUpdate(updateQuery);
					System.out.println("inserts "+deletes);
					logger.info("Update Group query ....."+updateQuery);

	                if (deletes > 0)
	                   results = true;
	                logger.debug("Status of Update Group is .... "+results);
	    } catch (SQLException e) {
			logger.error(e);   
	    	throw  new CMSBaseException(e,"error.db.exception");
		} catch (Exception e) {
			logger.error(e);  
	    	throw  new CMSBaseException(e,"error.db.exception");

		}finally {	
			if (result != null)
				result.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}

	    return results;

	}	

	
	public String getCertAlarmDetail(String appName, String acronym) throws  SQLException, CMSBaseException {

		String selectCertAlarm = "SELECT ALARM_FREQ from "+CmsDbTable.TBL_CMS_CERT_ALARM+" where (" +
				" APPLICATION_NAME='"+appName+"' AND "+
				" ACRONYM='"+acronym+"')";
		String alarmFreq = null;

		System.out.println("Get Cert Alarm query ......"+selectCertAlarm);
		logger.info("Get Cert Alarm Query ......"+selectCertAlarm);
		try {

			conn = dbConn.getConn(true);
			stmt = conn.createStatement();
			result = stmt.executeQuery(selectCertAlarm);
			result.next();
			alarmFreq = result.getString(1);
		} catch (SQLException e) {
			logger.error(e);
			throw  new CMSBaseException(e,"error.db.exception");
	
		} catch (Exception e) {
			logger.error(e);      
			throw  new CMSBaseException(e,"error.db.exception");

		}finally {
			if (result != null)
				result.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
		return  alarmFreq;
		}
	
	public String getAuthType(String appName, String acronym, String cuid) throws  SQLException, CMSBaseException {

		/*String selectAuthType = "SELECT AUTH_TYPE from TBL_CMS_APP_MEMBER where (" +
				" (APPLICATION_NAME='"+appName+"') AND "+
				" (ACRONYM='"+acronym+"') AND " +
				"(upper(MEMBER_CUID)='"+cuid.toUpperCase()+"'))";*/
	    	/*String selectAuthType = "SELECT NETPIN FROM "+CmsDbTable.CSC_APP_INFO+" WHERE APPLICATION_ID ='"+appName+"'";
		
		String authType = null;

		System.out.println("Get Cert Alarm query ......"+selectAuthType);
		logger.info("Get Cert Alarm query ......"+selectAuthType);
		try {

			conn = dbConn.getConn(true);
			stmt = conn.createStatement();
			result = stmt.executeQuery(selectAuthType);
			result.next();
			//authType = result.getString(3);
			authType = result.getString("NETPIN");
			System.out.println("Netpin in dao..... "+authType);
		} catch (SQLException e) {
			logger.error(e);
			throw  new CMSBaseException(e,"error.db.exception");
	
		} catch (Exception e) {
			logger.error(e);      
			throw  new CMSBaseException(e,"error.db.exception");

		}finally {
			if (result != null)
				result.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
		return  authType;
		*/
	    String netPin="";
	try
	   {			 
	    conn = dbConn.getConn(true);
	    stmt = conn.createStatement();
	    String selectNetpin = "SELECT NETPIN FROM "+CmsDbTable.CSC_APP_INFO+" WHERE APPLICATION_ID ='"+acronym+"'";
	    result = stmt.executeQuery(selectNetpin);
	    System.out.println("QUERY RESULT ------>" +selectNetpin);
	    while (result.next())
		     {	    	
	    		  netPin = result.getString("NETPIN");
		    	  System.out.println("netPin in GenericDAO" +netPin);
		     }
		} catch (SQLException e) {
			logger.error(e);
	    	throw  new CMSBaseException(e,"error.db.exception");
	    	
		} catch (Exception e) {
			logger.error(e);      
	    	throw  new CMSBaseException(e,"error.db.exception");

	   }finally {
		   if (result != null)
				result.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();			
	   }
	   return netPin;
	}
	
	
	public List getMemberCuidList(String searchQuery ) throws Exception,	SQLException
	{
		 ResultSet result = null;
		 Connection conn = null;
		 Statement stmt = null;
		 ArrayList cuidList =  new ArrayList();	
		 String searchGroupQuery = searchQuery;
		 
		 System.out.println("Get Group List query ........>>"+searchGroupQuery);
		 
		 try
		   {			 
		    conn = dbConn.getConn(true);
		    stmt = conn.createStatement();
		    result = stmt.executeQuery(searchGroupQuery);
		    System.out.println("QUERY RESULT ------>" );
		    while (result.next())
			     {	    	
		    		String[] cuidsList = new String[2];	
		    		cuidsList[0] = result.getString("MEMBER_CUID");
			    	  System.out.println("ProjectList in GenericDAO" +cuidsList.length);

			    	  cuidList.add(cuidsList);
		          //System.out.println("DataBase check===CUID>"+result.getString(1));
			     }
			} catch (SQLException e) {
				logger.error(e);
		    	throw  new CMSBaseException(e,"error.db.exception");
		    	
			} catch (Exception e) {
				logger.error(e);      
		    	throw  new CMSBaseException(e,"error.db.exception");

		   }finally {
			   if (result != null)
					result.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();			
		   }
		   return cuidList;		
	} 
	
	public HashMap getGroupList(String searchQuery ) throws Exception,	SQLException
	{
		 
		// ArrayList groupList =  new ArrayList();	
		 String searchGroupQuery = searchQuery;
		 HashMap hash = new HashMap();
		 System.out.println("Get Group List query ........>>"+searchGroupQuery);
		 logger.debug("Get Group List query ........>>"+searchGroupQuery);
		 try
		   {			 
			 conn = dbConn.getConn(true);
			 stmt = conn.createStatement();
			 result = stmt.executeQuery(searchGroupQuery);
			 //System.out.println("QUERY RESULT ------>" );
			 
			 while (result.next())
			     {	 	
				 hash.put(result.getString("APPLICATION_NAME"), result.getString("ACRONYM"));
		    		/*String[] groupsList = new String[2];	
		    		groupsList[0] = result.getString("APPLICATION_NAME");
		    		groupsList[1] = result.getString("ACRONYM");*/
			    	//System.out.println("ProjectList in GenericDAO" +groupsList.length);

		    		//groupList.add(groupsList);
		    		//System.out.println("DataBase check===APP_NAME>"+result.getString(1));
		    		//System.out.println("DataBase check===ACRONYM>"+result.getString(2));
			     }
		   } catch (SQLException e) {
				logger.error(e);      
		    	throw  new CMSBaseException(e,"error.db.exception");

			} catch (Exception e) {
				logger.error(e);      
		    	throw  new CMSBaseException(e,"error.db.exception");
			}finally {
				if (stmt != null)
					stmt.close();
				if (result != null)
					result.close();
				if (conn != null)
					conn.close();
				
			}
		return hash;
		
	} 
	////////////////////
	
	public HashMap getAppAcroList(String searchQuery ) throws Exception,	SQLException
	{
		 
		 String searchGroupQuery = searchQuery;
		 HashMap hash = new HashMap();
		 System.out.println("Get getAppAcroList query ........>>"+searchGroupQuery);
		 logger.debug("Get getAppAcroList query ........>>"+searchGroupQuery);
		 try
		   {			 
			    conn = dbConn.getConn(true);
			    stmt = conn.createStatement();
			    result = stmt.executeQuery(searchGroupQuery);
			    System.out.println("QUERY RESULT ------> in getMgrNames   " );
			    while (result.next())
				     {	    	
				Set s = hash.keySet();
				    String appName = result.getString("APPLICATION_NAME");
				    String acroNym = result.getString("ACRONYM");
				    
				    if(!(s.contains(appName))){
					ArrayList list = new ArrayList();
					list.add(acroNym);
					hash.put(appName, list);
				    }else{
					ArrayList list = (ArrayList) hash.get(appName);
					list.add(appName);
				    }
					//hash.put(result.getString("MANAGER_NAME"), result.getString("APP_CUID"));
				//System.out.println("APP_CUID==========> "+result.getString("APP_CUID"));
				//System.out.println("MANAGER_NAME==========> "+result.getString("MANAGER_NAME"));
				
				
				    }
				} catch (SQLException e) {
				logger.error(e);      
		    	throw  new CMSBaseException(e,"error.db.exception");

			} catch (Exception e) {
				logger.error(e);      
		    	throw  new CMSBaseException(e,"error.db.exception");
			}finally {
				if (stmt != null)
					stmt.close();
				if (result != null)
					result.close();
				if (conn != null)
					conn.close();
				
			}
		return hash;
		
	} 
	
	
	public HashMap getGroupList1(String searchQuery ) throws Exception,	SQLException
	{
		 
		// ArrayList groupList =  new ArrayList();	
		 String searchGroupQuery1 = searchQuery;
		 HashMap hash = new HashMap();
		 System.out.println("inside  getGroupList1........>>"+searchGroupQuery1);
		 logger.debug("inside  getGroupList1 ........>>"+searchGroupQuery1);
		 try
		   {			 
			 conn = dbConn.getConn(true);
			 stmt = conn.createStatement();
			 result = stmt.executeQuery(searchGroupQuery1);
			 System.out.println("QUERY RESULT ------>"+result );
			 
			 while (result.next())
			     {	 	
				 hash.put(result.getString("APPLICATION_NAME"), result.getString("ACRONYM"));
		    		/*String[] groupsList = new String[2];	
		    		groupsList[0] = result.getString("APPLICATION_NAME");
		    		groupsList[1] = result.getString("ACRONYM");*/
			    	//System.out.println("ProjectList in GenericDAO" +groupsList.length);

		    		//groupList.add(groupsList);
		    		//System.out.println("DataBase check===APP_NAME>"+result.getString(1));
		    		//System.out.println("DataBase check===ACRONYM>"+result.getString(2));
			     }
		   } catch (SQLException e) {
				logger.error(e);      
		    	throw  new CMSBaseException(e,"error.db.exception");

			} catch (Exception e) {
				logger.error(e);      
		    	throw  new CMSBaseException(e,"error.db.exception");
			}finally {
				if (stmt != null)
					stmt.close();
				if (result != null)
					result.close();
				if (conn != null)
					conn.close();
				
			}
		return hash;
		
	} 
	
	public ArrayList getHostIDList(String searchQuery ) throws Exception,	SQLException
	{
		 ResultSet result = null;
		 Connection conn = null;
		 Statement stmt = null;
		 ArrayList HostList =  new ArrayList();	
		 String searchHostIDQuery = searchQuery;
		 
		 System.out.println("Get Group List query ........>>"+searchHostIDQuery);
		 
		 try
		   {			 
		    conn = dbConn.getConn(true);
		    stmt = conn.createStatement();
		    result = stmt.executeQuery(searchHostIDQuery);
		    
		    System.out.println("QUERY RESULT ------> in getHostIDList   " );
		    while (result.next())
			     {	    	
		    		String[] HostList1 = new String[2];	
		    		HostList1[0] = result.getString("SERVER_NAME");
		    		System.out.println("ProjectList in GenericDAO   " +HostList1.length);
		    		HostList.add(HostList1);
		            System.out.println("DataBase check===HostList>"+result.getString(1));
			     }
			} catch (SQLException e) {
				logger.error(e);
		    	throw  new CMSBaseException(e,"error.db.exception");
		    	
			} catch (Exception e) {
				logger.error(e);      
		    	throw  new CMSBaseException(e,"error.db.exception");

		   }finally {
			   if (result != null)
					result.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();			
		   }
		   return HostList;		
	} 
	
	public String checkDuplicates(String searchQuery ) throws Exception,	SQLException
	{
		 ResultSet result = null;
		 Connection conn = null;
		 Statement stmt = null;
		 String searchHostIDQuery = searchQuery;
		 String dupList1=null;
		 System.out.println("Checking for Duplicates ........>>"+searchHostIDQuery);
		 
		 try
		   {			 
		    conn = dbConn.getConn(true);
		    stmt = conn.createStatement();
		    result = stmt.executeQuery(searchHostIDQuery);
		    
		    System.out.println("QUERY RESULT ------> in getHostIDList   " );
		    while (result.next())
			     {	    	
		    		dupList1 = result.getString("CREATOR_CUID");
		    		//dupList.add(dupList1);
		            System.out.println("DataBase check===dupList>"+result.getString(1));
			     }
			} catch (SQLException e) {
				logger.error(e);
		    	throw  new CMSBaseException(e,"error.db.exception");
		    	
			} catch (Exception e) {
				logger.error(e);      
		    	throw  new CMSBaseException(e,"error.db.exception");

		   }finally {
			   if (result != null)
					result.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();			
		   }
		   return dupList1;		
	} 
	
	public ArrayList checkDuplicatesCmsAction(String searchQuery ) throws Exception,	SQLException
	{
		 ResultSet result = null;
		 Connection conn = null;
		 Statement stmt = null;
		 String searchHostIDQuery = searchQuery;
		 ArrayList dupList=new ArrayList();
		 System.out.println("Checking for Duplicates ........>>"+searchHostIDQuery);
		 
		 try
		   {			 
		    conn = dbConn.getConn(true);
		    stmt = conn.createStatement();
		    result = stmt.executeQuery(searchHostIDQuery);
		    
		    System.out.println("QUERY RESULT ------> in getHostIDList   " );
		    while (result.next())
			     {	    
				String[] dupList1=new String[2];
		    		dupList1[0] = result.getString("CREATOR_CUID");
		    		dupList.add(dupList1);
		            System.out.println("DataBase check===dupList>"+result.getString(1));
			     }
			} catch (SQLException e) {
				logger.error(e);
		    	throw  new CMSBaseException(e,"error.db.exception");
		    	
			} catch (Exception e) {
				logger.error(e);      
		    	throw  new CMSBaseException(e,"error.db.exception");

		   }finally {
			   if (result != null)
					result.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();			
		   }
		   return dupList;		
	} 
	
	
	
	public ArrayList getLoadFromExcelData(String searchQuery ) throws Exception,	SQLException
	{
		 ResultSet result = null;
		 Connection conn = null;
		 Statement stmt = null;
		 ArrayList list =  new ArrayList();	
		 String searchHostIDQuery = searchQuery;
		 
		 System.out.println("getLoadFromExcelData ........>>"+searchHostIDQuery);
		 
		 try
		   {			 
		    conn = dbConn.getConn(true);
		    stmt = conn.createStatement();
		    result = stmt.executeQuery(searchHostIDQuery);
		    
		    System.out.println("QUERY RESULT ------> in getLoadFromExcelData   " );
		    while (result.next())
			     {	    	
		    		String[] list1 = new String[7];	
		    		list1[0] = result.getString("REQUESTOR_NAME");
		    		list1[1] = result.getString("ISSUED_COMMON_NAME");
		    		list1[2] = result.getString("ISSUED_ORG");
		    		list1[3] = result.getString("CERT_EFF_DATE");
		    		list1[4] = result.getString("CERT_EXP_DATE");
		    		list1[5] = result.getString("REQUEST_ID");
		    		list1[6] = result.getString("STATUS");
		    		list1[7] = result.getString("ALARM_FLAG");
		    		
		    		list.add(list1);
		          // System.out.println("DataBase check===getLoadFromExcelData>"+result.getString("REQUEST_ID"));
			     }
			} catch (SQLException e) {
				logger.error(e);
		    	throw  new CMSBaseException(e,"error.db.exception");
		    	
			} catch (Exception e) {
				logger.error(e);      
		    	throw  new CMSBaseException(e,"error.db.exception");

		   }finally {
			   if (result != null)
					result.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();			
		   }
		   return list;		
	} 
	
	public ArrayList getDetailsFromReqID(String searchQuery ) throws Exception,	SQLException
	{
		 ResultSet result = null;
		 Connection conn = null;
		 Statement stmt = null;
		 ArrayList list =  new ArrayList();	
		 String searchHostIDQuery = searchQuery;
		 
		 //System.out.println("getLoadFromExcelData ........>>"+searchHostIDQuery);
		logger.info("getDetailsFromReqID Query .... "+searchHostIDQuery);

		 try
		   {			 
		    conn = dbConn.getConn(true);
		    stmt = conn.createStatement();
		    result = stmt.executeQuery(searchHostIDQuery);
		    
		    System.out.println("QUERY RESULT ------> in getDetailsFromReqID   " );
		    while (result.next())
			     {	    	
		    		String[] list1 = new String[13];	
		    		list1[0] = result.getString(1);
		    		list1[1] = result.getString(2);
		    		list1[2] = result.getString(3);
		    		list1[3] = result.getString(4);
		    		list1[4] = result.getString(5);
		    		list1[5] = result.getString(6);
		    		list1[6] = result.getString(7);
		    		list1[7] = result.getString(8);
		    		list1[8] = result.getString(9);
		    		list1[9] = result.getString(10);
		    		list1[10] = result.getString(11);
		    		list1[11] = result.getString(12);
		    		
		    		list.add(list1);
		          // System.out.println("DataBase check===getLoadFromExcelData>"+result.getString("REQUEST_ID"));
			     }
			} catch (SQLException e) {
				logger.error(e);
				e.printStackTrace();
		    	throw  new CMSBaseException(e,"error.db.exception");
		    	
			} catch (Exception e) {
				logger.error(e);      
		    	throw  new CMSBaseException(e,"error.db.exception");

		   }finally {
			   if (result != null)
					result.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();			
		   }
		   return list;		
	} 
	
	
	public ArrayList getCscDetails(String searchQuery ) throws Exception,	SQLException
	{
		 ResultSet result = null;
		 Connection conn = null;
		 Statement stmt = null;
		 ArrayList HostList =  new ArrayList();	
		 String searchHostIDQuery = searchQuery;
		 
		 System.out.println("Get Group List query ........>>"+searchHostIDQuery);
		 
		 try
		   {			 
		    conn = dbConn.getConn(true);
		    stmt = conn.createStatement();
		    result = stmt.executeQuery(searchHostIDQuery);
		    System.out.println("QUERY RESULT ------> in getHostIDList   " );
		    while (result.next())
			     {	    	
		    		String[] HostList1 = new String[4];	
		    		HostList1[0] = result.getString("NETPIN");
		    		HostList1[1] = result.getString("APPLICATION_ID");
		    		
			    	System.out.println("ProjectList in GenericDAO   " +HostList1.length);
			    	  HostList.add(HostList1);
			    	 
			    	 
		          System.out.println("DataBase check===HostList>"+result.getString(1));
			     }
			} catch (SQLException e) {
				logger.error(e);
		    	throw  new CMSBaseException(e,"error.db.exception");
		    	
			} catch (Exception e) {
				logger.error(e);      
		    	throw  new CMSBaseException(e,"error.db.exception");

		   }finally {
			   if (result != null)
					result.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();			
		   }
		   return HostList;		
	} 
	
	public ArrayList getCsvData(String searchQuery ) throws Exception,	SQLException
	{
		 ResultSet result = null;
		 Connection conn = null;
		 Statement stmt = null;
		 ArrayList csvData =  new ArrayList();	
		 String searchHostIDQuery = searchQuery;
		 
		 System.out.println("Get getCsvData query ........>>"+searchHostIDQuery);
		 
		 try
		   {			 
		    conn = dbConn.getConn(true);
		    stmt = conn.createStatement();
		    result = stmt.executeQuery(searchHostIDQuery);
		    System.out.println("QUERY RESULT ------> in getCsvData   " );
		    while (result.next())
			     {	    	
		    		String[] csvData1 = new String[7];	
		    		csvData1[0] = result.getString("HOST_ID");
		    		csvData1[1] = result.getString("APPLICATION_NAME");
		    		csvData1[2] = result.getString("ISSUER");
		    		csvData1[3] = result.getString("SUBJECT");
		    		csvData1[4] = result.getString("SERIAL_NO");
		    		csvData1[5] = result.getString("EXPIRE_ON");
		    		csvData1[6] = result.getString("CERT_PATH_SERVER");
		    		
			    	//System.out.println("ProjectList in GenericDAO   " +csvData1.length);
			    	csvData.add(csvData1);
			    	 
			    	 
		         // System.out.println("DataBase check===HostList>"+result.getString(1));
			     }
			} catch (SQLException e) {
				logger.error(e);
		    	throw  new CMSBaseException(e,"error.db.exception");
		    	
			} catch (Exception e) {
				logger.error(e);      
		    	throw  new CMSBaseException(e,"error.db.exception");

		   }finally {
			   if (result != null)
					result.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();			
		   }
		   return csvData;		
	} 
	
	
	public HashMap getMgrNames(String searchQuery ) throws Exception,	SQLException
	{
		 ResultSet result = null;
		 Connection conn = null;
		 Statement stmt = null;
		 HashMap hash = new HashMap();
		 String searchHostIDQuery = searchQuery;
		 
		 System.out.println("Get getMgrNames query ........>>"+searchHostIDQuery);
		 
		 try
		   {			 
		    conn = dbConn.getConn(true);
		    stmt = conn.createStatement();
		    result = stmt.executeQuery(searchHostIDQuery);
		    System.out.println("QUERY RESULT ------> in getMgrNames   " );
		    while (result.next())
			     {	    	
			Set s = hash.keySet();
			    String appName = result.getString("APP_CUID");
			    String mgrName = result.getString("MANAGER_NAME");
			    
			    if(!(s.contains(mgrName))){
				ArrayList list = new ArrayList();
				list.add(appName);
				hash.put(mgrName, list);
			    }else{
				ArrayList list = (ArrayList) hash.get(mgrName);
				list.add(appName);
			    }
				//hash.put(result.getString("MANAGER_NAME"), result.getString("APP_CUID"));
			//System.out.println("APP_CUID==========> "+result.getString("APP_CUID"));
			//System.out.println("MANAGER_NAME==========> "+result.getString("MANAGER_NAME"));
			
			
			    }
			} catch (SQLException e) {
				logger.error(e);
		    	throw  new CMSBaseException(e,"error.db.exception");
		    	
			} catch (Exception e) {
				logger.error(e);      
		    	throw  new CMSBaseException(e,"error.db.exception");

		   }finally {
			   if (result != null)
					result.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();			
		   }
		   return hash;		
	} 
	
	
	public ArrayList getUserDetails(String searchQuery ) throws Exception,	SQLException
	{
		 ResultSet result = null;
		 Connection conn = null;
		 Statement stmt = null;
		 ArrayList UserList =  new ArrayList();	
		 String searchUserNameQuery = searchQuery;
		 
		System.out.println("Get Group List query ........>>"+searchUserNameQuery);
		 
		 try
		   {			 
		    conn = dbConn.getConn(true);
		    stmt = conn.createStatement();
		    result = stmt.executeQuery(searchUserNameQuery);
		    System.out.println("QUERY RESULT ------> in getUserDetails   " );
		    while (result.next())
			     {	    	
		    		String UserList1 = result.getString("APPLICATION_NAME");
			    	 // System.out.println("ProjectList in GenericDAO   " +HostList1.length);

		    		UserList.add(UserList1);
		          //System.out.println("DataBase check===getUserDetails  >"+result.getString(1));
			     }
			} catch (SQLException e) {
				logger.error(e);
		    	throw  new CMSBaseException(e,"error.db.exception");
		    	
			} catch (Exception e) {
				logger.error(e);      
		    	throw  new CMSBaseException(e,"error.db.exception");

		   }finally {
			   if (result != null)
					result.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();			
		   }
		   return UserList;		
	} 
	
	public ArrayList getAppId(String searchQuery ) throws Exception,	SQLException
	{
		 ResultSet result = null;
		 Connection conn = null;
		 Statement stmt = null;
		 ArrayList UserList =  new ArrayList();	
		 String searchUserNameQuery = searchQuery;
		 
		System.out.println("Get Group List query ........>>"+searchUserNameQuery);
		 
		 try
		   {			 
		    conn = dbConn.getConn(true);
		    stmt = conn.createStatement();
		    result = stmt.executeQuery(searchUserNameQuery);
		    System.out.println("QUERY RESULT ------> in getAppId   " );
		    while (result.next())
			     {	    	
		    		String UserList1 =  result.getString("ID");
			    	 // System.out.println("ProjectList in GenericDAO   " +HostList1.length);

		    		UserList.add(UserList1);
		          System.out.println("DataBase check===getAppId  >"+result.getString(1));
			     }
			} catch (SQLException e) {
				logger.error(e);
		    	throw  new CMSBaseException(e,"error.db.exception");
		    	
			} catch (Exception e) {
				logger.error(e);      
		    	throw  new CMSBaseException(e,"error.db.exception");

		   }finally {
			   if (result != null)
					result.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();			
		   }
		   return UserList;		
	} 
	
	public ArrayList getAcroNym(String searchQuery ) throws Exception,	SQLException
	{
		 ResultSet result = null;
		 Connection conn = null;
		 Statement stmt = null;
		 ArrayList UserList =  new ArrayList();	
		 String searchUserNameQuery = searchQuery;
		 
		System.out.println("Get getAcroNym query ........>>"+searchUserNameQuery);
		 
		 try
		   {			 
		    conn = dbConn.getConn(true);
		    stmt = conn.createStatement();
		    result = stmt.executeQuery(searchUserNameQuery);
		    System.out.println("QUERY RESULT ------> in getAcroNym   " );
		    while (result.next())
			     {	    	
		    		String UserList1 = result.getString("ACRONYM");
			    	 // System.out.println("ProjectList in GenericDAO   " +HostList1.length);

		    		UserList.add(UserList1);
		          System.out.println("DataBase check===getAcroNym  >"+result.getString(1));
			     }
			} catch (SQLException e) {
				logger.error(e);
		    	throw  new CMSBaseException(e,"error.db.exception");
		    	
			} catch (Exception e) {
				logger.error(e);      
		    	throw  new CMSBaseException(e,"error.db.exception");

		   }finally {
			   if (result != null)
					result.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();			
		   }
		   return UserList;		
	} 
	
	public ArrayList getAppAcroNym(String searchQuery ) throws Exception,	SQLException
	{
		 ResultSet result = null;
		 Connection conn = null;
		 Statement stmt = null;
		 ArrayList appAcroNym =  new ArrayList();	
		 String searchUserNameQuery = searchQuery;
		 
		System.out.println("Get getAcroNym query ........>>"+searchUserNameQuery);
		 
		 try
		   {			 
		    conn = dbConn.getConn(true);
		    stmt = conn.createStatement();
		    result = stmt.executeQuery(searchUserNameQuery);
		    System.out.println("QUERY RESULT ------> in getAcroNym   " );
		    while (result.next())
		     {	    	
	    		String[] appAcroNym1 = new String[2];	
	    		appAcroNym1[0] = result.getString("NAME");
	    		appAcroNym1[1] = result.getString("ACRONYM");
		    	 // System.out.println("ProjectList in GenericDAO   " +HostList1.length);

	    		appAcroNym.add(appAcroNym1);
	          System.out.println("DataBase check===getAppAcroNym>"+result.getString(1));
		     }
			} catch (SQLException e) {
				logger.error(e);
		    	throw  new CMSBaseException(e,"error.db.exception");
		    	
			} catch (Exception e) {
				logger.error(e);      
		    	throw  new CMSBaseException(e,"error.db.exception");

		   }finally {
			   if (result != null)
					result.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();			
		   }
		   return appAcroNym;		
	} 
	
	
	public boolean getAppInfo(String updateQuery ) throws SQLException, CMSBaseException {

	    boolean results = false;
	    try {
	                conn = dbConn.getConn(true);
	                stmt = conn.createStatement();					
					System.out.println(updateQuery);
	                int deletes = stmt.executeUpdate(updateQuery);
					System.out.println("inserts "+deletes);
					logger.info("Update Group query ....."+updateQuery);

	                if (deletes > 0)
	                   results = true;
	                logger.debug("Status of Update Group is .... "+results);
	    } catch (SQLException e) {
			logger.error(e);   
	    	throw  new CMSBaseException(e,"error.db.exception");
		} catch (Exception e) {
			logger.error(e);  
	    	throw  new CMSBaseException(e,"error.db.exception");

		}finally {	
			if (result != null)
				result.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}

	    return results;

	}	
	
	public ArrayList getCertNames(String searchQuery ) throws Exception,	SQLException
	{
		 ResultSet result = null;
		 Connection conn = null;
		 Statement stmt = null;
		 ArrayList appNickName =  new ArrayList();	
		 String searchUserNameQuery = searchQuery;
		 
		System.out.println("Get getCertNames query ........>>"+searchUserNameQuery);
		 
		 try
		   {			 
		    conn = dbConn.getConn(true);
		    stmt = conn.createStatement();
		    result = stmt.executeQuery(searchUserNameQuery);
		    System.out.println("QUERY RESULT ------> in getCertNames   " );
		    while (result.next())
		     {	    	
	    		String[] appNickName1 = new String[20];	
	    		appNickName1[0] = result.getString("RAW_CERTIFICATE");
	    		appNickName1[1] = result.getString("CERT_NICKNAME");
	    		appNickName1[2] = result.getString("SIGNATURE_ALGO");
		    	 // System.out.println("ProjectList in GenericDAO   " +HostList1.length);

	    		appNickName.add(appNickName1);
	          System.out.println("DataBase check===getCertNames>"+appNickName1[0]);
	          System.out.println("DataBase check===getCertNames>"+appNickName1[1]);
	          System.out.println("DataBase check===getCertNames>"+appNickName1[2]);
		     }
			} catch (SQLException e) {
				logger.error(e);
		    	throw  new CMSBaseException(e,"error.db.exception");
		    	
			} catch (Exception e) {
				logger.error(e);      
		    	throw  new CMSBaseException(e,"error.db.exception");

		   }finally {
			   if (result != null)
					result.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();			
		   }
		   return appNickName;		
	} 
	
	public ArrayList getSearchCertDetails(String selectQuery) throws  CMSBaseException,
	SQLException {

		ArrayList resList = new ArrayList();
		System.out.println("getSearchCertDetails-------------------->>     "+selectQuery);
		
		try {

			conn = dbConn.getConn(true);
			stmt = conn.createStatement();
			logger.info("Get Certificate list query ..... "+selectQuery);
			result = stmt.executeQuery(selectQuery);

			while (result.next()) {
				
				String[] data = new String[8];

       	 		data[0] = result.getString(1);
       	 		data[1] = result.getString(2);
				data[2] = result.getString(3);
       	 		data[3] = result.getString(4);
			 	data[4] = result.getString(5);
			 	data[5] = result.getString(6);
				data[6] = result.getString(7);
				data[7] = result.getString(8);
				//System.out.println("inside Generic DAO-- value of SERIAL_NO "+ data[0]);

				/*for(int j=0; j < data.length; j++)
				{
					System.out.println(data[j]);
					System.out.println("===========================");
				} 	*/		 	
				resList.add(data);
			}

		} catch (SQLException e) {
			logger.error(e);      
	    	throw  new CMSBaseException(e,"error.db.exception");
		} catch (Exception e) {
			logger.error(e);      
	    	throw  new CMSBaseException(e,"error.db.exception");
		}finally {
			if (result != null)
				result.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
		return resList;
	}
	
	public ArrayList getRcbsList(String searchQuery ) throws Exception,	SQLException
	{
		 ResultSet result = null;
		 Connection conn = null;
		 Statement stmt = null;
		 ArrayList rcbsList =  new ArrayList();	
		 String searchHostIDQuery = searchQuery;
		 
		 System.out.println("Get Group List query ........>>"+searchHostIDQuery);
		 
		 try
		   {			 
		    conn = dbConn.getConn(true);
		    stmt = conn.createStatement();
		    result = stmt.executeQuery(searchHostIDQuery);
		    System.out.println("QUERY RESULT ------> in getRcbsList   " );
		    while (result.next())
			     {	    	
		    		String[] rcbsList1 = new String[9];	
		    		rcbsList1[0] = result.getString("SUPPORT_DIRECTOR");
		    		rcbsList1[1] = result.getString("SUPPORT_MANAGER");
		    		rcbsList1[2] = result.getString("SUPPORT_PROJECT_MANAGER");
		    		rcbsList1[3] = result.getString("DEVELOPMENT_DIRECTOR");
		    		rcbsList1[4] = result.getString("DEVELOPMENT_MANAGER");
		    		rcbsList1[5] = result.getString("DEVELOPMENT_PROJECT_MANAGER");
		    		
			    	// System.out.println("ProjectList in rcbsList1[0]   " +rcbsList1[0]);
			    	// System.out.println("ProjectList in rcbsList1[1]   " +rcbsList1[1]);
			    	 rcbsList.add(rcbsList1);
		          System.out.println("DataBase check===HostList>"+result.getString(1));
			     }
			} catch (SQLException e) {
				logger.error(e);
		    	throw  new CMSBaseException(e,"error.db.exception");
		    	
			} catch (Exception e) {
				logger.error(e);      
		    	throw  new CMSBaseException(e,"error.db.exception");

		   }finally {
			   if (result != null)
					result.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();			
		   }
		   return rcbsList;		
	} 
	
	//////////////////
	
	public ArrayList getCertificates(String selectQuery) throws  SQLException, CMSBaseException {

		ArrayList certificatesList = new ArrayList();
		try {

			conn = dbConn.getConn(true);
			stmt = conn.createStatement();
			result = stmt.executeQuery(selectQuery);
			logger.debug("Get Certificates Query .... "+selectQuery);
			while (result.next()) {
				
				String[] certData = new String[4];

				certData[0] = result.getString(1);
				certData[1] = result.getString(2);
				certData[2] = result.getString(3);
				certData[3] = result.getString(4);
				
				certificatesList.add(certData);
			}

		} catch (SQLException e) {
			logger.error(e);
			throw  new CMSBaseException(e,"error.db.exception");
	
		} catch (Exception e) {
			logger.error(e);      
			throw  new CMSBaseException(e,"error.db.exception");

		}finally {
			if (result != null)
				result.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
		return certificatesList;
	}
	
	public boolean createGroup(String AppName,String Acronym,String cuid,String rcbsCode,String rcbsMgrCuid,String alarmTime,String alarmFreq,String appUserName) throws  SQLException, CMSBaseException {
		
		int inserts = 0;
		boolean results = false;
		try {

			conn = dbConn.getConn(true);
			stmt = conn.createStatement();			

			String inser_APP_Owner="INSERT INTO "+CmsDbTable.TBL_CMS_APP_OWNER+"( APPLICATION_NAME, ACRONYM, CREATOR_CUID, RCBS_CODE,RCBS_MGR_CUID, APP_USER_NAMES) " +"VALUES ('"+AppName+"', '"+Acronym+"', '"+cuid+"', '"+rcbsCode+"', '"+rcbsMgrCuid+"', '"+appUserName+"')";
			  
			System.out.println(" inser stmt of inser_APP_Owner ==> \n"+inser_APP_Owner);
			logger.debug("Insert Group into App Owner Query .... "+inser_APP_Owner);
			inserts = stmt.executeUpdate(inser_APP_Owner);
			if (inserts > 0)
                results = true;
             	logger.debug("Status of Insert Group is .... "+results);
			//result = stmt.executeQuery();
			/*while (result.next()) {				
				String[] certData = new String[4];

				certData[0] = result.getString(1);
				certData[1] = result.getString(2);
				certData[2] = result.getString(3);
				certData[3] = result.getString(4);				
				//certificatesList.add(certData);
			} */

		} catch (SQLException e) {
			logger.error(e);
			throw  new CMSBaseException(e,"error.db.exception");
	
		} catch (Exception e) {
			logger.error(e);      
			throw  new CMSBaseException(e,"error.db.exception");

		}finally {
			if (result != null)
				result.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
		return results;
	}
	
	public boolean insertAlarmDet(String AppName,String Acronym,String alaram) throws  SQLException, CMSBaseException {

		int inserts = 0;
		boolean results = false;
		try {

				conn = dbConn.getConn(true);
				stmt = conn.createStatement();
				
	
				String inser_CMS_CERT_ALARM="INSERT INTO "+CmsDbTable.TBL_CMS_CERT_ALARM+" ( APPLICATION_NAME, ACRONYM, ALARM_FREQ) " +"VALUES ('"+AppName+"', '"+Acronym+"', '"+alaram+"')";
				  
				System.out.println(" inser stmt of inser_APP_Owner ==> \n"+inser_CMS_CERT_ALARM);
				
				inserts = stmt.executeUpdate(inser_CMS_CERT_ALARM);
				if (inserts > 0)
	                results = true;
	             logger.debug("Status of Insert Alarm Details is .... "+results);
	      
		} catch (SQLException e) {
			logger.error(e);
			throw  new CMSBaseException(e,"error.db.exception");
	
		} catch (Exception e) {
			logger.error(e);      
			throw  new CMSBaseException(e,"error.db.exception");

		}finally {
			if (result != null)
				result.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
		return results;
	}
	
	
	 public boolean checkOwner(String appName,String ACRONYM) throws CMSBaseException, SQLException{
	        boolean exists = true;
	        String query="SELECT APPLICATION_NAME,ACRONYM from "+CmsDbTable.TBL_CMS_APP_OWNER+" where APPLICATION_NAME='"+appName+"' AND ACRONYM='"+ACRONYM+"'";
	        logger.debug("Check Owner Exists Query .... "+query);
	        try{
	        	conn = dbConn.getConn(true);
				stmt = conn.createStatement();         
	        	result=stmt.executeQuery(query);
	        	exists=result.next();
	        	System.out.println(" the status of the given row of exist=rs.next() is --"+exists);
	        	logger.debug("Status of Owner exists is .... "+exists);
			} catch (SQLException e) {
				logger.error(e);
				throw  new CMSBaseException(e,"error.db.exception");
		
			} catch (Exception e) {
				logger.error(e);      
				throw  new CMSBaseException(e,"error.db.exception");

			}finally {
				if (result != null)
					result.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			}
	        return exists;
	    }
	 
	 public boolean checkRowmember(String AppName,String Acronym,String creator_cuid) throws CMSBaseException, SQLException{
	        boolean exists=true;
	        String chkMembQuery="select APPLICATION_NAME, ACRONYM, MEMBER_CUID from "+CmsDbTable.TBL_CMS_APP_MEMBER+" where APPLICATION_NAME='"+AppName+"' AND ACRONYM='"+Acronym+"'AND MEMBER_CUID='"+creator_cuid+"'";
	        System.out.println(" Checking query in GenericDAO class-- \n"+chkMembQuery);
	        logger.debug("Checking Member Exists Query .... "+chkMembQuery);
	        try{
	        	conn = dbConn.getConn(true);
				stmt = conn.createStatement();         
	            result=stmt.executeQuery(chkMembQuery);
	            exists=result.next();
	            System.out.println("checking in for member existance --"+exists);
	            logger.debug("Status of Member exists is .... "+exists);
			} catch (SQLException e) {
				logger.error(e);
				throw  new CMSBaseException(e,"error.db.exception");
		
			} catch (Exception e) {
				logger.error(e);      
				throw  new CMSBaseException(e,"error.db.exception");

			}finally {
				if (result != null)
					result.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			}	      
	        return exists;
	    }
	 
	 public boolean checkAlaram(String appName,String ACRONYM) throws CMSBaseException, SQLException{
	        boolean exists = false;
	        String query="select APPLICATION_NAME,ACRONYM from "+CmsDbTable.TBL_CMS_CERT_ALARM+" where APPLICATION_NAME='"+appName+"' AND ACRONYM='"+ACRONYM+"'";
	        System.out.println(" select query of Alaram ==> \n"+query);
	        logger.debug("Checking Alarm Exists Query .... "+query);
	        try{
	        	conn = dbConn.getConn(true);
				stmt = conn.createStatement();       
	            result=stmt.executeQuery(query);
	            exists = result.next();
	            System.out.println(" the status of the given row of exist=rs.next() is --"+exists);
	            logger.debug("Status of Alarm Det exists is .... "+exists);
			} catch (SQLException e) {
				logger.error(e);
				throw  new CMSBaseException(e,"error.db.exception");
		
			} catch (Exception e) {
				logger.error(e);      
				throw  new CMSBaseException(e,"error.db.exception");

			}finally {
				if (result != null)
					result.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			}	      
	        return exists;
	    }


	 public boolean createMember(String AppName,String Acronym,String member_cuid,String AUTH_TYPE)throws  SQLException, CMSBaseException {
		 
		boolean results = false;
		int inserts = 0;
		try {
			conn = dbConn.getConn(true);
			stmt = conn.createStatement();

			String inser_APP_MEMBER="INSERT INTO "+CmsDbTable.TBL_CMS_APP_MEMBER+"(APPLICATION_NAME, ACRONYM, MEMBER_CUID,AUTH_TYPE) " +"VALUES ('"+AppName+"', '"+Acronym+"', '"+member_cuid+"', '"+AUTH_TYPE+"')";
			  
			System.out.println(" inser stmt of inser_APP_MEMBER ==> \n"+inser_APP_MEMBER);
			logger.debug("Create Member Query .... "+inser_APP_MEMBER);
			
			inserts = stmt.executeUpdate(inser_APP_MEMBER);
			if (inserts > 0)
                results = true;
             logger.debug("Status of Insert Member Details is .... "+results);
		} catch (SQLException e) {
			logger.error(e);
			throw  new CMSBaseException(e,"error.db.exception");
	
		} catch (Exception e) {
			logger.error(e);      
			throw  new CMSBaseException(e,"error.db.exception");

		}finally {
			if (result != null)
				result.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
		return results;
	}
	 
	public boolean deleteAppDAO(String appname,String acronym)throws Exception,	SQLException 
	{
		System.out.println("in deleteAppDAO *********************************");
		boolean results = false;
		int deletes = 0;
			 
		 try
	     {
		    String selectQuery = null; 
		    conn = dbConn.getConn(true);
		    stmt = conn.createStatement();
		    String delete ="delete  from "+CmsDbTable.TBL_CMS_APP_MEMBER+" where application_name='" + appname + "'  AND ACRONYM= '" + acronym + "'";
		    String delete1="delete  from "+CmsDbTable.TBL_CMS_APP_OWNER+" where application_name='" + appname + "'  AND ACRONYM= '" + acronym + "'";
		    String delete2="delete  from "+CmsDbTable.TBL_CMS_CERT_ALARM+" where application_name='" + appname + "'  AND ACRONYM= '" + acronym + "'";
			    
		    System.out.println(delete);
		    System.out.println(delete1);
		    deletes = stmt.executeUpdate(delete);
		    if ( deletes >0 )
		    	deletes = stmt.executeUpdate(delete1)+1;
		    if (deletes > 1){
		    	deletes = stmt.executeUpdate(delete2)+1;
                results = true;
             	logger.debug("Status of Delete Member Details is .... "+results);			    
		    }   			    
	     }catch (SQLException e) {
				logger.error(e);      
		    	throw  new CMSBaseException(e,"error.db.exception");

		 } catch (Exception e) {
				logger.error(e);      
		    	throw  new CMSBaseException(e,"error.db.exception");
		 }finally {
			if (result != null)
				result.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		 }
		 return results;
	}
		
	public ArrayList getMALInfo(String appName) throws  SQLException, CMSBaseException {

		ArrayList MALInofList = new ArrayList();
		try {
			
			String selectQuery = "SELECT * from "+CmsDbTable.TBL_CMS_MAL+" where APPLICATION_NAME='"+appName+"'";
			logger.debug("Get MAL info Query .... "+selectQuery);
			conn = dbConn.getConn(true);
			stmt = conn.createStatement();
			result = stmt.executeQuery(selectQuery);

			while (result.next()) {
				
				String[] MALData = new String[14];

				MALData[0] = result.getString("APPLICATION_NAME");
				MALData[1] = result.getString("ACRONYM");
				MALData[2] = result.getString("ASSIGNMENT");
				MALData[3] = result.getString("PRI_BUSINESS_UNIT");
				MALData[4] = result.getString("SUPP_DIRECTOR");
				MALData[5] = result.getString("SUPP_MANAGER");
				MALData[6] = result.getString("SUPP_PROJ_MANAGER");
				MALData[7] = result.getString("STATUS");
				MALData[8] = result.getString("SOX_CRITICAL");
				MALData[9] = result.getString("SYSTEM_GROUP");
				MALData[10] = result.getString("SLR_COLOR");
				
				MALInofList.add(MALData);
			}

		} catch (SQLException e) {
			logger.error(e);      
	    	throw  new CMSBaseException(e,"error.db.exception");

		} catch (Exception e) {
			logger.error(e);      
	    	throw  new CMSBaseException(e,"error.db.exception");

		}finally {
			if (result != null)
				result.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
		return MALInofList;
	}
	
	public String[] getAppUserName( String appName, String acronym ) throws SQLException, CMSBaseException {
		
		String selectquery = "select DISTINCT APP_USER_NAMES from "+CmsDbTable.TBL_CMS_APP_OWNER+" where ( APPLICATION_NAME='"+appName+"' AND ACRONYM='"+acronym+"')";
		String[] appUserNames = null;
		String error = null;
		
		System.out.println("Get Rcbs Manager query...."+selectquery);
		logger.info("Get App User Names query ......"+selectquery);
		try {

			conn = dbConn.getConn(true);
			stmt = conn.createStatement();
			result = stmt.executeQuery(selectquery);
			result.next();
			if(result.getString(1) !=null ){
				appUserNames = result.getString(1).split(",");
				System.out.println("APP USER NAMES ****************** "+appUserNames);
				Set s=new HashSet();
				for (int i = 0; i < appUserNames.length; i++) {
				    if(!s.contains(appUserNames[i]))
				    s.add(appUserNames[i]);                    
                }
				System.out.println("APP USER NAMES *****************2* "+s.size());
				Iterator ir=s.iterator();
				String[] appUserNamenew = new String[s.size()];
				int i=0;
				while(ir.hasNext()){
				    appUserNamenew[i]=(String)ir.next();
				    i++;
				}				
				appUserNames=appUserNamenew;

			}
			else{
				//appUserNames = "error";
				//error = "RCBS Manager not found for the Application "+appName;				
			}
				
		} catch (SQLException e) {
			logger.error(e);
	    	throw  new CMSBaseException(e,"error.db.exception");
	    	
		} catch (Exception e) {
			logger.error(e);      
	    	throw  new CMSBaseException(e,"error.db.exception");

		}finally {
			if (result != null)
				result.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
		return  appUserNames;
	}

		
}
