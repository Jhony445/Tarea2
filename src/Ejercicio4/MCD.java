/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

/**
 *
 * @author Donyo
 */
public class MCD {

    private int n1, n2;
    private double r;

    public MCD(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;

    }

    public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }

    public double getR() {
        return r;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double MCDIterativo() {
        double n1 = this.n1, n2 = this.n2;
        double resul = 0;
        do {
            resul = n1 % n2;
            n1 = n2;
            n2 = resul;

        } while (n2 != 0);
        return n1;
    }

    public double metodosRecursivo() {
      return  metodo(n1, n2);
        
    }

    private double metodo(int n1, int n2) {
        int temporal = 0;
        
        while(n2 != 0){
            temporal = n2;
            n2 = n1 % n2;
            n1= temporal;
            
        }
        return temporal;
    }

 

}
