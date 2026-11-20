/*
 * Sesión: S10 - Métodos y paso de parámetros
 * Ejercicio 01: intercambiar(int a, int b)
 * Enunciado: escribir un método que intente intercambiar dos enteros y comprobar si funciona.
 * Autor: Mileydi Dueñas
 * Fecha: 20/11/2026
 */

public class S10_Ej01_Intercambiar {

    static void intercambiar(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        System.out.println("Antes:   x = " + x + ", y = " + y);
        intercambiar(x, y);
        System.out.println("Después: x = " + x + ", y = " + y);

/*
 * ¿Funciona? No.
 *
 * ¿Por qué? Java envía una copia de los valores de x e y al método.
 * Dentro del método se intercambian esas copias, llamadas a y b,
 * pero las variables originales x e y de main siguen teniendo
 * los mismos valores.
 */
    }
}