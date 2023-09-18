package EstruturaDecisao;

import java.util.Scanner;

public class VerificacaoLogin {
    public static void main(String[] args) {

        //Exercício 1: Verificação de login
        //Escreva um programa que solicita ao usuário um nome de usuário e uma senha.
        //Verifique se o nome de usuário é "admin" e a senha é "senha123".
        //Exiba uma mensagem indicando se o login foi bem-sucedido ou não.


        Scanner leitor = new Scanner(System.in);

        String usuario;
        String senha;

        System.out.println("Digite o nome de usuário:");
        usuario = leitor.nextLine();

        System.out.println("Digite a senha:");
        senha = leitor.nextLine();

        if (usuario.equals("admin")  && senha.equals("senha123")) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Nome de usuário ou senha incorretos.");
        }
        leitor.close();


    }
}
