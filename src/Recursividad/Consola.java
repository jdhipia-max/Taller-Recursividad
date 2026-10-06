package Recursividad;

import java.util.Scanner;

/**
 * Encapsula la lectura de datos por teclado.
 */
public class Consola {

    private final Scanner scanner = new Scanner(System.in);

    public int leerEntero(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print("Valor inválido. " + mensaje);
        }
        return scanner.nextInt();
    }

    public long leerLargo(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextLong()) {
            scanner.next();
            System.out.print("Valor inválido. " + mensaje);
        }
        return scanner.nextLong();
    }

    public double leerDecimal(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.print("Valor inválido. " + mensaje);
        }
        return scanner.nextDouble();
    }

    public String leerLinea(String mensaje) {
        System.out.print(mensaje);
        if (scanner.hasNextLine()) {
            scanner.nextLine(); // descarta salto de línea pendiente
        }
        return scanner.hasNextLine() ? scanner.nextLine() : "";
    }
}
