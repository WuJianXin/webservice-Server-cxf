package com.xw.ws.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.4
 * 2016-09-28T11:31:30.452+08:00
 * Generated source version: 3.1.4
 * 
 */
@WebService(targetNamespace = "http://server.ws.xw.com/", name = "helloworldInterface")
@XmlSeeAlso({ObjectFactory.class})
public interface HelloworldInterface {

    @WebMethod
    @RequestWrapper(localName = "save", targetNamespace = "http://server.ws.xw.com/", className = "com.xw.ws.server.Save")
    @ResponseWrapper(localName = "saveResponse", targetNamespace = "http://server.ws.xw.com/", className = "com.xw.ws.server.SaveResponse")
    @WebResult(name = "resultxml", targetNamespace = "")
    public java.lang.String save(
        @WebParam(name = "bookxml", targetNamespace = "")
        java.lang.String bookxml
    );
}
