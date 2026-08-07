package Ejercicio02_SistemaDeVehiculos;

public class Vehiculo {
    
    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public static void main(String[] args) {
        Vehiculo carro = new Carro("Toyota", "Corolla", 4);
        Vehiculo moto = new Moto("Honda", "CBR500R", true);

        System.out.println();

        carro.mostrarDatos();
        System.out.println();
        moto.mostrarDatos();
    }
}
