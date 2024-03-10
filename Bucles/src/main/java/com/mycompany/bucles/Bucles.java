/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bucles;

/**
 *
 * @author dkkissling
 */
public class Bucles {

    public static void main(String[] args) {
        int contador=0;
        int contador1=0;
        while (contador < 3 ){
            contador++;
            System.out.println("ciclo while");
        }
        
        do{
            contador1++;
            System.out.println("ciclo dowhile");
        }while(contador1 < 3);
    
        for (int cont=0; cont<3; cont++){
            System.out.println("ciclo for");
        };
    }
}