/*
 * Sesión: S10 - Métodos y paso de parámetros
 * Ejercicio 02: intercambiar(int[] v, int i, int j)
 * Enunciado: intercambiar dos posiciones de un arreglo usando un método.
 * Autor: Mileydi Dueñas
 * Fecha: 20/11/2026
 */

import java.util.Arrays;

public class S10_Ej02_IntercambiarArreglo {

    static void intercambiar(int[] v, int i, int j) {
        int temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }

    public static void main(String[] args) {
        int[] datos = {1, 2, 3, 4, 5};

        System.out.println("Antes:   " + Arrays.toString(datos));
        intercambiar(datos, 0, 4);
        System.out.println("Después: " + Arrays.toString(datos));

/*
 * ¿Por qué ahora sí funciona?
 *
 * Porque un arreglo es un objeto. Al llamar al método, Java entrega una
 * copia de la dirección donde está guardado el arreglo, no una copia de
 * todos sus valores.
 *
 * Por eso, tanto la copia como el arreglo original de main apuntan al
 * mismo lugar. Cuando dentro del método cambiamos v[i] y v[j], en realidad
 * estamos cambiando los valores del arreglo original.
 */
    }
}