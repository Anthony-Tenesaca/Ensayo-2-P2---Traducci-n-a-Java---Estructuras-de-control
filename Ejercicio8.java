/**
 * @author Anthony German Tenesaca Rosales
 */
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String clave;

        do {
            System.out.print("Ingrese la contrasena: ");
            clave = teclado.nextLine();
        } while (!clave.equals("java2026"));

        System.out.println("Acceso concedido.");
    }
}