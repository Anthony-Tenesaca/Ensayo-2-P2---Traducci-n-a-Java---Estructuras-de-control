/**
 * @author: Anthony German Tenesaca Rosales
 */
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2;
        int suma, resta, multiplicacion, residuo;
        double division;

        System.out.print("Ingrese el primer numero entero: ");
        num1 = teclado.nextInt();

        System.out.print("Ingrese el segundo numero entero: ");
        num2 = teclado.nextInt();

        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        residuo = num1 % num2;
        division = (double) num1 / num2; // Cast para no perder decimales

        System.out.println("\n--- Resultados ---");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);
        System.out.println("Residuo: " + residuo);
    }
}