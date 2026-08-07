package Ejercicio02_SistemaDeVehiculos;

public class Moto extends Vehiculo {
    
    private boolean tieneCasco;

    public Moto(String marca, String modelo, boolean tieneCasco) {
        super(marca, modelo);
        this.tieneCasco = tieneCasco;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tiene casco: " + tieneCasco);
    }

    public boolean isTieneCasco() {
        return tieneCasco;
    }

    public void setTieneCasco(boolean tieneCasco) {
        this.tieneCasco = tieneCasco;
    }

    
}