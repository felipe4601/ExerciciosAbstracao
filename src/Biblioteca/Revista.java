package Biblioteca;

public class Revista extends Livro{
    private int edicao;

    // Criando Construtor:
    public Revista(String titulo, int anoPublicacao, String autor, int edicao){
        super(titulo, anoPublicacao, autor);
        this.edicao = edicao;
    }
    // Sobrescrevendo exibirInfo (Polimorfismo)
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Edição: " + edicao);
    }

    @Override
    public String toString() {
        return "Revista | " +
                "Autor: " + autor +
                " | Ano de Publicação: " + anoPublicacao +
                " | Título: " + titulo +
                " | Edição: " + edicao;
    }

}
