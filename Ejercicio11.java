import java.util.Scanner;

/**
 * @author Anthony German Tenesaca Rosales
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Por favor ingrese 10 numeros:");
            System.out.print("Numero 1: ");
            int primerNumero = entrada.nextInt();
            
            int mayor = primerNumero;
            int menor = primerNumero;
            
            for (int i = 2; i <= 10; i++) {
                System.out.print("Numero " + i + ": ");
                int numero = entrada.nextInt();
                
                if (numero > mayor) {
                    mayor =  numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
            }
            
            System.out.println("\n--- Resultados ---");
            System.out.println("Numero mayor: " + mayor);
            System.out.println("Numero menor: " + menor);
        }
    }
}
