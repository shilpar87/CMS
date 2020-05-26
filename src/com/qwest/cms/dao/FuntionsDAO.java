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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
//import com.qwest.prpo.exception.RMSBaseException;

import com.qwest.cms.BO.BOClass;
import com.qwest.cms.BO.CMSBO;
import com.qwest.cms.action.CMSAction;
import com.qwest.cms.utils.CmsDbTable;



public class FuntionsDAO
{
	DBConnection dbConn = DBConnection.getInstance();
	ActionErrors errors = new ActionErrors();
	private static FuntionsDAO gendao;
//	Logger logger=Logger.getLogger(PRPOAction.class);
	public static synchronized FuntionsDAO getGenericDAO(){
        if(gendao == null){
            gendao=new FuntionsDAO();
        }
        return gendao;
    }

	
	public String getCertificate(String cuid, String seqnum,String serialno,String issuer ) throws Exception,	SQLException 
	{
		 ResultSet result = null;
		 ResultSet result1 = null;
		 Connection conn = null;
		 Statement stmt = null;
		 Statement stmt1 = null;
		 ArrayList rcbsProject = new ArrayList();
		 try
		   {
		    conn = dbConn.getConn(true);
		    stmt = conn.createStatement();
		    System.out.println("CUID--------------------------"+cuid);
		    System.out.println("Sequence number-------------------"+seqnum);
		    System.out.println("serial no ----------------"+serialno);
		    System.out.println("issuer in DAO ----------------------"+issuer);
		    conn = dbConn.getConn(true);
		    //String location ="select detail.RAW_CERTIFICATE from TBL_CMS_CERT_DETAILS detail,TBL_CMS_CERTIFICATES cert where cert.CREATOR_CUID='" + cuid + "'AND "+"cert.SERIAL_NO='"+serialno+"' AND cert.ISSUER='"+issuer+"' AND cert.CERT_SEQ_NU= "+seqnum;
		    //String location ="select detail.RAW_CERTIFICATE from TBL_CMS_CERT_DETAILS detail,TBL_CMS_CERTIFICATES cert where cert.SERIAL_NO='"+serialno+"' AND cert.ISSUER='"+issuer+"' AND cert.CERT_SEQ_NU= "+seqnum;
		    //String location ="select detail.RAW_CERTIFICATE from TBL_CMS_CERT_DETAILS detail,TBL_CMS_CERTIFICATES cert where detail.SERIALNO=3 AND detail.ISSUER='Qwest2311' and cert.CERT_SEQ_NU=117";
		    String location ="select detail.RAW_CERTIFICATE from "+CmsDbTable.TBL_CMS_CERT_DETAILS+" detail,"+CmsDbTable.TBL_CMS_CERTIFICATES+" cert where detail.SERIALNO='"+serialno+"' AND detail.ISSUER='"+issuer+"' AND cert.CERT_SEQ_NU= "+seqnum;
		    System.out.println("display the query"+location);
		    result = stmt.executeQuery(location);
		    while (result.next())
		     {	
		    	System.out.println("File name in DAO class iss-------------");
		    	String Certificate = result.getString(1);
		    	System.out.println("File name in DAO class iss-------------"+Certificate);
		    	return Certificate;
		     }
		   }catch (SQLException e) {
				//logger.	(e);      
		    	//throw  new RMSBaseException(e,"error.db.exception");
			} catch (Exception e) {
			//	logger.error(e);      
		    //	throw  new RMSBaseException(e,"error.db.exception");
			}finally {
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			}
		// return rcbsProject;
		return null;
		}
	
