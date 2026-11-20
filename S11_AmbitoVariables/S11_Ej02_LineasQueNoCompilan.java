/*
 * Sesión: S11 - Ámbitos de variables
 * Ejercicio 02: Líneas que no compilan
 * Enunciado: comentar con // las líneas con error, indicando el mensaje del compilador y la causa.
 * Autor: Mileydi Dueñas
 * Fecha: 20/11/2026
 */

public class S11_Ej02_LineasQueNoCompilan {

    static int contador = 0;

    static void metodoAuxiliar() {
        int local = 10;
        System.out.println(local);
    }

    public static void main(String[] args) {
        int x = 5;

        if (x > 0) {
            int dentro = 20;
            System.out.println(dentro);
        }

        // System.out.println(dentro);
        // Error: cannot find symbol (symbol: variable dentro)
        // Causa: 'dentro' se declaro en el bloque del if; fuera de el ya no existe.

        // System.out.println(local);
        // Error: cannot find symbol (symbol: variable local)
        // Causa: 'local' pertenece a metodoAuxiliar; main no puede verla.

        // int x = 8;
        // Error: variable x is already defined in method main(String[])
        // Causa: ya existe una variable 'x' en el mismo ambito.

        // int y;
        // System.out.println(y);
        // Error: variable y might not have been initialized
        // Causa: una variable local debe recibir un valor antes de usarse.

        System.out.println("x = " + x + ", contador = " + contador);
        metodoAuxiliar();
    }
}