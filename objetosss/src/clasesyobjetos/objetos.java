/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesyobjetos;

/**
 *
 * @author DkKissling
 */
public class objetos {
    //atributos
    String Color;
    String Marca;
    int Km;
    //metodo
    public static void main(String[] args) {
        //creacion de objetos
        objetos coche1= new objetos();
        //rellenar con datos los atributos de objetos
        coche1.Color="rojo";
        coche1.Km=100;
        coche1.Marca= "audi";
        
        System.out.println(coche1.Color);
        System.out.println(coche1.Km);
        System.out.println(coche1.Marca);
        
        
        
    }
    
}
