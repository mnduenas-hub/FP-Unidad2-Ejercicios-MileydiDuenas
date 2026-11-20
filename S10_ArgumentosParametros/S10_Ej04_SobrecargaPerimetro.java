/*
 * Sesión: S10 - Sobrecarga de métodos
 * Ejercicio 04: Sobrecarga de perimetro
 * Enunciado: dos versiones de perimetro (cuadrado y rectángulo) llamadas desde main.
 * Autor: Mileydi Dueñas
 * Fecha: 20/11/2026
 */

public class S10_Ej04_SobrecargaPerimetro {

    // Version para el cuadrado: un solo parametro (lado)
    static double perimetro(double lado) {
        return 4 * lado;
    }

    // Version para el rectangulo: dos parametros (base y altura)
    static double perimetro(double base, double altura) {
        return 2 * (base + altura);
    }

    public static void main(String[] args) {
        System.out.println("Perimetro del cuadrado (lado 5): " + perimetro(5));
        System.out.println("Perimetro del rectangulo (4 x 7): " + perimetro(4, 7));
    }
}