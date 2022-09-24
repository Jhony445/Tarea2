/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;


import javax.swing.JOptionPane;

/**
 *
 * @author Donyo
 */
public class pruebaMCD {
    public static void main(String[] args) {
        
         int n1,n2;
        
         n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de N1"));
         n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de N2"));
        MCD obj;
        obj = new MCD(n1,n2);
        
        //System.out.println(obj.MCDIterativo());
        
        obj.metodosRecursivo();
    }
}
