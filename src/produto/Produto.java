package produto;

public class Produto implements Exibivel{
    private String nome;
    private double preco;

    // Criando método construtor
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    // Criando método exibirDetalhes();
    public void exibirDetalhes(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
    }
}
