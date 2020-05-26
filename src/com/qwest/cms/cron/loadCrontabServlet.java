package com.qwest.cms.cron;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

//import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.jcrontab.Crontab;
import org.jcrontab.log.Log;

/**
 * @author $Author: rwaheng $
 * @version $Revision: 1.27 $
 */
public class loadCrontabServlet extends HttpServlet {
	
    private Crontab crontab = null;
        /** Refer to Servlet Javadoc
         * This method is invoked by the Servlet container
		 * When the app-server starts.
         * @param config The ServletConfig
         */ 
   /// private static Logger logger = Logger.getLogger(new Object().getClass().getName());
    
	public void init(ServletConfig config) throws ServletException{
		super.init(config);
		Properties logProperties = new Properties();
		String log4jprop=getServletConfig().getServletContext().getRealPath("properties/log4j.properties").replace('\\','/');
	    System.out.println("CRON "+log4jprop);
		//try
	   // {
	    //  logProperties.load(new FileInputStream(log4jprop));
	    //  PropertyConfigurator.configure(logProperties);
	    //  log.info("Logging initialized.");
	   // }
	   // catch(IOException e)
	   // {
	   //   throw new RuntimeException("Unable to load logging property " + log4jprop);
	  //  }
		try {
			
			 
            		process();
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}

	protected InputStream createPropertiesStream(String name)
		throws IOException {
		return new FileInputStream(name);
	}
	 /** 
	  * This method  starts the Crontab and lets the system
	  * Continue without wasting more resources.
	  * This method can receive the config File as a variable in web.xml
	  */        
	public void process() {
       
		String path = getServletConfig().getServletContext().getRealPath("properties/jcrontab.properties");
		path=path.replace('\\','/');   		
        crontab = Crontab.getInstance();
        System.out.println(">>>>>>>>>>>>>>>>>."+path);
        try {
        	 crontab.getInstance().setDaemon(true);
			crontab.init(path);
			//logger.info("CronJob initialise  :"+path);
        } catch (Exception e) {
			// TODO Auto-generated catch block
        	//logger.error("CronJob initialise fail :"+e.getLocalizedMessage());
			System.out.println("exception"+path);
			e.printStackTrace();
		}

	}  

	
    /**
	 * This method seths a ShutdownHook to the system
	 *  This traps the CTRL+C or kill signal and shutdows 
	 * Correctly the system.
	 * @throws Exception
	 */ 
	 public void ShutdownHook() throws Exception {
             Runtime.getRuntime().addShutdownHook(new Thread() {         
	 	public void run() {
                doStop();
				}
			});
    }
     
    public void destroy() {
        doStop();
    }
    
    public void doStop() {
        	Log.info("Shutting down...");
			// stops the system in 100 miliseconds :-)
			crontab.uninit(100);
			
    }
}
