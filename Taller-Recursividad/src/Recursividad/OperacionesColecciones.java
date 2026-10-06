package Recursividad;

/**
 * Operaciones recursivas sobre arreglos y matrices.
 */
public class OperacionesColecciones {

    /** 11. Suma los elementos de un arreglo. */
    public int sumarArreglo(int[] arreglo) {
        return sumarArreglo(arreglo, 0);
    }

    private int sumarArreglo(int[] arreglo, int indice) {
        if (indice == arreglo.length) {
            return 0;
        }
        return arreglo[indice] + sumarArreglo(arreglo, indice + 1);
    }

    /** 12. Suma los elementos de una matriz m x n. */
    public int sumarMatriz(int[][] matriz) {
        return sumarMatriz(matriz, 0, 0);
    }

    private int sumarMatriz(int[][] matriz, int fila, int columna) {
        if (fila == matriz.length) {
            return 0;
        }
        if (columna == matriz[fila].length) {
            return sumarMatriz(matriz, fila + 1, 0);
        }
        return matriz[fila][columna] + sumarMatriz(matriz, fila, columna + 1);
    }
}
