package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a quantidade de atividades para cadastrar:");
    int quantityActivities = scanner.nextInt();
    scanner.nextLine();

    String[] nameActivities = new String[quantityActivities];
    int[] wightActivity = new int[quantityActivities];

    for (int i = 0; i < quantityActivities; i++) {
      System.out.println("Digite o nome da atividade " + (i + 1) + ":");
      nameActivities[i] = scanner.nextLine();

      System.out.println("Digite o peso da atividade " + (i + 1) + ":");
      wightActivity[i] = scanner.nextInt();
      scanner.nextLine(); // Limpar o buffer do scanner
    }
  }
}