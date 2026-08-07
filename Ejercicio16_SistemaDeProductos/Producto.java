package Ejercicio16_SistemaDeProductos;

public abstract class Producto {
    private String nombre;

    public Producto(String nombre) {
        setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    public abstract void mostrarInformacion();

    public static void main(String[] args) {

        Producto producto1 = new ProductoFisico("Laptop");

        Producto producto2 = new ProductoDigital("Curso de Java");

        producto1.mostrarInformacion();
        producto2.mostrarInformacion();
    }
}
