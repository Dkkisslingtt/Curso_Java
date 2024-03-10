package com.mycompany.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int cantidadElementos = 10;
        int[] miArrayAleatorio = crearArrayAleatorio(cantidadElementos);
        int numeroBuscado = 34;
        String[] palabras = {"gato", "perro", "sol", "luna", "familia", "casa", "montaña", "playa", "libro", "computadora", "ciencia", "arte"};
        char letra='a';
        int[] lista1 = {54, 23, 67, 12, 89, 45, 76, 31, 58, 90};
        int[] lista2 = {32, 78, 11, 67, 44, 29, 55, 88, 19, 63};

        
        System.out.println("Array aleatorio: " + Arrays.toString(miArrayAleatorio));
        System.out.println("el numero: "+numeroBuscado + "esta "+ numerosRepetidos(miArrayAleatorio, numeroBuscado));
        System.out.println("la palabra mas larga es: " + palabraMasLarga(palabras));
        System.out.println("la palabras que comienzan con la letra: " + letra +" son " + comienzoDePalabra(palabras,letra));
        System.out.println("la lista definitiva quedaria asi: " + comparacionArray(lista1,lista2));
    }

    public static int[] crearArrayAleatorio(int cantidadElementos) {
        Random random = new Random();
        int[] arrayAleatorio = random.ints(cantidadElementos, 1, 101).toArray();
        return arrayAleatorio;
    }
    
    public static int numerosRepetidos(int [] array, int n){
        int contador=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==n){
                contador++;
            }
        }
        return contador;

    }
    
    public static String palabraMasLarga(String [] array){
        int masLarga=0;
        String palabra ="";
        for (int i = 0; i< array.length; i++){
            if (array[i].length()>masLarga){
                masLarga= array[i].length();
                palabra=array[i];
            }
        }
        return palabra;
    }
    
    public static ArrayList<String> comienzoDePalabra(String[] array, char letra){
        ArrayList<String> palabrasConLetra = new ArrayList<>();
        for (String palabra : array) {
            if (palabra.length() > 0 && palabra.charAt(0) == letra) {
                palabrasConLetra.add(palabra);
            }
        }
        return palabrasConLetra;
    }
    
    public static ArrayList<Integer> comparacionArray(int [] array1, int[] array2){
        
        ArrayList<Integer> numerosMasGrandes = new ArrayList<>();
        
        if (array1.length == array2.length){
            for (int i = 0; i< array1.length; i++){
                if (array1[i]>array2[i]){
                    numerosMasGrandes.add(array1[i]);
                }else {
                    numerosMasGrandes.add(array2[i]);
                }
            }
        }
        return numerosMasGrandes;
        
    }
}

