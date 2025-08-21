package LojaOnline;

public class ProdutoDigital implements Vendavel{
    //  Criando atributos
    private double preco;
    private int tamanhoArquivoMB;

    // Criando método construtor
    public ProdutoDigital(double preco, int tamanhoArquivoMB){
        this.preco = preco;
        this.tamanhoArquivoMB = tamanhoArquivoMB;
    }

    @Override
    public double calcularPrecoFinal() {
        // Criando verificacão para aplicar desconto
        if(tamanhoArquivoMB > 1000){
            preco = preco * 0.75;
        }
        return preco;
    }

    @Override
    public String toString() {
        return "Produto Digital " +
                " | Preço: " + preco + " | " +
                tamanhoArquivoMB + "MB"
                ;
    }
}
