package Cursos;

public class CursoOnline extends Curso{
    private String linkAcesso;

    // Criando método construtor
    public CursoOnline(String nome, int duracaoHoras, String linkAcesso){
        super(nome, duracaoHoras);
        this.linkAcesso = linkAcesso;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Modalidade Online" );
        super.exibirDetalhes();
        System.out.println("Link para acessar o curso:" +  linkAcesso );
        System.out.println("--------------------------------------------------------------------\n");

    }
}
