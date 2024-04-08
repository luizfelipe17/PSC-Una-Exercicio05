/*1 - Faça um programa que receba várias idades, calcule e mostre a média das idades digitadas. 
Finalize digitando idade igual a zero.*/
package psc.exercicio05;
import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner (System.in);
        
        int idade, somaIdade = 0, mediaIdade, opcao, qtsIdade = 0;   
        
        while (true) {
            
            System.out.print("Informe a idade: ");
            idade = ler.nextInt();
            
            while (idade <= 0){
                
                System.out.print("\nInforme um valor válido!!!");
                System.out.print("\nInforme a idade: ");
                idade = ler.nextInt();
                
            }
            
            somaIdade+=idade;
            qtsIdade++;
            
            System.out.println("9 - CONTINUAR     0 - SAIR");
            opcao = ler.nextInt();
            
            if (opcao == 9){
                
                
                
            }else if (opcao == 0){
              
                mediaIdade = somaIdade / qtsIdade;
                System.out.println("\nA média das idades informadas foi de: "+mediaIdade+" anos");
                break;
                
            }else{
                
                System.out.print("Informe um dos valores:\n \"9 - CONTINUAR     0 - SAIR\"");
                
            }
            
        }
        
    }
    
}
