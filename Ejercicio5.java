import java.util.Scanner;

/**
 * @author Anthony German Tenesaca Rosales
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Ingrese una calificacion (entre 0 y 10): ");
            double calificacion = entrada.nextDouble();
            
            if (calificacion < 0 || calificacion > 10) {
                System.out.println("Calificacion no valida. Debe estar entre 0 y 10.");
            } else if (calificacion >= 9.0) {
                System.out.println("Excelente");
            } else if (calificacion >= 8.0) {
                System.out.println("Muy Bueno");
            } else if (calificacion >= 7.0) {
                System.out.println("Bueno");
            } else if (calificacion >= 5.0) {
                System.out.println("Regular");
            } else {
                System.out.println("Deficiente");
            }
        }
    }
}

