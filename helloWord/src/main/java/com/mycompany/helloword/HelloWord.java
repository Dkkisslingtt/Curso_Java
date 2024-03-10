
package com.mycompany.helloword;

// Importamos las clases necesarias para leer desde la consola y manejar excepciones de entrada/salida.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 * La clase HelloWord es un programa simple que solicita al usuario que ingrese su nombre
 * y luego imprime un saludo personalizado.
 */
public class HelloWord {

  public static void main(String[] args) throws IOException {
    // Creamos un lector de entrada para leer desde la consola.
    InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    
    // Creamos un lector de líneas para facilitar la lectura desde la consola.
    BufferedReader reader = new BufferedReader(inputStreamReader);
    
    // Solicitamos al usuario que ingrese su nombre.
    System.out.println("Escribe tu nombre:");
    
    // Leemos la línea ingresada por el usuario y la almacenamos en la variable 'name'.
    String name = reader.readLine();
    
    // Imprimimos un mensaje de saludo personalizado con el nombre ingresado por el usuario.
    System.out.println("¡Hola " + name + "!");
    
    InputStreamReader lecturaDeNumero = new InputStreamReader (System.in);
    
    BufferedReader numero = new BufferedReader(lecturaDeNumero);
    
    System.out.println("Escribe su edad:");

    
    Integer edad = Integer.valueOf(numero.readLine());
    
    if (edad > 18){
            System.out.print("es mayor de edad");}
        
        else{
            System.out.print("es menor de edad");}
    }            
  }




