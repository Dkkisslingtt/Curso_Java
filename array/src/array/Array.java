
package array;

public class Array {


    public static void main(String[] args) {
    //tipo_dato nombre_array[]= new tipo_dato[tamanio];    
      int nombre_lista []= new int[3];
      
      int indice=0;
      nombre_lista [0]= 5;
      nombre_lista [1]=20;
      nombre_lista [2]= 10;
      int menor = nombre_lista[0];
      
      for (int i=0; i<3;i++){
          System.out.println(nombre_lista[-i]);
          
      }
      for (int i=0; i<nombre_lista.length;i++){
          System.out.println(nombre_lista[i]);
      }
      for (int i:nombre_lista){
          System.out.println(i);
      }
      //es para sacar cual es nro menor de una lista
      for (int i=0; i<nombre_lista.length;i++){
          if (nombre_lista[i]<=menor){
              menor = nombre_lista[i];
              indice=i;
           
          }
                   
      }
      System.out.println("el menor es "+nombre_lista[indice]);
    }
}

              
    
    
    
