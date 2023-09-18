package EstruturaDecisao;

import java.util.Scanner;

public class ExercicioHoraFilme {

    /*Sabendo que cada hora dura 60 minutos e que cada minuto dura 60 segundos,
    solicite ao usuário que digite o tempo de um filme em minutos e informe a duração
    desse filme em horas e em segundos.*/

    public static void main(String[] args) {

        /*Para solicitarmos que o usuário digite um dado pelo teclado, será necessário
        criarmos um Scanner. A linha abaixo cria um Scanner chamado "leitor"*/

        Scanner leitor = new Scanner(System.in);

        /* Precisamos criar as variáveis para armazenarmos o tempo do filme
        em minutos (será digitado pelo usuário), em horas (será calculado pelo programa)
        e em segundos. O cálculo em horas pode gerar um número com casas decimais,
        por conta da divisão. Então criaremos as variáveis para minutos e segundos
        omo do tipo int e a variável para as horas como do tipo double.*/

        int minutos, segundos;
        double horas;

        /*Para orientar o usuário, podemos exibir mensagens através do comando System.out.println,
         colocando entre parênteses uma mensagem de texto*/

        System.out.println("Esse programa recebe a duração de um filme em minutos e exibe a conversão para horas e para segundos");
        System.out.println("Por favor, informe a duração do filme em minutos");

        /*Para armazenarmos em uma variável a duração que o usuário digitar, devemos usar o Scanner.
        /Como estamos tratando de números inteiros, o Scanner deve usar o método nextInt()*/

        minutos = leitor.nextInt();
        segundos = minutos * 60;
        horas = minutos / 60.0;

        /*Para exibirmos o resultado final dos segundos, podemos utilizar o System.out.println(),
        /colocando o nome da variável segundos fora das aspas para que seu conteúdo seja exibido*/


        System.out.println("A duração desse filme é de " + segundos + " segundos");
        System.out.println("A duração desse filme é de " + horas + " horas");

        leitor.close();

    }
}