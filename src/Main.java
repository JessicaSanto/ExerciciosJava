import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Teste suaInstancia = new Teste();
        LocalDate dataDeNascimento = LocalDate.of(1990, 8, 25); // Substitua com a data de nascimento desejada
        boolean resultado = suaInstancia.ValidarDataNasc(dataDeNascimento);
        System.out.println("Resultado: " + resultado);
    }
}