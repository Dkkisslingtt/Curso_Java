/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;

/**
 *
 * @author dkkissling
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        int contador = 1;

        while (contador <= 100) {
            if (contador > 1) {
                int divisor = 2;

                while (divisor * divisor <= contador && contador % divisor != 0) {
                    divisor++;
                }

                if (divisor * divisor > contador) {
                    System.out.println(contador);
                }
            }

            contador += 2; // Avanza de a 2 para evitar números pares (excepto 2).
        }
    }
}
