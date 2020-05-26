
package com.qwest.cms.actionForm;


import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;

/**
 * @author ipatan
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class CMSFormBean extends ValidatorForm{
    
    
    	private String expBefDate;
    	private String expAfterDate;
	private String certName;
	private String nickName;
	private String status;
	private String type;
	private String appName;
	private String acronym;
	private String appList;
	private String acronymList;
	private String serialNo;
	private String serverName;
	private String appSearch;
	private String appNames;
	private String statusDropDown;
	
	/*******   Group Name   *******/
	private String groupNameSelect;
	private String groupString;
	private String memberCuid;
	private String creatorCuid;
	private String noCrtOfApp;
	private String rcbsCode;
	private String rcbsMgrCuid;
	private String memberCuidList;
	private String appUserName;

	private String notifyCuid;
	private String alarmTime;
	private String alarmFreq;
	/******* Group List  ******/
	private String groupId;
	private String selectGroupName;
	private String rcbsMbrCuid;
	private String auth_type;
	private String hostID;
	
	/******* CSC_APP_INFO  ******/
	private String appId;
	private String serName;
	private String netPin;
	private String firstContact;
	private String secondContact;
	
	private String errMess;
	private String mgrName;
	
	
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
	    
	    private String selName;
	    private String reqString;
	    private String selCN;
	    

	public void reset(ActionMapping arg0, HttpServletRequest arg1) {
		// TODO Auto-generated method stub
		//super.reset(arg0, arg1);
		//this.setCuid("");
		//this.password = "";
		this.certName = null;
		this.nickName = null;
		this.status = null;
		this.type = null;
		this.appName = null;
		this.acronym = null;
		this.serialNo = null;
		this.memberCuid = null;
		this.rcbsCode = null;
		this.notifyCuid = null;
		this.alarmTime = null;
		this.alarmFreq = null;
		this.selectGroupName = null;
		this.groupNameSelect = null;
		this.groupString = null;
		this.memberCuidList = null;
		this.rcbsMgrCuid = null;
		this.creatorCuid = null;
		this.appUserName = null;
		this.errMess = null;
		this.rcbsMbrCuid = null;
		this.expBefDate = null;
		this.expAfterDate=null;
		this.serverName=null;
		this.acronymList= null;
		this.appList = null;
		this.appSearch = null;
		this.appNames = null;
		this.hostID = null;
		this.appId= null;
		this.serName= null;
		this.netPin= null;
		this.firstContact= null;
		this.secondContact= null;
		this.mgrName = null;
		this.noCrtOfApp= null;
		this.statusDropDown=null;
		
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
		    this.selName=null;
		    this.reqString=null;
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

    public String getCertName() {
		return certName;
	}
	

	public void setCertName(String certName) 
	{
		this.certName = certName;
	}
	

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public String getNickName() {
		return nickName;
	}
	

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getStatus() {
		return status;
	}
	

	public void setStatus(String status) {
		this.status= status;
	}

	public String getType() {
		return type;
	}
	

	public void setType(String type) {
		this.type = type;
	}


	public String getExpBefDate() {
		return expBefDate;
	}
	

	public void setExpBefDate(String expBefDate) {
		this.expBefDate = expBefDate;
	}

	public String getExpAfterDate() {
		return expAfterDate;
	}
	

	public void setExpAfterDate(String expAfterDate) {
		this.expAfterDate = expAfterDate;
	}
	
	public String getAppName() {
		System.out.println("in get CMSFormBean APPNAME : "+appName);
		return appName;
	}

	public void setAppName(String appName) {
		System.out.println("in set CMSFormBean APPNAME : "+appName);
		this.appName = appName;
	}

	public String getAcronym() {
		System.out.println("in get CMSFormBean getAcronym : "+acronym);
		return acronym;
	}

	public void setAcronym(String acronym) {
		System.out.println("in set CMSFormBean Acronym : "+acronym);
		this.acronym = acronym;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}


	public String getMemberCuid() {
		return memberCuid;
	}

	public void setMemberCuid(String memberCuid) {
		//System.out.println("setting MEMBER cuid......."+memberCuid);
		this.memberCuid = memberCuid;
	}

	public String getRcbsCode() {
		//System.out.println("RCBS Code in -----in form bean-----"+rcbsCode);
		return rcbsCode;
	}

	public void setRcbsCode(String rcbsCode) {
		//System.out.println("RCBS Code in -----in form bean-----"+rcbsCode);
		this.rcbsCode = rcbsCode;
	}

	public String getNotifyCuid() {
		return notifyCuid;
	}

	public void setNotifyCuid(String notifyCuid) {
		this.notifyCuid = notifyCuid;
	}

	public String getAlarmTime() {
		//System.out.println("alarmTime -- get-----"+alarmTime);
		return alarmTime;
	}

	public void setAlarmTime(String alarmTime) {
		//System.out.println("alarmTime -- set-----"+alarmTime);
		this.alarmTime = alarmTime;
	}

	public String getAlarmFreq() {
		//System.out.println("alarmFreq---get"+alarmFreq);
		return alarmFreq;
	}

	public void setAlarmFreq(String alarmFreq) {
		//System.out.println("alarmFreq---set"+alarmFreq);
		this.alarmFreq = alarmFreq;
	}

	public String getSelectGroupName() {
		return selectGroupName;
	}

	public void setSelectGroupName(String selectGroupName) {
		this.selectGroupName = selectGroupName;
	}

	public String getGroupString() {
		return groupString;
	}

	public void setGroupString(String groupString) {
		this.groupString = groupString;
	}

	public String getGroupNameSelect() {
		return groupNameSelect;
	}

	public void setGroupNameSelect(String groupNameSelect) {
		this.groupNameSelect = groupNameSelect;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getMemberCuidList() {
		return memberCuidList;
	}

	public void setMemberCuidList(String memberCuidList) {
		this.memberCuidList = memberCuidList;
	}

	public String getRcbsMgrCuid() {
		//System.out.println("rcbsMgrCuid in bean class----+getmethod "+rcbsMgrCuid);
		return rcbsMgrCuid;
	}

	public void setRcbsMgrCuid(String rcbsMgrCuid) {
		//System.out.println("rcbsMgrCuid in bean class----+setMethod"+rcbsMgrCuid);
		this.rcbsMgrCuid = rcbsMgrCuid;
	}

	public String getCreatorCuid() {
		return creatorCuid;
	}

	public void setCreatorCuid(String creatorCuid) {
		this.creatorCuid = creatorCuid;
	}

	/*public String getRcbsMbrCuid() {
		System.out.println("Member CUID in CMSFormBean ----+getmethod----"+rcbsMbrCuid);
		return rcbsMbrCuid;
	}

	public void setRcbsMbrCuid(String rcbsMbrCuid) {
		System.out.println("Member CUID in CMSFormBean ----+setmethod---"+rcbsMbrCuid);
		this.rcbsMbrCuid = rcbsMbrCuid;
	}*/

	public String getAuth_type() {
		System.out.println("******************auth_type----in formbean+getmethod ----"+auth_type);
		return auth_type;
	}

	public void setAuth_type(String auth_type) {
		//System.out.println("********************************auth_type----in formbean+setmethod ----"+auth_type);
		this.auth_type = auth_type;
	}

	public String getErrMess() {
		return errMess;
	}

	public void setErrMess(String errMess) {
		System.out.println("setting the error mess"+errMess);
		this.errMess = errMess;
	}

	public String getAppUserName() {
		return appUserName;
	}

	public void setAppUserName(String appUserName) {
		this.appUserName = appUserName;
	}

	public String getAppList() {
		System.out.println("getAppList  "+appList);
		return appList;
	}

	public void setAppList(String appList) {
		this.appList = appList;
	}

	public String getAcronymList() {
		System.out.println("getAcronymList()  "+acronymList);
		return acronymList;
	}

	public void setAcronymList(String acronymList) {
		this.acronymList = acronymList;
	}

	
	public String getAppSearch() {
		return appSearch;
	}

	public void setAppSearch(String appSearch) {
		this.appSearch = appSearch;
	}

	public String getAppNames() {
		return appNames;
	}

	public void setAppNames(String appNames) {
		this.appNames = appNames;
	}

	public String getHostID() {
		System.out.println("hostid in cmsform  "+hostID);
		return hostID;
	}

	public void setHostID(String hostID) {
		this.hostID = hostID;
	}

	public String getAppId() {
	    return appId;
	}

	public void setAppId(String appId) {
	    this.appId = appId;
	}

	public String getSerName() {
	    return serName;
	}

	public void setSerName(String serName) {
	    this.serName = serName;
	}

	public String getNetPin() {
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

	public String getMgrName() {
	    return mgrName;
	}

	public void setMgrName(String mgrName) {
	    this.mgrName = mgrName;
	}
	
	public String getNoCrtOfApp() {
	    return noCrtOfApp;
	}

	public void setNoCrtOfApp(String noCrtOfApp) {
	    this.noCrtOfApp = noCrtOfApp;
	}

	public String getStatusDropDown() {
	    return statusDropDown;
	}

	public void setStatusDropDown(String statusDropDown) {
	    this.statusDropDown = statusDropDown;
	}

	public String getRcbsMbrCuid() {
	    return rcbsMbrCuid;
	}

	public void setRcbsMbrCuid(String rcbsMbrCuid) {
	    this.rcbsMbrCuid = rcbsMbrCuid;
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

	public String getSelName() {
	  //  System.out.println("selName in Bean ..  "+selName);
	    return selName;
	}

	public void setSelName(String selName) {
	    this.selName = selName;
	}

	public String getReqString() {
	   // System.out.println("reqString in Bean ... "+reqString);
	    return reqString;
	}

	public void setReqString(String reqString) {
	    this.reqString = reqString;
	}

	public String getSelCN() {
	    return selCN;
	}

	public void setSelCN(String selCN) {
	    this.selCN = selCN;
	}
}
