/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

/**
 *
 * @author Donyo
 */
public class SumaRecursiva {

    private int n;
    private double res;
    private nFactorial obj1;

    public SumaRecursiva(int n) {
        this.n = n;
        obj1 = new nFactorial(0);
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public nFactorial getObj1() {
        return obj1;
    }

    public void setObj1(nFactorial obj1) {
        this.obj1 = obj1;
    }

    public double Calcular2() {
        int i = 1;
        double resultado = 0;
        while (i <= n) {
            obj1.setN(i);
            resultado += ((i * 1.0) / obj1.factorialIterativo());
            i++;
        }
        return resultado;
    }

    //Recursivo
    public void metodoR() {
        metodo(n);
    }

    private void metodo(int n) {
        if (n == 0) {
            //caso base
        } else {
            //caso general
            obj1.setN(n);
            res += ((n * 1.0) / obj1.factorialIterativo());
            metodo(n - 1);
            System.out.println(res);
        }
    }

}
