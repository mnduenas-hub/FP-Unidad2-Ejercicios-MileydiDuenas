/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio 05: Codigo de 6 caracteres
 * Enunciado: generar un codigo con 3 letras aleatorias seguidas de 3 digitos aleatorios.
 * Autor: Mileydi Dueñas
 * Fecha: 20/11/2026
 */

import java.util.Random;

public class S12_Ej05_Codigo6Caracteres {

    public static void main(String[] args) {
        Random rnd = new Random();
        String codigo = "";

        // 3 letras mayusculas aleatorias (A-Z)
        for (int i = 0; i < 3; i++) {
            char letra = (char) ('A' + rnd.nextInt(26));
            codigo += letra;
        }

        // 3 digitos aleatorios (0-9)
        for (int i = 0; i < 3; i++) {
            codigo += rnd.nextInt(10);
        }

        System.out.println("Código generado: " + codigo);
    }
}