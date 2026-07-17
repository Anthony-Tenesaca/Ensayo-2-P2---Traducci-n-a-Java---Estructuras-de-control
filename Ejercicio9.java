/**
 * @author Anthony German Tenesaca Rosales
 */
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.print("Ingrese un numero entero: ");
        numero = teclado.nextInt();

        System.out.println("\n--- Tabla del " + numero + " ---");
        for (int i = 1; i < 13; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}