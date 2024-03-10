/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author dkkissling
 */
public class ejercicio1Resuelto {
    public static void main(String[] args) throws IOException {
    InputStreamReader lecturaDeNumero = new InputStreamReader (System.in);
    
    BufferedReader numero = new BufferedReader(lecturaDeNumero);
    
    System.out.println("Escribe primer numero:");
    Integer numero1 = Integer.valueOf(numero.readLine());
    
    System.out.println("Escribe segundo numero:");
    Integer numero2 = Integer.valueOf(numero.readLine());
    
    System.out.println("Escribe tercera numero:");
    Integer numero3 = Integer.valueOf(numero.readLine());
    
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
