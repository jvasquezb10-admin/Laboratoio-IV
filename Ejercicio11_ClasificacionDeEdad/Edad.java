package Ejercicio11_ClasificacionDeEdad;
import java.util.Scanner;

public class Edad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        scanner.close();
        try {
            if (edad <= 0) {
                throw new IllegalArgumentException("Edad inválida.");
            } else if (edad < 13) {
                System.out.println("Es un niño.");
            } else if (edad < 18) {
                System.out.println("Es un adolescente.");
            } else {
                System.out.println("Es un adulto.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
