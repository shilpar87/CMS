package com.qwest.cms.actionForm;


import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionFormBean;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;

import com.qwest.cms.utils.CMSProperties;

/**
 * @author amanila
 *
 */
public class CMSFunctionForm extends ValidatorForm {
	
	private String certificateName;
	private String CertId;
	private String selectCertType="binary";

	/*********** Renewal ***********/
	
	private String pubKeyCrtPath;  
	private String raw_certificate;
	private String serialNo;
	private String cert_owner;
	private String company_name;
	private String cert_status;
	private String cert_version;
	private String subject;
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
	
	private String csrInfo;
	private String toList;
	private String ccList;
	private String mail_subject;
	private String message;
	private String notes;
	private String fromId;
		
	private String applicationName;
	private String acronym;
	private String certInfo;
	
	/*********** Status ***********/
	private String certStatus;
	private String changeCertStatus;
	private String selectCert;
	private String appName;
	
	
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
		//super.reset(arg0, arg1);
		this.certificateName = null;
		this.CertId = null;
		this.toList = null;
		this.ccList = null;
		this.mail_subject = null;
		this.message = null;
		this.notes = null;
		this.fromId = null;
		this.certStatus = null;
		this.changeCertStatus = null;
		
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
		this.acronym = null;
		this.csrInfo = null;
		this.certInfo = null;

	}
	
	
	public String getToList() {
		//System.out.println("in func form get..."+toList);
		return toList;
	}

	public void setToList(String toList) {
		this.toList = toList;
		//System.out.println("in func form...set  "+toList);
	}

	public String getCcList() {
		return ccList;
	}

	public void setCcList(String ccList) {
		this.ccList = ccList;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getCertificateName() {
		return certificateName;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}

	public String getCertId() {
		return CertId;
	}

	public void setCertId(String certId) {
		CertId = certId;
	}

	public String getCertStatus() {
		System.out.println("in func form get..."+certStatus);
		return certStatus;
	}

	public void setCertStatus(String certStatus) {
		this.certStatus = certStatus;
		System.out.println("in func form set..."+certStatus);

	}


	public String getChangeCertStatus() {
		return changeCertStatus;
	}


	public void setChangeCertStatus(String changeCertStatus) {
		this.changeCertStatus = changeCertStatus;
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


	public String getPubKeyCrtPath() {
		return pubKeyCrtPath;
	}


	public void setPubKeyCrtPath(String pubKeyCrtPath) {
		this.pubKeyCrtPath = pubKeyCrtPath;
	}


	public String getRaw_certificate() {
		return raw_certificate;
	}


	public void setRaw_certificate(String raw_certificate) {
		this.raw_certificate = raw_certificate;
	}


	public String getSerialNo() {
		return serialNo;
	}


	public void setSerialNo(String serialNo) {
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


	public String getMail_subject() {
		return mail_subject;
	}


	public void setMail_subject(String mail_subject) {
		this.mail_subject = mail_subject;
	}


	public String getApplicationName() {
		System.out.println("Application anme in bean -----------"+applicationName);
		return applicationName;
	}


	public void setApplicationName(String applicationName) {
		System.out.println("Application anme in bean -----------"+applicationName);
		this.applicationName = applicationName;
	}


	public String getCsrInfo() {
		return csrInfo;
	}


	public void setCsrInfo(String csrInfo) {
		this.csrInfo = csrInfo;
	}


	public String getCertInfo() {
		return certInfo;
	}


	public void setCertInfo(String certInfo) {
		this.certInfo = certInfo;
	}


	public String getFromId() {
		return fromId;
	}


	public void setFromId(String fromId) {
		this.fromId = fromId;
	}


	public String getSelectCertType() {
		System.out.println("inside bean of type of cert in set **************************"+selectCertType);
		return selectCertType;
		
	}


	public void setSelectCertType(String selectCertType) {
		System.out.println("inside bean of type of cert in GET **************************"+selectCertType);
		this.selectCertType = selectCertType;
	}


	public String getSelectCert() {
		return selectCert;
	}


	public void setSelectCert(String selectCert) {
		System.out.println("bean class for  selectCert value**************************"+selectCert);
		this.selectCert = selectCert;
	}


	public String getAcronym() {
		System.out.println("Function form .....getting acronym"+acronym);
		return acronym;
	}


	public void setAcronym(String acronym) {
		System.out.println("Function form .....setting acronym "+acronym);
		this.acronym = acronym;
	}

}
