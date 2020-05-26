/**
 * 
 */
package com.qwest.cms.BO;

/**
 * @author aadeppa
 *
 */
public class BOClass {
	private String rawcert;

	public String getRawcert() {
		
		return rawcert;
		
	}
	
	

	public void setRawcert(String rawcert) {
		System.out.println("In BO class checking for values"+rawcert);
		this.rawcert = rawcert;
	}

		

}
