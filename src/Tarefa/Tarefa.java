package Tarefa;

public class Tarefa implements Concluivel{
    private String descricao;
    private boolean concluida = false;
    private int prioridade;

    public Tarefa(String descricao, int prioridade) {
        this.descricao = descricao;
        this.prioridade = prioridade;
    }

    public void concluir(){
        concluida = true;
        System.out.println("Tarefa concluída");
    }

    @Override
    public boolean estaConcluida() {
        return concluida;
    }
    @Override
    public void exibirStatus(){
        System.out.println("Descricão: " + descricao);
        System.out.println("Status: " + ((concluida) ? "Concluida" : "Pendente"));
        System.out.println("Prioridade: " + prioridade);
    }
}
