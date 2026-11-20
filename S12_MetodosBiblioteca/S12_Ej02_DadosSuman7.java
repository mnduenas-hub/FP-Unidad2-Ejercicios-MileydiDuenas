/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio 02: Dados que suman 7
 * Enunciado: 1000 lanzamientos de dos dados con Random; mostrar el conteo y el porcentaje de veces que suman 7.
 * Autor: Mileydi Dueñas
 * Fecha: 20/11/2026
 */

import java.util.Random;

public class S12_Ej02_DadosSuman7 {

    public static void main(String[] args) {
        Random rnd = new Random();
        final int LANZAMIENTOS = 1000;
        int conteo = 0;

        for (int i = 0; i < LANZAMIENTOS; i++) {
            int dado1 = rnd.nextInt(6) + 1;   // 1..6
            int dado2 = rnd.nextInt(6) + 1;   // 1..6
            if (dado1 + dado2 == 7) {
                conteo++;
            }
        }

        double porcentaje = conteo * 100.0 / LANZAMIENTOS;

        System.out.println("Lanzamientos: " + LANZAMIENTOS);
        System.out.println("Veces que sumaron 7: " + conteo);
        System.out.printf("Porcentaje: %.2f%%%n", porcentaje);
    }
}