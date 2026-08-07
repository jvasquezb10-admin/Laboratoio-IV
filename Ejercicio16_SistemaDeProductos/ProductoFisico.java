package Ejercicio16_SistemaDeProductos;
public class ProductoFisico extends Producto {

    public ProductoFisico(String nombre) {
        super(nombre);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Producto Físico: " + getNombre());
    }
}