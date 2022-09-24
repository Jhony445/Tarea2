/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import javax.swing.JOptionPane;

/**
 *
 * @author Donyo
 */
public class pruebaNFactorial {
    public static void main(String[] args) {
        int n;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de N"));
        SumaRecursiva obj = new SumaRecursiva(n); 
        
        //System.out.println(obj.Calcular2());
        obj.metodoR();
    }
}
