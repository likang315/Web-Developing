import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import java.util.List;
import java.util.Iterator;

import javax.xml.parsers.*;
import org.dom4j.*;
import org.dom4j.io.SAXReader;
//import org.dom4j.io.DOMReader;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import org.xml.sax.SAXException;


public class Dom4jTest
{
    public static void main(String[] args)
    {
        SAXReader saxReader=new SAXReader();
        File file=new File("students.xml");
        DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
	

        try
        {
            Document doc=saxReader.read(file);
            
            /*DocumentBuilder db=dbf.newDocumentBuilder();
	        File file=new File("students.xml");
	        org.w3c.dom.Document document=db.parse(file);
	        DOMReader domReader=new DOMReader();
	        org.dom4j.Document doc=domReader.read(document);*/
	        //doc.normalize();
	        //doc.accept(new MyVisitor());
	        Element root=doc.getRootElement();
	        for (java.util.Iterator i=root.elementIterator();i.hasNext(); )
            {
    	        Element element = (Element) i.next();
		        System.out.println(element.getName());
	        }


	
            //------------------添加节点------------------
            //创建表示一个学生信息的各元素节点
            /*Element eltStu=DocumentHelper.createElement("student");
            Element eltName=DocumentHelper.createElement("name");
            Element eltAge=DocumentHelper.createElement("age");*/
            
            //Element root=doc.getRootElement();
            /*List l=root.elements("student");
            System.out.println("size="+l.size());
            System.out.println(l.get(0));
            System.out.println(l.get(1));*/
            /*Element eltStu=root.element("student");
            System.out.println(eltStu);*/
            
            /*for (java.util.Iterator i=root.elementIterator();i.hasNext(); )
            {
                Element element = (Element) i.next();
                System.out.println(element);
            }*/
            /*Element eltStu=root.element("student");
            //root.remove(eltStu);
            boolean b=eltStu.remove (eltStu.attribute("sn"));
            
            //Attribute attr=(Attribute)attrList.get(0);
            System.out.println(b);*/
            
            /*OutputFormat outFmt=OutputFormat.createPrettyPrint();
            outFmt.setEncoding("GBK");
            outFmt.setIndent("    ");
            
            //FileWriter fw=new FileWriter("test.xml");
            XMLWriter xmlWriter=new XMLWriter(outFmt);
            
            xmlWriter.write(doc);*/
            
            /*for (java.util.Iterator i=l.iterator();i.hasNext(); )
            {
                //Attribute attr=(Attribute)i.next();
                //System.out.println(attr.getValue());
                Element elt=(Element)i.next();
                System.out.println(elt.element("name").getText());
            }*/

            
            
        }
        catch(DocumentException e){System.out.println(e.getMessage());}
        //catch(UnsupportedEncodingException e){System.out.println(e.getMessage());}
        //catch(IOException e){System.out.println(e.getMessage());}
        //catch(ParserConfigurationException e){e.printStackTrace();}
        //catch(SAXException e){e.printStackTrace();}
            
    }
}

class MyVisitor extends VisitorSupport
{
    public void visit(Attribute node)
    {
        System.out.println("attribute : "+node.getName()+" = "+node.getValue());
    }
    public void visit(ProcessingInstruction node)
    {
        System.out.println("PI : "+node.getTarget()+" = "+node.getText());
    }
    
    public void visit(Element node)
    {
        System.out.println("element : "+node.getName()+" = "+node.getTextTrim());
    }
}