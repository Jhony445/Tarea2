/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author Donyo
 */
public class PruebaNumero {
    public static void main(String[] args) {
        int n;
        
         n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de N"));
        
        
        Numero obj = new Numero(n); 
        
        //System.out.println(obj.NumeroIterativo());
        obj.NumeroR();
        
    }
}
