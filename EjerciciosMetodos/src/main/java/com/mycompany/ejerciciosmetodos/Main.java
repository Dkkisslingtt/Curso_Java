/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciosmetodos;

import java.util.Scanner;

/**
 *
 * @author dkkissling
 */
public class Main {

    // Método que dado un nombre devuelva un saludo
    static String saludar(String nombre) {
        return "Hola, " + nombre + ".";
    }

    // Método que dado un número entero calcule el cubo
    static int calcularCubo(int numero) {
        return numero * numero * numero;
    }

    // Método que dado dos números los multiplique
    static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    // Método que dado un número de su tabla de multiplicación de 1 a 10
    static void tablaMultiplicar(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
    }

    // Método que dado un número diga si es par
    static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    // Método que muestra un menú y permite salir al elegir un número específico
    static void menu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Saludar");
            System.out.println("2. Calcular cubo");
            System.out.println("3. Multiplicar dos números");
            System.out.println("4. Tabla de multiplicar");
            System.out.println("5. Verificar si un número es par");
            System.out.println("6. Salir");

            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un nombre: ");
                    String nombre = scanner.next();
                    System.out.println(saludar(nombre));
                    break;
                case 2:
                    System.out.print("Ingrese un número entero: ");
                    int numCubo = scanner.nextInt();
                    System.out.println(calcularCubo(numCubo));
                    break;
                case 3:
                    System.out.print("Ingrese el primer número: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double num2 = scanner.nextDouble();
                    System.out.println(multiplicar(num1, num2));
                    break;
                case 4:
                    System.out.print("Ingrese un número para la tabla de multiplicar: ");
                    int numTabla = scanner.nextInt();
                    tablaMultiplicar(numTabla);
                    break;
                case 5:
                    System.out.print("Ingrese un número para verificar si es par: ");
                    int numPar = scanner.nextInt();
                    System.out.println(esPar(numPar) ? numPar + " es par." : numPar + " no es par.");
                    break;
                case 6:
                    System.out.println("Saliendo del menú...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
    }

    // Método main para ejecutar el menú
    public static void main(String[] args) {
        menu();
    }
}

