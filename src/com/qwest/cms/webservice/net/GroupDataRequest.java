/**
 * GroupDataRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.qwest.cms.webservice.net;

public class GroupDataRequest  implements java.io.Serializable {
    private java.lang.String groupPin;

    private java.lang.String groupPins;

    private int minutes;

    public GroupDataRequest() {
    }

    public GroupDataRequest(
           java.lang.String groupPin,
           java.lang.String groupPins,
           int minutes) {
           this.groupPin = groupPin;
           this.groupPins = groupPins;
           this.minutes = minutes;
    }


    /**
     * Gets the groupPin value for this GroupDataRequest.
     * 
     * @return groupPin
     */
    public java.lang.String getGroupPin() {
        return groupPin;
    }


    /**
     * Sets the groupPin value for this GroupDataRequest.
     * 
     * @param groupPin
     */
    public void setGroupPin(java.lang.String groupPin) {
        this.groupPin = groupPin;
    }


    /**
     * Gets the groupPins value for this GroupDataRequest.
     * 
     * @return groupPins
     */
    public java.lang.String getGroupPins() {
        return groupPins;
    }


    /**
     * Sets the groupPins value for this GroupDataRequest.
     * 
     * @param groupPins
     */
    public void setGroupPins(java.lang.String groupPins) {
        this.groupPins = groupPins;
    }


    /**
     * Gets the minutes value for this GroupDataRequest.
     * 
     * @return minutes
     */
    public int getMinutes() {
        return minutes;
    }


    /**
     * Sets the minutes value for this GroupDataRequest.
     * 
     * @param minutes
     */
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GroupDataRequest)) return false;
        GroupDataRequest other = (GroupDataRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.groupPin==null && other.getGroupPin()==null) || 
             (this.groupPin!=null &&
              this.groupPin.equals(other.getGroupPin()))) &&
            ((this.groupPins==null && other.getGroupPins()==null) || 
             (this.groupPins!=null &&
              this.groupPins.equals(other.getGroupPins()))) &&
            this.minutes == other.getMinutes();
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
        if (getGroupPin() != null) {
            _hashCode += getGroupPin().hashCode();
        }
        if (getGroupPins() != null) {
            _hashCode += getGroupPins().hashCode();
        }
        _hashCode += getMinutes();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GroupDataRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.qwest.net.webservice", "GroupDataRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupPin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupPin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupPins");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupPins"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minutes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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
