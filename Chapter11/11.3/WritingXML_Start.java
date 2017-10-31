package writingxml;

import java.io.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import org.w3c.dom.*;
import org.xml.sax.*;

public class WritingXML {
    public static void main(String[] args) {
        File xmlFile = new File("cars.xml");
        Document dom = LoadXMLDocument(xmlFile);      
        WriteXMLDocument(dom, xmlFile);
    }
    
    private static void WriteXMLDocument(Document doc, File destination)
    {
        try{
            // Write doc to destination file here...
        }
        catch(TransformerConfigurationException e)
        {
            System.err.println("XML writing failed.");
        }
        catch(TransformerException e)
        {
            System.err.println("XML writing failed.");
        }
    }
    
    private static Document LoadXMLDocument(File source)
    {
        Document dom = null;
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            dom = builder.parse(source);
        }
        catch (ParserConfigurationException e) {
             System.err.println("XML loading failed.");
        } 
        catch (SAXException e) {
             System.err.println("XML loading failed.");
        } 
        catch (IOException e) {
            System.err.println("XML loading failed.");
        }
        
        return dom;
    }
}
