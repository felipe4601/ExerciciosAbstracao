import ContaBancaria.ContaBancaria;
import ContaBancaria.OperacoesConta;
import Tarefa.Concluivel;
import Tarefa.Tarefa;
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



        primeiraOperacao.transferir((ContaBancaria) segundaOperacao, 2200);
        // Usando casting, pois o parametro recebe um argumento do tipo Operações, mas estou passando
        // um objeto do tipo ContaBancaria, faço o casting para que ele aceite o argumento
        double v = segundaOperacao.consultarSaldo();
        System.out.println(v);
        System.out.println();//pulando linha

        // Exercício 3
        // Criando objeto
        Concluivel tarefa1 = new Tarefa("Desenvolver API",5);

        tarefa1.exibirStatus();
        tarefa1.concluir();
        tarefa1.estaConcluida();
        tarefa1.exibirStatus();

        // Exercício 4
        



    }
}