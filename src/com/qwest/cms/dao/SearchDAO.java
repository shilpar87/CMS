/**
 * 
 */
package com.qwest.cms.dao;

/**
 * @author aadeppa
 *
 */


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import javax.swing.text.DateFormatter;

import org.apache.log4j.Category;
import org.apache.log4j.Logger;
import org.apache.struts.action.ActionErrors;
import com.qwest.cms.exception.CMSBaseException;
import com.qwest.cms.BO.CMSBO;
import com.qwest.cms.dbconnection.*;
import com.qwest.cms.actionForm.CMSFormBean;



	public class SearchDAO {
	
		DBConnection dbConn = DBConnection.getInstance();
		ActionErrors errors = new ActionErrors();
		private static SearchDAO gendao;
	
		private Connection conn = null;
		private Statement stmt = null;
		ResultSet result = null;
		Logger logger=Logger.getLogger(GenericDAO.class);	   
    
		public static synchronized SearchDAO getSearchDAO(){
			if(gendao == null){
				gendao=new SearchDAO();
			}
			return gendao;
    }

	
	public List getGroupList1(String searchQuery ) throws Exception,	SQLException
	{
		
		 ArrayList groupList =  new ArrayList();	
		 String searchGroupQuery = searchQuery;
		 
		 System.out.println("Get Group List query ........>>"+searchGroupQuery);
		 logger.debug("Get Group List1 query ........>>"+searchGroupQuery);
		 try
		   {
			 
		   		conn = dbConn.getConn(true);
		   		stmt = conn.createStatement();
		   		result = stmt.executeQuery(searchGroupQuery);
		   		System.out.println("QUERY RESULT ------>" );
		   		while (result.next())
			    {	    	
		    		String[] groupsList = new String[2];	
		    		groupsList[0] = result.getString("AUTH_TYPE");
		    		//System.out.println("ProjectList in GenericDAO" +groupsList.length);

		    		groupList.add(groupsList);
		    		//System.out.println("DataBase check===APP_NAME>"+result.getString("AUTH_TYPE"));
		         }
		   }catch (SQLException e) {
				//logger.error(e);      
//		    	throw  new CMSBaseException(e,"error.db.exception");
			} catch (Exception e) {
			//	logger.error(e);      
		 //   	throw  new CMSBaseException(e,"error.db.exception");
			}finally {
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			}
		return groupList;
		
	} 

	
	public boolean insertAppMember(String insertQuery) throws SQLException, CMSBaseException {

        boolean results = false;
        Logger logger = null;
		try {
        			String insertAppMemQuery = null;
                    conn = dbConn.getConn(true);
                    stmt = conn.createStatement();
                    insertAppMemQuery = insertQuery;
					System.out.println("InsertCertDet query ->"+insertAppMemQuery);
					logger.info("InsertCertDet query ......"+insertAppMemQuery);
                    int inserts = stmt.executeUpdate(insertAppMemQuery);
                    System.out.println("inserts..."+inserts);
                    if (inserts > 0)
                                results = true;
                    logger.debug("Status of Inserts is .... "+results);
        } catch (SQLException e) {
    		logger.error(e);     
	    	throw  new CMSBaseException(e,"error.db.exception");

    	} catch (Exception e) {
    		logger.error(e);     
	    	throw  new CMSBaseException(e,"error.db.exception");

    	}finally {
    		if (stmt != null)
    			stmt.close();
    		if (conn != null)
    			conn.close();
    		if (result != null)
    			result.close();
    	}

        return results;

	}
	

}
	

	