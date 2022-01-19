public class Silla {
    /* Crear una clase silla que no tendra main, atributos de las sillas el color numero de patas si tiene respaldo o no nivel de comodidad de 0 al 10 material de construccion ademas la clase silla tiene un punto que las ubica en una habitación con x e y hay que definir todos los atributos como privados pero desde la clase test se deben poder modificar e acceder a su valor crear en la clase de prueba 100 sillas con distintas posiciones , materiales etc*/

    // atributos 
    private String color;
    private int nPatas;
    private boolean respaldo;
    private int nivelComodidad;
    private String material;
    private int [] posicion = {0,0};


    public Silla (String color, int nPatas, boolean respaldo, int nivelComodidad, String material, int posX, int posY){
        this.color = color;
        this.nPatas = nPatas;
        this.respaldo = respaldo;
        this.nivelComodidad = nivelComodidad;
        this.material = material;
        this.posicion [1] = posX;
        this.posicion [2] = posY;
    }

    public void imprimirValores (){
        System.out.println("Color de la silla " + color + "\nNumero de patas de la silla " + nPatas + "\nTiene respaldo " + respaldo + "\nNivel de comodidad de la silla " + nivelComodidad + "\nMaterial de la silla " + material + "Posición de la silla " + posicion [1] + " , " + posicion [2]);
    }
}
