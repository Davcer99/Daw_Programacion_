package Formas;

import java.awt.Point;

public class Forma {

    private String color;
    private Point centro;
    private String nombre;
    
    public Forma(String color, Point centro, String nombre) {
        this.color = color;
        this.centro = centro;
        this.nombre = nombre;
    }

    public void imprimir(){
        System.out.println("Color: " + this.color);
        System.out.printf("Centro: (%d, %d)\n", centro.x, centro.y);
        System.out.println("Nombre: " + this.nombre);
    }

    public String getColor() {
        return color;
    }

    public Point getCentro() {
        return centro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void mover(int x, int y) {
        this.centro = new Point(x,y);
    }
}