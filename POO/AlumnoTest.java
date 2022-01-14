public class AlumnoTest {
    public static void main(String[] args) {
        Alumno a1, a2, a3, a4;
    
        a1 = new Alumno("Pablo", 1);
        a2 = new Alumno("María", 2);
        a3 = new Alumno("Manuel", 3);
        a4 = new Alumno("Francisco", 4);

        Alumno [] lista = {a1,a2,a3,a4};
        a1.preguntarDuda();
        Alumno.imprimirInforme();
        Alumno.imprimirInformeAlumnos(lista);
    }
}