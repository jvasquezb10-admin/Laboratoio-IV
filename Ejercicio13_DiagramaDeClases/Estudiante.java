package Ejercicio13_DiagramaDeClases;

public class Estudiante extends Persona {
    private String nombre;
    private int edad;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String mostrarInformacion() {
        return "Estudiante: " + nombre + ", Edad: " + edad;
    }
}
