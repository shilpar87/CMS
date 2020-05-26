package com.qwest.cms.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.apache.log4j.Logger;


/**
 * @author Prashanth Surya
 *
 */

public class CMSBaseException  extends Exception {
	 private String m_stackTrace = null;

	 public CMSBaseException() {
	      super();
	   }

	   public CMSBaseException(String s) {
	      super(s);
	     m_stackTrace=s;
	   }

	   public CMSBaseException(Exception e) {
	      super(getExceptionMessage(e));
	      setStackTrace(e);
	   }

	   public CMSBaseException(Exception e, String s) {
	      super(s + getExceptionMessage(e));
	      System.out.println("String--->"+e);
	      setStackTrace(e);
	   }

	   public String getStackTrce() {
	      return m_stackTrace;
	   }


	   private void setStackTrace(Exception e) {
	      m_stackTrace =
	         "\n********** STACK TRACE FOLLOWS **************\n"
	            + printStackTraceToString(e)
	            + "\n********** END OF STACK TRACE  **************\n";
	   }

	   private static String getExceptionMessage(Exception e) {
	      if (e == null) {
	         return "";
	      }
	      StringBuffer msg = new StringBuffer("\n");
	      msg.append(e.getClass().getName());
	      if (e.getMessage() != null) {
	         msg.append(": ");
	         msg.append(e.getMessage());
	      }
	      msg.append("  ");
	      return msg.toString();
	   }
	   public static String printStackTraceToString(Exception exc)
	    {
	        StringWriter writer = new StringWriter();
	        if(exc != null){        
	        	exc.printStackTrace(new PrintWriter(writer));
	        }
	        
	        String trace = "Stack trace follows\n" + writer + "\nend of stack trace\n";
	        return trace;
	    }
}
