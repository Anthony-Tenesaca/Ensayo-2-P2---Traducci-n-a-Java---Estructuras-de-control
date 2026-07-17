import java.util.Scanner;

/**
 * @author Anthony German Tenesaca Rosales
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Ingrese su edad: ");
            int edad = entrada.nextInt();
            
            if (edad >= 18) {
                System.out.println("Es mayor de edad.");
            }
        }
    }
}

