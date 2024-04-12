/*Sendo H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N, fazer um algoritmo, utilizando o comando para ... faça, para gerar o número H. 
O número N é lido através de uma unidade de entrada qualquer uma única vez.*/
package psc.exercicio05;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao08 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double h = 0;
        int n;

        System.out.print("H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N\n"
                + "Informe um valor: ");
        n = ler.nextInt();

        for (int i = 1; i <= n; i++) {

            h += 1.0 / i;

        }

            System.out.printf("O valor de H será: %.2f",h);       
        
    }
}

