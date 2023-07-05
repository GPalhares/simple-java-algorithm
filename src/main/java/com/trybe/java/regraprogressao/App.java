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
    double[] wightActivity = new double[quantityActivities];
    double[] notaActivity = new double[quantityActivities];
    double notaFinal = 0.0;
    double pesoFinal = 0.0;

    for (int i = 0; i < quantityActivities; i++) {
      System.out.println("Digite o nome da atividade " + (i + 1) + ":");
      nameActivities[i] = scanner.nextLine();
      System.out.println("Digite o peso da atividade " + (i + 1) + ":");
      wightActivity[i] = scanner.nextInt();
      System.out.println("Digite a nota obtida para " + nameActivities[i] + ":");
      notaActivity[i] = scanner.nextInt();
      scanner.nextLine();
      notaFinal += notaActivity[i] * wightActivity[i];
      pesoFinal += wightActivity[i];
    }
    System.out.println(notaFinal / pesoFinal);
    if (notaFinal / pesoFinal >= 85) {
      System.out.print("Parabéns! Você alcançou " + notaFinal / pesoFinal + "%!"
              + " E temos o prazer de informar que você obteve aprovação! ");
    }

    if (notaFinal / pesoFinal < 85) {
      System.out.print("Lamentamos informar que,"
              + " com base na sua pontuação alcançada neste período, " + notaFinal / pesoFinal
              + "%, você não atingiu a pontuação mínima necessária para sua aprovação. ");
    }

  }
}