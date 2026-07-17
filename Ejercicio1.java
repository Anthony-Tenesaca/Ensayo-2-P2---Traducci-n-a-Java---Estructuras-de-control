/**
 * @author Anthony German Tenesaca Rosales
 */
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Ingrese su nombre: ");
            String nombre = entrada.nextLine();
            
            System.out.print("Ingrese su edad: ");
            int edad = entrada.nextInt();
            entrada.nextLine(); // Limpiar el buffer de entrada
            
            System.out.print("Ingrese su carrera: ");
            String carrera = entrada.nextLine();
            
            System.out.print("Ingrese su estatura (ej. 1.75): ");
            double estatura = entrada.nextDouble();
            
            System.out.println("\n--- Datos del Estudiante ---");
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad + " anios");
            System.out.println("Carrera: " + carrera);
            System.out.println("Estatura: " + estatura + " m");
        }
    }

    /**
     * @author Anthony German Tenesaca Rosales
     */
    public static class Ejercicio11 {

        public static void main(String[] args) {
            try (Scanner entrada = new Scanner(System.in)) {
                System.out.println("Por favor ingrese 10 numeros:");
                System.out.print("Numero 1: ");
                int primerNumero = entrada.nextInt();
                int mayor = primerNumero;
                int menor = primerNumero;
                for (int i = 2; i <= 10; i++) {
                    System.out.print("Numero " + i + ": ");
                    int numero = entrada.nextInt();
                    if (numero > mayor) {
                        mayor = numero;
                    }
                    if (numero < menor) {
                        menor = numero;
                    }
                }
                System.out.println("\n--- Resultados ---");
                System.out.println("Numero mayor: " + mayor);
                System.out.println("Numero menor: " + menor);
            }
        }
    }
}