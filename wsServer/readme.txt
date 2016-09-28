前言：
	本项目是webservice的服务器端demo，采用apache下开源框架CXF（3.1.4）整合spring（4.2.5.RELEASE）而成；
	数据通信采用XML传输，采用java自带api--JAXB（Java Architecture for XML Binding)实现xml文本与javabean的序列化与反序列化；

webservice简介：
	1、webservice技术， 能使得运行在不同机器上的不同应用无须借助附加的、专门的第三方软件或硬件， 就可相互交换数据或集成。依据Web Service规范实施的应用之间， 无论它们所使用的语言、 平台	或内部协议是什么， 都可以相互交换数据。
	2、webservice采用SOAP协议（简单对象访问协议），其实就是在http传输的基础上进一步分装，把数据通过xml封装，然后采用http协议进行传输，同时在http加上特定的消息头标志。
优点：
	1、跨防火墙的通信
        2、应用程序集成
        3、平台的无关性，实现不同代码语言间的通信等等。。。。
缺点：
	1、webservice编写起来比较麻烦
	2、xml封装解析麻烦点
	3、xml数据体比较大消耗较大的网络带宽等等


webservice服务端技术实现步骤（基于spring整合cxf实现）：
	1、创建web工程，在web.xml里加载spring，还要配置cxf的servlet（org.apache.cxf.transport.servlet.CXFServlet）
	2、编写webservice接口，及相关注解，也可以不写注解都有默认配置，但不是很友好
	3、在spring配置文件里配置webservice的地址，服务类等等
	4、启动tomcat即可访问


本demo使用方法：
	1、本程序使用tomcat作为部署容器，部分其他中间件可能需要其他的依赖包，如（jetty）可能还要加入cxf对其他容器的支持，具体自行问度娘
	2、部署完后通过浏览器输入 http://localhost:8080/wsServer 即可进去本项目发布的soap service，可以自行查看wsdl定义

