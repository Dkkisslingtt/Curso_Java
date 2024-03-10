/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.funciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Funciones {
    public static void main(String[] args) throws IOException {

    System.out.println("Escribe primer numero:");
    Integer numero1 = cargarNumero();
    
    System.out.println("Escribe segundo numero:");
    Integer numero2 =  cargarNumero();
    
    System.out.println("Escribe tercera numero:");
    Integer numero3 = cargarNumero();
    
    calcularMayor(numero1, numero2, numero3);
    
   }
    private static Integer cargarNumero() throws IOException{
        InputStreamReader lecturaDeNumero = new InputStreamReader (System.in);
        BufferedReader strnumero = new BufferedReader(lecturaDeNumero);
        Integer numero = Integer.valueOf(strnumero.readLine());
        return numero;
    }
    
    
    private static void calcularMayor(Integer numero1, Integer numero2, Integer numero3 ){
        Integer mayor = numero1;

        if (numero2>mayor){
            mayor = numero2;
        }
        if (numero3>mayor){
            mayor = numero3;
        }
    
    System.out.println ("el numero mas grande es: " +mayor);
}
}
