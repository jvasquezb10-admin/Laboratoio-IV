package Ejercicio08_PromedioNotas;
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double [] notas = new double[5];

        for ( int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }
        scanner.close();
        
        double promedio = 0;
        for (double nota : notas) {
            promedio += nota;
        }
        promedio /= notas.length;
        System.out.println("El promedio de las notas es: " + promedio);
    }
}
