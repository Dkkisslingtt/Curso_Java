
package javaapplication25;

import java.util.Scanner;


public class JavaApplication25 {


    public static void main(String[] args) {

         Scanner leer=new Scanner(System.in);
         int[] a = new int[5];
         int numerofinal = 0;
         int numero; 

         /* ORDENACIÓN */ 
         for(int i=0; i<a.length; i++){
            System.out.println("digite un número");
            numero = leer.nextInt();
            if(numero != 0){
                a[numerofinal] = numero;
                numerofinal++;
            }
         }
        
        for (int i=0; i<a.length;i++){
            if (a[i]==0){
                a[i]=1;

            }
        }
         /* COMPROBAR QUE EL ARRAY ESTÁ ORDENADO */
         for(int i = 0; i < a.length; i++){
             System.out.print(a[i]);    }
    }
}
    
