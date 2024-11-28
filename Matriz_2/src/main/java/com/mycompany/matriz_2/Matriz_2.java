package com.mycompany.matriz_2;

import java.util.Scanner;

public class Matriz_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];

        System.out.println("Preencha a matriz 5x5 com valores inteiros:");
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("Digite o número para a posição [%d][%d] (linha %d, coluna %d): ", i, j, i, j);
                matriz[i][j] = scanner.nextInt();
                // Atualiza e exibe a matriz
                exibirMatriz(matriz);
            }
        }

        // a) Soma dos números ímpares
        int somaImpares = somaImpares(matriz);
        System.out.println("Soma dos números ímpares: " + somaImpares);

        // b) Soma de cada uma das 5 colunas
        somaColunas(matriz);

        // c) Soma de cada uma das 5 linhas
        somaLinhas(matriz);

        scanner.close();
    }

    // Método para exibir a matriz
    private static void exibirMatriz(int[][] matriz) {
        System.out.println("\nEstado atual da matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    // a) Soma dos números ímpares
    private static int somaImpares(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 != 0) {
                    soma += matriz[i][j];
                }
            }
        }
        return soma;
    }
    
    // b) Soma de cada uma das 5 colunas
    private static void somaColunas(int[][] matriz) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        for (int j = 0; j < matriz[0].length; j++) {
            int soma = 0;
            for (int i = 0; i < matriz.length; i++) {
                soma += matriz[i][j];
            }
            System.out.println("Soma da coluna " + (j + 1) + ": " + soma);
        }
    }

    // c) Soma de cada uma das 5 linhas
    private static void somaLinhas(int[][] matriz) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            int soma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
            System.out.println("Soma da linha " + (i + 1) + ": " + soma);
        }
    }
}
