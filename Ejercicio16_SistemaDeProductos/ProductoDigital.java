package Ejercicio16_SistemaDeProductos;
public class ProductoDigital extends Producto {

    public ProductoDigital(String nombre) {
        super(nombre);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Producto Digital: " + getNombre());
    }
}