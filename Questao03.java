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
package psc.exercicio05;

import java.util.Scanner;

public class Questao03 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int opcao;

        while (true) {

            System.out.print("1 - Média aritmética\n"
                    + "2 - Média ponderada\n"
                    + "3 - Sair");
            opcao = ler.nextInt();

            if (opcao == 1 || opcao == 2) {

                if (opcao == 1) {
                    
                   while(true){
                       System.out.print("1 - Média aritmética\n");
           
                    System.out.println("Informe dois valores: ");
                    int valor1 = ler.nextInt();
                    int valor2 = ler.nextInt();

                    double mediaAritmetica = (valor1 + valor2) / 2;

                    System.out.printf("Sua média aritmética é igual a: %.2f", mediaAritmetica);
                    System.out.print(" 8 - Repetir     9 - Voltar     0 - Sair");
                    opcao = ler.nextInt();

                    if (opcao == 1) {

                        break;

                    } else if (opcao == 9) {

                        break;

                    } else {

                        System.out.println("Informe um valor válido");
                        opcao = ler.nextInt();

                    }

                } else if (opcao = 2) {

                }
            }
        }

    }
}
