/*
 * Sesión: S11 - Ámbitos de variables
 * Ejercicio 04: Reescribir sin static
 * Enunciado: reescribir el programa con contador static usando parametros y return.
 * Autor: Mileydi Dueñas
 * Fecha: 20/11/2026
 */

public class S11_Ej04_ReescribirSinStatic {

    /* ---------- VERSIÓN ORIGINAL (con static) ----------
    static int contador = 0;

    static void incrementar() {
        contador++;
    }

    public static void main(String[] args) {
        incrementar();
        incrementar();
        incrementar();
        System.out.println("contador = " + contador);
    }
    ------------------------------------------------------- */

    // ---------- VERSIÓN NUEVA (sin static: parametros y return) ----------
    static int incrementar(int contador) {
        return contador + 1;
    }

    public static void main(String[] args) {
        int contador = 0;               // ahora es una variable local de main
        contador = incrementar(contador);
        contador = incrementar(contador);
        contador = incrementar(contador);
        System.out.println("contador = " + contador);
    }
}