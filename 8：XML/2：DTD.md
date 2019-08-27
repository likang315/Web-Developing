### DTD：文档类型定义

------

##### 1：DTD（Document Type Definition）   

- 目的：定义 XML 文档的结构，它使用一系列合法的元素来定义文档结构
- 保证XML文档格式正确的有效方法，可以比较XML文档和DTD文件来看文档是否符合规范，元素和标签使用是否正确
- DTD文档包含：
  1. 元素的定义规则
  2. 元素间关系的定义规则
  3. 元素可使用的属性、可使用的实体或符号规则

##### 2：DTD与XML文档的关联方式

1. 可以在XML的文件中直接书写DTD的代码

   ```xml
   <!DOCTYPE 根节点 [    DTD的代码 		]>  
   ```

2. 引入本地的DTD文件

   ```
   <!DOCTYPE 根节点 SYSTEM "DTD文件的地址">
   ```

3. 引入网络上的DTD文件

   ```
   <!DOCTYPE 根节点 PUBLIC "DTD文件名称" "DTD文件的地址"> 
   ```

 XML处理程序会根据DTD名称按照某种方法检索DTD，如果 XML处理器不能根据名称检索到DTD，就会使用“外部DTD文件的URI”来查找DTD

##### 3：元素类型声明

- < !ELEMENT 元素名称 元素类型 >      
- 元素类型：
  - EMPTY：空元素
  - ANY：任意的，表明该元素可以包含任何的字符数据和子元素
  - (#PCDATA)：文本内容，会被解析
  - (子元素名)：子元素     
  - 混合内容：<!ELEMENT employee (#PCDATA | name)*> 

##### 4：属性声明

- 语法：

  ```xml
  <!ATTLIST 元素名称  属性名称 属性类型 默认声明  属性名称 属性类型 默认声明>  
  ```

- 元素名：指给哪个元素声明属性
- 属性名：声明属性的名称
- 属性类型：
  1. CDATA：字符串
  2. 枚举：(男人|女人) 
  3. ID：代表唯一的值，不能只写数字

- 属性值

- <!ATTLIST person number CDATA #REQUIRED>

  | 值           | 解释           |
  | :----------- | :------------- |
  | 值           | 属性的默认值   |
  | #REQUIRED    | 属性值是必需的 |
  | #IMPLIED     | 属性不是必需的 |
  | #FIXED value | 属性值是固定的 |

##### 5：实体声明

​     	有时候，你可能会在文档中调用同样的内容，为了避免重复输入这些内容，我们可以声明一个实体来表示这些内容，在文档中只要引入这个实体就可以

- 内部实体声明： < !ENTITY entity-name "entity-value">

- 外部实体声明： < !ENTITY entity-name SYSTEM "URI/URL" > 

- 引入方式：&实体名;  

  ```xml
  DTD 实例:
  <!ENTITY writer "Donald Duck.">
  <!ENTITY copyright "Copyright runoob.com">
  XML 实例：
  <author>&writer;&copyright;</author>
  ```

#####  6：命名空间

​	由于URI在Internet中唯一的，因此保证了在此空间中所用元素名称的唯一性

- 格式为： < Element xmlns:prefix="NameSpace">

##### 7：XML Schema

​	XML-Schema 文件描述了XML文档的结构，XML Schema语言也被称为XML Schema Definition (XSD)，后缀名是 .xsd

- 基于XML的 DTD替代者，与DTD相比，XML Schema具有以下特点：  
  1. XML Schema 符合XML的语法结构，本身其实就是XML文档，只要懂XML语法规则就可以编写Schema，无需学习其它的语法，XML文档和XML Schema文档可以用相同的语法分析器来解析
  2. 支持更多的数据类型
  3. 支持元素分组
     - XML Schema 支持元素更灵活的定义，可以将元素的部分子元素分组，对组中的元素进行定义
  4. 对支持命名空间 
     - XML Schema 利用命名空间将文档中特殊的节点与Schema说明相联系
     - 一个XML文档可以有多个对应的Schema，一个Schema中可以支持一个或多个名称空间的使用，从而使其具务较强的可扩展性
     - 在编写XML文档，通过xmlns来引入名称空间
       - xmlns="http://www.w3.org/2001/XMLSchema-instance"   引入自己编写的schema文档地址
       - schemaLocation属性 是W3C提供的，如果W3C名称空间要是有别名的话，先把别名写上
       - xsi:schemaLocation="要引入的名称空间   schema文件的地址"  





