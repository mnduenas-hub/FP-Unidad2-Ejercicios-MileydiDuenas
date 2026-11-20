/*
 * Sesión: S11 - Ámbitos de variables
 * Ejercicio 03: Traza del contador static
 * Enunciado: programa con un contador static y la tabla línea | variables vivas | valor.
 * Autor: Mileydi Dueñas
 * Fecha: 20/11/2026
 * */

public class S11_Ej03_TrazaStatic {

    static int contador = 0;

    static void incrementar() {
        contador++;
    }

    public static void main(String[] args) {
        incrementar();
        incrementar();
        int copia = contador;
        incrementar();
        System.out.println("contador = " + contador);
        System.out.println("copia = " + copia);
    }
}

/*
 * TRAZA (orden de ejecución)
 *
 * línea | variables vivas        | valor
 *  11   | contador               | contador = 0
 *  18   | contador               | contador = 0 (se llama a incrementar)
 *  14   | contador               | contador = 1
 *  19   | contador               | contador = 1 (se llama a incrementar)
 *  14   | contador               | contador = 2
 *  20   | contador, copia        | contador = 2, copia = 2
 *  21   | contador, copia        | contador = 2 (se llama a incrementar)
 *  14   | contador, copia        | contador = 3, copia = 2
 *  22   | contador, copia        | imprime "contador = 3"
 *  23   | contador, copia        | imprime "copia = 2"
 */