/*
 * Sesión: S11 - Ámbitos de variables
 * Ejercicio 01: Marcar ámbitos
 * Enunciado: indicar con un comentario si cada variable es local, de bloque o static.
 * Autor: Mileydi Dueñas
 * Fecha: 20/11/2026
 */

public class S11_Ej01_MarcarAmbitos {

    static int contadorGlobal = 0;      // static: pertenece a la clase, vive todo el programa
    static final double IVA = 0.15;     // static: constante de la clase

    static int sumarHasta(int limite) { // limite: local (parametro del método)
        int suma = 0;                   // local: vive solo dentro de sumarHasta
        for (int i = 1; i <= limite; i++) { // i: de bloque (solo existe dentro del for)
            int doble = i * 2;          // doble: de bloque (solo dentro del cuerpo del for)
            suma += doble;
        }
        contadorGlobal++;               // uso de la variable static
        return suma;
    }

    public static void main(String[] args) { // args: local (parámetro de main)
        int total = sumarHasta(3);      // total: local de main
        double precio = 100.0;          // precio: local de main

        if (total > 5) {
            double conIva = precio * (1 + IVA); // conIva: de bloque (solo dentro del if)
            System.out.println("Con IVA: " + conIva);
        }

        System.out.println("Total: " + total);
        System.out.println("Llamadas: " + contadorGlobal);
    }
}