ǰ�ԣ�
	����Ŀ��webservice�Ŀͻ���demo������apache�¿�Դ���CXF��3.1.4������spring��4.2.5.RELEASE�����ɣ�
	����ͨ�Ų���XML���䣬����java�Դ�api--JAXB��Java Architecture for XML Binding)ʵ��xml�ı���javabean�����л��뷴���л���

webservice�ͻ���ʵ�֣�
	1����ʹ��cxf����jdk�Դ���������webservice�ͻ��˵��ô��룬cxf���wsdl2java -d Ҫ���ɴ���Ĵ��·�� �����wsdl��ַ  
	�� wsdl2java -d e:\\test http://localhost:8080/wsServer/helloService?wsdl
	2���ɲ���cxfԭ��api����cxf����springʵ��webservice���ã����ߵײ���ǲ���cxf��JaxWsProxyFactoryBeanʵ�ֵģ���Test.java �е�test���� �������ǲ���ԭ��api��testBaseSpring��������������	spring�ĵ��÷���������spring�Ļ���Ҫ�������ļ�����Ӧ�����ã����õ��õ�ַ���������


��demoʹ�÷�����
	�ڿ����˷���˵������ֱ�ӽ���Test.java�����в��Է�������