/*
 * Created on Feb 20, 2008
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */ 
package com.qwest.cms.actionForm;


import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;
import org.apache.struts.validator.ValidatorForm;

/**
 * @author ipatan
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class CMSToolForm extends ValidatorForm{
    
    private String pubKeyCrtPath;
    private String sigAlgorithm;
    private String cert_validity;
    private String comName;
    private String orgUnit;
    private String orgName;
    private String locName;
    private String state;
    private String country;
    private String email;
    private String keyName;
    private String keyAlg;
    private String keySize;
    private FormFile crtfile;
    private FormFile xlFile;
    private String crttest;
    private String pubKey;
    private String priKey;
    private String appName;
    private String appServer;
    private String aipName;
    private String mailMessage;
    private String appUserName;
    private String notes;
    private String acroNym;
    
    private String certName;
    private String certNickName;
    private String hostID;
    private String hostIP;
    private String certType;
    private String loadNotes;
    
    /** LOAD_CERTS_FROM_EXCEL **/
    
    private String reqID;
    private String reqName;
    private String binaryCert;
    private String certTemp;
    private String serialNo;
    private String certEffDate;
    private String certExpDate;
    private String issuedCountry;
    private String issuedOrg;
    private String issuedOrgUnit;
    private String issuedCommonName;
    private String issuedCity;
    private String issuedState;
    private String issuedEmail;
    private String status;
    private String path;
    
    
    
	public void reset(ActionMapping arg0, HttpServletRequest arg1) {
		// TODO Auto-generated method stub
		//super.reset(arg0, arg1);
		//this.setCuid("");
		//this.password = "";
		this.pubKeyCrtPath = null;
	    this.sigAlgorithm = null;
	    this.cert_validity = null;
	    this.comName = null;
	    this.orgUnit = null;
	    this.orgName = null;
	    this.locName = null;
	    this.state = null;
	    this.country = null;
	    this.email = null;
	    this.keyName = null;
	    this.keyAlg = null;
	    this.keySize = null;
	    this.crtfile = null;
	    this.crttest = null;
	    this.pubKey = null;
	    this.priKey = null;
	    this.appName = null;
	    this.appServer = null;
	    this.aipName = null;
	    this.mailMessage = null;
	    this.appUserName = null;
	    this.notes = null;
	    this.acroNym=null;
		
	    this.certName = null;
	    this.certNickName = null;
	    this.hostID = null;
	    this.hostIP = null;
	    this.certType = null;
	    this.loadNotes = null;
	    this.xlFile=null;
	    
	    
	    this.reqID=null;
	    this.reqName=null;
	    this.binaryCert=null;
	    this.certTemp=null;
	    this.serialNo=null;
	    this.certEffDate=null;
	    this.certExpDate=null;
	    this.issuedCountry=null;
	    this.issuedOrg=null;
	    this.issuedOrgUnit=null;
	    this.issuedCommonName=null;
	    this.issuedCity=null;
	    this.issuedState=null;
	    this.issuedEmail=null;
	    this.status=null;

	    this.path=null;
	}
    
    /**
     * @return Returns the crtfile.
     */
    public FormFile getCrtfile() {
        return crtfile;
    }
    /**
     * @param crtfile The crtfile to set.
     */
    public void setCrtfile(FormFile crtfile) {
        this.crtfile = crtfile;
    }
    /**
     * @return Returns the cert_validity.
     */
    public String getCert_validity() {
        return cert_validity;
    }
    /**
     * @param cert_validity The cert_validity to set.
     */
    public void setCert_validity(String cert_validity) {
        this.cert_validity = cert_validity;
    }
    /**
     * @return Returns the comName.
     */
    public String getComName() {
        return comName;
    }
    /**
     * @param comName The comName to set.
     */
    public void setComName(String comName) {
        this.comName = comName;
    }
    /**
     * @return Returns the country.
     */
    public String getCountry() {
        return country;
    }
    /**
     * @param country The country to set.
     */
    public void setCountry(String country) {
        this.country = country;
    }
    /**
     * @return Returns the email.
     */
    public String getEmail() {
        return email;
    }
    /**
     * @param email The email to set.
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * @return Returns the locName.
     */
    public String getLocName() {
        return locName;
    }
    /**
     * @param locName The locName to set.
     */
    public void setLocName(String locName) {
        this.locName = locName;
    }
    /**
     * @return Returns the orgName.
     */
    public String getOrgName() {
        return orgName;
    }
    /**
     * @param orgName The orgName to set.
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }
    /**
     * @return Returns the orgUnit.
     */
    public String getOrgUnit() {
        return orgUnit;
    }
    /**
     * @param orgUnit The orgUnit to set.
     */
    public void setOrgUnit(String orgUnit) {
        this.orgUnit = orgUnit;
    }
    /**
     * @return Returns the state.
     */
    public String getState() {
        return state;
    }
    /**
     * @param state The state to set.
     */
    public void setState(String state) {
        this.state = state;
    }
    /**
     * @param cert_validity
     */
    public CMSToolForm() {
        super();
        
    }


    /**
     * To perform form level validation
     */
    public ActionErrors validate(ActionMapping mapping,HttpServletRequest request) {

        ActionErrors errors = new ActionErrors();	
       /* if(this.getCuid() == null ||this.getCuid().equals("") || this.getCuid().trim().length() == 0){
	                errors.add("Login" , new ActionError("error.login"));
	         }*/
	            
        return errors;
    }

    /**
     * @return Returns the pubKeyCrt.
     */
    public String getPubKeyCrtPath() {
        System.out.println(" in beean get method");
        return pubKeyCrtPath;
    }
    /**
     * @param pubKeyCrt The pubKeyCrt to set.
     */
    public void setPubKeyCrtPath(String pubKeyCrtPath) {
        System.out.println(" in beean set callss");
        this.pubKeyCrtPath = pubKeyCrtPath;
    }
    /**
     * @return Returns the sigAlgorithm.
     */
    public String getSigAlgorithm() {
        return sigAlgorithm;
    }
    /**
     * @param sigAlgorithm The sigAlgorithm to set.
     */
    public void setSigAlgorithm(String sigAlgorithm) {
        this.sigAlgorithm = sigAlgorithm;
    }
    /**
     * @return Returns the keyAlg.
     */
    public String getKeyAlg() {
        return keyAlg;
    }
    /**
     * @param keyAlg The keyAlg to set.
     */
    public void setKeyAlg(String keyAlg) {
        this.keyAlg = keyAlg;
    }
    /**
     * @return Returns the keyName.
     */
    public String getKeyName() {
        return keyName;
    }
    /**
     * @param keyName The keyName to set.
     */
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }
    /**
     * @return Returns the keySize.
     */
    public String getKeySize() {
        return keySize;
    }
    /**
     * @param keySize The keySize to set.
     */
    public void setKeySize(String keySize) {
        this.keySize = keySize;
    }
    /**
     * @return Returns the crttest.
     */
    public String getCrttest() {
        return crttest;
    }
    /**
     * @param crttest The crttest to set.
     */
    public void setCrttest(String crttest) {
        this.crttest = crttest;
    }
    /**
     * @return Returns the priKey.
     */
    public String getPriKey() {
        return priKey;
    }
    /**
     * @param priKey The priKey to set.
     */
    public void setPriKey(String priKey) {
        this.priKey = priKey;
    }
    /**
     * @return Returns the pubKey.
     */
    public String getPubKey() {
        return pubKey;
    }
    /**
     * @param pubKey The pubKey to set.
     */
    public void setPubKey(String pubKey) {
        this.pubKey = pubKey;
    }
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppServer() {
		return appServer;
	}
	public void setAppServer(String appServer) {
		this.appServer = appServer;
	}
	public String getAipName() {
		return aipName;
	}
	public void setAipName(String aipName) {
		this.aipName = aipName;
	}
	public String getMailMessage() {
		return mailMessage;
	}
	public void setMailMessage(String mailMessage) {
		this.mailMessage = mailMessage;
	}
	public String getAppUserName() {
		return appUserName;
	}
	public void setAppUserName(String appUserName) {
		this.appUserName = appUserName;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getCertName() {
		return certName;
	}

	public void setCertName(String certName) {
		this.certName = certName;
	}

	public String getCertNickName() {
		return certNickName;
	}

	public void setCertNickName(String certNickName) {
		this.certNickName = certNickName;
	}

	public String getHostID() {
		return hostID;
	}

	public void setHostID(String hostID) {
		this.hostID = hostID;
	}

	public String getHostIP() {
		return hostIP;
	}

	public void setHostIP(String hostIP) {
		this.hostIP = hostIP;
	}

	public String getCertType() {
		return certType;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getLoadNotes() {
		return loadNotes;
	}

	public void setLoadNotes(String loadNotes) {
		this.loadNotes = loadNotes;
	}

	public String getAcroNym() {
	    return acroNym;
	}

	public void setAcroNym(String acroNym) {
	    this.acroNym = acroNym;
	}

	public FormFile getXlFile() {
	    return xlFile;
	}

	public void setXlFile(FormFile xlFile) {
	    this.xlFile = xlFile;
	}

	public String getReqID() {
	    return reqID;
	}

	public void setReqID(String reqID) {
	    this.reqID = reqID;
	}

	public String getReqName() {
	    return reqName;
	}

	public void setReqName(String reqName) {
	    this.reqName = reqName;
	}

	public String getBinaryCert() {
	    return binaryCert;
	}

	public void setBinaryCert(String binaryCert) {
	    this.binaryCert = binaryCert;
	}

	public String getCertTemp() {
	    return certTemp;
	}

	public void setCertTemp(String certTemp) {
	    this.certTemp = certTemp;
	}

	public String getSerialNo() {
	    return serialNo;
	}

	public void setSerialNo(String serialNo) {
	    this.serialNo = serialNo;
	}

	public String getCertEffDate() {
	    System.out.println("certExpDate ======== "+certEffDate);
	    return certEffDate;
	}

	public void setCertEffDate(String certEffDate) {
	    this.certEffDate = certEffDate;
	}

	public String getCertExpDate() {
	    System.out.println("certExpDate ======== "+certExpDate);
	    return certExpDate;
	}

	public void setCertExpDate(String certExpDate) {
	    this.certExpDate = certExpDate;
	}

	public String getIssuedCountry() {
	    return issuedCountry;
	}

	public void setIssuedCountry(String issuedCountry) {
	    this.issuedCountry = issuedCountry;
	}

	public String getIssuedOrg() {
	    return issuedOrg;
	}

	public void setIssuedOrg(String issuedOrg) {
	    this.issuedOrg = issuedOrg;
	}

	public String getIssuedOrgUnit() {
	    return issuedOrgUnit;
	}

	public void setIssuedOrgUnit(String issuedOrgUnit) {
	    this.issuedOrgUnit = issuedOrgUnit;
	}

	public String getIssuedCommonName() {
	    return issuedCommonName;
	}

	public void setIssuedCommonName(String issuedCommonName) {
	    this.issuedCommonName = issuedCommonName;
	}

	public String getIssuedCity() {
	    return issuedCity;
	}

	public void setIssuedCity(String issuedCity) {
	    this.issuedCity = issuedCity;
	}

	public String getIssuedState() {
	    return issuedState;
	}

	public void setIssuedState(String issuedState) {
	    this.issuedState = issuedState;
	}

	public String getIssuedEmail() {
	    return issuedEmail;
	}

	public void setIssuedEmail(String issuedEmail) {
	    this.issuedEmail = issuedEmail;
	}

	public String getPath() {
	    return path;
	}

	public void setPath(String path) {
	    this.path = path;
	}

	public String getStatus() {
	    return status;
	}

	public void setStatus(String status) {
	    this.status = status;
	}
}
