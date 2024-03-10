/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recursivo;

/**
 *
 * @author dkkissling
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("la cantidad de digitos que tiene es: " + digitos(144));
        System.out.println("el resultado de la base elevado al exponente: " + potencia (3,3));
        System.out.println("El numero invertido es: " + invertir(144));
    }
    
    static int digitos(int n){
        
        if  (n==0) return 0;
        return 1+ digitos (n/10);
    }
    
    static int potencia(int base, int exponente){
        if (exponente==0)return 1;
        return base *potencia(base, --exponente);
        
    }
    
    static int invertir (int n){
        if (n==0 && n<10) System.out.println(n);
        else{
            System.out.println(n%10);
            invertir(n/10);
            }
        return 0;
    }
    
}
