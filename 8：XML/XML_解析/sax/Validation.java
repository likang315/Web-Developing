import java.io.*;

import javax.xml.XMLConstants;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.stream.*;
import javax.xml.transform.dom.*;
import javax.xml.validation.*;

import org.w3c.dom.*;
import org.xml.sax.*;


public class Validation
{
    public static void main(String[] args)
    {
        DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
        
        try
        {
            DocumentBuilder db=dbf.newDocumentBuilder();
            Document doc = db.parse(new File("students.xml"));
            SchemaFactory sf=SchemaFactory.newInstance(XMLConstants.XML_DTD_NS_URI);
            Source dtdSource=new StreamSource(new File("students.dtd"));
            Schema schema=sf.newSchema(dtdSource);
            Validator validator = schema.newValidator();
            validator.validate(new DOMSource(doc));
        }
        catch(ParserConfigurationException e)
        {
            e.printStackTrace();
        }
        catch(SAXException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        

    }
}