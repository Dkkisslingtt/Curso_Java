/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repetitivos;

import java.util.Scanner;

/**
 *
 * @author DkKissling
 */
public class Repetitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, dato, sumador;
        Scanner entrada = new Scanner (System.in);
        for (sumador=0;sumador<=100;sumador++){
            System.out.println(sumador);
        }

        numero=10;
        dato=entrada.nextInt();
        
        do{
            dato=entrada.nextInt();
            
            if (numero> dato){
                System.out.println("es mayor el numero");
              
            }
            else{
                System.out.println("es menor el numero");
            }


    }while(numero!=dato);
        
        System.out.println("los numeros son iguales ");
        
    }
    
        
    
}
    

