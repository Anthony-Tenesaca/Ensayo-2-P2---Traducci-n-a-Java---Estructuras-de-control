/**
 * @author Anthony German Tenesaca Rosales
 */
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cantidad = 0;
        double sumaTotal = 0;
        double numero;

        do {
            System.out.print("Ingrese un numero positivo (o uno negativo para salir): ");
            numero = teclado.nextDouble();

            if (numero >= 0) {
                sumaTotal += numero;
                cantidad++;
            }
        } while (numero >= 0);

        System.out.println("\n--- Resultados ---");
        System.out.println("Cantidad de numeros ingresados: " + cantidad);
        System.out.println("Suma total: " + sumaTotal);
    }
}