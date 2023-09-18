package EstruturaRepeticao;

import java.util.ArrayList;

public class ListaAlunos {
         public static void main(String[] args) {
             // Exemplo 1 - Listar alunos e verificar posição na lista
            // Se o numero for par, escreva "par" e o numero correspondente
            //Se o numero for impar, escreva "impar" e o numero correspondente
            //Se for zero, escreva "zero"

             ArrayList<String> aluno = new ArrayList<>();
             aluno.add("Alana");
             aluno.add("Aléxia");
             aluno.add("Jéssica");
             aluno.add("Odirlei");
             aluno.add("Possarle");
             aluno.add("Samanta");
             aluno.add("Thiago");

                for (int contador = 0; contador < aluno.size(); contador++) {

                    if (contador == 0) {
                        System.out.println("O número de indice do(a) professor(a) " + aluno.get(contador) + " é Zero");
                    } else if (contador % 2 == 0) {
                        System.out.println("O número de indice do(a) professor(a) " + aluno.get(contador) + " é Par");
                    } else {
                        System.out.println("O número de indice do(a) professor(a) " + aluno.get(contador) + " é Impar");
                    }
                }
            }
        }