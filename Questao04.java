/*4 - Faça um programa que receba dez idades, pesos e alturas, calcule e mostre: 
a média das idades das dez pessoas;
a quantidade de pessoas com peso superior a 90 kg e altura inferior a 1,50 metro; e 
a porcentagem de pessoas com idade entre 10 e 30 anos entre as pessoas que medem mais de 1,90 m. 
 */
package com.mycompany.psc.exercicio05;

import java.util.Scanner;

public class Questao04 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int[] pessoas = new int[10];
        int idade, totalIdade = 0, segundaCondicao = 0, terceiraCondição = 0;
        double peso, altura, mediaIdade;

        for (int i = 0; i < pessoas.length; i++) {

            System.out.print("\n"+ (i + 1) + "º PESSOA");
            System.out.print("\nINFORME A IDADE: ");
            idade = ler.nextInt();
            System.out.print("INFORME A PESO: ");
            peso = ler.nextDouble();
            System.out.print("INFORME A ALTURA: ");
            altura = ler.nextDouble();

            totalIdade += idade;

            if (peso > 90 && altura < 1.50) {

                segundaCondicao++;

            }

            if (altura > 1.90 && idade > 10 && idade < 30) {

                terceiraCondição++;

            }
        }

        mediaIdade = totalIdade / pessoas.length;
        int porcentagemPessoas = terceiraCondição * 100 / 10;

        System.out.print("\nA idade média das pessoas é de: " + mediaIdade + " anos");
        System.out.print("\nTemos " + segundaCondicao + " pessoa(s) com peso superior a 90 kg e altura inferior a 1,50 metro");
        System.out.print("\n" + porcentagemPessoas + "% de pessoas com idade entre 10 e 30 anos entre as pessoas que medem mais de 1,90 m. ");

    }
}
