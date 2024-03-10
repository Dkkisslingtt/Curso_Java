/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author DkKissling
 */
public class Operaciones {

    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    public void Suma(int numero1,int numero2){
        suma=numero1+numero2;

    }
    public void Resta(int numero1,int numero2){
        resta=numero1-numero2;
            
    }
    public void Multiplicacion(int numero1,int numero2){
        multiplicacion=numero1*numero2;
        
    }
    public void Division(int numero1,int numero2){
        division=numero1/numero2;
        
    }
    public void MostrarResultados(){
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multiplicacion);
        System.out.println(division);
    }
    }
    

