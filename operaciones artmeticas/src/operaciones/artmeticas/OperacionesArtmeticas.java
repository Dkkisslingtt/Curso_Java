

package operaciones.artmeticas;

import java.util.Scanner;


public class OperacionesArtmeticas {


    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float numero1,numero2,suma,resta,multiplicacion,division,resultado,raiz;
        numero1= entrada.nextFloat();
        numero2=entrada.nextFloat();
        suma= numero1+numero2;
        resta=numero1-numero2;
        multiplicacion=numero1*numero2;
        division=numero1/numero2;
        
        
        
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multiplicacion);
        System.out.println(division);
        
        //simplificaciones 
        
        suma+=2; //suma de 2
        suma++; //suma 1
        suma--; //resta1
        resultado = suma++;//si los signos estan atras de la variable se suman despues de la salida
        resultado= ++suma;//si estan delante se suman antes de la salida
        System.out.println(suma);
     
            int i = 7;
            int j = -9;
            double x = 72.3543;
            double y = 0.3498;
        // para hallar el menor de dos número
            System.out.println("min(" + i + "," + j + ") es " + Math.min(i,j));
            System.out.println("min(" + x + "," + y + ") es " + Math.min(x,y));
        // Para hallar el mayor de dos números
             System.out.println("max(" + i + "," + j + ") es " + Math.max(i,j));
             System.out.println("max(" + x + "," + y + ") es " + Math.max(x,y));
        
        //para calcular la raiz
        
        raiz = (float)Math.sqrt(36);
        System.out.println(raiz);
        
        //elevar a un numero
        double base= 3;
        double exponente = 3;
              
       numero1= (float) Math.pow(base, exponente);
    }
    
}
