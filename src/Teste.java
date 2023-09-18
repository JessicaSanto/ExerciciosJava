import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Teste {
    public static void main(String[] args) {

    }
        public boolean ValidarDataNasc (LocalDate dataNasc){
            LocalDate dataAtual = LocalDate.now();

            int anos = Period.between(dataNasc, dataAtual).getYears();

            System.out.println(anos);

            if (anos >= 18) {
                return true;
            }

            return false;
    }

}
