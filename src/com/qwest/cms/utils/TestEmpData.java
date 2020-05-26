package com.qwest.cms.utils;

public class TestEmpData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails emp=new EmployeeDetails();
		Employeedata  data=emp.getNextInHierarchy("BHATNAGH");
		Employeedata  data1=emp.getEmployeeDetails("BVISVAN");
		System.out.println("name="+data.getName());
		System.out.println("cuid="+data1.getCuid());
		System.out.println("doj="+data1.getDOJ());
		System.out.println("empid="+data1.getEmp_id());
		System.out.println("division="+data1.getDivision());
		System.out.println("emptype="+data1.getEmpType());
		System.out.println("designation="+data1.getJobtitle());
		System.out.println("impCuid="+data1.getImmSupCuid());
		System.out.println("impName="+data1.getImmSupName());
		System.out.println("impDesg="+data1.getImmSupDesignation());
		System.out.println("impDiv="+data1.getImmSupDivision());
		System.out.println("impType="+data1.getImmSupEmpType());
		System.out.println("managerCuid="+data1.getManagerCuid());
		System.out.println("ManagerName="+data1.getManagerName());
		System.out.println("managerDesg="+data1.getManagerDesignation());
		System.out.println("ManagerDiv="+data1.getManagerDivision());
		System.out.println("managerEmpType="+data1.getManagerEmpType());
		System.out.println("directorCuid="+data1.getDirectorCuid());
		System.out.println("directorName="+data1.getDirectorName());
		System.out.println("directorDesg="+data1.getDirectorDesignation());
		System.out.println("directorDiv="+data1.getDirectorDivision());
		System.out.println("directorType"+data1.getDirectorEmpType());

	}

}
