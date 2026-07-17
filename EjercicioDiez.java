/**
 * @author Anthony German Tenesaca Rosales
 */
import java.util.Scanner;

public class EjercicioDiez {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[10];
        int suma = 0;
        double promedio;

        System.out.println("--- Ingreso de 10 numeros enteros ---");
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            suma += numeros[i];
        }
        promedio = (double) suma / 10;

        System.out.println("\n--- Resultados ---");
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}