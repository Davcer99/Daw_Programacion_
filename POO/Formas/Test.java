package Formas;

import java.awt.Point;
import java.util.ArrayList;

/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        ArrayList <Forma> formas = new ArrayList<>();

        Rectangulo r1 = new Rectangulo("verde", new Point(2,4), "Rectangulo1", 6, 3);
        Cuadrado c1 = new Cuadrado("morado", new Point(5,3), "Cuadrado1", 5);
        Elipse e1 = new Elipse("rosa", new Point(2,2), "Elipse1", 5, 3);
        Circulo cir1= new Circulo("azul", new Point(6,8), "Circulo1", 8);

        formas.add(r1);
        formas.add(c1);
        formas.add(e1);
        formas.add(cir1);
    }
}