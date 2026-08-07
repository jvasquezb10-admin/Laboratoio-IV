package Ejercicio10_EstadisticasBasicas;
public class EstadisticaBasica {
    public static void main(String[] args) {
        double[] numeros = {5.0, 10.0, 15.0, 20.0, 25.0};

        double suma = 0;
        double mayor = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;

        for (double numero : numeros) {
            suma += numero;
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        double promedio = suma / numeros.length;

        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
        System.out.println("Número mayor: " + mayor);
        System.out.println("Número menor: " + menor);
    }
}