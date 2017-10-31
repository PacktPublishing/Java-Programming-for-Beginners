package loadinganxmlfile;

import java.io.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import org.w3c.dom.*;
import org.xml.sax.*;

public class LoadingAnXMLFile {
    public static void main(String[] args) {
        Document dom;
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        
        try {
            // Write code that can throw errors here...
            DocumentBuilder builder = factory.newDocumentBuilder();
            dom = builder.parse("cars.xml");
            
            PrintXmlDocument(dom);
        }
        catch (ParserConfigurationException pce) {
            System.out.println(pce.getMessage());
        } 
        catch (SAXException se) {
            System.out.println(se.getMessage());
        } 
        catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
    }
    
    private static void PrintXmlDocument(Document xml)
    {
        try{
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            StreamResult result = new StreamResult(new StringWriter());
            DOMSource source = new DOMSource(xml);
            transformer.transform(source, result);
            System.out.println(result.getWriter().toString());
        }
        catch(TransformerConfigurationException e)
        {
            System.err.println("XML Printing Failed");
        }
        catch(TransformerException e)
        {
            System.err.println("XML Printing Failed");
        }
    }
}