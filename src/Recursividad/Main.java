package Recursividad;

import java.util.Arrays;

/**
 * Menú principal del taller de recursividad.
 */
public class Main {

    private final Consola consola = new Consola();
    private final OperacionesNumericas numericas = new OperacionesNumericas();
    private final Series series = new Series();
    private final OperacionesCadenas cadenas = new OperacionesCadenas();
    private final OperacionesColecciones colecciones = new OperacionesColecciones();

    public static void main(String[] args) {
        new Main().ejecutar();
    }

    private void ejecutar() {
        int opcion;
        do {
            mostrarMenu();
            opcion = consola.leerEntero("Seleccione una opción: ");
            try {
                procesar(opcion);
            } catch (IllegalArgumentException | ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (StackOverflowError e) {
                System.out.println("Error: los valores son demasiado grandes para la recursión.");
            }
        } while (opcion != 0);
        System.out.println("¡Hasta pronto!");
    }

    private void mostrarMenu() {
        System.out.println("\n===== TALLER DE RECURSIVIDAD =====");
        System.out.println(" 1. Factorial");
        System.out.println(" 2. Invertir número");
        System.out.println(" 3. Sumatoria 1 + 1/2 + ... + 1/n");
        System.out.println(" 4. Suma de dígitos");
        System.out.println(" 5. Sumatoria hasta n");
        System.out.println(" 6. Potencia");
        System.out.println(" 7. M.C.D. (Euclides)");
        System.out.println(" 8. Copiar cadena");
        System.out.println(" 9. Cociente (restas sucesivas)");
        System.out.println("10. Multiplicación (sumas sucesivas)");
        System.out.println("11. Suma de un arreglo");
        System.out.println("12. Suma de una matriz");
        System.out.println("13. Serie de Fibonacci");
        System.out.println("14. Función de Ackermann");
        System.out.println(" 0. Salir");
    }

    private void procesar(int opcion) {
        switch (opcion) {
            case 1 -> System.out.println("Factorial: "
                    + numericas.factorial(consola.leerEntero("Número: ")));
            case 2 -> System.out.println("Invertido: "
                    + numericas.invertir(consola.leerLargo("Número: ")));
            case 3 -> System.out.println("Sumatoria: "
                    + series.sumatoriaArmonica(consola.leerEntero("Valor de n: ")));
            case 4 -> System.out.println("Suma de dígitos: "
                    + numericas.sumarDigitos(consola.leerLargo("Número: ")));
            case 5 -> System.out.println("Sumatoria: "
                    + numericas.sumatoriaHasta(consola.leerEntero("Número: ")));
            case 6 -> {
                double base = consola.leerDecimal("Base: ");
                int exponente = consola.leerEntero("Exponente: ");
                System.out.println("Potencia: " + numericas.potencia(base, exponente));
            }
            case 7 -> {
                int m = consola.leerEntero("M: ");
                int n = consola.leerEntero("N: ");
                System.out.println("M.C.D.: " + numericas.maximoComunDivisor(m, n));
            }
            case 8 -> System.out.println("Copia: "
                    + cadenas.copiar(consola.leerLinea("Cadena: ")));
            case 9 -> {
                int dividendo = consola.leerEntero("Dividendo: ");
                int divisor = consola.leerEntero("Divisor: ");
                System.out.println("Cociente: " + numericas.cociente(dividendo, divisor));
            }
            case 10 -> {
                int a = consola.leerEntero("Primer número: ");
                int b = consola.leerEntero("Segundo número: ");
                System.out.println("Producto: " + numericas.multiplicar(a, b));
            }
            case 11 -> procesarArreglo();
            case 12 -> procesarMatriz();
            case 13 -> System.out.println("Serie: "
                    + series.serieFibonacci(consola.leerEntero("Límite: ")));
            case 14 -> {
                long m = consola.leerLargo("m: ");
                long n = consola.leerLargo("n: ");
                System.out.println("Ackermann(" + m + ", " + n + ") = " + series.ackermann(m, n));
            }
            case 0 -> { }
            default -> System.out.println("Opción no válida.");
        }
    }

    private void procesarArreglo() {
        int cantidad = consola.leerEntero("Cantidad de valores: ");
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad no puede ser negativa.");
        }
        int[] arreglo = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            arreglo[i] = consola.leerEntero("Valor " + (i + 1) + ": ");
        }
        System.out.println("Arreglo: " + Arrays.toString(arreglo));
        System.out.println("Suma: " + colecciones.sumarArreglo(arreglo));
    }

    private void procesarMatriz() {
        int filas = consola.leerEntero("Filas (m): ");
        int columnas = consola.leerEntero("Columnas (n): ");
        if (filas < 0 || columnas < 0) {
            throw new IllegalArgumentException("Las dimensiones no pueden ser negativas.");
        }
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = consola.leerEntero("Elemento [" + i + "][" + j + "]: ");
            }
        }
        System.out.println("Suma de la matriz: " + colecciones.sumarMatriz(matriz));
    }
}
