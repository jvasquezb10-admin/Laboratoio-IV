package Ejercicio14_SistemaDeEmpleados;

public class EmpleadoTiempoCompleto extends Empleado {
    
    private double salarioMensual;

    public EmpleadoTiempoCompleto(String nombre, double salarioMensual) {
        super(nombre);
        setSalarioMensual(salarioMensual);
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        if (salarioMensual <= 0) {
            throw new IllegalArgumentException(
                "El salario mensual debe ser mayor que cero."
            );
        }

        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularPago() {
        return salarioMensual;
    }
    
}
