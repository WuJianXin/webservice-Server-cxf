package com.xw.ws.server.service;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(
		targetNamespace="http://server.ws.xw.com/",  //指定wsdl的命名空间
		name="helloworldInterface",      //指定porttype类型
		portName="helloworldInterfacePort",   //指定port名称
		serviceName="helloworldService"          //服务视图的名称
		)
public interface IHelloWorld {
    public @WebResult(name="resultxml") String save(@WebParam(name = "bookxml") String bookxml);    
}