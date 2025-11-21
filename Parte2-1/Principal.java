import java.util.Scanner;
/**
 *
 * @author Nilus
 */

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese el dividendo: ");
            int dividendo = scanner.nextInt();
            System.out.print("Ingrese el divisor: ");
            int divisor = scanner.nextInt();

            int resultado = dividendo / divisor;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        }
    }
}
