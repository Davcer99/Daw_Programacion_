public class Alumno {
    /*crear una clase alumno cuyos objetos tendran como caracteristica un id un nombre y un gurpo 1CFSJ,se podran crear alumnos solo con el nombre y el identificador o tambien con los tres atributos tambien debera tener un metodo llamado preguntar duda que tendra que imprimir el nombre del alumno con el texto "levanta la mano" y ademas tendra que tener un contador del numero de alumnos creados habrá un metodo de clase llamado imprimir informe que muestra el total de alumnos y otro metodo de clase que se llama imprimir informe alumnos al que se le pasa como parametro un array de alumnos e imprime el nombre y grupo de cada alumno*/

    private int id;
    private String nombre;
    private String grupo;
    private static int contadorAlumnos= 0;

    private String alumnosGrupo [];
    private int indice = 0;
    

    private void añadirAlumno () {
       alumnosGrupo[indice] = "Nombre: " + nombre + " grupo: " + grupo;
       indice++;
    }

    public Alumno (String n, int ID){
        id = ID;
        nombre = n;
        grupo = "No asignado";
        contadorAlumnos++;
        añadirAlumno();
    }

    public Alumno (String n, int ID, String grup){
        id = ID;
        nombre = n;
        grupo = grup;
        contadorAlumnos++;
        añadirAlumno();
    }

    public void preguntarDuda (){
        System.out.println(nombre + " levanta la mano");
    }
    public static void imprimirInforme () {
        System.out.println(contadorAlumnos);
    }

    public void imprimirInformeAlumnos () {
        for (int i = 0; i < alumnosGrupo.length; i++) {
            System.out.println(alumnosGrupo[i]);
        }
    }

    public static void main(String[] args) {
        Alumno al1, al2, al3;

        al1 = new Alumno("Javier Escrig", 4883);
        al2 = new Alumno("David Balaguer", 1829, "1CFSJ");
        al3 = new Alumno("Paco Leon ", 2321, "M1MT");

        Alumno.imprimirInforme();
        al1.imprimirInformeAlumnos();
    }
} 