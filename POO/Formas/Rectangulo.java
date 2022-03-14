package Formas;

import java.awt.Point;

public class Rectangulo extends Forma{
    
    private double ladoMayor;
    private double ladoMenor;
    
    public Rectangulo(String color, Point centro, String nombre, double ladoMayor, double ladoMenor) {
        super(color, centro, nombre);
        this.ladoMayor = ladoMayor;
        this.ladoMenor = ladoMenor;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Lado mayor: " + this.ladoMayor);
        System.out.println("Lado menor: " + this.ladoMenor);
    }

    public double getArea(){
        return this.ladoMenor * this.ladoMayor;
    }

    public double getPerimetro(){
        return (2 * this.ladoMenor + 2 * this.ladoMayor);
    }

    public void cambiarTamaño(double factorDeForma ){
        this.ladoMayor= ladoMayor * factorDeForma;
        this.ladoMenor= ladoMenor * factorDeForma;
    }
    
    public double getLadoMayor() {
        return ladoMayor;
    }

    public double getLadoMenor() {
        return ladoMenor;
    }

    public void setLadoMayor(double ladoMayor) {
        this.ladoMayor = ladoMayor;
    }


}
