/**
 * @author Anthony German Tenesaca Rosales
 */
import java.util.Scanner;

public class EjercicioOnce {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] numeros = new double[10];
        double mayor, menor;

        System.out.println("--- Ingreso de 10 numeros ---");
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextDouble();
        }

        mayor = numeros[0];
        menor = numeros[0];

        for (int i = 1; i < 10; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("\n--- Resultados ---");
        System.out.println("Numero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);
    }
}