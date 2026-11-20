/*
 * Sesión: S10 - Métodos y paso de parámetros
 * Ejercicio 03: aplicarDescuento(double[] precios, double pct)
 * Enunciado: modificar un arreglo de precios aplicando un porcentaje de descuento.
 * Autor: Mileydi Dueñas
 * Fecha: 20/11/2026
 */

import java.util.Arrays;

public class S10_Ej03_AplicarDescuento {

    static void aplicarDescuento(double[] precios, double pct) {
        for (int i = 0; i < precios.length; i++) {
            precios[i] = precios[i] * (1 - pct / 100);
        }
    }

    public static void main(String[] args) {
        double[] precios = {100.0, 250.5, 80.0, 40.0};

        System.out.println("Antes:   " + Arrays.toString(precios));
        aplicarDescuento(precios, 10);
        System.out.println("Después: " + Arrays.toString(precios));
    }
}