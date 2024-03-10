/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author dkkissling
 */
public class Ejercicio1 {

    public static void main(String[] args) throws IOException {
    InputStreamReader lecturaDeNumero = new InputStreamReader (System.in);
    
    BufferedReader numero = new BufferedReader(lecturaDeNumero);
    
    System.out.println("Escribe primer numero:");
    Integer numero1 = Integer.valueOf(numero.readLine());
    
    System.out.println("Escribe segundo numero:");
    Integer numero2 = Integer.valueOf(numero.readLine());
    
    System.out.println("Escribe tercera numero:");
    Integer numero3 = Integer.valueOf(numero.readLine());
    
    
    if (numero1 > numero2 && numero1> numero3){
        System.out.println ("el mayor es " +numero1);
    }
    else if (numero1<numero2 && numero2 > numero3){
        System.out.println("el mayor es " +numero2);
    }
    else if(numero1==numero2 && numero1>numero3){
        System.out.println("el mayor es el " +numero2);
    }
    else{
        System.out.println("el mayor es " +numero3);
        }
  }
    
}
