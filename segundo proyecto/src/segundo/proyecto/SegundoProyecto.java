/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundo.proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author DkKissling
 */
public class SegundoProyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PEDIR
        //cadena
        String palabra= JOptionPane.showInputDialog("ingreese nombre ");
        //numero
        int numero = Integer.parseInt(JOptionPane.showInputDialog("ingreese edad "));
        //letra
        char letra = JOptionPane.showInputDialog("ingreese una letra ").charAt(0);
        //decimal
        double decimal = Double.parseDouble(JOptionPane.showInputDialog("ingreese decima "));
        
        //MOSTRAR
        JOptionPane.showMessageDialog(null, palabra);
        JOptionPane.showMessageDialog(null, numero);
        JOptionPane.showMessageDialog(null, letra);
        JOptionPane.showMessageDialog(null, decimal);
    }
    
}
