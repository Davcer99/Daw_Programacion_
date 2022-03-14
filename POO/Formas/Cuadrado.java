package Formas;

import java.awt.Point;

public class Cuadrado extends Rectangulo {

    public Cuadrado(String color, Point centro, String nombre, double lado) {
        super(color, centro, nombre, lado, lado);
    }

    @Override
    public double getPerimetro(){
        return super.getLadoMayor()*4;
    }

    @Override
    public void cambiarTamaño(double factorDeForma ){
        super.setLadoMayor(super.getLadoMayor() * factorDeForma);
    }
}
