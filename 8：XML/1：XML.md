###  XML (Extensible Markup Language)

------

​	可扩展的标记语言，被设计成结构化，用来传输和存储数据库，没有预定义的标签，需要自己定义

- XML 文档形成了一种文档树结构，它从"根部"开始(根节点)，然后扩展到"枝叶"，一切内容都是结点

##### 1：XML和HTML的区别

- XML：用于传输和存储数据，其焦点是数据的内容
- HTML：用于显示数据，其焦点是数据的外观
- XML的版本：
  1. XML1.0（使用该版本）	
  2. XML1.1（不向下兼容）
- 应用
  1. 作为配置文件
  2. 可以在系统与系统之间进行数据的传输，存储

##### 2：语法

- XML版本声明，必须放在xml文件的第一行和第一列的位置

- 写法：

  ``` xml
  <?xml version="1.0" encoding="UTF-8"?> 
  ```

- 属性：

  1. version="1.0"  ，XML的版本，必须值
  2. encoding="UTF-8" ，编码集，可选值
  3. standalone="yes"  ，代表xml的文件是否依赖外部文件的，若是no，依赖外部文件
     - 默认值 "no"，可选值、

- xml标签对大小写敏感

- 格式：

  ```
  <元素名 属性名="属性值" 属性名="属性值">
  ```

#####   3：XML命名空间

- 目的：避免元素命名冲突的方法

- 命名空间是在元素的开始标签的 xmlns 属性中定义的

  ```xml
  <project 
  	xmlns="http://maven.apache.org/POM/4.0.0"
  	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  				xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
  														http://maven.apache.org/xsd/maven-4.0.0.xsd">
  </project>
  ```

- 语法：xmlns:前缀="URI" 

##### 4：文档类型声明

​	用来指出定义XML语义所用的DTD（文档类型定义）

- 两种形式：

  1. 外部的DTD文档：DTD的定义和XML文档在不同的文件中

     ```xml
     < !DOCTYPE hello SYSTEM "hello.dtd">
     ```

  2. 在XML中直接给出DTD 的定义 ，[ ] 中是DTD的内容

     ```xml
     <!DOCTYPE 
     	hello [<!ELEMENT hello (#PCDATA)>]
     >
     ```

##### 5：元素

1. 空元素
2. 带属性的元素
3. 带有内容的元素
4. 带内容和属性的元素	

##### 6：CDATA (character data)

​	在编写XML文档时，有时需要显示字母，数字和其它的符号本身，而在XML中，这些字符已经有特殊的含义，这时就需要用到CDATA，因为CDATA 区段中的文本数据不会被解析器解析

- 语法：

  ```xml
  <![
  		CDATA[	
  				内容：当成字符串，不会被解析
  		]
  ]>
  ```

##### 7：处理指令PI  (Processing Instructions)
	

PI允许XML文档中包含由应用程序来处理的指令，在XML文档中，有可能包含一些非XML格式的数据，这些数据XML处理器无法处理，我们就可以通过PI通知其它应用程序来处理这些数据

- 格式

  ```xml
  <?xml-stylesheet href="hello.css" type="text/css"?>
  ```

##### 8：行尾处理

 XML以文本的方式存在于计算机系统中，以行来分隔，不同的系统采用不同的行分隔符，在XML空白字符串中，有两个是标准的

- ASCII码行尾近控制字串
  1. 回车：CR  #xA
  2. 换行：LF  #xD
- Windows: #xD#xA组合作为分隔符
- UNIX:#xA作为分隔符
- Mac:#xD作为分隔符





