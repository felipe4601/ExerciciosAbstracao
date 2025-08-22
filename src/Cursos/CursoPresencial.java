package Cursos;

public class CursoPresencial extends Curso{
    // Criando atributos específicos da classe filha
    private String endereco;

    // Criando método construtor
    public CursoPresencial(String nome, int duracaoHoras, String endereco){
        super(nome,duracaoHoras);
        this.endereco  = endereco;
    }

    // Sobrescrevendo método da classe mãe(Polimorfismo)

    @Override
    public void exibirDetalhes() {
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Modalidade Presencial" );
        super.exibirDetalhes();
        System.out.println("Endereço: " + endereco );
        System.out.println("--------------------------------------------------------------------\n");

    }
}
