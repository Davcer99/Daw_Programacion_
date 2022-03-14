package Formas;

import java.awt.Point;

public class Circulo extends Elipse {

    
    public Circulo(String color, Point centro, String nombre, double radio) {
        super(color, centro, nombre, radio, radio);
    }
    
    @Override
    public double getArea(){
        return Math.PI* Math.pow(super.getRadioMayor(), 2);
    }
    
}
