/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;
import Funciones.FuncionesArray;

/**
 *
 * @author Javier
 */
public class Ej20_28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Bienvenido al programa de arrays");
        System.out.println("Introduce el tamaño del array");
        int tamano = s.nextInt();
        int array[] = new int[tamano];
        System.out.println("¿Quieres generar un array automáticamente o quieres introducir tu los datos?");
        System.out.println("1/Meter valores    2/Introducirlos automaticamente");
        int primeraeleccion = s.nextInt();
        if (primeraeleccion == 1) {
            System.out.println("Introduce los "+tamano+" valores");
            for (int i = 0; i < array.length; i++) {
                int valores = s.nextInt();
                array[i] = valores;
            }
        } else {
            System.out.println("Introduce el valor máximo al que puede llegar el array.");
            int max = s.nextInt();
            System.out.println("Y ahora el minimo");
            int min = s.nextInt();
            array = FuncionesArray.generaArray(tamano, max, min);
            System.out.println("El array quedaría así ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]+" ");
                System.out.println("");
            }
        }
        System.out.println("¿Que quieres hacer con el array?");
        System.out.println("1.Mostrar el número mas pequeño del array");
        System.out.println("2.Mostrar el número mas grande del array");
        System.out.println("3.La media de los datos del array");
        System.out.println("4.Decir si un número está o no en el array");
        System.out.println("5.Busca un número en el array y devuelve la posicion en la que se encuentra");
        System.out.println("6.Voltear el array");
        System.out.println("7.Rotar a la derecha los valores del array");
        System.out.println("8.Rotar a la izquieda los valores del array");
        int segundaeleccion = s.nextInt();

        switch (segundaeleccion) {
            case 1:
                int min=FuncionesArray.minimoArray(array);
                System.out.println("El mínimo es "+min);
                break;
            case 2:
                int max=FuncionesArray.maximoArray(array);
                System.out.println("El máximo es "+max);
                break;
            case 3:
                int media=FuncionesArray.mediaArray(array);
                System.out.println("La media de los datos es "+media);
                break;
            case 4:
                System.out.println("Introduce el numero para comprobar si está");
                int buscado=s.nextInt();
                boolean bandera=FuncionesArray.estaEnArray(array,buscado);
                if (bandera==true) {
                    System.out.println("El número se encuentra en el array");
                } else {
                    System.out.println("El número no se encuentra en el array");
                }
                break;
            case 5:
                System.out.println("Dime el número que tengo que buscar");
                int buscado1=s.nextInt();
                int posicion=FuncionesArray.posicionEnArrayInt(array, buscado1);
                if (posicion==-1) {
                    System.out.println("El número no se encuentra en el array");
                } else {
                    System.out.println("El número si está en el array y está en ña posición "+posicion);
                }
                break;
            case 6:
                System.out.println("El array volteado quedaría así");
                array=FuncionesArray.volteaArray(array);
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i]+" ");
                }
                break;
            case 7:
                System.out.println("¿Cuantas veces quieres rotarlo?");
                int veces=s.nextInt();
                array=FuncionesArray.rotaDerechaArray(array, veces);
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i]+", ");
                }
                break;
            case 8:
                System.out.println("¿Cuantas veces quieres rotarlo?");
                int veces2=s.nextInt();
                array=FuncionesArray.rotaIzquierdaArray(array, veces2);
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i]+", ");
                }
                break;
        }
    }

}
