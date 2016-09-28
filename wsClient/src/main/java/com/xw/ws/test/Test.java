package com.xw.ws.test;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xw.ws.bean.Book;
import com.xw.ws.bean.ResultEntity;
import com.xw.ws.server.HelloworldInterface;
import com.xw.ws.utils.JaxbUtil;

/**
 * 测试客户端
 * 
 * @author wjx 2016年9月28日 上午11:09:49
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class Test {

	@Autowired
	private HelloworldInterface client;

	/**
	 * 不需要spring配置，使用cxf原生api
	 */
	@org.junit.Test
	public void test() {
		Book book = new Book();

		book.setId(100);
		book.setName("webservice 从入门到遁入空门");
		book.setPrice(998);
		book.setAuthor("陈思誉");

		String queryXml = JaxbUtil.convertToXml(book, "GBK");

		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

		factory.setServiceClass(HelloworldInterface.class);
		factory.setAddress("http://localhost:8080/wsServer/helloService?wsdl");

		HelloworldInterface client = (HelloworldInterface) factory.create();

		String response = client.save(queryXml);

		ResultEntity r = JaxbUtil.converyToJavaBean(response, ResultEntity.class);

		System.out.println("ResponseCode:" + r.getCode());
	}

	/**
	 * 基于spring配置，原理同不需要spring配置的，只不过把配置通过xml抽取出来，
	 * 底层都是调用cxf的JaxWsProxyFactoryBean实现通信
	 */
	@org.junit.Test
	public void testBaseSpring() {
		Book book = new Book();

		book.setId(100);
		book.setPrice(998);
		book.setName("webservice 从入门到遁入空门");
		book.setAuthor("陈思誉");

		String queryXml = JaxbUtil.convertToXml(book, "GBK");

		String result = client.save(queryXml);

		ResultEntity r = JaxbUtil.converyToJavaBean(result, ResultEntity.class);
		System.out.println("ResponseCode:" + r.getCode());
	}

}
