public class Alumno {
    /*crear una clase alumno cuyos objetos tendran como caracteristica un id un nombre y un gurpo 1CFSJ,se podran crear alumnos solo con el nombre y el identificador o tambien con los tres atributos tambien debera tener un metodo llamado preguntar duda que tendra que imprimir el nombre del alumno con el texto "levanta la mano" y ademas tendra que tener un contador del numero de alumnos creados habrá un metodo de clase llamado imprimir informe que muestra el total de alumnos y otro metodo de clase que se llama imprimir informe alumnos al que se le pasa como parametro un array de alumnos e imprime el nombre y grupo de cada alumno*/

    //atributos objetos
    private int id;
    private String nombre;
    private String grupo;
    
    //atributos clase
    private static int contadorAlumnos= 0;
    
    public Alumno (String nombreAlumno, int Identificador){
        id = Identificador;
        nombre = nombreAlumno;
        grupo = "No asignado";
        contadorAlumnos++;
    }

    public Alumno (String nombreAlumno, int identificador, String nombreGrupo){
        id = identificador;
        nombre = nombreAlumno;
        grupo = nombreGrupo;
        contadorAlumnos++;
    }
 
    public void preguntarDuda (){
        System.out.println(nombre + " levanta la mano");
    }

    public static void imprimirInforme () {
        System.out.println("Total alumnos: " + contadorAlumnos);
    }

    public static void imprimirInformeAlumnos (Alumno[] alumnos)  {
        System.out.println("Nombre\t\tGrupo\t\tIdentificador");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.nombre + "\t\t" + alumno.grupo + "\t\t" + alumno.id);;
        }
    }
} 