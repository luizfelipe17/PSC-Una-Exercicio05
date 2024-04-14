/*6 - Faça um programa que apresente o menu de opções a seguir, permita ao usuário escolher a opção desejada, receba os dados necessários para executar a operação e mostre o resultado. 
Verifique a possibilidade de opção inválida e não se preocupe com restrições do tipo salário inválido.
Menu de opções:
1. Imposto
2. Novo salário
3. Classificação
4. Finalizar o programa
Digite a opção desejada.
Na opção 1: receber o salário de um funcionário, calcular e mostrar o valor do imposto usando as regras a seguir.
SALÁRIO
% DO IMPOSTO
Menor que R$ 1400,00
5
De R$ 1400,00 a R$ 2500,00
10
Acima de R$ 2500,00
15
Na opção 2: receber o salário de um funcionário, calcular e mostrar o valor do novo salário usando as regras a seguir.
Salário
Aumento
Maiores que R$ 5000,00
R$ 25,00
De R$ 2500,00 (inclusive) a R$ 5.000,00 (inclusive) 
R$ 50,00
De R$ 1400,00 (inclusive) a R$ 2500,00
R$ 75,00
Menores que R$ 1400,00 
R$ 100,00
Na opção 3: receber o salário de um funcionário e mostrar sua classificação usando esta tabela:
Salário
Classificação
Até 1400,00
Mal remunerado
Maiores que R$ 1400,00
Bem remunerado
 */
package com.mycompany.psc.exercicio05;

import java.util.Scanner;

public class Questao06 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int opcao;
        double salario, impostoSalario = 0, novoSalario = 0;

        System.out.print("MENU DE OPÇÕES: \n"
                + "1. Imposto\n"
                + "2. Novo salário\n"
                + "3. Classificação\n"
                + "4. Finalizar o programa\n"
                + "Digite a opção desejada: ");
        opcao = ler.nextInt();

        while (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4) {

            System.out.print("\nINFORME UM VALOR VÁLIDO!");
            System.out.print("\nDigite a opção desejada: ");
            opcao = ler.nextInt();

        }

        if (opcao == 1) {

            System.out.print("\n1 - IMPOSTO\n");
            System.out.print("DIGITE O SEU SALÁRIO: R$");
            salario = ler.nextDouble();

            if (salario < 1400) {

                impostoSalario = (salario * 5) / 100;

            } else if (salario >= 1400 && salario <= 2500) {

                impostoSalario = (salario * 10) / 100;

            } else if (salario > 2500) {

                impostoSalario = (salario * 15) / 100;

            }

            System.out.printf("\nO IMPOSTO SERÀ DE: R$%.2f", impostoSalario);

        } else if (opcao == 2) {

            System.out.print("\n2 - NOVO SALÁRIO\n");
            System.out.print("DIGITE O SEU SALÁRIO: R$");
            salario = ler.nextDouble();

            if (salario < 1400) {

                novoSalario = salario + 100;

            } else if (salario >= 1400 && salario <= 2500) {

                novoSalario = salario + 75;

            } else if (salario > 2500 && salario <= 5000) {

                novoSalario = salario + 50;

            } else if (salario > 5000) {

                novoSalario = salario + 25;

            }

            System.out.printf("\nO NOVO SALÁRIO SERÀ DE: R$%.2f", novoSalario);

        } else if (opcao == 3) {

            System.out.print("\n3 - CLASSIFICAÇÃO\n");
            System.out.print("DIGITE O SEU SALÁRIO: R$");
            salario = ler.nextDouble();

            if (salario <= 1400) {

                System.out.print("\nMAL REMUNERADO");

            } else if (salario > 1400) {

                System.out.print("\nBEM REMUNERADO");

            }

        } else if (opcao == 4) {

            System.out.print("\nOBRIGADO!");

        }

    }
}
