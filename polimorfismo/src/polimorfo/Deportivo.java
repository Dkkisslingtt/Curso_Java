
package polimorfo;


public class Deportivo extends vehiculo {
    protected String Cilindrada;


    public Deportivo(String Cilindrada, String Matricula, String Marca, String Modelo) {
        super(Matricula, Marca, Modelo);
        this.Cilindrada = Cilindrada;
    }
        public String getCilindrada() {
        return Cilindrada;
    }
    
        
    @Override
     public String mostrardatos(){
        return "matricula "+Matricula+"\nMarca "+Marca+"\nModelo "+Modelo+
                "\nCilindrada "+Cilindrada;

     }
        
    
    
    
}
