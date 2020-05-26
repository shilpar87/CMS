package com.qwest.cms.exception;

public class CMSUserException extends CMSBaseException{
	
	public CMSUserException() {
		super();
	}

	public CMSUserException(String s) {
		super(s);
	}

	public CMSUserException(Exception e) {
		super(e);
	}

	public CMSUserException(Exception e, String s) {
		super(e, s);
	}

}
