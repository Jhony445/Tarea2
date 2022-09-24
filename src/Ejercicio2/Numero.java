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
public class Numero {

    private int n;

    public Numero(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n < 0 ? 0 : n;
    }

    //Metodo Interativo
    public String NumeroIterativo() {
        String suse = "";
        for (int i = 1; i <= n; i++) {
            suse+=i+"\n";; 
        }
        return suse;
    }

    public void NumeroR() {
        NumeroR(n);
    }

    //Metodo recursivo
    private void NumeroR(int n) {
        String cadena = "";
            //caso base
        if (n == 0 || n == 1) {
            System.out.println(n);

        //Caso general
        } else {
            System.out.println(n);
            NumeroR(n-1);
        }

    }

    @Override
    public String toString() {
        return "La susecion es " + NumeroIterativo() ;
    }

}
