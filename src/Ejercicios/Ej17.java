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
public class Ej17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int binario=101;
    int apoyo=binario;
    int contador=0;
    int calculador=0;
    int calculador1=0;
        do {            
            apoyo/=10;
            contador++;
        } while (apoyo>0);    
        int array []= new int [contador];
        for (int i = 0; i < contador; i++) {
          int numeroextraido=Funciones.Funciones.digitoN(binario,i);
          array[i]=(numeroextraido*2^i);
        }
        for (int i = 0; i <contador; i++) {
            System.out.println(array[i]);
        }
    }
}
