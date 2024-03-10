
package PAQUETE1;


public class CLASE2 {
    public static void main(String[] args) {
        CLASE1 objeto1= new CLASE1();
        
        objeto1.atributo1=15;
        //ahora se puede usar un atributo privado 
        objeto1.Setter(10);
        //para imprimir necesito un getter 
        System.out.println("la edad es: "+objeto1.getAtributo2());
        
    }
}
