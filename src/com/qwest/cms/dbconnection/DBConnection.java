package com.qwest.cms.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.apache.log4j.Category;

import com.qwest.cms.action.CMSAction;

public class DBConnection {
	private static DBConnection dbConn;
	Logger logger=Logger.getLogger(DBConnection.class);

	private DBConnection() {

	}

	public static DBConnection getInstance() {
		if (dbConn == null) {
			dbConn = new DBConnection();
		}
		return dbConn;
	}

	public Connection getConn(boolean flag) throws SQLException {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@suomt79i.dev.qintra.com:1521:stub5", "certmgmt",
					"certmgmt");

			Context ctx = new InitialContext();
		    if(ctx == null ) 
		          throw new Exception(" No Context");
		    
		    DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/CERTMGMT");
		    conn = ds.getConnection();
		    if (ds == null) {
		      	  throw new Exception(" No Datasource found  ");		    		
		    }
		    
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DBConn.getConn()1 exception connecting to DB");
			logger.error("DBConn.getConn()1 exception connecting to DB");
			// throw new Exception("Error ! while opening connection * "+e);
		}
		return conn;

	}











}