	public void deleteCertDAO(int i,String cuid)throws Exception,	SQLException 
	{
		/* HttpSession session = request.getSession();
		session.setAttribute("DetailInfo",cms); */
		//System.out.println("in session"+ session.getAttribute("checkedRadioValue"));
		CMSAction var = new CMSAction();
		
		 String result = null;
		 Connection conn = null;
		 Statement stmt = null;
		 ResultSet rs = null;
		 try
		{
			    String selectQuery = null; 
			    conn = dbConn.getConn(true);
			    stmt = conn.createStatement();
			    String delete ="delete from "+CmsDbTable.TBL_CMS_CERTIFICATES+" where CREATOR_CUID='" + cuid + "'  AND CERT_SEQ_NU= "+i;
			    //rs = stmt.executeQuery("SELECT APPLICATION_NAME FROM TBL_CMS_CERTIFICATES"+" WHERE"+ "CERT_SEQ_NU="+i);
			    //rs.getString("APPLICATION_NAME");
			    //String app = rs.getString("APPLICATION_NAME");
			    //System.out.println("APPLICATION_NAME in Functions DAO ------"+app);
			    
			    System.out.println(delete);
			   
			    stmt.executeUpdate(delete);
		    
			    //selectQuery = "delete from TBL_CMS_CERTIFICATES  WHERE  CERT_SEQ_NU="+i;
				//System.out.println("Select TBL_CMS_CERTIFICATES   query...."+selectQuery);
					
			    //result = stmt.executeQuery(selectQuery);
			    
			   // while (result.next())
				 //    {	
			    		// String[] certDetails = new String[2];	
			    		// System.out.println("ISSUER***********************"+result.getString("ISSUER"));
			    		 
			    		 //System.out.println("Issuer"+certDetails[0]);
			    		 //System.out.println("Issuer"+certDetails[1]);
			    		 //rcbsProject.add(certDetails);
			    		 //return sb;
				   //  }
			/*conn = dbConn.getConn(true);
		    stmt = conn.createStatement();
		    result = stmt.executeQuery("SELECT ISSUER,SERIAL_NO FROM TBL_CMS_CERTIFICATES  WHERE  CERT_SEQ_NU=101");
		    
		    while (result.next())
			     {
		    	  String issuer = (String)result.getString("ISSUER");
		    	  System.out.println("ISSUER******"+issuer);
		    	  String serialno = (String)result.getString("SERIAL_NO");
		    	  System.out.println("Serial No "+serialno);
		    	  return issuer ;
		     	 }  */
			 
	
		   }catch (SQLException e) {
		       System.out.println("SQL exp ==>"+e.getMessage());
		       e.printStackTrace();
				//logger.	(e);      
		    	//throw  new RMSBaseException(e,"error.db.exception");
			} catch (Exception e) {
			    e.printStackTrace();
			//	logger.error(e);      
		    //	throw  new RMSBaseException(e,"error.db.exception");
			}finally {
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			}
		//return null;
	}
	public String getAuthType(String appName,String acronym,String cuid,int i)throws Exception,	SQLException 
	{
		CMSAction var = new CMSAction();
		String result = null;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try
		{
			    String selectQuery = null; 
			    conn = dbConn.getConn(true);
			    stmt = conn.createStatement();
			    System.out.println("Application Name in DAo class ----------"+appName);
			    System.out.println("Acronym  Name in DAo class ----------"+acronym);
			    rs = stmt.executeQuery("select AUTH_TYPE from "+CmsDbTable.TBL_CMS_APP_MEMBER+" where APPLICATION_NAME='" + appName + "'  AND ACRONYM= '"+acronym+"'  AND MEMBER_CUID='" +cuid+"'");
			    while (rs.next())
			    {
			    	String auth = rs.getString("AUTH_TYPE");
			    	if (auth.equals("A"))
			    	{
			    		deleteCertDAO(i, cuid);
			    	}
			    	else
			    		
			    	System.out.println("Auth Type in DAO class --------------"+auth);
			    	return auth;
			    }
			 
	
		   }catch (SQLException e) {
		       System.out.println("SQL exp ==>"+e.getMessage());
		       e.printStackTrace();
				//logger.	(e);      
		    	//throw  new RMSBaseException(e,"error.db.exception");
			} catch (Exception e) {
			    e.printStackTrace();
			//	logger.error(e);      
		    //	throw  new RMSBaseException(e,"error.db.exception");
			}finally {
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			}
		//return null;
		return result;
	}
	
}