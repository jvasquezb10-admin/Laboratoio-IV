package Ejercicicio04_SistemaDeBiblioteca;

public class Revista extends Material {

    private String editorial;
    private boolean disponible;

    public Revista(String titulo, String editorial, boolean disponible) {
        super(titulo);
        this.editorial = editorial;
        this.disponible = disponible;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Editorial: " + editorial);
    }

    @Override
    public boolean esDisponible() {
        return disponible;
    }
    
}
