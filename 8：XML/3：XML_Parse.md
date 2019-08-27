### XML 解析

------

​	在程序中常要对XML增加、修改、删除和检索，这就需要对XML进行解析，目前几乎所有的XML解析器都对两套标准的API提供了支持,即DOM和SAX，但是DOM、SAX只定义了一些接口,以及某些接口的空实现，一个应用程序要想利用DOM或SAX访问XML文档，还要一个实现了DOM或SAX的解析器

##### 1：三种解析XML的方式

1. DOM
   - 在内存中形成DOM对象树
   - 优点：有相应的方法做增删改查的操作
   - 缺点：如果文档过大，容易产生内存溢出的问题   	
2. SAX
   - 基于事件驱动，边读边解析，解析的时候调用函数
   - 优点：不会产生内存溢出问题
   - 缺点：不能做增删改操作
3. DOM4J
   - 提供了优化过后的DOM对象树，方便做增删改的操作
   - 性能最优

##### 2：DOM4J

 	由dom4j.org出品的一个开源XML解析包，是一个易用的、开源的库，用于XML应用于Java平台，采用了Java集合框架并完全支持DOM，SAX和JAXP

###### 流程

1. 先下载DOM4J相应的jar包，导入工程中，想要使用DOM4j解析XML文档时，必须使用导入dom4j.jar包才可以读取XML文档
2. 把dom4j-1.6.1.jar导入到工程中
3. DOM4J的解析步骤：增，删，改，查
4. SAXReader(class)：得到其实例，然后通过方法read()，得到document对象
   - 创建saxReader对象，来读取文件      		
   - SAXReader reader = new SAXReader(); 
   - 通过read() 读取一个文件转换成Document对象
   - Document document = reader.read(new File("src//DOM/book2.xml"));   			 			 



