package com.mycompany.matriz_4;

import java.util.Scanner;

public class Matriz_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] matriz = new double[4][4];

        System.out.println("Preencha a matriz 4x4 com valores decimais:");
        System.out.println();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("Digite o número para a posição [%d][%d] (linha %d, coluna %d): ", i, j, i, j);
                matriz[i][j] = scanner.nextDouble();
                exibirMatriz3(matriz); // Call to display after each input
            }
        }

        System.out.println("a) Valores da diagonal principal:");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%.2f ", matriz[i][i]);
        }
        System.out.println();

        System.out.println("b) Valores da diagonal secundária:");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%.2f ", matriz[i][3 - i]);
        }
        System.out.println();

        scanner.close();
    }

    private static void exibirMatriz3(double[][] matriz) {
        System.out.println("\nEstado atual da matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%.2f ", matriz[i][j]); // Use %.2f for decimals
            }
            System.out.println();
        }
        System.out.println();
    }
}