
package paquete1;

public class Clase1 {
    //el final es para que sea una constante y no se pueda modificar mas 
    private final String Nombre;
    //la edad se puede modificar a lo largo del programa con getter y setter
    private int edad;

    public Clase1(String Nombre, int edad) {
        this.Nombre = Nombre;
        this.edad = edad;
    }
    
    public void mostrardatos(){
        System.out.println("el nombre es: "+Nombre);
        System.out.println("la edad es: "+edad);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

   
}
