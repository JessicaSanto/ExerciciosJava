package EstruturaDecisao;

import java.util.Date;
import java.util.Scanner;

public class VerificacaoIdade {

        public static void main(String[] args) {

            //Exercício 4: Verificação de idade
            //Escreva um programa que solicita o ano de nascimento de uma pessoa e verifica se ela é maior de 18 anos.
            //Exiba uma mensagem indicando se a pessoa é maior de idade ou não.


            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o ano de nascimento: ");

            int anoNascimento = scanner.nextInt();
            int anoAtual = new Date().getYear() + 1900;
            int idade = anoAtual - anoNascimento;

            if (idade >= 18) {
                System.out.println("Você é maior de idade.");
            } else {
                System.out.println("Você é menor de idade.");
            }
        }
    }

