import java.util.Scanner;

/**
 * @author Anthony German Tenesaca Rosales
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Ingrese un numero entero para ver su tabla de multiplicar: ");
            int numero = entrada.nextInt();
            
            System.out.println("\nTabla de multiplicar del " + numero + ":");
            for (int i = 1; i <= 12; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }
        }
    }
}
