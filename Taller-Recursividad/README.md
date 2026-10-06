# Taller de Recursividad

**Estudiante:** _[Juan DAvid Hipia Lopez]_

## Descripción del taller

Taller de programación en Java que resuelve 14 ejercicios **usando funciones recursivas**, aplicando código limpio y programación orientada a objetos (clases con una única responsabilidad, nombres descriptivos, validación de entradas y separación entre lógica y entrada/salida).

| Clase | Responsabilidad | Ejercicios |
|---|---|---|
| `OperacionesNumericas` | Aritmética recursiva | 1, 2, 4, 5, 6, 7, 9, 10 |
| `Series` | Series y funciones matemáticas | 3, 13, 14 |
| `OperacionesCadenas` | Cadenas de texto | 8 |
| `OperacionesColecciones` | Arreglos y matrices | 11, 12 |
| `Consola` | Lectura de datos por teclado | — |
| `Main` | Menú interactivo | — |

Notas:
- Ejercicio 13: se imprimen los términos `Fib(0)` hasta `Fib(límite)`.
- Ejercicio 14: valores grandes de `m` (≥ 4) provocan desbordamiento de pila por la naturaleza de la función; el programa lo captura e informa.

## Estructura

```
Taller-Recursividad/
├── src/
│   └── Recursividad/
│       ├── Main.java
│       ├── Consola.java
│       ├── OperacionesNumericas.java
│       ├── Series.java
│       ├── OperacionesCadenas.java
│       └── OperacionesColecciones.java
└── README.md
```

## Instrucciones para ejecutar

Requisitos: **JDK 17 o superior**.

Desde la carpeta raíz `Taller-Recursividad/`:

```bash
# Compilar
javac -d out src/Recursividad/*.java

# Ejecutar
java -cp out Recursividad.Main
```

Seleccione del menú el número del ejercicio e ingrese los datos solicitados. Use `0` para salir.
