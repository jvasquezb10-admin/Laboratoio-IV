package Ejercicio14_SistemaDeEmpleados;

public abstract class Empleado {
    private String nombre;

    public Empleado(String nombre) {
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

    public abstract double calcularPago();

    public static void main(String[] args) {

        Empleado empleado1 = new EmpleadoTiempoCompleto("Carlos", 5000);

        Empleado empleado2 = new EmpleadoPorHoras("Ana", 80, 40);

        System.out.println(empleado1.getNombre());
        System.out.println("Pago: Q" + empleado1.calcularPago());

        System.out.println();

        System.out.println(empleado2.getNombre());
        System.out.println("Pago: Q" + empleado2.calcularPago());
        
    }

}
