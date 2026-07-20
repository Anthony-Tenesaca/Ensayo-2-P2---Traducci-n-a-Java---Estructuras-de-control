/**
 * @author: Anthony German Tenesaca Rosales
 */
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre, carrera;
        int edad;
        double estatura;

        System.out.print("Ingrese su nombre: ");
        nombre = teclado.nextLine();

        System.out.print("Ingrese su edad: ");
        edad = teclado.nextInt();
        teclado.nextLine(); 

        System.out.print("Ingrese su carrera: ");
        carrera = teclado.nextLine();

        System.out.print("Ingrese su estatura (ej. 1,75): ");
        estatura = teclado.nextDouble();

        System.out.println("\n--- Datos Registrados ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("Estatura: " + estatura);
    }
}
