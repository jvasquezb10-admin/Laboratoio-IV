package Ejercicio03_SistemaDePagos;

import java.util.ArrayList;

public abstract class Pago {
    protected double monto;


    public Pago(double monto) {
        this.monto = monto;
    }

    public abstract void procesarPago();

    public static void main(String[] args) {
        ArrayList<Pago> pagos = new ArrayList<>();

        pagos.add(new PagoTarjeta(250));
        pagos.add(new PagoEfectivo(100));
        pagos.add(new PagoTarjeta(500));
        pagos.add(new PagoEfectivo(75));

        for (Pago pago : pagos) {
            pago.procesarPago();
        }
    }
}