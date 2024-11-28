package com.mycompany.matriz_9;

import java.util.Scanner;

public class Matriz_9 {

    public static void main(String[] args) {
        char[][] tabuleiro = criarTabuleiro();
        char jogadorAtual = 'X';
        boolean jogoAtivo = true;

        while (jogoAtivo) {
            mostrarTabuleiro(tabuleiro);
            System.out.println("Jogador " + jogadorAtual + ", escolha sua jogada (linha e coluna):");
            int linha = obterEntrada("Linha");
            int coluna = obterEntrada("Coluna");

            if (tabuleiro[linha][coluna] == ' ') {
                tabuleiro[linha][coluna] = jogadorAtual;
                if (verificarVitoria(tabuleiro, jogadorAtual)) {
                    mostrarTabuleiro(tabuleiro);
                    System.out.println();
                    System.out.println("Parabéns! Jogador " + jogadorAtual + " venceu!");
                    jogoAtivo = false;
                } else if (verificarEmpate(tabuleiro)) {
                    mostrarTabuleiro(tabuleiro);
                    System.out.println("Empate!");
                    jogoAtivo = false;
                } else {
                    jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Posição já ocupada. Tente novamente.");
            }
        }
    }

    // Cria o tabuleiro vazio
    public static char[][] criarTabuleiro() {
        char[][] tabuleiro = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
        return tabuleiro;
    }

    // Mostra o tabuleiro no console
    public static void mostrarTabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("-----");
        }
    }

    // Obtém entrada do jogador
    public static int obterEntrada(String prompt) {
        Scanner scanner = new Scanner(System.in);
        int valor;
        while (true) {
            System.out.print(prompt + " (0, 1 ou 2): ");
            if (scanner.hasNextInt()) {
                valor = scanner.nextInt();
                if (valor >= 0 && valor <= 2) break;
            }
            scanner.nextLine(); // Limpa entrada inválida
            System.out.println("Entrada inválida. Tente novamente.");
        }
        return valor;
    }

    // Verifica se o jogador atual venceu
    public static boolean verificarVitoria(char[][] tabuleiro, char jogador) {
        // Verifica linhas e colunas
        for (int i = 0; i < 3; i++) {
            if ((tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) ||
                (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador)) {
                return true;
            }
        }
        // Verifica diagonais
        if ((tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) ||
            (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador)) {
            return true;
        }
        return false;
    }

    // Verifica se há empate
    public static boolean verificarEmpate(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}