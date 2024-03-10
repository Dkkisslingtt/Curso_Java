
package abstracto;


public class Principal {

    public static void main(String[] args) {
    
        carnivoro perro = new carnivoro();
        hervivoro vaca = new hervivoro();
        planta flor = new planta();
        
        perro.alimentarse();
        vaca.alimentarse();
        flor.alimentarse();
    }
    
}
