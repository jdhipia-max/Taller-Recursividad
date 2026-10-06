package Recursividad;

/**
 * Operaciones recursivas sobre cadenas de texto.
 */
public class OperacionesCadenas {

    /** 8. Copia una cadena en otra, carácter por carácter. */
    public String copiar(String origen) {
        return copiar(origen, 0);
    }

    private String copiar(String origen, int indice) {
        if (indice == origen.length()) {
            return "";
        }
        return origen.charAt(indice) + copiar(origen, indice + 1);
    }
}
