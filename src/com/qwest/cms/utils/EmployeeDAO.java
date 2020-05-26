/**
 * 
 */
package com.qwest.cms.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
  
/**
 * @author rkuckia
 *
 */

public class EmployeeDAO {
	
	public Connection getConnection(){
		Connection connection=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");		
			String url ="jdbc:oracle:thin:@XBAN2K3DBA01:1521:tracker";
			String userId="humanres";
			String passwd="humanres";

			connection = DriverManager.getConnection(url,userId,passwd);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return connection;
	}
	
	public String[] getData(String query){
		ResultSet resultSet = null;
		Connection connection = null;
		Statement stmt = null;
		//ArrayList employeeDataList = new ArrayList();
		String[] strEmployeeData = new String[25];
		connection=getConnection();
		try {
			stmt = connection.createStatement();
			resultSet=stmt.executeQuery(query);
			while(resultSet.next()){
			 strEmployeeData[0] = resultSet.getString(1);
			 strEmployeeData[1] = resultSet.getString(2);
			 strEmployeeData[2] = resultSet.getString(3);
			 strEmployeeData[3] = resultSet.getString(4);
			 strEmployeeData[4] = resultSet.getString(5);
			 strEmployeeData[5] = resultSet.getString(6);
			 strEmployeeData[6] = resultSet.getString(7);
			 strEmployeeData[7] = resultSet.getString(8);
			 strEmployeeData[8] = resultSet.getString(9);
			 strEmployeeData[9] = resultSet.getString(10);
			 strEmployeeData[10] = resultSet.getString(11);
			 strEmployeeData[11] = resultSet.getString(12);
			 strEmployeeData[12] = resultSet.getString(13);
			 strEmployeeData[13] = resultSet.getString(14);
			 strEmployeeData[14] = resultSet.getString(15);
			 strEmployeeData[15] = resultSet.getString(16);
			 strEmployeeData[16] = resultSet.getString(17);
			 strEmployeeData[17] = resultSet.getString(18);
			 strEmployeeData[18] = resultSet.getString(19);
			 strEmployeeData[19] = resultSet.getString(20);
			 strEmployeeData[20] = resultSet.getString(21);
			 strEmployeeData[21] = resultSet.getString(22);
			 strEmployeeData[22] = resultSet.getString(23);
			// strEmployeeData[23] = resultSet.getString(7);
			 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return strEmployeeData;
		
	}
	
	public String getDesignation (String query){
		ResultSet resultSet = null;
		Connection connection = null;
		Statement stmt = null;
		String designation=null;
		connection=getConnection();
		try {
			stmt = connection.createStatement();
			resultSet=stmt.executeQuery(query);
			while(resultSet.next()){
				designation=resultSet.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return designation;
				
	}
	
	//Start ( Next Hierarchy for particular CUID.)
	
	public String getNextHierarchy (String query){
		ResultSet resultSet = null;
		Connection connection = null;
		Statement stmt = null;
		String nextHierarchy = null;
		connection=getConnection();
		try {
			stmt = connection.createStatement();
			resultSet=stmt.executeQuery(query);
			while(resultSet.next()){
				nextHierarchy = resultSet.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nextHierarchy;
				
	}
	
	//End (Next Hierarchy)

}
