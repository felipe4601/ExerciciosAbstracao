import ContaBancaria.ContaBancaria;
import ContaBancaria.OperacoesConta;
import produto.Exibivel;
import produto.Produto;
import produto.Produto2;

public class Main {
    public static void main(String[] args) {
        Exibivel prod1 = new Produto("Mouse", 20);
        Produto2 prod2 = new Produto2("Teclado", 30);

        prod2.exibirDetalhes();

        System.out.println();

        prod1.exibirDetalhes();

        // Conta Bancaria

        OperacoesConta primeiraOperacao = new ContaBancaria("123",2000);
        OperacoesConta segundaOperacao = new ContaBancaria("456", 3000);



    }
}