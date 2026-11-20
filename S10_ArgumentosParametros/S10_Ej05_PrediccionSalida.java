/*
 * Sesión: S10 - Métodos y paso de parámetros
 * Ejercicio 05: Prediccion de salida
 * Enunciado: programa con 3 llamadas; predecir la salida y compararla con la real.
 * Autor: Mileydi Dueñas
 * 20/11/2026
 */

public class S10_Ej05_PrediccionSalida {

    static int cuadrado(int x) {
        return x * x;
    }

    static void sumarUno(int n) {
        n = n + 1;
    }

    static void sumarUnoArreglo(int[] v) {
        v[0] = v[0] + 1;
    }

    public static void main(String[] args) {
        // Llamada 1
        System.out.println(cuadrado(4));

        // Llamada 2
        int n = 5;
        sumarUno(n);
        System.out.println(n);

        // Llamada 3
        int[] arr = {10, 20};
        sumarUnoArreglo(arr);
        System.out.println(arr[0]);
    }

/*
 * SALIDA ESPERADA:
 * 16   (cuadrado(4) devuelve 4 * 4)
 * 5    (n se pasa como una copia, así que sumarUno no cambia el valor original)
 * 11   (el arreglo se modifica directamente, por eso v[0] pasa de 10 a 11)
 *
 * SALIDA REAL:
 * 16
 * 5
 * 11
 */
}