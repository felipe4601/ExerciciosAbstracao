package Cursos;

public class Curso {
    // Criando atributos
    protected String nome;
    protected  int duracaoHoras;

    // Criando método construtor
    public Curso(String nome, int duracaoHoras){
        this.nome = nome;
        this.duracaoHoras = duracaoHoras;
    }

    // Criando métod para exibir detalhes do curso
    public void exibirDetalhes(){
        System.out.println("Nome do Curso: " + nome);
        System.out.println("Duração do curso " + duracaoHoras + " horas");
    }
}
