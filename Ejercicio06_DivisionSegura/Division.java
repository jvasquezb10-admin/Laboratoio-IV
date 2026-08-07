package Ejercicio06_DivisionSegura;

import java.util.Scanner;
public class Division {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el dividendo: ");
        int dividendo = scanner.nextInt();
        System.out.print("Ingrese el divisor: ");
        int divisor = scanner.nextInt();

        try {
            if (divisor == 0) {
                throw new ArithmeticException("Error: División por cero no permitida.");
            }
            int resultado = dividendo / divisor;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
