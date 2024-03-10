
package polimorfo;


public class Turismo extends vehiculo {
    protected String Puertas;
    
    public Turismo(String Puertas, String Matricula, String Marca, String Modelo) {
        super(Matricula, Marca, Modelo);
        this.Puertas = Puertas;
    }

    public String getPuertas() {
        return Puertas;
    }
    @Override
    public String mostrardatos(){
        
        return "matricula "+Matricula+"\nMarca "+Marca+"\nModelo "+Modelo+"\nPuertas"
                + Puertas;
        
    }
}
