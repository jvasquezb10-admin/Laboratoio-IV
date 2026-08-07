package Ejercicio13_DiagramaDeClases;

public class Curso extends Estudiante {
    private String nombreCurso;
    private String codigoCurso;

    public Curso(String nombre, int edad, String nombreCurso, String codigoCurso) {
        super(nombre, edad);
        this.nombreCurso = nombreCurso;
        this.codigoCurso = codigoCurso;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + ", Curso: " + nombreCurso + ", Código: " + codigoCurso;
    }
    
}
