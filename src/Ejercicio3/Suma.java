/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author Donyo
 */
public class Suma {
    private int n;
    private double sumas;

    public Suma(int n) {
        setN(n);
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSumas() {
        
        return sumas;
    }

    public void setSumas(double sumas) {
        this.sumas = sumas;
    }
      
    
    //iterativo 
    public double calcularIterativo(){ 
            double suma = 0.0;
            
            for( int i =1 ; i<= n; i++){
              suma+=1.0/i;      
        }
          return suma;
    }
    
    
    //Recursivo
        public void calcularR() {
        calcularRecursivo(n);
    }
    
    private void calcularRecursivo(int n){
                //caso base
        if(n==0 || n==1){
            
        }else{
            //caso general
            
            sumas+=1.0/n;
            calcularRecursivo(n-1); 
            System.out.println(sumas);
            
        }
    }


}
