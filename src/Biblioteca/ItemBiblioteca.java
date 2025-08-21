package Biblioteca;

public class ItemBiblioteca {
    protected String titulo;
    protected int anoPublicacao;

    // Criando método construtor
    public ItemBiblioteca(String titulo, int anoPublicacao){
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    // Criando método exibirInfo()
    public void exibirInfo(){
        System.out.println("Título: " + titulo);
        System.out.println("Ano Publicação: " + anoPublicacao);
    }



}
