package Ejercicio05_ValidacionEdad;
import java.util.Scanner;
public class Edad {
    
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        try {
            int edad = scanner.nextInt();
            if (edad < 0) {
                throw new IllegalArgumentException("Edad inválida. Por favor, ingrese un valor positivo.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
