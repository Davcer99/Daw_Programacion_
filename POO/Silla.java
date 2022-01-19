import java.awt.Point;
import java.util.Random;
public class Silla {
    /* Crear una clase silla que no tendra main, atributos de las sillas el color numero de patas si tiene respaldo o no nivel de comodidad de 0 al 10 material de construccion ademas la clase silla tiene un punto que las ubica en una habitación con x e y hay que definir todos los atributos como privados pero desde la clase test se deben poder modificar e acceder a su valor crear en la clase de prueba 100 sillas con distintas posiciones , materiales etc*/

    // atributos 
    private String color;
    private int nPatas;
    private boolean respaldo;
    private int nivelComodidad;
    private String material;
    private Point ubicacion;


    public Silla (String color, int nPatas, boolean respaldo, int i, String material, Point ubicacion){
        this.color = color;
        this.nPatas = nPatas;
        this.respaldo = respaldo;
        this.nivelComodidad = i;
        this.material = material;
        this.ubicacion = ubicacion;
    }

    public Silla (){
        
        Random ran = new Random();
        String [] material = {"madera", "alumninio", "plastico", "inoxidable"};
        String [] color = {"Rojo", "Amarillo", "Verde", "Morado", "Marron", "Azul "};
        boolean respaldo = false;
        Point ubicacion = new Point (ran.nextInt(100-0+1)+0, ran.nextInt(100-0+1)+0);

        if (ran.nextInt(1-0+1)+0 == 1){
            respaldo = true;
        }else {
            respaldo = false;
        }

        this.color = color[ran.nextInt(5-0+1)+0];
        this.nPatas = ran.nextInt(6-3+1)+3;
        this.respaldo = respaldo;
        this.nivelComodidad = ran.nextInt(10-0+1)+0;
        this.material = material[ran.nextInt(3-0+1)+0];
        this.ubicacion = ubicacion;
    }


    public void imprimirValores (){
        System.out.println("Color de la silla " + color + "\nNumero de patas de la silla " + nPatas + "\nTiene respaldo " + respaldo + "\nNivel de comodidad de la silla " + nivelComodidad + "\nMaterial de la silla " + material + "Posición de la silla " + ubicacion );
    }

    //Getter

    public int getNivelComodidad(){
        return nivelComodidad;
    }
    
    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public Point getUbicacion() {
        return ubicacion;
    }

    public int getnPatas() {
        return nPatas;
    }
    public boolean isRespaldo() {
        return respaldo;
    }

    //Setter

    public void setNivelComodidad(byte nivelComodidad) {
        this.nivelComodidad = nivelComodidad;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setRespaldo(boolean respaldo) {
        this.respaldo = respaldo;
    }

    public void setUbicacion(Point ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    public void setnPatas(int nPatas) {
        this.nPatas = nPatas;
    }
}
