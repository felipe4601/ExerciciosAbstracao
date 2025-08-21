package Biblioteca;

public class Livro extends ItemBiblioteca{
    protected String autor;

    // Criando método construtor:
    public Livro(String titulo, int anoPublicacao, String autor){
        super(titulo, anoPublicacao);
        this.autor = autor;
    }

    // Criando método exibirInfo():

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Autor: " + autor);
    }

    @Override
    public String toString() {
        return  "Livro\t| " +
                "Autor: " + autor +
                " | Ano de Publicação: " + anoPublicacao +
                " | Título: " + titulo;
    }
}
