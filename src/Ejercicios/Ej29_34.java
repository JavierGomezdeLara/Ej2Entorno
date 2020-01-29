/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import Funciones.FuncionesArrayBi;
import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class Ej29_34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Bienvenido al programa de arrays bidimensionales");
        System.out.println("Introduce el tamaño x del array");
        int x = s.nextInt();
        System.out.println("Ahora el y");
        int y = s.nextInt();
        int array[][] = new int[x][y];
        System.out.println("Introduce el valor máximo al que puede llegar el array.");
        int max = s.nextInt();
        System.out.println("Y ahora el minimo");
        int min = s.nextInt();
        array = Funciones.FuncionesArrayBi.generaArrayBiInt(x, y, max, min);
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("¿Que quieres hacer con el array?");
        System.out.println("1.Devuelve la fila i-ésima del array que se pasa como parámetro.");
        System.out.println("2.Devuelve la columna j-ésima del array que se pasa como parámetro.");
        System.out.println("3. Devuelve la fila y la columna (en un array\n"
                + "con dos elementos) de la primera ocurrencia de un número dentro de un\n"
                + "array bidimensional. Si el número no se encuentra en el array, la función\n"
                + "devuelve el array {-1, -1}.");
        System.out.println("4.: Dice si un número es o no punto de silla, es decir,\n"
                + "mínimo en su fila y máximo en su columna.");
        System.out.println("5.Devuelve un array que contiene una de las diagonales del\n"
                + "array bidimensional que se pasa como parámetro");
        int segundaeleccion = s.nextInt();

        switch (segundaeleccion) {
            case 1:
                System.out.println("Introduce la fila que extraer del array");
                int elección = s.nextInt();
                int case1[] = FuncionesArrayBi.filaDeArrayBiInt(array, elección);
                System.out.println("La fila es");
                System.out.println("");
                for (int i = 0; i < case1.length; i++) {
                    System.out.print(case1[i] + " ");
                }
                break;
            case 2:
                System.out.println("Introduce la columna que extraer del array");
                int elección1 = s.nextInt();
                int case2[] = FuncionesArrayBi.columnaDeArrayBiInt(array, elección1);
                System.out.println("La fila es");
                System.out.println("");
                for (int i = 0; i < case2.length; i++) {
                    System.out.print(case2[i] + " ");
                }
                break;
            case 3:
                System.out.println("Dime el número a buscar");
                int pedido=s.nextInt();
                int posicion[]=FuncionesArrayBi.coordenadasEnArrayBiInt(array, pedido);
                for (int i = 0; i < posicion.length; i++) {
                    System.out.println("La posición es {"+posicion[0]+","+posicion[1]+"}");
                }
                break;
            case 4:
                System.out.println("Introduce la coordenada x del número");
                int buscado = s.nextInt();
                System.out.println("Introduce la coordenada y del número");
                int buscado2=s.nextInt();
                boolean bandera = FuncionesArrayBi.esPuntoDeSilla(array, buscado,buscado2);
                if (bandera == true) {
                    System.out.println("El número es punto de silla");
                } else {
                    System.out.println("El número no es punto de silla");
                }
                break;
            case 5:
                
                break;
        }
    }

}
