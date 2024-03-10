
package miprimerproyecto;

import java.util.Scanner;


public class MiprimerProyecto {


    public static void main(String[] args) {
        //primitivo
        
        int variable = 2000; //esto es definir variables 
        float decimal= 2.52f;
        char caracter = 'a';
        boolean desicion = true;
        
        //no primitivos
        Integer numero = null;
        
        //cadena
        
        String palabra="Hola mundo ";
        
        //constante no se puede cambiar durante todo el programa
        
        final int constante =10;
        
        
        //entrada de datos
        
        //numeros
        
        Scanner entrada = new Scanner (System.in);
        
        int nro= entrada.nextInt();
        
        //cadenas
        
        Scanner entrada2 = new Scanner (System.in);
        
        String cadena;
        String cadena2;
        
        cadena=entrada2.next(); //hasta que encuentra un espacio
        
        cadena2=entrada2.nextLine(); //hasta que encuentre un salto de linea
        
        //un solo caracter
        
        char letra; 
        
        letra = entrada2.next().charAt(0);
        //el cero indica q nro de caracter guarda

        
        System.out.println( letra );
        
    }
    
}
