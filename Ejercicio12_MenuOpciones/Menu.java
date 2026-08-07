package Ejercicio12_MenuOpciones;
import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menú de opciones:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Cuantos números desea sumar?");
                int cantidad = scanner.nextInt();
                double suma = 0;
                for (int i = 0; i < cantidad; i++) {
                    System.out.print("Ingrese el número " + (i + 1) + ": ");
                    double numero = scanner.nextDouble();
                    suma += numero;
                }
                System.out.println("La suma es: " + suma);
                break;
            case 2:
                System.out.println("Cuantos números desea restar?");
                int cantidadResta = scanner.nextInt();

                System.out.print("Ingrese el número 1: ");
                double resta = scanner.nextDouble();

                for (int i = 1; i < cantidadResta; i++) {
                    System.out.print("Ingrese el número " + (i + 1) + ": ");
                    double numero = scanner.nextDouble();
                    resta -= numero;
                }
                System.out.println("La resta es: " + resta);
                break;
            case 3:
                System.out.println("Saliendo del programa.");
                break;
            default:
                System.out.println("Opción inválida.");
        }
        scanner.close();
    }
}
