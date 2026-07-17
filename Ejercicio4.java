/**
 * @author Anthony German Tenesaca Rosales
 */
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota;

        System.out.print("Ingrese la nota del estudiante: ");
        nota = teclado.nextDouble();

        if (nota >= 7) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }
}