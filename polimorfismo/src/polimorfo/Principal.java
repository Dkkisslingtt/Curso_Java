
package polimorfo;


public class Principal {

    public static void main(String[] args) {
        vehiculo misvehiculos[]= new vehiculo[4];
        
        misvehiculos[0]= new vehiculo("INR970","FIAT","SIENA");
        
        misvehiculos[1]= new Turismo("2.0","FPA140","VW","GOL");
        
        misvehiculos [2]= new Deportivo("2.0","JPA130", "AUDI","A4");
        
        misvehiculos[3] = new Furgoneta("300","CPA203","FIAT","STRADA");
        
        for(vehiculo vehiculos: misvehiculos){
            System.out.println(vehiculos.mostrardatos());
            System.out.println(" ");
        }

    }
    
}
