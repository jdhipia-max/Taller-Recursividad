package Recursividad;

/**
 * Operaciones aritméticas resueltas de forma recursiva.
 */
public class OperacionesNumericas {

    /** 1. Factorial de n. */
    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El factorial no está definido para negativos.");
        }
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    /** 2. Invierte los dígitos de un número. Ej: 123 -> 321. */
    public long invertir(long numero) {
        if (numero < 0) {
            return -invertir(-numero);
        }
        return invertir(numero, 0);
    }

    private long invertir(long restante, long acumulado) {
        if (restante == 0) {
            return acumulado;
        }
        return invertir(restante / 10, acumulado * 10 + restante % 10);
    }

    /** 4. Suma los dígitos de un número. Ej: 123 -> 6. */
    public int sumarDigitos(long numero) {
        if (numero < 0) {
            return sumarDigitos(-numero);
        }
        if (numero == 0) {
            return 0;
        }
        return (int) (numero % 10) + sumarDigitos(numero / 10);
    }

    /** 5. Sumatoria 1 + 2 + ... + n. */
    public long sumatoriaHasta(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número debe ser mayor o igual a cero.");
        }
        if (n == 0) {
            return 0;
        }
        return n + sumatoriaHasta(n - 1);
    }

    /** 6. Potencia base^exponente (admite exponentes negativos). */
    public double potencia(double base, int exponente) {
        if (exponente < 0) {
            if (base == 0) {
                throw new ArithmeticException("0 no puede elevarse a un exponente negativo.");
            }
            return 1 / potencia(base, -exponente);
        }
        if (exponente == 0) {
            return 1;
        }
        return base * potencia(base, exponente - 1);
    }

    /** 7. Máximo común divisor por el algoritmo de Euclides. */
    public int maximoComunDivisor(int m, int n) {
        m = Math.abs(m);
        n = Math.abs(n);
        if (n == 0) {
            return m;
        }
        return maximoComunDivisor(n, m % n);
    }

    /** 9. Cociente de la división entera mediante restas sucesivas. */
    public int cociente(int dividendo, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        if (dividendo < 0 || divisor < 0) {
            int signo = ((dividendo < 0) ^ (divisor < 0)) ? -1 : 1;
            return signo * cociente(Math.abs(dividendo), Math.abs(divisor));
        }
        if (dividendo < divisor) {
            return 0;
        }
        return 1 + cociente(dividendo - divisor, divisor);
    }

    /** 10. Multiplicación mediante sumas sucesivas. */
    public int multiplicar(int a, int b) {
        if (b == 0) {
            return 0;
        }
        if (b < 0) {
            return -multiplicar(a, -b);
        }
        return a + multiplicar(a, b - 1);
    }
}
