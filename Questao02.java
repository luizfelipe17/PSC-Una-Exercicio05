/* 2 - Foi feita uma pesquisa sobre a audiência de canal de TV em várias casas de uma cidade, em determinado dia. Para cada casa consultada foi fornecido o número do canal (4, 5, 7, 12) e o número de pessoas que estavam assistindo aquele canal. Se a televisão estivesse desligada, nada era anotado, ou seja, essa casa não entrava na pesquisa. Faça um programa que:
leia um número indeterminado de dados (número do canal e número de pessoas que estavam assistindo); e
calcule e mostre a porcentagem de audiência de cada canal.
Para encerrar a entrada de dados, digite o número do canal ZERO.
 */
package com.mycompany.psc.exercicio05;

import java.util.Scanner;

public class Questao02 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int canal = 1, pessoas, totalPessoas4 = 0, totalPessoas5 = 0, totalPessoas7 = 0, totalPessoas12 = 0;

        while (canal != 0) {

            System.out.println("Informe o canal (4, 5, 7, 12 / 0 - PARA SAIR)");
            System.out.print("INFORME: ");
            canal = ler.nextInt();
            
            if (canal == 0){
                
                break;
                
            }
            
            while (canal != 4 && canal != 5 && canal != 7 && canal != 12){
                
                System.out.println("INFORME UM VALOR VÁLIDO!!!          0 - PARA SAIR");
                System.out.print("INFORME: ");
                canal = ler.nextInt();
                
                if (canal == 0){
                    
                    break;
                    
                }
                
            }
            
            System.out.print("Quantas pessoas estão assistindo? ");
            pessoas = ler.nextInt();

            if (canal == 4) {

                totalPessoas4 += pessoas;

            } else if (canal == 5) {

                totalPessoas5 += pessoas;
                
            } else if (canal == 7) {

                totalPessoas7 += pessoas;
                
            } else if (canal == 12) {

                totalPessoas12 += pessoas;
                
            }             
        }
        
        double totalPessoas = totalPessoas4 + totalPessoas5 + totalPessoas7 + totalPessoas12;
        double porcetagemCanal4 = (totalPessoas4 * 100) / totalPessoas;
        double porcetagemCanal5 = (totalPessoas5 * 100) / totalPessoas;
        double porcetagemCanal7 = (totalPessoas7 * 100) / totalPessoas;
        double porcetagemCanal12 = (totalPessoas12 * 100) / totalPessoas;
        
        System.out.print("\nA PORCENTAGEM DE CADA CANAL DURANTE O DIA FOI:\n");
        System.out.printf("CANAL 4: %.2f", porcetagemCanal4);
        System.out.print("%\n");
        System.out.printf("CANAL 5: %.2f", porcetagemCanal5); 
        System.out.print("%\n");
        System.out.printf("CANAL 7: %.2f", porcetagemCanal7);
        System.out.print("%\n");
        System.out.printf("CANAL 12: %.2f", porcetagemCanal12);
        System.out.print("%\n");
        
    }
}
