/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author Javier
 */
public class Ej16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean señal;
        for (int i = 1; i < 999999; i++) {
            señal=Funciones.Funciones.esCapicua(i);
            if (señal==true) {
                System.out.print(i+" ");
            }
    }
    
}
}