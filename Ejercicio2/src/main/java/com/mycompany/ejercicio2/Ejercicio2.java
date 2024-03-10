/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author dkkissling
 */
public class Ejercicio2 {

    public static void main(String[] args) throws IOException {
        System.out.println("Escribe primer numero:");
        Integer numero1 = cargarNumero();
    
        System.out.println("Escribe segundo numero:");
        Integer numero2 =  cargarNumero();
    
        System.out.println("Escribe tercera numero:");
        Integer numero3 = cargarNumero();
        
        float promedio = Promedio(numero1, numero2, numero3);
        System.out.println ("el promedio es: " +promedio);

    }
    
    private static Integer cargarNumero() throws IOException{
       InputStreamReader lecturaDeNumero = new InputStreamReader (System.in);
       BufferedReader strnumero = new BufferedReader(lecturaDeNumero);
       Integer numero = Integer.valueOf(strnumero.readLine());
       
       return numero;
    }
    
    private static float Promedio (float numero1, float numero2, float numero3){
        float suma = (numero1 + numero2 +numero3);        
        float promedio = (suma/3);

        return promedio;

    }
}


