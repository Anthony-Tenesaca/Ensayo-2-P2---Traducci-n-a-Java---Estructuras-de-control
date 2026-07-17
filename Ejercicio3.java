/**
 * @author Anthony German Tenesaca Rosales
 */
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;

        System.out.print("Ingrese su edad: ");
        edad = teclado.nextInt();

        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        }
    }
}