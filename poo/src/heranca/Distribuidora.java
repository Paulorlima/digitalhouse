package heranca;

import java.util.ArrayList;
import java.util.List;

public class Distribuidora {
    public static void main(String[] args) {

        double precoFinal = 0;
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Pereciveis("alface", 3.50, 2));
        produtos.add(new Pereciveis("tomate", 4.50, 3));
        produtos.add(new Pereciveis("kiwi", 7.50, 1));
        produtos.add(new Pereciveis("macã", 4.50, 2));
        produtos.add(new Pereciveis("banana", 3.00, 3));
        produtos.add(new NaoPereciveis("sal", 2.50, "não perecivel"));
        produtos.add(new NaoPereciveis("oleo", 1.50, "não perecivel"));
        produtos.add(new NaoPereciveis("nescau", 3.50, "não perecivel"));
        produtos.add(new NaoPereciveis("bolacha", 3.50, "não perecivel"));
        produtos.add(new NaoPereciveis("chocolate", 5.00, "não perecivel"));

        for(Produto produto:produtos){
            precoFinal += produto.getPreco();
        }
        System.out.printf("O valor total é R$%.2f", precoFinal);
    }
}
