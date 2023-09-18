package EstruturaRepeticao;

import java.util.ArrayList;

public class ListaCarro {
    public static void main(String[] args) {

        // Exemplo 2 - Apresente a lista de carros

        ArrayList<String> listaCarros = new ArrayList<>();
        listaCarros.add("fiesta");
        listaCarros.add("onix");
        listaCarros.add("fusca");
        listaCarros.add("saveiro");

        for (String carro : listaCarros) {
            System.out.println("O carro atual: " + carro);
        }
    }
}

