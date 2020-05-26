/**
 * NETGroupDataServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.qwest.cms.webservice.NETGroupData;

public class NETGroupDataServiceLocator extends org.apache.axis.client.Service implements com.qwest.cms.webservice.NETGroupData.NETGroupDataService {

    public NETGroupDataServiceLocator() {
    }


    public NETGroupDataServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NETGroupDataServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for NETGroupData
    private java.lang.String NETGroupData_address = "http://net.qintra.com/WebServices/services/NETGroupData";

    public java.lang.String getNETGroupDataAddress() {
        return NETGroupData_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String NETGroupDataWSDDServiceName = "NETGroupData";

    public java.lang.String getNETGroupDataWSDDServiceName() {
        return NETGroupDataWSDDServiceName;
    }

    public void setNETGroupDataWSDDServiceName(java.lang.String name) {
        NETGroupDataWSDDServiceName = name;
    }

    public com.qwest.cms.webservice.NETGroupData.NETGroupData getNETGroupData() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(NETGroupData_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getNETGroupData(endpoint);
    }

    public com.qwest.cms.webservice.NETGroupData.NETGroupData getNETGroupData(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.qwest.cms.webservice.NETGroupData.NETGroupDataSoapBindingStub _stub = new com.qwest.cms.webservice.NETGroupData.NETGroupDataSoapBindingStub(portAddress, this);
            _stub.setPortName(getNETGroupDataWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNETGroupDataEndpointAddress(java.lang.String address) {
        NETGroupData_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.qwest.cms.webservice.NETGroupData.NETGroupData.class.isAssignableFrom(serviceEndpointInterface)) {
                com.qwest.cms.webservice.NETGroupData.NETGroupDataSoapBindingStub _stub = new com.qwest.cms.webservice.NETGroupData.NETGroupDataSoapBindingStub(new java.net.URL(NETGroupData_address), this);
                _stub.setPortName(getNETGroupDataWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("NETGroupData".equals(inputPortName)) {
            return getNETGroupData();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://net.qintra.com/WebServices/services/NETGroupData", "NETGroupDataService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://net.qintra.com/WebServices/services/NETGroupData", "NETGroupData"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("NETGroupData".equals(portName)) {
            setNETGroupDataEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
