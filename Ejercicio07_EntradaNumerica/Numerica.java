package Ejercicio07_EntradaNumerica;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Numerica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        try{
            int numero = scanner.nextInt();
            System.out.println("Número ingresado: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada inválida. Por favor, ingrese un número entero.");
        } finally {
            scanner.close();
        }
    }
}