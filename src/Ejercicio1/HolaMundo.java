package Ejercicio1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Donyo
 */
public class HolaMundo {

    private int n;
    
    public HolaMundo(int n) {
        if (n >= 0) {
            this.n = n;
        } else {
            System.err.println("EL valor de n no puede ser negativo");

        }

    }

    public void setN(int n) {
        this.n = n < 0 ? 0 : n;
    }

    public int getN() {
        return n;
    }

    //Metodo iteractivo
    public String HolaIteractivo() {
        String cadena = "";
        for (int i = 1; i <= n; i++) {
            cadena += ("Hola mundo \n");
        }
        return cadena;
    }

    //metodo recursivo
    public void holaRecursivo() {
        HolaR(n);
    }

    private void HolaR(int n) {
        //caso base
        if ( n== 0 ||n == 1 ) {
            System.out.println("Hola mundo");

        } else {
            System.out.println("Hola mundo");
            HolaR(n - 1);
        }

    }
}
