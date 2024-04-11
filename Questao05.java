/*5 - Uma empresa fez uma pesquisa de mercado para saber se as pessoas gostaram ou não de um novo produto lançado. Para isso, forneceu o sexo do entrevistado e sua resposta (S — sim; ou N — não). Sabe-se que foram entrevistadas dez pessoas. Faça um programa que calcule e mostre:
 o número de pessoas que responderam sim;
o número de pessoas que responderam não;
o número de mulheres que responderam sim; e
a percentagem de homens que responderam não, entre todos os homens analisados
 */
package com.mycompany.psc.exercicio05;

import java.util.Scanner;
import java.util.ArrayList;

public class Questao05 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String avaliacao = "";
        int sexo = 0;
        ArrayList<String> pessoasSim = new ArrayList<String>();
        ArrayList<String> pessoasNao = new ArrayList<String>();
        ArrayList<String> mulheresSim = new ArrayList<String>();
        ArrayList<String> homemSim = new ArrayList<String>();

        System.out.print("TESTE PRODUTO\n");

        for (int i = 0; i < 10; i++) {

            System.out.print("\n" + (i + 1) + "º ENTREVISTADO\n");
            System.out.println("INFORME SEU SEXO:\n"
                    + "1 - MASCULINO\n"
                    + "2 - FEMININO");
            sexo = ler.nextInt();

            while (sexo != 1 && sexo != 2) {

                System.out.println("Informe um valor válido");
                sexo = ler.nextInt();

            }

            System.out.print("\nGOSTOU DO NOSSO PRODUTO (S - SIM / N - NÃO): ");
            avaliacao = ler.nextLine();

            while (!avaliacao.equalsIgnoreCase("S") && !avaliacao.equalsIgnoreCase("N")) {

                System.out.println("Informe um valor válido");
                avaliacao = ler.nextLine();

            }

            if (avaliacao.equalsIgnoreCase("S") && sexo == 1) {

                homemSim.add(avaliacao);

            }

            if (avaliacao.equalsIgnoreCase("S")) {

                pessoasSim.add(avaliacao);

            }

            if (avaliacao.equalsIgnoreCase("S") && sexo == 2) {

                mulheresSim.add(avaliacao);

            } 
            
            if (avaliacao.equalsIgnoreCase("N")) {

                pessoasNao.add(avaliacao);

            }

        }

        System.out.print("\n\nTotal de " + pessoasSim.size() + " responderam 'SIM'\n");
        System.out.print("Total de " + pessoasNao.size() + " responderam 'NÃO'\n");
        System.out.print("Total de " + mulheresSim.size() + " mulheres responderam 'SIM'\n");
        System.out.print("Total de " + homemSim.size() + " homens responderam 'SIM'");

    }
}
