/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio 03: Validar una contraseña
 * Enunciado: minimo 8 caracteres, al menos una mayuscula y un digito.
 * Autor: Mileydi Dueñas
 * Fecha: 20/11/2026
 */

import java.util.Scanner;

public class S12_Ej03_ValidarPassword {

    static boolean esValida(String clave) {
        if (clave.length() < 8) {
            return false;
        }

        boolean hayMayuscula = false;
        boolean hayDigito = false;

        for (int i = 0; i < clave.length(); i++) {
            char c = clave.charAt(i);
            if (Character.isUpperCase(c)) {
                hayMayuscula = true;
            }
            if (Character.isDigit(c)) {
                hayDigito = true;
            }
        }

        return hayMayuscula && hayDigito;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una contraseña: ");
        String clave = sc.nextLine();

        if (esValida(clave)) {
            System.out.println("Contraseña válida.");
        } else {
            System.out.println("Contraseña inválida: mínimo 8 caracteres, una mayúscula y un dígito.");
        }
        sc.close();
    }
}