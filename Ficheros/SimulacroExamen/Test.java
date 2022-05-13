package SimulacroExamen;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;

public class Test {
    public static void main(String[] args) throws IOException, TransformerFactoryConfigurationError, ParserConfigurationException, TransformerException {
        Cliente p1 = new Cliente("10182736","David", "B.C", "dbc@gmail.com");
        Cliente p2 = new Cliente("10386230", "Juan", "L.C", "jlc@gmail.com");

        p1.readJson();
    }
}
