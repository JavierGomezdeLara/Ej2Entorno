/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

/**
 *
 * @author Javier
 */
public class FuncionesArrayBi {

    public static int[][] generaArrayBiInt(int tamanox, int tamanoy, int max, int min) {
        int[][] array = new int[tamanox][tamanoy];

        for (int i = 0; i < tamanox; i++) {
            for (int j = 0; j < tamanoy; j++) {
                array[i][j] = (int) (Math.random() * (max - min + 1) + min);
            }

        }

        return array;
    }

    public static int[] filaDeArrayBiInt(int array[][], int pedido) {
        int[] sol = new int[array[0].length];

        for (int i = 0; i < array[0].length; i++) {
            sol[i] = array[pedido][i];
        }

        return sol;
    }

    public static int[] columnaDeArrayBiInt(int array[][], int pedido) {
        int[] sol = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            sol[i] = array[i][pedido];
        }

        return sol;
    }

    public static int[] coordenadasEnArrayBiInt(int array[][], int pedido) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == pedido) {
                    int[] coordenadas = {i, j};
                    return coordenadas;
                }
            }
        }
        int[] coordenadas = {-1, -1};
        return coordenadas;
    }

    public static boolean esPuntoDeSilla(int array[][], int pedido, int pedido2) {

        int[] fila = filaDeArrayBiInt(array, pedido);
        int[] columna = columnaDeArrayBiInt(array, pedido2);

        return ((FuncionesArray.minimoArray(fila) == array[pedido][pedido2]) && (FuncionesArray.maximoArray(columna) == array[pedido][pedido2]));
    }
}
