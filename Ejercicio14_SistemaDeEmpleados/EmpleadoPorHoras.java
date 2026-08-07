package Ejercicio14_SistemaDeEmpleados;
public class EmpleadoPorHoras extends Empleado {
    private double horasTrabajadas;
    private double pagoPorHora;

    public EmpleadoPorHoras(String nombre, double horasTrabajadas, double pagoPorHora) {
        super(nombre);
        setHorasTrabajadas(horasTrabajadas);
        setPagoPorHora(pagoPorHora);
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double getPagoPorHora() {
        return pagoPorHora;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        if (horasTrabajadas < 0) {
            throw new IllegalArgumentException(
                "Las horas trabajadas no pueden ser negativas."
            );
        }

        this.horasTrabajadas = horasTrabajadas;
    }

    public void setPagoPorHora(double pagoPorHora) {
        if (pagoPorHora <= 0) {
            throw new IllegalArgumentException(
                "El pago por hora debe ser mayor que cero."
            );
        }

        this.pagoPorHora = pagoPorHora;
    }

    @Override
    public double calcularPago() {
        return horasTrabajadas * pagoPorHora;
    }

}