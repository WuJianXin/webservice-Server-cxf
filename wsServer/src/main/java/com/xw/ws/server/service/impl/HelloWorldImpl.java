package com.xw.ws.server.service.impl;

import com.xw.ws.server.bean.Book;
import com.xw.ws.server.bean.ResultEntity;
import com.xw.ws.server.service.IHelloWorld;
import com.xw.ws.server.utils.JaxbUtil;

public class HelloWorldImpl implements IHelloWorld {
	@Override
	public String save(String bookxml) {
		Book book = JaxbUtil.converyToJavaBean(bookxml, Book.class);
		System.out.println("recive: "+book);
		
		ResultEntity r=new ResultEntity();
        r.setCode(0);
        
        String response = JaxbUtil.convertToXml(r,"GBK");  
		return response;
	}
}
