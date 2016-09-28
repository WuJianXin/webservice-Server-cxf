前言：
	本项目是webservice的客户端demo，采用apache下开源框架CXF（3.1.4）整合spring（4.2.5.RELEASE）而成；
	数据通信采用XML传输，采用java自带api--JAXB（Java Architecture for XML Binding)实现xml文本与javabean的序列化与反序列化；

webservice客户端实现：
	1、可使用cxf或者jdk自带命令生成webservice客户端调用代码，cxf命令：wsdl2java -d 要生成代码的存放路径 服务端wsdl地址  
	如 wsdl2java -d e:\\test http://localhost:8080/wsServer/helloService?wsdl
	2、可采用cxf原生api或者cxf整合spring实现webservice调用，两者底层均是采用cxf的JaxWsProxyFactoryBean实现的；如Test.java 中的test（） 方法就是采用原生api，testBaseSpring（）就是整合了	spring的调用方法，采用spring的话需要在配置文件做响应的配置，配置调用地址，服务类等


本demo使用方法：
	在开启了服务端的情况下直接进入Test.java类运行测试方法就行