package com.mycompany.ejercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio3 {

    public static void main(String[] args) throws IOException {
        System.out.println("Escribe primer numero:");
        Float numero1 = cargarNumero();  
        ParImpar(numero1);
    }

    private static Float cargarNumero() throws IOException {
        InputStreamReader lecturaDeNumero = new InputStreamReader(System.in);
        BufferedReader strNumero = new BufferedReader(lecturaDeNumero);
        Float numero = Float.valueOf(strNumero.readLine());

        return numero;
    }

    private static void ParImpar(Float numero1) {
        Float resultado = numero1 % 2;
        if (resultado == 0) {
            System.out.println("es par");
        } else {
            System.out.println("es impar");
        }
    }
}
