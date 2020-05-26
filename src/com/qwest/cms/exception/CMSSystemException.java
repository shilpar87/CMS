package com.qwest.cms.exception;

public class CMSSystemException extends CMSBaseException {
	private String errorCode = null;

	public CMSSystemException() {
		super();
	}

	public CMSSystemException(String s) {
		super(s);
	}

	public CMSSystemException(Exception e) {
		super(e);
	}

	public CMSSystemException(Exception e, String s) {
		super(e, s);
	}
	
	public CMSSystemException(String s, String errorCd) {
		super(s);
		setErrorCode(errorCd);
	}
	

	/**
	 * Returns the errorCode.
	 * @return String
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * Sets the errorCode.
	 * @param errorCode The errorCode to set
	 */
	public void setErrorCode(String ecode) {
		this.errorCode = ecode;
	}
}
