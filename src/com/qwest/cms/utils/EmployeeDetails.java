/**
 * 
 */
package com.qwest.cms.utils;

import java.util.ArrayList;

import org.apache.log4j.Logger;

//import com.qwest.ems.action.EMSAction;

/**
 * @author rkuckia
 *
 */
public class EmployeeDetails {
	
	/**
	 * @param empCuid
	 * @return EmployeeData
	 */
	Logger logger = Logger.getLogger(EmployeeDetails.class);
	String[] strEmployeeData= null;
	String query ="";
	Employeedata employeeData = null;
	
	public Employeedata getNextInHierarchy (String empCuid){
		query = "SELECT RES_NAME, RES_CUID, EMP_NO, to_char(DOJ,'DD-Mon-yyyy'), to_char(DOL,'DD-Mon-yyyy'), DESIGNATION, DIVISION, EMP_TYPE, IMM_SUP_CUID, IMM_SUP_NAME, IMM_SUP_DESIGNATION, IMM_SUP_DIVISION, IMM_SUP_EMPTYPE, MGR_CUID, MGR_NAME, MGR_DESIGNATION, MGR_DIVISION, MGR_EMPTYPE, DIR_CUID, DIR_NAME, DIR_DESIGNATION, DIR_DIVISION, DIR_EMPTYPE FROM emp_details_view@PMTLINK where upper(res_cuid)=(select imm_sup_cuid from emp_details_view@PMTLINK where upper(RES_CUID)='"+empCuid.toUpperCase()+"'"+" and DOL is NULL"+")";
	    logger.info("getNextInHierarchy qry="+query);
	    System.out.println("getNextInHierarchy qry="+query);
		EmployeeDAO employeeDAO = new EmployeeDAO();
		strEmployeeData= employeeDAO.getData(query);
		
		employeeData=setEmployeeData(strEmployeeData);
		
		return employeeData;
	}
	
	/**
	 * @param empCuid
	 * @return EmployeeData
	 */
	public Employeedata getEmployeeDetails (String empCuid){
		query = "SELECT RES_NAME, RES_CUID, EMP_NO, to_char(DOJ,'DD-Mon-yyyy'), to_char(DOL,'DD-Mon-yyyy'), DESIGNATION, DIVISION, EMP_TYPE, IMM_SUP_CUID, IMM_SUP_NAME, IMM_SUP_DESIGNATION, IMM_SUP_DIVISION, IMM_SUP_EMPTYPE, MGR_CUID, MGR_NAME, MGR_DESIGNATION, MGR_DIVISION, MGR_EMPTYPE, DIR_CUID, DIR_NAME, DIR_DESIGNATION, DIR_DIVISION, DIR_EMPTYPE FROM emp_details_view@PMTLINK where upper(res_cuid)='"+empCuid.toUpperCase()+"'"+" and DOL is NULL";
		logger.info("getEmployeeDetails qry="+query);
		System.out.println("getEmployeeDetails qry="+query);
		EmployeeDAO employeeDAO = new EmployeeDAO();
		strEmployeeData= employeeDAO.getData(query);
		employeeData=setEmployeeData(strEmployeeData);
		
		return employeeData;
	}
	
	/**
	 * @param str
	 * @return EmployeeData
	 */
	public Employeedata setEmployeeData (String str[]){
		
		employeeData = new Employeedata();
		employeeData.setName(strEmployeeData[0]);
		employeeData.setCuid(strEmployeeData[1]);
		if(strEmployeeData[1]!=null)
			employeeData.setEmp_id(Integer.parseInt(strEmployeeData[2]));
		
		employeeData.setDOJ(strEmployeeData[3]);
		employeeData.setTerminationDate(strEmployeeData[4]);
		employeeData.setJobtitle(strEmployeeData[5]);
		employeeData.setDivision(strEmployeeData[6]);
		employeeData.setEmpType(strEmployeeData[7]);
		
		employeeData.setImmSupCuid(strEmployeeData[8]);
		employeeData.setImmSupName(strEmployeeData[9]);
		employeeData.setImmSupDesignation(strEmployeeData[10]);
		employeeData.setImmSupDivision(strEmployeeData[11]);
		employeeData.setImmSupEmpType(strEmployeeData[12]);
		employeeData.setManagerCuid(strEmployeeData[13]);
		employeeData.setManagerName(strEmployeeData[14]);
		employeeData.setManagerDesignation(strEmployeeData[15]);
		employeeData.setManagerDivision(strEmployeeData[16]);
		employeeData.setManagerEmpType(strEmployeeData[17]);
		employeeData.setDirectorCuid(strEmployeeData[18]);
		employeeData.setDirectorName(strEmployeeData[19]);
		employeeData.setDirectorDesignation(strEmployeeData[20]);
		employeeData.setDirectorDivision(strEmployeeData[21]);
		employeeData.setDirectorEmpType(strEmployeeData[22]);
		
		return employeeData;	
	}

}
