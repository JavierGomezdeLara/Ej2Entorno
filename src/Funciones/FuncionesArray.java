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
public class FuncionesArray {


    public static int[] generaArray(int tamano, int max, int min) {
        int[] array = new int[tamano];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        return array;
    }

    public static int minimoArray(int array[]) {
        int menor = 999;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
        }
        return menor;
    }

    public static int maximoArray(int array[]) {
        int mayor = 0;
        System.out.print("El array es: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < mayor) {
                mayor = array[i];
            }
        }
        return mayor;
    }

    public static int mediaArray(int array[]) {
        int media = 0;
        System.out.print("El array es: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            media = media + array[i];
        }
        media = media / array.length;
        media = Math.round(media);
        return media;
    }

    public static boolean estaEnArray(int array[], int buscado) {
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == buscado) {
                flag = true;
            }
        }
        return flag;
    }

    public static int posicionEnArrayInt(int array[],int buscado) {
        int posicion = 0;
        boolean flag = estaEnArray(array,buscado);
        if (flag = true) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == buscado) {
                    posicion = i;
                }
            }
        } else {
            
            posicion = -1;
        }

        return posicion;
    }

    public static int[] volteaArray(int array[]) {
        System.out.print("El array es: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int contador = 0;
        int[] auxiliar = new int[array.length];

        for (int i = (array.length - 1); i >= 0; i--) {
            auxiliar[i] = array[contador];
            contador = contador + 1;
        }
        return auxiliar;
    }

    public static int[] rotaDerechaArray(int[] x, int n) {
        for (int i = 0; i < n; i++) {
            int j, ult;
            // Último elemento:
            ult = x[x.length - 1];
            for (j = x.length - 1; j > 0; j--) {
                // Mueve 1
                x[j] = x[j - 1];
            }
            // Último se añade al principio:
            x[0] = ult;
        }
        return x;
    }
     public static int[] rotaIzquierdaArray(int[] x, int n) {
    
    int[] a = x.clone(); // clona en a el contenido de x
    int i;
    int aux;
    
    while (n-- > 0) {
      aux = a[0];
      for(i = 0; i < a.length - 1; i++) {
        a[i] = a[i + 1];
      }
      a[a.length - 1] = aux;
    }
      
    return a;
  }
}

