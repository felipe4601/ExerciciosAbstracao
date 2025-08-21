package GestaoDeColaboradores;

public class Funcionario {
    // Criando atributos
    protected String nome;
    protected double salarioBase;

    // Criando método construtor
    public Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    // Criando método para calcular o pagamento
    public double calcularPagamento(){
        return salarioBase;
    }

    // Criando método para exibir os dados do funcionario
    public void exibirDados(){
        System.out.println("-- DADOS DO FUNCIONÁRIO --");
        System.out.println("Nome: " + nome);
    }
}
