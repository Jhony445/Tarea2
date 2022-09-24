/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;


import javax.swing.JOptionPane;

/**
 *
 * @author Donyo
 */
public class PruebaSuma {
       public static void main(String[] args) {
        int n;
        
         n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de N"));
        
        
        Suma obj = new Suma(n); 
        
        //çSystem.out.println(obj.calcularIterativo());
        obj.calcularR();
    } 
}
