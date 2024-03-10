
package polimorfo;


public class Furgoneta extends vehiculo {
    protected String Carga;

    public Furgoneta(String Carga, String Matricula, String Marca, String Modelo) {
        super(Matricula, Marca, Modelo);
        this.Carga = Carga;
    }

    public String getCarga() {
        return Carga;
    }
    @Override
    public String mostrardatos(){
        
    return "matricula "+Matricula+"\nMarca "+Marca+"\nModelo "+Modelo+"\nCarga"
                + Carga;
        
    }
    
    
}
