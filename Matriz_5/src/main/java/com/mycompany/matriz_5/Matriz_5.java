package com.mycompany.matriz_5;

import java.util.Locale;

public class Matriz_5 {

    public static void main(String[] args) {

        // Define o Locale para usar ponto (.).
        Locale.setDefault(Locale.US);

        // Matriz a)
        char[][] matrizA = {
                {'*', '*', '*', '*'},
                {'*', '*', '*', '*'},
                {'*', '*', '*', '*'},
                {'*', '*', '*', '*'}
        };

        char[][] matrizB = {
                {'*', '*', '*', '*'},
                {'*', ' ', ' ', '*'},
                {'*', ' ', ' ', '*'},
                {'*', '*', '*', '*'}
        };

        char[][] matrizC = {
                {'*', ' ', ' ', ' '},
                {'*', '*', ' ', ' '},
                {'*', '*', '*', ' '},
                {'*', '*', '*', '*'}
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

            System.out.print("           "); // Espaço entre matrizes

            // Imprime matriz B (inteiros)
            if (i < matrizB.length) {
                for (int j = 0; j < matrizB[i].length; j++) {
                    System.out.printf("%4c ", matrizB[i][j]);
                }
            } else {
                System.out.printf("                          "); // Espaço vazio se não houver linha
            }
            System.out.print("          ");
            if (i < matrizC.length) {
                for (int j = 0; j < matrizC[i].length; j++) {
                    System.out.printf("%4c ", matrizC[i][j]);
                }
            } else {
                System.out.printf("                          "); // Espaço vazio se não houver linha
            }

            System.out.println(); // Próxima linha
        }
    }
}
