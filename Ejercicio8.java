import java.util.Scanner;

/**
 * @author Anthony German Tenesaca Rosales
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            String claveCorrecta = "java2026";
            String intentoClave;
            
            do {
                System.out.print("Ingrese la contrasena: ");
                intentoClave = entrada.nextLine();
                
                if (!intentoClave.equals(claveCorrecta)) {
                    System.out.println("Contrasena incorrecta. Intente de nuevo.");
                }
            } while (!intentoClave.equals(claveCorrecta));
            
            System.out.println("Acceso concedido.");
        }
    }
}
