package SimulacroExamen;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        Persistencia p1 = new Persistencia(10182736,"David", "B.C", "dbc@gmail.com");
        p1.serializar(Cliente.getClientes());;
        
    }
}
