package com.qwest.cms.BO;

import java.io.Serializable;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;

public class CMSBO implements Serializable{
	
	/**** Certificate details ****/
    private String noCrtOfApp;  
    /**
     * @return Returns the noCrtOfApp.
     */
    public String getNoCrtOfApp() {
        return noCrtOfApp;
    }
    /**
     * @param noCrtOfApp The noCrtOfApp to set.
     */
    public void setNoCrtOfApp(String noCrtOfApp) {
        this.noCrtOfApp = noCrtOfApp;
    }
	private String pubKeyCrtPath;  
	private String raw_certificate;
	private String serialNo;
	private String cert_owner;
	private String company_name;
	private String cert_status;
	private String cert_version;
	private String subject;
	private String subject_DN;
	private String subject_CN;
	private String subject_O;
	private String subject_OU;
	private String subject_L;
	private String subject_S;
	private String subject_C;
	private String subject_E;
	private String issuer;
	private String issuer_CN;
	private String issuer_O;
	private String issuer_OU;
	private String issuer_L;
	private String issuer_S;
	private String issuer_C;
	private String issuer_E;
	private String public_key;
	private String signature_algo;
	private String signature;
	private String from_dt;
	private String expiry_dt;
	private String create_dt;
	private String mod_dt;
	private String daysDiff;
	private String version;
	private String notBefore;
	private String notAfter;
	private int hashCode;
	private String sigAlgParams;
	private String certificate;
	
	/**** Application Member details ****/
	private String appName;
	private String acronym;
	private String memberCuid;
	private String authType;
	
	/**** Application Owner details ****/
	private String creatorCuid;
	private String rcbsCode;
	private String rcbsMgrCuid;
	private String appUserName;
	
	/**** CMS Certificates data ****/
	private String hostId;
	private String hostIp;
	private String certNickname;
	private String createOn;
	private String expireOn;
	private String status;
	private String nickName;
	private String expDate;
	private String type;
	private String notes;
	private String certSeqNo;
	private String certType;
	private String certPathServer;
	
	/**** Application Member details ****/
	private String assignment;
	private String priBusUnit;
	private String suppDirector;
	private String suppManager;
	private String suppProjManager;
	private String appStatus;
	private String soxCritical;
	private String systemGroup;
	private String slrColor;
	
	/**** Certificate History details ****/
	private String modifiedCuid;
	private String modifiedDate;
	private String modifiedAction;
	/**** Certificate Function - delete ****/
	private String serialno;
	private String deleteissuer;

	/******* Group List  ******/
	private String groupName;
	private String selectGroup;
	
	/******* MAL_APP_HIERARCHY  ******/
	private String suppDir;
	private String suppMgr;
	private String suppProjMgr;
	private String devDirector;
	private String devMnanger;
	private String devProjMgr;
	
	/******* CSC_APP_INFO  ******/
	private String iD;
	private String serverName;
	private String netPin;
	private String firstContact;
	private String secondContact;
	private String appID;	
	
	/******* D_CERT_AUTO_ALARM ******/
	private String mgrName;
	
	private ArrayList appNames;
	
	   /** LOAD_CERTS_FROM_EXCEL **/
	    
