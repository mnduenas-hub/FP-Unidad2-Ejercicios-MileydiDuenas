/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio 04: Contar vocales
 * Enunciado: contar las vocales de un texto (mayusculas y minusculas) con String y Character.
 * Autor: Mileydi Dueñas
 * Fecha: 20/11/2026
 */

import java.util.Scanner;

public class S12_Ej04_ContarVocales {

    static int contarVocales(String texto) {
        int total = 0;
        for (int i = 0; i < texto.length(); i++) {
            char c = Character.toLowerCase(texto.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                total++;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un texto: ");
        String texto = sc.nextLine();

        System.out.println("Cantidad de vocales: " + contarVocales(texto));
        sc.close();
    }
}