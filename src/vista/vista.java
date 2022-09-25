/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JOptionPane;
import Ejercicio1.HolaMundo;
import Ejercicio2.Numero;
import Ejercicio3.Suma;
import Ejercicio4.MCD;
import Ejercicio5.SumaRecursiva;

/**
 *
 * @author Donyo
 */
public class vista {

    public static void main(String[] args) {
        String opciones, opciones2;
        HolaMundo obj1;
        Numero obj2;
        Suma obj3;
        MCD obj4;
        SumaRecursiva obj5;

        int n, n1 = 0, n2 = 0;
        double r2;
        boolean SENTINEL = true;
        String menu, menu2, r;
        do {
            menu = "Menu programas Iterativos y Recursivos \n1) Iterativo \n2) Recursivo \n3) Regresar \n"
                    + "\nElegir Opcion: ";

            opciones = JOptionPane.showInputDialog(menu);

            switch (opciones) {
                case "1":

                    menu2 = "Metodos Iterativos \n1) Problema 1: Hola Mundo \n2) Problema 2: Sucesion \n3) Problema 3: Suma de fracciones "
                            + "\n4) Problema 4: MCD \n5) Problema 5: suma factorial \n6) Salir"
                            + "\nElegir Opcion: ";
                    opciones2 = JOptionPane.showInputDialog(menu2);

                    do {
                        switch (opciones2) {
                            case "1":
                                n = Integer.parseInt(JOptionPane.showInputDialog("Numero de Hola mundo a imprimir"));
                                obj1 = new HolaMundo(n);
                                r = obj1.HolaIteractivo();
                                JOptionPane.showMessageDialog(null, obj1.HolaIteractivo());

                                break;
                            case "2":
                                n = Integer.parseInt(JOptionPane.showInputDialog("Imprimir n numeros"));
                                obj2 = new Numero(n);
                                r = obj2.NumeroIterativo();
                                JOptionPane.showMessageDialog(null, obj2.NumeroIterativo());
                                break;
                            case "3":
                                n = Integer.parseInt(JOptionPane.showInputDialog("Suma de fracciones, ingresa n:"));
                                obj3 = new Suma(n);
                                r2 = obj3.calcularIterativo();
                                JOptionPane.showMessageDialog(null, "La suma es " + r2);
                                break;
                            case "4":
                                n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa N1"));
                                n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa N2"));
                                obj4 = new MCD(n1, n2);
                                r2 = obj4.MCDIterativo();
                                JOptionPane.showMessageDialog(null, "El minimo comun divisor es: " + r2);
                                break;
                            case "5":
                                n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa N1"));
                                obj5 = new SumaRecursiva(n1);
                                r2 = obj5.Calcular2();
                                JOptionPane.showMessageDialog(null, "La suma de 1/n! es: " + r2);
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, "No valido");
                                SENTINEL = false;

                        }
                    } while (SENTINEL);
                    break;
                case "2":
                    menu2 = "Metodos Recursivos \n1) Problema 1: Hola Mundo \n2) Problema 2: Sucesion \n3) Problema 3: Suma de fracciones "
                            + "\n4) Problema 4: MCD \n5) Problema 5: suma factorial \n6) Salir"
                            + "\nElegir Opcion: ";
                    opciones2 = JOptionPane.showInputDialog(menu2);
                    do {
                        switch (opciones2) {
                            case "1":
                                n = Integer.parseInt(JOptionPane.showInputDialog("Numero de Hola mundo a imprimir"));
                                obj1 = new HolaMundo(n);
                                obj1.holaRecursivo();
                                break;
                                
                            case "2":
                                n = Integer.parseInt(JOptionPane.showInputDialog("Imprimir n numeros"));
                                obj2 = new Numero(n);
                                obj2.NumeroR();
                                break;

                            case "3":
                                
                                n = Integer.parseInt(JOptionPane.showInputDialog("Suma de fracciones, ingresa n:"));
                                obj3 = new Suma(n);
                                obj3.calcularR();
                                JOptionPane.showMessageDialog(null, "La fraccion es: " + obj3.calcularR());
                                break;

                            case "4":
                                n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa N1"));
                                n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa N2"));
                                obj4 = new MCD(n1, n2);
                                obj4.metodosRecursivo();
                                JOptionPane.showMessageDialog(null, "El MCD es: " + obj4.metodosRecursivo());
                                break;
                            case "5":
                                n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad que se sumara"));
                                obj5 = new SumaRecursiva(n);
                                obj5.metodoR();
                               
                                break;
                        }
                    } while (SENTINEL);
                    break;
            }
        } while (SENTINEL);

    }

}