	    private String reqID;
	    private String reqName;
	    private String binaryCert;
	    private String certTemp;
	    private String slNo;
	    private String certEffDate;
	    private String certExpDate;
	    private String issuedCountry;
	    private String issuedOrg;
	    private String issuedOrgUnit;
	    private String issuedCommonName;
	    private String issuedCity;
	    private String issuedState;
	    private String issuedEmail;
	    private String alarmFlag;
		
	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}


	public String getSelectGroup() {
		return selectGroup;
	}

	public void setSelectGroup(String selectGroup) {
		this.selectGroup = selectGroup;
	}
	
	




	public void reset(ActionMapping arg0, HttpServletRequest arg1) {
		// TODO Auto-generated method stub
		//super.reset(arg0, arg1);
		//this.setCuid("");
		//this.password = "";
		this.pubKeyCrtPath = null;
		this.raw_certificate = null;
		this.serialNo = null;
		this.cert_owner = null;
		this.company_name = null;
		this.cert_status = null;
		this.cert_version = null;
		this.subject = null;
		this.subject_CN = null;
		this.subject_O = null;
		this.subject_OU = null;
		this.subject_L = null;
		this.subject_S = null;
		this.subject_C = null;
		this.subject_E = null;
		this.issuer = null;
		this.issuer_CN = null;
		this.issuer_O = null;
		this.issuer_OU = null;
		this.issuer_L = null;
		this.issuer_S = null;
		this.issuer_C = null;
		this.issuer_E = null;
		this.public_key = null;
		this.signature_algo = null;
		this.signature = null;
		this.from_dt = null;
		this.expiry_dt = null;
		this.create_dt = null;
		this.mod_dt = null;
		this.daysDiff = null;
		
		this.appName= null;
		this.acronym= null;
		this.memberCuid= null;
		this.authType= null;
		
		/**** Application Owner details ****/
		this.creatorCuid= null;
		this.rcbsCode= null;
		
		/**** CMS Certificates data ****/
		this.hostId= null;
		this.hostIp= null;
		this.certNickname= null;
		this.createOn= null;
		this.expireOn= null;
		this.status= null;
		this.certPathServer= null;
		
		/**** Application Member details ****/
		this.assignment= null;
		this.priBusUnit= null;
		this.suppDirector= null;
		this.suppManager= null;
		this.suppProjManager= null;
		this.appStatus= null;
		this.soxCritical= null;
		this.systemGroup= null;
		this.slrColor= null;
		
		/**** Certificate History details ****/
		this.modifiedCuid= null;
		this.modifiedDate= null;
		this.modifiedAction= null;
		this.appNames = null;
		
		/******* MAL_APP_HIERARCHY  ******/
		this.suppDir = null;
		this.suppMgr = null;
		this.suppProjMgr= null;
		this.devDirector= null;
		this.devMnanger=null;
		this.devProjMgr=null;
		
		/******* CSC_APP_INFO  ******/
		this.iD = null;
		this.serverName = null;
		this.netPin = null;
		this.firstContact = null;
		this.secondContact = null;
		this.appID = null;
		
		/******* D_CERT_AUTO_ALARM ******/
		this.mgrName = null;
		
		
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
		    this.alarmFlag=null;
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
              return pubKeyCrtPath;
    }
    /**
     * @param pubKeyCrt The pubKeyCrt to set.
     */
    public void setPubKeyCrtPath(String pubKeyCrtPath) {
             this.pubKeyCrtPath = pubKeyCrtPath;
    }
    
    public String getRaw_certificate() {
		return raw_certificate;
	}

	public void setRaw_certificate(String raw_certificate) {
		this.raw_certificate = raw_certificate;
		//System.out.println("in cmsBO....."+raw_certificate);
	}

	public String getSerialNo() {
		//System.out.println("serialNo value in CMSBO**************"+serialNo);
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		//System.out.println("Setting Serial no in CMSBO"+serialNo);
		this.serialNo = serialNo;
	}

	public String getCert_owner() {
		return cert_owner;
	}

	public void setCert_owner(String cert_owner) {
		this.cert_owner = cert_owner;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getCert_status() {
		return cert_status;
	}

	public void setCert_status(String cert_status) {
		this.cert_status = cert_status;
	}

	public String getCert_version() {
		return cert_version;
	}

	public void setCert_version(String cert_version) {
		this.cert_version = cert_version;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getSubject_CN() {
		return subject_CN;
	}

	public void setSubject_CN(String subject_CN) {
		this.subject_CN = subject_CN;
	}

	public String getSubject_O() {
		return subject_O;
	}

	public void setSubject_O(String subject_O) {
		this.subject_O = subject_O;
	}

	public String getSubject_OU() {
		return subject_OU;
	}

	public void setSubject_OU(String subject_OU) {
		this.subject_OU = subject_OU;
	}

	public String getSubject_L() {
		return subject_L;
	}

	public void setSubject_L(String subject_L) {
		this.subject_L = subject_L;
	}

	public String getSubject_S() {
		return subject_S;
	}

	public void setSubject_S(String subject_S) {
		this.subject_S = subject_S;
	}

	public String getSubject_C() {
		return subject_C;
	}

	public void setSubject_C(String subject_C) {
		this.subject_C = subject_C;
	}

	public String getSubject_E() {
		return subject_E;
	}

	public void setSubject_E(String subject_E) {
		this.subject_E = subject_E;
	}

	public String getIssuer() {
		return issuer;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public String getIssuer_CN() {
		return issuer_CN;
	}

	public void setIssuer_CN(String issuer_CN) {
		this.issuer_CN = issuer_CN;
	}

	public String getIssuer_O() {
		return issuer_O;
	}

	public void setIssuer_O(String issuer_O) {
		this.issuer_O = issuer_O;
	}

	public String getIssuer_OU() {
		return issuer_OU;
	}

	public void setIssuer_OU(String issuer_OU) {
		this.issuer_OU = issuer_OU;
	}

	public String getIssuer_L() {
		return issuer_L;
	}

	public void setIssuer_L(String issuer_L) {
		this.issuer_L = issuer_L;
	}

	public String getIssuer_S() {
		return issuer_S;
	}

	public void setIssuer_S(String issuer_S) {
		this.issuer_S = issuer_S;
	}

	public String getIssuer_C() {
		return issuer_C;
	}

	public void setIssuer_C(String issuer_C) {
		this.issuer_C = issuer_C;
	}

	public String getIssuer_E() {
		return issuer_E;
	}

	public void setIssuer_E(String issuer_E) {
		this.issuer_E = issuer_E;
	}

	public String getPublic_key() {
		return public_key;
	}

	public void setPublic_key(String public_key) {
		this.public_key = public_key;
	}

	public String getSignature_algo() {
		return signature_algo;
	}

	public void setSignature_algo(String signature_algo) {
		this.signature_algo = signature_algo;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getFrom_dt() {
		return from_dt;
	}

	public void setFrom_dt(String from_dt) {
		this.from_dt = from_dt;
	}

	public String getExpiry_dt() {
		return expiry_dt;
	}

	public void setExpiry_dt(String expiry_dt) {
		this.expiry_dt = expiry_dt;
	}

	public String getCreate_dt() {
		return create_dt;
	}

	public void setCreate_dt(String create_dt) {
		this.create_dt = create_dt;
	}

	public String getMod_dt() {
		return mod_dt;
	}

	public void setMod_dt(String mod_dt) {
		this.mod_dt = mod_dt;
	}


	public String getAppName() {
		//System.out.println("Application Name in bean class-----------------------"+appName);
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAcronym() {
		//System.out.println("Acronym in CMSBO##############"+acronym);
		return acronym;
	}

	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}

	public String getMemberCuid() {
		return memberCuid;
	}

	public void setMemberCuid(String memberCuid) {
		this.memberCuid = memberCuid;
	}

	public String getAuthType() {
		return authType;
	}

	public void setAuthType(String authType) {
		this.authType = authType;
	}

	public String getCreatorCuid() {
		return creatorCuid;
	}

	public void setCreatorCuid(String creatorCuid) {
		this.creatorCuid = creatorCuid;
	}

	public String getRcbsCode() {
		return rcbsCode;
	}

	public void setRcbsCode(String rcbsCode) {
		this.rcbsCode = rcbsCode;
	}

	public String getHostId() {
		//System.out.println("HostID in CMSBO  "+hostId);
		return hostId;
	}

	public void setHostId(String hostId) {
		this.hostId = hostId;
	}
	
	public String getHostIp() {
		return hostIp;
	}
	public void setHostIp(String hostIp) {
		this.hostIp = hostIp;
	}
	public String getCertNickname() {
		return certNickname;
	}

	public void setCertNickname(String certNickname) {
		this.certNickname = certNickname;
	}

	public String getCreateOn() {
		return createOn;
	}

	public void setCreateOn(String createOn) {
		this.createOn = createOn;
	}

	public String getExpireOn() {
		return expireOn;
	}

	public void setExpireOn(String expireOn) {
		this.expireOn = expireOn;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAssignment() {
		return assignment;
	}

	public void setAssignment(String assignment) {
		this.assignment = assignment;
	}

	public String getPriBusUnit() {
		return priBusUnit;
	}

	public void setPriBusUnit(String priBusUnit) {
		this.priBusUnit = priBusUnit;
	}

	public String getSuppDirector() {
		return suppDirector;
	}

	public void setSuppDirector(String suppDirector) {
		this.suppDirector = suppDirector;
	}

	public String getSuppManager() {
		return suppManager;
	}

	public void setSuppManager(String suppManager) {
		this.suppManager = suppManager;
	}

	public String getSuppProjManager() {
		return suppProjManager;
	}

	public void setSuppProjManager(String suppProjManager) {
		this.suppProjManager = suppProjManager;
	}

	public String getAppStatus() {
		return appStatus;
	}

	public void setAppStatus(String appStatus) {
		this.appStatus = appStatus;
	}

	public String getSoxCritical() {
		return soxCritical;
	}

	public void setSoxCritical(String soxCritical) {
		this.soxCritical = soxCritical;
	}

	public String getSystemGroup() {
		return systemGroup;
	}

	public void setSystemGroup(String systemGroup) {
		this.systemGroup = systemGroup;
	}

	public String getSlrColor() {
		return slrColor;
	}

	public void setSlrColor(String slrColor) {
		this.slrColor = slrColor;
	}

	public String getModifiedCuid() {
		return modifiedCuid;
	}

	public void setModifiedCuid(String modifiedCuid) {
		this.modifiedCuid = modifiedCuid;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getModifiedAction() {
		return modifiedAction;
	}

	public void setModifiedAction(String modifiedAction) {
		this.modifiedAction = modifiedAction;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSerialno() {
		//System.out.println("serial no in BO class ***"+serialno);
		return serialno;
	}

	public String setSerialno(String serialno) {
		return this.serialno = serialno;
	}

	public String getDeleteissuer() {
		return deleteissuer;
	}

	public void setDeleteissuer(String deleteissuer) {
		this.deleteissuer = deleteissuer;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getRcbsMgrCuid() {
		return rcbsMgrCuid;
	}

	public void setRcbsMgrCuid(String rcbsMgrCuid) {
		this.rcbsMgrCuid = rcbsMgrCuid;
	}

	public String getCertSeqNo() {
		return certSeqNo;
	}

	public void setCertSeqNo(String certSeqNo) {
		this.certSeqNo = certSeqNo;
	}

	public String getCertType() {
		return certType;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getAppUserName() {
		//System.out.println("getting app user name"+appUserName);
		return appUserName;
	}

	public void setAppUserName(String appUserName) {
		//System.out.println("setting in app user name"+appUserName);
		this.appUserName = appUserName;
	}

	public String getDaysDiff() {
		return daysDiff;
	}

	public void setDaysDiff(String daysDiff) {
		this.daysDiff = daysDiff;
	}
	public ArrayList getAppNames() {
		return appNames;
	}
	public void setAppNames(ArrayList appNames) {
		this.appNames = appNames;
	}
	public String getSuppDir() {
		return suppDir;
	}
	public void setSuppDir(String suppDir) {
		this.suppDir = suppDir;
	}
	public String getSuppMgr() {
		return suppMgr;
	}
	public void setSuppMgr(String suppMgr) {
		this.suppMgr = suppMgr;
	}
	public String getSuppProjMgr() {
		return suppProjMgr;
	}
	public void setSuppProjMgr(String suppProjMgr) {
		this.suppProjMgr = suppProjMgr;
	}
	public String getDevDirector() {
		return devDirector;
	}
	public void setDevDirector(String devDirector) {
		this.devDirector = devDirector;
	}
	public String getDevMnanger() {
		return devMnanger;
	}
	public void setDevMnanger(String devMnanger) {
		this.devMnanger = devMnanger;
	}
	public String getDevProjMgr() {
		return devProjMgr;
	}
	public void setDevProjMgr(String devProjMgr) {
		this.devProjMgr = devProjMgr;
	}
	public String getID() {
	    return iD;
	}
	public void setID(String id) {
	    iD = id;
	}
	public String getServerName() {
	    return serverName;
	}
	public void setServerName(String serverName) {
	    this.serverName = serverName;
	}
	public String getNetPin() {
	    System.out.println("netPin in cmsbo   "+netPin);
	    return netPin;
	}
	public void setNetPin(String netPin) {
	    this.netPin = netPin;
	}
	public String getFirstContact() {
	    return firstContact;
	}
	public void setFirstContact(String firstContact) {
	    this.firstContact = firstContact;
	}
	public String getSecondContact() {
	    return secondContact;
	}
	public void setSecondContact(String secondContact) {
	    this.secondContact = secondContact;
	}
	public String getAppID() {
	    return appID;
	}
	public void setAppID(String appID) {
	    this.appID = appID;
	}
	public String getMgrName() {
	    return mgrName;
	}
	public void setMgrName(String mgrName) {
	    this.mgrName = mgrName;
	}
	public String getCertPathServer() {
	    return certPathServer;
	}
	public void setCertPathServer(String certPathServer) {
	    this.certPathServer = certPathServer;
	}
	public String getVersion() {
	    return version;
	}
	public void setVersion(String version) {
	    this.version = version;
	}
	public String getSubject_DN() {
	    return subject_DN;
	}
	public void setSubject_DN(String subject_DN) {
	    this.subject_DN = subject_DN;
	}
	public String getNotBefore() {
	    return notBefore;
	}
	public void setNotBefore(String notBefore) {
	    this.notBefore = notBefore;
	}
	public String getNotAfter() {
	    return notAfter;
	}
	public void setNotAfter(String notAfter) {
	    this.notAfter = notAfter;
	}
	public int getHashCode() {
	    return hashCode;
	}
	public void setHashCode(int hashCode) {
	    this.hashCode = hashCode;
	}
	public String getSigAlgParams() {
	    return sigAlgParams;
	}
	public void setSigAlgParams(String sigAlgParams) {
	    this.sigAlgParams = sigAlgParams;
	}
	public String getCertificate() {
	    return certificate;
	}
	public void setCertificate(String certificate) {
	    this.certificate = certificate;
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
	public String getSlNo() {
	    return slNo;
	}
	public void setSlNo(String slNo) {
	    this.slNo = slNo;
	}
	public String getCertEffDate() {
	    return certEffDate;
	}
	public void setCertEffDate(String certEffDate) {
	    this.certEffDate = certEffDate;
	}
	public String getCertExpDate() {
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
	public String getAlarmFlag() {
	    return alarmFlag;
	}
	public void setAlarmFlag(String alarmFlag) {
	    this.alarmFlag = alarmFlag;
	}

	
}
