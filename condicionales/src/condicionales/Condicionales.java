
package condicionales;

import javax.swing.JOptionPane;


public class Condicionales {

    public static void main(String[] args) {
        
        float numero, dato;
        int dato1;
        char letra;
        numero=5;
        dato = Integer.parseInt(JOptionPane.showInputDialog("ingreese un numero "));
        if(dato==numero){
            JOptionPane.showMessageDialog(null, dato);
        }
        else {
            JOptionPane.showMessageDialog(null, "no es igual al numero");
        }
        
        //opciones multiples 
        
        dato1 = Integer.parseInt(JOptionPane.showInputDialog("ingreese un numero "));
        
        switch(dato1){
            case 1: JOptionPane.showMessageDialog(null, "es un 1");
            break; //el break es porque sino el programa sigue corriendo
                    //por las deas opciones
            case 2: JOptionPane.showMessageDialog(null, "es un 2");
            break;
            case 3: JOptionPane.showMessageDialog(null, "es un 3");
            break;
            case 4: JOptionPane.showMessageDialog(null, "es un 4");
            break;
            case 5: JOptionPane.showMessageDialog(null, "es un 5");
            break;
            default: JOptionPane.showMessageDialog(null, "no es un numero entre 1 y 5");
            break;
            
        }
        letra=JOptionPane.showInputDialog("ingrese una letra ").charAt(0);
        //sirve para saber si es mayuscula o no 
        if (Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null, "es mayuscula");
        }
        else{
            JOptionPane.showMessageDialog(null, "es MINUSCULA ");
        }
    }
}
