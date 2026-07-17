import java.util.Scanner;

/**
 * @author Anthony German Tenesaca Rosales
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int suma = 0;
            
            System.out.println("Por favor ingrese 10 numeros enteros:");
            for (int i = 1; i <= 10; i++) {
                System.out.print("Numero " + i + ": ");
                int numero = entrada.nextInt();
                suma += numero;
            }
            
            double promedio = (double) suma / 10;
            
            System.out.println("\n--- Resultados ---");
            System.out.println("Suma total: " + suma);
            System.out.println("Promedio: " + promedio);
        }
    }
}
