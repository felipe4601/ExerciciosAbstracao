import Biblioteca.ItemBiblioteca;
import Biblioteca.Livro;
import Biblioteca.Revista;
import ContaBancaria.ContaBancaria;
import ContaBancaria.OperacoesConta;
import Tarefa.Concluivel;
import Tarefa.Tarefa;
import produto.Exibivel;
import produto.Produto;
import produto.Produto2;

import java.util.ArrayList;
import java.util.Arrays;

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
        double v1 = primeiraOperacao.consultarSaldo();
        System.out.println(v1);
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
        Livro livro1 = new Livro("Java: O guia do programador", 2018, "Peter");
        System.out.println();
        livro1.exibirInfo();

        Livro livro2 = new Livro("Código Limpo", 2020, "Robert Cecil Martin");
        System.out.println();
        livro1.exibirInfo();

        Livro livro4 = new Livro("Python para Análise de dados", 2024, "Wes McKinney");
        System.out.println();
        livro1.exibirInfo();

        Revista revista1 = new Revista(".NET Magazine 132", 2025, "Robert Cecil Martin", 2020);
        System.out.println();
        livro1.exibirInfo();

        Revista revista2 = new Revista("Java EE 7", 2025, "Robert Cecil Martin", 2020);
        System.out.println();
        livro1.exibirInfo();

        Revista revista3 = new Revista("Engenharia de Software", 2025, "Robert Cecil Martin", 2020);
        System.out.println();
        livro1.exibirInfo();

        // Exercício 5

        ArrayList<ItemBiblioteca> listaBiblioteca = new ArrayList<>();
        listaBiblioteca.add(livro1);
        listaBiblioteca.add(livro2);
        listaBiblioteca.add(livro4);
        listaBiblioteca.add(revista1);
        listaBiblioteca.add(revista2);
        listaBiblioteca.add(revista3);

        int tamanhoArray = listaBiblioteca.size();

        // Percorrendo Array
        for(int i = 0; i < tamanhoArray; i++){
            System.out.println((i+1) + " - " + listaBiblioteca.get(i));
        }









    }
}