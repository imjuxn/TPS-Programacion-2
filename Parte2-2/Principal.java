/**
 *
 * @author Nilus
 */ 
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        String entrada = scanner.nextLine();

        try {
            int numero = Integer.parseInt(entrada);
            System.out.println("Número ingresado: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: La entrada no es un número válido.");
        }
    }
}
