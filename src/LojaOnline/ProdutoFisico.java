package LojaOnline;

public class ProdutoFisico implements Vendavel{
    // Criando atributos
    private double preco;
    private double frete;

    // Criando Método construtor
    public ProdutoFisico(double preco, double frete){
        this.preco = preco;
        this.frete = frete;
    }

    @Override
    public double calcularPrecoFinal(){
        return preco + frete;
    }

    @Override
    public String toString() {
        return "Produto Fisico " +
                " | Preço: " + preco +
                " | Frete: " + frete
                ;
    }
}
