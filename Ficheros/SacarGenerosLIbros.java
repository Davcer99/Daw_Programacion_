import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class SacarGenerosLIbros 
{ 
    public static void main(String[] args) throws ParserConfigurationException,
    SAXException, IOException {
        extraerGeneros();

    }

    private static void extraerGeneros() {
        try {
            File inputFile = new File("./archivos/Books.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder;
            String generos="";
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            XPath xPath =  XPathFactory.newInstance().newXPath();
            String expresion = "//book";            
            NodeList nodeList = (NodeList) xPath.compile(expresion).evaluate(doc, XPathConstants.NODESET);
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node nNode = nodeList.item(i);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    generos += eElement.getElementsByTagName("genre").item(0).getTextContent() + ",";
                    
                }
            }

            String[] todosGeneros = generos.split(",");
            String resultado= "Los generos que hay en el xml son los siguientes: ";
            for (String genero : todosGeneros) {
                if (!resultado.contains(genero)){
                    resultado += genero + ", ";
                }
            }
            System.out.println(resultado);
        } catch (ParserConfigurationException e) {
            System.out.println(e);
        } catch (SAXException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        } catch (XPathExpressionException e) {
            System.out.println(e);
        }
    }
}


