package GestaoDeColaboradores;

public class FuncionarioFreelancer extends Funcionario{
    // Criando atributos
    private double valorHora;
    private int horasTrabalhadas;

    // Criando método construtor
    public FuncionarioFreelancer(String nome, double salarioBase, double valorHora, int horasTrabalhadas){
        super(nome,salarioBase);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    // Sobrescrevendo método calcularPagamento, pois ele tem alterações
    @Override
    public double calcularPagamento(){
        return valorHora * horasTrabalhadas;
    }

    // Sobrescrevendo método exibir dados
    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Salário Freelancer: " + calcularPagamento());
    }
}
