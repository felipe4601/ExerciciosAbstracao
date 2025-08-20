package produto;

public class Produto2 {
    private String nome;
    private double preco;


    public Produto2(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public void exibirDetalhes(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);

    }
}
