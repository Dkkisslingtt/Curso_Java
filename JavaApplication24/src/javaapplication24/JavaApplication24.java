
package javaapplication24;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;



public class JavaApplication24 {

    public static void main(String[] args) {
        Integer [] numeros = {3, 5, 1, 2, 1, 7, 0, -1};
        Arrays.sort(numeros, Collections.reverseOrder());                                                                 

        for (int i=0; i<numeros.length;i++){
            if (numeros[i]==0){
                numeros[i]=1;

            }
        }
        for (int n : numeros) {
            System.out.println("los numeros distintos de 0 son: "+n); 

        }  
        

        
    }
    
}

