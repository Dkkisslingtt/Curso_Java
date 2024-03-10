
package polimorfo;


public class vehiculo {
    protected String Matricula;
    protected String Marca;
    protected String Modelo;

    public vehiculo(String Matricula, String Marca, String Modelo) {
        this.Matricula = Matricula;
        this.Marca = Marca;
        this.Modelo = Modelo;
    }

    public String getMatricula() {
        return Matricula;
    }

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }
    
    public String mostrardatos(){
        
        return "matricula "+Matricula+"\nMarca "+Marca+"\nModelo "+Modelo;
        
    }
            
}
