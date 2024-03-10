/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DkKissling
 */
public class Estudiante extends Persona{
    private int codigo;
    private int notafinal;

    public Estudiante(int codigo, int notafinal, String Nombre, String Apellido, int Edad) {
        super(Nombre, Apellido, Edad);//se señaliza que los atributos estan inicializados
        this.codigo = codigo;
        this.notafinal = notafinal;
    }
    public void mostrardatos(){
        System.out.println("nombre: "+getNombre());
        System.out.println("apellido: "+getApellido());
        System.out.println("edad: "+getEdad());
        System.out.println("codigo: "+codigo);
        System.out.println("nota final: "+notafinal);
        
    
}
    
}
