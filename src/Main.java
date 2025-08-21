import Biblioteca.ItemBiblioteca;
import Biblioteca.Livro;
import Biblioteca.Revista;
import ContaBancaria.ContaBancaria;
import ContaBancaria.OperacoesConta;
import GestaoDeColaboradores.Funcionario;
import GestaoDeColaboradores.FuncionarioCLT;
import GestaoDeColaboradores.FuncionarioFreelancer;
import LojaOnline.ProdutoDigital;
import LojaOnline.ProdutoFisico;
import LojaOnline.Vendavel;
import Tarefa.Concluivel;
import Tarefa.Tarefa;
import produto.Exibivel;
import produto.Produto;
import produto.Produto2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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


        // Exercício 6
        // Criando objetos do tipo ProdutoFisico
        double totalCarrinho = 0 ;
        Vendavel livroFisico1 = new ProdutoFisico(180,20);
        Vendavel livroFisico2 = new ProdutoFisico(40,15);
        Vendavel livroFisico3 = new ProdutoFisico(100,20);
        Vendavel livroFisico4 = new ProdutoFisico(90,20);
        Vendavel livroFisico5 = new ProdutoFisico(25,15);
        Vendavel livroFisico6 = new ProdutoFisico(30,21);
        Vendavel livroFisico7 = new ProdutoFisico(12,20);
        Vendavel livroFisico8 = new ProdutoFisico(200,20);
        Vendavel livroFisico9 = new ProdutoFisico(152,18);

        // Criando objetos do tipo ProdutoDigital
        Vendavel livroDigital1 = new ProdutoDigital(623,1000);
        Vendavel livroDigital2 = new ProdutoDigital(550,800);
        Vendavel livroDigital3 = new ProdutoDigital(750,1500);
        Vendavel livroDigital4 = new ProdutoDigital(852,700);
        Vendavel livroDigital5= new ProdutoDigital(152,500);
        Vendavel promob = new ProdutoDigital(150,250);
        Vendavel autodesk = new ProdutoDigital(300,1000);
        Vendavel warface = new ProdutoDigital(500,7000);
        double precoDesconto = warface.calcularPrecoFinal();



        List<Vendavel> carrinho = new ArrayList<Vendavel>();

        carrinho.add(livroFisico1);
        carrinho.add(livroFisico2);
        carrinho.add(livroFisico3);
        carrinho.add(livroFisico4);
        carrinho.add(livroFisico5);
        carrinho.add(livroFisico6);
        carrinho.add(livroFisico7);
        carrinho.add(livroFisico8);
        carrinho.add(livroFisico9);
        carrinho.add(livroDigital1);
        carrinho.add(livroDigital2);
        carrinho.add(livroDigital3);
        carrinho.add(livroDigital4);
        carrinho.add(livroDigital5);
        carrinho.add(promob);
        carrinho.add(autodesk);
        carrinho.add(warface);


        for(Vendavel c: carrinho){
            totalCarrinho += c.calcularPrecoFinal();
        }

        for(Vendavel c: carrinho){
            System.out.println(c);
        }
        System.out.println("Total Carrinho: R$" + totalCarrinho);

        // Exercício 6
        Funcionario felipe = new FuncionarioFreelancer("Felipe", 3000,50,120);
        Funcionario luiz = new FuncionarioCLT("Luiz", 6000);

        felipe.exibirDados();
        luiz.exibirDados();

        // Exercício 7





















    }
}