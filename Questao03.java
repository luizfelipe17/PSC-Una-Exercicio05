/*3 - Faça um programa que apresente o menu de opções a seguir:
Menu de opções:
1. Média aritmética
2. Média ponderada
3. Sair
Digite a opção desejada.
Na opção 1: receber duas notas, calcular e mostrar a média aritmética.
Na opção 2: receber três notas e seus respectivos pesos, calcular e mostrar média ponderada.
Na opção 3: sair do programa.
Verifique a possibilidade de opção inválida. Nesse caso, o programa deverá mostrar uma mensagem.
 */
package com.mycompany.psc.exercicio05;

import java.util.Scanner;

public class Questao03 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int opcao;
        double media1 = 0;
        double media2 = 0;

        outerLoop:

        while (true) {

            System.out.println("1 - Média aritmética\n"
                    + "2 - Média ponderada\n"
                    + "3 - Sair");
            System.out.print("INFORME: ");
            opcao = ler.nextInt();

            if (opcao == 1 || opcao == 2) {

                if (opcao == 1) {

                    while (true) {
                        System.out.print("\n1 - Média aritmética\n");

                        System.out.println("Informe dois valores: ");
                        double valor1 = ler.nextDouble();
                        double valor2 = ler.nextDouble();

                        double mediaAritmetica = (valor1 + valor2) / 2;

                        System.out.printf("Sua média aritmética é igual a: %.2f", mediaAritmetica);
                        System.out.println(" \n\n8 - Repetir     9 - Voltar     0 - Sair");
                        opcao = ler.nextInt();

                        if (opcao == 8) {
                            

                        } else if (opcao == 9) {

                            break;

                        } else if (opcao == 0) {

                            break outerLoop;

                        } else {

                            System.out.print("INFORME UM VALOR VÁLIDO");    
                            break outerLoop;
                            
                        }
                    }

                } else if (opcao == 2) {

                    while (true) {

                        System.out.print("\n2 - Média ponderada\n");

                        for (int i = 0; i < 3; i++) {

                            System.out.println("Informe os valores e seus pesos: ");
                            System.out.print("NOTA: ");
                            double valor1 = ler.nextDouble();
                            System.out.print("PESO: ");
                            double valor2 = ler.nextDouble();

                            double media = valor1 * valor2;
                            media1 += media;
                            media2 += valor2;

                        }

                        double mediaPonderada = media1 / media2;

                        System.out.printf("A média ponderada é igual a: %.2f", mediaPonderada);
                        System.out.println(" \n\n8 - Repetir     9 - Voltar     0 - Sair");
                        opcao = ler.nextInt();

                        if (opcao == 8) {

                        } else if (opcao == 9) {

                            break;

                        } else if (opcao == 0) {

                            break outerLoop;

                        } else {

                            System.out.print("INFORME UM VALOR VÁLIDO");    
                            break outerLoop;

                        }
                    }
                }

            } else if (opcao == 3) {

                System.out.print("ATÈ A PRÓXIMA!!!");
                break;

            } else {

                    System.out.println("Informe um valor válido\n");

            }
        }
    }
}
