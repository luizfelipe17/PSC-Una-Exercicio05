/*7 - Foi feita uma estatística em n cidades brasileiras para coletar dados sobre acidentes de trânsito. Foram obtidos os seguintes dados:
nome da cidade;
número de veículos de passeio;
número de acidentes de trânsito com vítimas.
Deseja-se saber:
 qual é o maior e qual é o menor índice de acidentes de trânsito e a que cidades pertencem;
 qual é a média de veículos nas cinco cidades juntas
 */
package com.mycompany.psc.exercicio05;

import java.util.Scanner;

public class Questao07 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int numeroCidades = 5, numeroVeiculos, numerosAcidentes, maiorValorAcidente = 0, menorValorAcidente = 0;
        double totalVeiculos = 0;
        String nomeCidade, maiorIndiceCidade = "", menorIndiceCidade = "";

        for (int i = 0; i < numeroCidades; i++) {

            System.out.println("\n" + (i + 1) + "º Cidade");
            System.out.print("Informe o nome da cidade: ");
            nomeCidade = ler.nextLine();
            System.out.print("Número de veículos de passeio: ");
            numeroVeiculos = ler.nextInt();
            System.out.print("Número de acidentes de trânsito com vítimas: ");
            numerosAcidentes = ler.nextInt();

            totalVeiculos += numeroVeiculos;

            if (maiorValorAcidente < numerosAcidentes) {

                maiorValorAcidente = numerosAcidentes;
                maiorIndiceCidade = nomeCidade;

            }

            if (numerosAcidentes < maiorValorAcidente) {

                menorValorAcidente = numerosAcidentes;
                menorIndiceCidade = nomeCidade;

            }

            ler.nextLine();

        }

        double mediaVeiculos = totalVeiculos / numeroCidades;

        System.out.print("\nA cidade com maior indice de acidente é " + maiorIndiceCidade + " com um total de " + maiorValorAcidente + " acidentes");
        System.out.print("\nA cidade com menor indice de acidente é " + menorIndiceCidade + " com apenas " + menorValorAcidente + " acidentes");
        System.out.printf("\nA média de veiculos de todas as cidades foi de: %.2f", mediaVeiculos);

    }
}
