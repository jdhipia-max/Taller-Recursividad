package Recursividad;

import java.util.ArrayList;
import java.util.List;

/**
 * Series y funciones matemáticas recursivas.
 */
public class Series {

    /** 3. Sumatoria 1 + 1/2 + 1/3 + ... + 1/n. */
    public double sumatoriaArmonica(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n debe ser mayor o igual a 1.");
        }
        if (n == 1) {
            return 1.0;
        }
        return 1.0 / n + sumatoriaArmonica(n - 1);
    }

    /** 13. Fib(0)=0, Fib(1)=1, Fib(n)=Fib(n-1)+Fib(n-2). */
    public long fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n debe ser mayor o igual a cero.");
        }
        return fibonacci(n, 0, 1);
    }

    // Versión con acumuladores: evita la explosión exponencial de la definición ingenua.
    private long fibonacci(int n, long actual, long siguiente) {
        if (n == 0) {
            return actual;
        }
        return fibonacci(n - 1, siguiente, actual + siguiente);
    }

    /** 13. Devuelve los términos Fib(0) ... Fib(limite). */
    public List<Long> serieFibonacci(int limite) {
        if (limite < 0) {
            throw new IllegalArgumentException("El límite debe ser mayor o igual a cero.");
        }
        if (limite == 0) {
            List<Long> serie = new ArrayList<>();
            serie.add(fibonacci(0));
            return serie;
        }
        List<Long> serie = serieFibonacci(limite - 1);
        serie.add(fibonacci(limite));
        return serie;
    }

    /** 14. Función de Ackermann. */
    public long ackermann(long m, long n) {
        if (m < 0 || n < 0) {
            throw new IllegalArgumentException("m y n deben ser no negativos.");
        }
        if (m == 0) {
            return n + 1;
        }
        if (n == 0) {
            return ackermann(m - 1, 1);
        }
        return ackermann(m - 1, ackermann(m, n - 1));
    }
}
