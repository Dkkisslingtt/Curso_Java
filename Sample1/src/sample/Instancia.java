
package sample;


public class Instancia extends Animal{
    String vuela;
    String animal;
    String ruido;
    String tipo;
    public Instancia (int age) {
        super(age);
    }

    
    public void setRuido(String ruido) {
        this.ruido = ruido;
    }
    
    public void setVuela(String vuela) {
        this.vuela = vuela;
    }
    
    
    @Override
    protected String noise() {
       return ruido;
    }

    @Override
    protected boolean canFly() {
        if (this.vuela=="si"){
        return true;
    }

        return false;
 }
    public void recuperar (String animal, String ruido,int ano){
        this.ruido= ruido;
        this.animal=animal;
        this.age=ano;
    }
    public String getAnimal(){
        return animal;
    }

    public String getTipo() {
        return tipo;
    }

    public String getRuido() {
        return ruido;
    }
  


    public void imprimiranimal(int age, String Animal, String tipo, String ruido) {
        this.age = age;
        this.animal = Animal;
        this.tipo = tipo;
        this.ruido = ruido;
    }


    @Override
    public String toString() {
    // this.getClass().getSimpleName() -> prints this class name
    // this.getClass().getSuperclass().getSimpleName() -> prints this super class name
    String val = "-Animal:\t" + this.getAnimal() + "\n";
    val += "-Type:\t\t" + this.getTipo() + "\n";
    val += "-Noise:\t" + this.getRuido() + "\n";  val += "-Age:\t\t" + this.getAge() + "\n";
    val += "-Can fly:\t" + this.canFly();
    return val;
     
   
    }
}


    
    
