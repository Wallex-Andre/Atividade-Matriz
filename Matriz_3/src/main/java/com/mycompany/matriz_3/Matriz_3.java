package com.mycompany.matriz_3;

import java.util.HashSet;
import java.util.Scanner;

public class Matriz_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] matriz = new int[3][5];
        
        HashSet<Integer> elementos = new HashSet<>();
        
        boolean temRepetidos = false;
        
        int pares = 0, impares = 0;

        System.out.println("Preencha a matriz 3x5 com valores inteiros:");
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("Digite o número para a posição [%d][%d] (linha %d, coluna %d): ", i, j, i, j);
                matriz[i][j] = scanner.nextInt();

                // Verifica repetidos
                if (!elementos.add(matriz[i][j])) {
                    temRepetidos = true;
                }

                // Conta pares e ímpares
                if (matriz[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        }

        System.out.println("a) A matriz " + (temRepetidos ? "possui" : "não possui") + " elementos repetidos.");
        System.out.println("b) Quantidade de números pares: " + pares);
        System.out.println("c) Quantidade de números ímpares: " + impares);

        scanner.close();
    }
}