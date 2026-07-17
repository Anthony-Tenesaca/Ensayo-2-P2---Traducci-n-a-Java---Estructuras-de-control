import java.util.Scanner;

/**
 * @author Anthony German Tenesaca Rosales
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Ingrese el primer numero entero: ");
            int num1 = entrada.nextInt();
            
            System.out.print("Ingrese el segundo numero entero: ");
            int num2 = entrada.nextInt();
            
            int suma = num1 + num2;
            int resta = num1 - num2;
            int multiplicacion = num1 * num2;
            
            System.out.println("\n--- Resultados ---");
            System.out.println("Suma: " + suma);
            System.out.println("Resta: " + resta);
            System.out.println("Multiplicacion: " + multiplicacion);
            
            if (num2 != 0) {
                double division = (double) num1 / num2;
                int residuo = num1 % num2;
                System.out.println("Division: " + division);
                System.out.println("Residuo: " + residuo);
            } else {
                System.out.println("División: No es posible dividir para cero.");
                System.out.println("Residuo: No es posible calcular el residuo.");
            }
        }
    }
}
