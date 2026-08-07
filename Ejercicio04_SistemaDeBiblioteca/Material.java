package Ejercicio04_SistemaDeBiblioteca;

public abstract class Material {

    protected String titulo;

    public Material(String titulo) {
        this.titulo = titulo;

    }
    public abstract void mostrarInformacion();
    public abstract boolean esDisponible();

    public static void main(String[] args) {
        Material libro1 = new Libro("El Quijote", "Miguel de Cervantes", true);
        Material revista1 = new Revista("National Geographic", "National Geographic Society", false);

        System.out.println("Información del libro:");
        libro1.mostrarInformacion();
        System.out.println("Disponible: " + (libro1.esDisponible() ? "Sí" : "No"));

        System.out.println("\nInformación de la revista:");
        revista1.mostrarInformacion();
        System.out.println("Disponible: " + (revista1.esDisponible() ? "Sí" : "No"));
    }
}