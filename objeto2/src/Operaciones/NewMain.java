
package Operaciones;

import javax.swing.JOptionPane;

public class NewMain {
        

    public static void main(String[] args) {
        int numero1=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        int numero2=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        String Nombre= JOptionPane.showInputDialog("ingrese un nombre ");
        Operaciones op= new Operaciones();
        retorno op2= new retorno();
        
        op.Suma(numero1,numero2);
        op.Resta(numero1,numero2);
        op.Multiplicacion(numero1,numero2);
        op.Division(numero1,numero2);
        op.MostrarResultados();
        System.out.print(op2.Saludar(Nombre)); 
       
    }
    
}
