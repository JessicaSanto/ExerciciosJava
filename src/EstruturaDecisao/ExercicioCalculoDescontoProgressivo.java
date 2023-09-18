package EstruturaDecisao;

import java.util.Scanner;

public class ExercicioCalculoDescontoProgressivo {
    public static void main(String[] args) {

        //Exercício 5: Cálculo de desconto progressivo
        //Imagine uma loja de roupas que dê um desconto ao cliente, dependendo do valor que ele pague.
        //Faça um programa para loja, que solicite o valor total da compra ao usuário e assim, aplique um desconto de acordo com o valor total da compra.
        //Siga a tabela:
        //Valor total da compra até R$ 100,00: sem desconto.
        //Valor total da compra de R$ 100,01 a R$ 200,00: desconto de 10%.
        //Valor total da compra acima de R$ 200,00: desconto de 20%.
        //Exiba o valor final da compra com o desconto aplicado.


        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor total da compra: ");

        double valorCompra = Double.parseDouble(scanner.nextLine());
        double descontoDaCompra;

        if (valorCompra <= 100) {
            descontoDaCompra = valorCompra;
        } else if (valorCompra > 100 && valorCompra <= 200) {
            descontoDaCompra = valorCompra * .90; // Desconto de 10%
        } else {
            descontoDaCompra = valorCompra * .80; // Desconto de 20%
        }

        System.out.println("Valor final da compra: R$" + descontoDaCompra);
    }
}