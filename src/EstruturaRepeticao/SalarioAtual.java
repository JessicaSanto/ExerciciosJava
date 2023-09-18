package EstruturaRepeticao;

import java.util.Scanner;

public class SalarioAtual {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salario: ");
        int salario = scanner.nextInt();

        while (salario < 5000) {
            salario += 100;
            System.out.println("O salário ainda é R$" + salario);
        }

        System.out.println("O salário final é R$" + salario);
    }
    }
