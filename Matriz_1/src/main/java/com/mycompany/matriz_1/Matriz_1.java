package com.mycompany.matriz_1;

import java.util.Locale;

public class Matriz_1 {

    public static void main(String[] args) {

        // Define o Locale para usar ponto (.).
        Locale.setDefault(Locale.US);

        // Matriz a)
        char[][] matrizA = {
                {'a', 'b', 'c', 'd', 'e'},
                {'f', 'g', 'h', 'i', 'j'},
                {'l', 'm', 'n', 'o', 'p'},
                {'q', 'r', 's', 't', 'u'},
        };

        int[][] matrizB = {
                {19, 25, 100, 99},
                {10, 7, 25, 14},
                {35, 2, 47, 74}
        };

        double[][] matrizC = {
                {1.9, 2.5, 10.0},
                {1.0, 7.8, 2.5},
                {3.5, 2.2, 4.7}
        };

        System.out.println("a)                           b)                            c)");
        int maxRows = Math.max(matrizA.length, Math.max(matrizB.length, matrizC.length));
        for (int i = 0; i < maxRows; i++) {
            // Imprime matriz A (caracteres)
            if (i < matrizA.length) {
                for (int j = 0; j < matrizA[i].length; j++) {
                    System.out.printf("%4c ", matrizA[i][j]);
                }
            } else {
                System.out.printf("                          "); // Espaço vazio se não houver linha
            }

            System.out.print("     "); // Espaço entre matrizes

            // Imprime matriz B (inteiros)
            if (i < matrizB.length) {
                for (int j = 0; j < matrizB[i].length; j++) {
                    System.out.printf("%4d ", matrizB[i][j]);
                }
            } else {
                System.out.printf("                                     "); // Espaço vazio se não houver linha
            }

            System.out.print("          "); // Espaço entre matrizes

            // Imprime matriz C (doubles)
            if (i < matrizC.length) {
                for (int j = 0; j < matrizC[i].length; j++) {
                    System.out.printf("%5.1f ", matrizC[i][j]);
                }
            }

            System.out.println(); // Próxima linha
        }
    }
}
