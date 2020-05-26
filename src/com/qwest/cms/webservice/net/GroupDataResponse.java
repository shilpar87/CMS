/**
 * GroupDataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.qwest.cms.webservice.net;

public class GroupDataResponse  implements java.io.Serializable {
    private java.lang.String backupCuid;

    private java.lang.String backupName;

    private java.lang.String firstEscCuid;

    private java.lang.String firstEscName;

    private java.lang.String groupDescription;

    private int groupId;

    private java.lang.String[] groupMembersAll;

    private java.lang.String[] groupMembersCuidAll;

    private java.lang.String groupName;

    private java.lang.String groupOwnerName;

    private java.lang.String groupType;

    private java.lang.String messageText;

    private java.lang.String notifTime;

    private java.lang.String primaryCuid;

    private java.lang.String primaryName;

    private int rc;

    private java.lang.String secondEscCuid;

    private java.lang.String secondEscName;

    private int sev1EscTime;

    private int sev2EscTime;

    private int sev3EscTime;

    private int severity;

    private java.lang.String statusText;

    public GroupDataResponse() {
    }

    public GroupDataResponse(
           java.lang.String backupCuid,
           java.lang.String backupName,
           java.lang.String firstEscCuid,
           java.lang.String firstEscName,
           java.lang.String groupDescription,
           int groupId,
           java.lang.String[] groupMembersAll,
           java.lang.String[] groupMembersCuidAll,
           java.lang.String groupName,
           java.lang.String groupOwnerName,
           java.lang.String groupType,
           java.lang.String messageText,
           java.lang.String notifTime,
           java.lang.String primaryCuid,
           java.lang.String primaryName,
           int rc,
           java.lang.String secondEscCuid,
           java.lang.String secondEscName,
           int sev1EscTime,
           int sev2EscTime,
           int sev3EscTime,
           int severity,
           java.lang.String statusText) {
           this.backupCuid = backupCuid;
           this.backupName = backupName;
           this.firstEscCuid = firstEscCuid;
           this.firstEscName = firstEscName;
           this.groupDescription = groupDescription;
           this.groupId = groupId;
           this.groupMembersAll = groupMembersAll;
           this.groupMembersCuidAll = groupMembersCuidAll;
           this.groupName = groupName;
           this.groupOwnerName = groupOwnerName;
           this.groupType = groupType;
           this.messageText = messageText;
           this.notifTime = notifTime;
           this.primaryCuid = primaryCuid;
           this.primaryName = primaryName;
           this.rc = rc;
           this.secondEscCuid = secondEscCuid;
           this.secondEscName = secondEscName;
           this.sev1EscTime = sev1EscTime;
           this.sev2EscTime = sev2EscTime;
           this.sev3EscTime = sev3EscTime;
           this.severity = severity;
           this.statusText = statusText;
    }


    /**
     * Gets the backupCuid value for this GroupDataResponse.
     * 
     * @return backupCuid
     */
    public java.lang.String getBackupCuid() {
        return backupCuid;
    }


    /**
     * Sets the backupCuid value for this GroupDataResponse.
     * 
     * @param backupCuid
     */
    public void setBackupCuid(java.lang.String backupCuid) {
        this.backupCuid = backupCuid;
    }


    /**
     * Gets the backupName value for this GroupDataResponse.
     * 
     * @return backupName
     */
    public java.lang.String getBackupName() {
        return backupName;
    }


    /**
     * Sets the backupName value for this GroupDataResponse.
     * 
     * @param backupName
     */
    public void setBackupName(java.lang.String backupName) {
        this.backupName = backupName;
    }


    /**
     * Gets the firstEscCuid value for this GroupDataResponse.
     * 
     * @return firstEscCuid
     */
    public java.lang.String getFirstEscCuid() {
        return firstEscCuid;
    }


    /**
     * Sets the firstEscCuid value for this GroupDataResponse.
     * 
     * @param firstEscCuid
     */
    public void setFirstEscCuid(java.lang.String firstEscCuid) {
        this.firstEscCuid = firstEscCuid;
    }


    /**
     * Gets the firstEscName value for this GroupDataResponse.
     * 
     * @return firstEscName
     */
    public java.lang.String getFirstEscName() {
        return firstEscName;
    }


    /**
     * Sets the firstEscName value for this GroupDataResponse.
     * 
     * @param firstEscName
     */
    public void setFirstEscName(java.lang.String firstEscName) {
        this.firstEscName = firstEscName;
    }


    /**
     * Gets the groupDescription value for this GroupDataResponse.
     * 
     * @return groupDescription
     */
    public java.lang.String getGroupDescription() {
        return groupDescription;
    }


    /**
     * Sets the groupDescription value for this GroupDataResponse.
     * 
     * @param groupDescription
     */
    public void setGroupDescription(java.lang.String groupDescription) {
        this.groupDescription = groupDescription;
    }


    /**
     * Gets the groupId value for this GroupDataResponse.
     * 
     * @return groupId
     */
    public int getGroupId() {
        return groupId;
    }


    /**
     * Sets the groupId value for this GroupDataResponse.
     * 
     * @param groupId
     */
    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }


    /**
     * Gets the groupMembersAll value for this GroupDataResponse.
     * 
     * @return groupMembersAll
     */
    public java.lang.String[] getGroupMembersAll() {
        return groupMembersAll;
    }


    /**
     * Sets the groupMembersAll value for this GroupDataResponse.
     * 
     * @param groupMembersAll
     */
    public void setGroupMembersAll(java.lang.String[] groupMembersAll) {
        this.groupMembersAll = groupMembersAll;
    }


    /**
     * Gets the groupMembersCuidAll value for this GroupDataResponse.
     * 
     * @return groupMembersCuidAll
     */
    public java.lang.String[] getGroupMembersCuidAll() {
        return groupMembersCuidAll;
    }


    /**
     * Sets the groupMembersCuidAll value for this GroupDataResponse.
     * 
     * @param groupMembersCuidAll
     */
    public void setGroupMembersCuidAll(java.lang.String[] groupMembersCuidAll) {
        this.groupMembersCuidAll = groupMembersCuidAll;
    }


    /**
     * Gets the groupName value for this GroupDataResponse.
     * 
     * @return groupName
     */
    public java.lang.String getGroupName() {
        return groupName;
    }


    /**
     * Sets the groupName value for this GroupDataResponse.
     * 
     * @param groupName
     */
    public void setGroupName(java.lang.String groupName) {
        this.groupName = groupName;
    }


    /**
     * Gets the groupOwnerName value for this GroupDataResponse.
     * 
     * @return groupOwnerName
     */
    public java.lang.String getGroupOwnerName() {
        return groupOwnerName;
    }


    /**
     * Sets the groupOwnerName value for this GroupDataResponse.
     * 
     * @param groupOwnerName
     */
    public void setGroupOwnerName(java.lang.String groupOwnerName) {
        this.groupOwnerName = groupOwnerName;
    }


    /**
     * Gets the groupType value for this GroupDataResponse.
     * 
     * @return groupType
     */
    public java.lang.String getGroupType() {
        return groupType;
    }


    /**
     * Sets the groupType value for this GroupDataResponse.
     * 
     * @param groupType
     */
    public void setGroupType(java.lang.String groupType) {
        this.groupType = groupType;
    }


    /**
     * Gets the messageText value for this GroupDataResponse.
     * 
     * @return messageText
     */
    public java.lang.String getMessageText() {
        return messageText;
    }


    /**
     * Sets the messageText value for this GroupDataResponse.
     * 
     * @param messageText
     */
    public void setMessageText(java.lang.String messageText) {
        this.messageText = messageText;
    }


    /**
     * Gets the notifTime value for this GroupDataResponse.
     * 
     * @return notifTime
     */
    public java.lang.String getNotifTime() {
        return notifTime;
    }


    /**
     * Sets the notifTime value for this GroupDataResponse.
     * 
     * @param notifTime
     */
    public void setNotifTime(java.lang.String notifTime) {
        this.notifTime = notifTime;
    }


    /**
     * Gets the primaryCuid value for this GroupDataResponse.
     * 
     * @return primaryCuid
     */
    public java.lang.String getPrimaryCuid() {
        return primaryCuid;
    }


    /**
     * Sets the primaryCuid value for this GroupDataResponse.
     * 
     * @param primaryCuid
     */
    public void setPrimaryCuid(java.lang.String primaryCuid) {
        this.primaryCuid = primaryCuid;
    }


    /**
     * Gets the primaryName value for this GroupDataResponse.
     * 
     * @return primaryName
     */
    public java.lang.String getPrimaryName() {
        return primaryName;
    }


    /**
     * Sets the primaryName value for this GroupDataResponse.
     * 
     * @param primaryName
     */
    public void setPrimaryName(java.lang.String primaryName) {
        this.primaryName = primaryName;
    }


    /**
     * Gets the rc value for this GroupDataResponse.
     * 
     * @return rc
     */
    public int getRc() {
        return rc;
    }


    /**
     * Sets the rc value for this GroupDataResponse.
     * 
     * @param rc
     */
    public void setRc(int rc) {
        this.rc = rc;
    }


    /**
     * Gets the secondEscCuid value for this GroupDataResponse.
     * 
     * @return secondEscCuid
     */
    public java.lang.String getSecondEscCuid() {
        return secondEscCuid;
    }


    /**
     * Sets the secondEscCuid value for this GroupDataResponse.
     * 
     * @param secondEscCuid
     */
    public void setSecondEscCuid(java.lang.String secondEscCuid) {
        this.secondEscCuid = secondEscCuid;
    }


    /**
     * Gets the secondEscName value for this GroupDataResponse.
     * 
     * @return secondEscName
     */
    public java.lang.String getSecondEscName() {
        return secondEscName;
    }


    /**
     * Sets the secondEscName value for this GroupDataResponse.
     * 
     * @param secondEscName
     */
    public void setSecondEscName(java.lang.String secondEscName) {
        this.secondEscName = secondEscName;
    }


    /**
     * Gets the sev1EscTime value for this GroupDataResponse.
     * 
     * @return sev1EscTime
     */
    public int getSev1EscTime() {
        return sev1EscTime;
    }


    /**
     * Sets the sev1EscTime value for this GroupDataResponse.
     * 
     * @param sev1EscTime
     */
    public void setSev1EscTime(int sev1EscTime) {
        this.sev1EscTime = sev1EscTime;
    }


    /**
     * Gets the sev2EscTime value for this GroupDataResponse.
     * 
     * @return sev2EscTime
     */
    public int getSev2EscTime() {
        return sev2EscTime;
    }


    /**
     * Sets the sev2EscTime value for this GroupDataResponse.
     * 
     * @param sev2EscTime
     */
    public void setSev2EscTime(int sev2EscTime) {
        this.sev2EscTime = sev2EscTime;
    }


    /**
     * Gets the sev3EscTime value for this GroupDataResponse.
     * 
     * @return sev3EscTime
     */
    public int getSev3EscTime() {
        return sev3EscTime;
    }


    /**
     * Sets the sev3EscTime value for this GroupDataResponse.
     * 
     * @param sev3EscTime
     */
    public void setSev3EscTime(int sev3EscTime) {
        this.sev3EscTime = sev3EscTime;
    }


    /**
     * Gets the severity value for this GroupDataResponse.
     * 
     * @return severity
     */
    public int getSeverity() {
        return severity;
    }


    /**
     * Sets the severity value for this GroupDataResponse.
     * 
     * @param severity
     */
    public void setSeverity(int severity) {
        this.severity = severity;
    }


    /**
     * Gets the statusText value for this GroupDataResponse.
     * 
     * @return statusText
     */
    public java.lang.String getStatusText() {
        return statusText;
    }


    /**
     * Sets the statusText value for this GroupDataResponse.
     * 
     * @param statusText
     */
    public void setStatusText(java.lang.String statusText) {
        this.statusText = statusText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GroupDataResponse)) return false;
        GroupDataResponse other = (GroupDataResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.backupCuid==null && other.getBackupCuid()==null) || 
             (this.backupCuid!=null &&
              this.backupCuid.equals(other.getBackupCuid()))) &&
            ((this.backupName==null && other.getBackupName()==null) || 
             (this.backupName!=null &&
              this.backupName.equals(other.getBackupName()))) &&
            ((this.firstEscCuid==null && other.getFirstEscCuid()==null) || 
             (this.firstEscCuid!=null &&
              this.firstEscCuid.equals(other.getFirstEscCuid()))) &&
            ((this.firstEscName==null && other.getFirstEscName()==null) || 
             (this.firstEscName!=null &&
              this.firstEscName.equals(other.getFirstEscName()))) &&
            ((this.groupDescription==null && other.getGroupDescription()==null) || 
             (this.groupDescription!=null &&
              this.groupDescription.equals(other.getGroupDescription()))) &&
            this.groupId == other.getGroupId() &&
            ((this.groupMembersAll==null && other.getGroupMembersAll()==null) || 
             (this.groupMembersAll!=null &&
              java.util.Arrays.equals(this.groupMembersAll, other.getGroupMembersAll()))) &&
            ((this.groupMembersCuidAll==null && other.getGroupMembersCuidAll()==null) || 
             (this.groupMembersCuidAll!=null &&
              java.util.Arrays.equals(this.groupMembersCuidAll, other.getGroupMembersCuidAll()))) &&
            ((this.groupName==null && other.getGroupName()==null) || 
             (this.groupName!=null &&
              this.groupName.equals(other.getGroupName()))) &&
            ((this.groupOwnerName==null && other.getGroupOwnerName()==null) || 
             (this.groupOwnerName!=null &&
              this.groupOwnerName.equals(other.getGroupOwnerName()))) &&
            ((this.groupType==null && other.getGroupType()==null) || 
             (this.groupType!=null &&
              this.groupType.equals(other.getGroupType()))) &&
            ((this.messageText==null && other.getMessageText()==null) || 
             (this.messageText!=null &&
              this.messageText.equals(other.getMessageText()))) &&
            ((this.notifTime==null && other.getNotifTime()==null) || 
             (this.notifTime!=null &&
              this.notifTime.equals(other.getNotifTime()))) &&
            ((this.primaryCuid==null && other.getPrimaryCuid()==null) || 
             (this.primaryCuid!=null &&
              this.primaryCuid.equals(other.getPrimaryCuid()))) &&
            ((this.primaryName==null && other.getPrimaryName()==null) || 
             (this.primaryName!=null &&
              this.primaryName.equals(other.getPrimaryName()))) &&
            this.rc == other.getRc() &&
            ((this.secondEscCuid==null && other.getSecondEscCuid()==null) || 
             (this.secondEscCuid!=null &&
              this.secondEscCuid.equals(other.getSecondEscCuid()))) &&
            ((this.secondEscName==null && other.getSecondEscName()==null) || 
             (this.secondEscName!=null &&
              this.secondEscName.equals(other.getSecondEscName()))) &&
            this.sev1EscTime == other.getSev1EscTime() &&
            this.sev2EscTime == other.getSev2EscTime() &&
            this.sev3EscTime == other.getSev3EscTime() &&
            this.severity == other.getSeverity() &&
            ((this.statusText==null && other.getStatusText()==null) || 
             (this.statusText!=null &&
              this.statusText.equals(other.getStatusText())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getBackupCuid() != null) {
            _hashCode += getBackupCuid().hashCode();
        }
        if (getBackupName() != null) {
            _hashCode += getBackupName().hashCode();
        }
        if (getFirstEscCuid() != null) {
            _hashCode += getFirstEscCuid().hashCode();
        }
        if (getFirstEscName() != null) {
            _hashCode += getFirstEscName().hashCode();
        }
        if (getGroupDescription() != null) {
            _hashCode += getGroupDescription().hashCode();
        }
        _hashCode += getGroupId();
        if (getGroupMembersAll() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGroupMembersAll());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGroupMembersAll(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGroupMembersCuidAll() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGroupMembersCuidAll());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGroupMembersCuidAll(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGroupName() != null) {
            _hashCode += getGroupName().hashCode();
        }
        if (getGroupOwnerName() != null) {
            _hashCode += getGroupOwnerName().hashCode();
        }
        if (getGroupType() != null) {
            _hashCode += getGroupType().hashCode();
        }
        if (getMessageText() != null) {
            _hashCode += getMessageText().hashCode();
        }
        if (getNotifTime() != null) {
            _hashCode += getNotifTime().hashCode();
        }
        if (getPrimaryCuid() != null) {
            _hashCode += getPrimaryCuid().hashCode();
        }
        if (getPrimaryName() != null) {
            _hashCode += getPrimaryName().hashCode();
        }
        _hashCode += getRc();
        if (getSecondEscCuid() != null) {
            _hashCode += getSecondEscCuid().hashCode();
        }
        if (getSecondEscName() != null) {
            _hashCode += getSecondEscName().hashCode();
        }
        _hashCode += getSev1EscTime();
        _hashCode += getSev2EscTime();
        _hashCode += getSev3EscTime();
        _hashCode += getSeverity();
        if (getStatusText() != null) {
            _hashCode += getStatusText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GroupDataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.qwest.net.webservice", "GroupDataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backupCuid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "backupCuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backupName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "backupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstEscCuid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstEscCuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstEscName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstEscName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupMembersAll");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupMembersAll"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupMembersCuidAll");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupMembersCuidAll"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupOwnerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupOwnerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messageText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notifTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryCuid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primaryCuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primaryName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondEscCuid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "secondEscCuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondEscName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "secondEscName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sev1EscTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sev1EscTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sev2EscTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sev2EscTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sev3EscTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sev3EscTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "severity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
