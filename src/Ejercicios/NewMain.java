/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char asci;

        System.out.println("Introduce una palabra para encriptarla");
        String texto = s.next();

        System.out.println("Ahora introduce un numero del 1 al 25");
        int n = s.nextInt();

        for (int i = 0; i < texto.length(); i++) {
            asci = texto.charAt(i);
            int resultado = asci + n;

            System.out.println((char) resultado);
        }
    }
}


