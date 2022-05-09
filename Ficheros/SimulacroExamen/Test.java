package SimulacroExamen;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;

public class Test {
    public static void main(String[] args) throws IOException, TransformerFactoryConfigurationError, ParserConfigurationException, TransformerException {
        Persistencia p1 = new Persistencia(10182736,"David", "B.C", "dbc@gmail.com");
        p1.transformXML();
    }
}
