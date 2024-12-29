import java.io.IOException;
import java.util.Scanner;

public class DolarASoles {

    public void DolarASoles() throws IOException, InterruptedException {
        // Implementación de la conversión de soles a dólares

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor que desea convertir:");
        double cantidad = scanner.nextDouble();

        Conversor conversor = new Conversor();

        System.out.println("El valor de " + cantidad + " Dolares, " + "corresponde al valor final de: "
                + "S/ " + conversor.conversor("USD", "PEN", cantidad));
    }
}