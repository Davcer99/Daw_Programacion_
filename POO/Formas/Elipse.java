package Formas;

import java.awt.Point;

public class Elipse extends Forma {
   
    private double radioMayor;
    private double radioMenor;
    
    public Elipse(String color, Point centro, String nombre, double radioMayor, double radioMenor) {
        super(color, centro, nombre);
        this.radioMayor = radioMayor;
        this.radioMenor = radioMenor;
    }

    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Radio mayor: " + this.radioMayor);
        System.out.println("Radio menor: " + this.radioMenor);
    }

    public double getArea(){
        return Math.PI*(this.radioMayor*this.radioMenor);
    }


    public double getRadioMayor() {
        return radioMayor;
    }
}
