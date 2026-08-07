package Ejercicio04_SistemaDeBiblioteca;

public class Libro extends Material {

    private String autor;
    private boolean disponible;

    public Libro(String titulo, String autor, boolean disponible) {
        super(titulo);
        this.autor = autor;
        this.disponible = disponible;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }

    @Override
    public boolean esDisponible() {
        return disponible;
    }
    

}
