package Ejercicio09_NumeroMayor;
import java.util.Scanner;

public class NumeroMayor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numeros = new double[3];
        double mayor = Double.NEGATIVE_INFINITY;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        scanner.close();
        System.out.println("El número mayor es: " + mayor);
    }
}
