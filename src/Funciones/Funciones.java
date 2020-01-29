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
public class Funciones {

    public static int quitaporDetras(int x, int y) {
        for (int i = 0; i < y; i++) {
            x = x / 10;
        }
        return x;
    }

    public static int quitaporDelante(int x, int y) {
        //El usuario tiene que decir cuantos números quiere dejar
        double ayuda = (double) (x);
        for (int i = 0; i < y; i++) {
            ayuda = ayuda / 10;
            x = x / 10;
        }
        double enteros = (double) (x);
        double resul = ayuda - enteros;
        for (int i = 0; i < y; i++) {
            resul = resul * 10;
        }
        int fin = (int) (resul);
        return fin;
    }

    public static boolean esPrimo(int x) {
        for (int i = 2; i < x; i++) {
            if ((x % i) == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean esCapicua(int x) {
        String cambio = String.valueOf(x);

        StringBuilder input1 = new StringBuilder();

        input1.append(cambio);
        input1 = input1.reverse();

        String comparar = input1.toString();

        if (cambio.equals(comparar)) {
            return true;
        }
        return false;
    }

    public static long voltea(long x) {
        if (x < 0) {
            return -voltea(-x);
        }
        long volteado = 0;

        while (x > 0) {
            volteado = (volteado * 10) + (x % 10);
            x = x / 10;
        }
        return volteado;
    }

    public static int digitoN(long x, int n) {
        x = voltea(x);

        while (n-- > 0) {
            x = x / 10;
        }

        return (int) x % 10;
    }

    public static int digitoN1(int x, int n) {
        return digitoN((long) x, n);
    }
}
