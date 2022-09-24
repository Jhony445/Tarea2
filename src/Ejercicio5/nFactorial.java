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
public class nFactorial {
    private int n;

    public nFactorial(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        if (n>=0){
            this.n = n;
        }
        
    }
    //Iteraticvo
    public long factorialIterativo(){
        long fact = 1;
        for(int i = 1; i <= n; i++){
           fact*=i;
           
        }
        return fact;
    }
    
  
    @Override
    public String toString() {
        return "El valor de N es: "+ n;
    }
    
    
}
    

