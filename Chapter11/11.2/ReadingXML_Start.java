package readingxml;

import java.io.IOException;
import javax.xml.parsers.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadingXML {
    public static void main(String[] args) {
        
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder docBuilder = factory.newDocumentBuilder();
          Document dom = docBuilder.parse("cars.xml");
            
            // Now, print out all of Jane's cars...
            
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
}
