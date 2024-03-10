
package PAQUETE1;

//modificadores de acceso
public class CLASE1 {
    //se pone publico para que todas las clases dentro de la misma 
    //app pueda usarlo en diferentes paquetes
   public int atributo1;
   //solo se puede utilizar en la misma clase
   private int atributo2;
   //igual si no pongo nada 
   int atributo3;
   
   //para poder acceder a los atributos privados necesitamos un setter
   
   public void Setter(int edad){
       this.atributo2=edad;
         
   }
   // se necesita un getter para poder utilizarlo en otra clase..
   
    public int getAtributo2() {
        return atributo2;
    }
       
       
}