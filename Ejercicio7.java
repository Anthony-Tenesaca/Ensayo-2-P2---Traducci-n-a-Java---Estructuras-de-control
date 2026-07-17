import java.util.Scanner;

/**
 * @author Anthony German Tenesaca Rosales
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int contador = 0;
            int sumaTotal = 0;
            
            System.out.println("Ingrese numeros enteros(numero negativo para terminar):");
            int numero = entrada.nextInt();
            
            while (numero >= 0) {
                sumaTotal += numero;
                contador++;
                numero = entrada.nextInt();
            }
            
            System.out.println("\n--- Resumen ---");
            System.out.println("Cantidad de numeros ingresados: " + contador);
            System.out.println("Suma total: " + sumaTotal);
        }
    }
}
