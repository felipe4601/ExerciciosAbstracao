package GestaoDeColaboradores;

public class FuncionarioCLT extends Funcionario{
    // Sem atributos extras

    // Criando método construtor
    public FuncionarioCLT(String nome, double salarioBase){
        super(nome, salarioBase);
    }

    // Como o método é exatamente igual ao da classe mãe, não preciso sobrescreve-lo aqui

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Salário CLT: " + calcularPagamento());
    }

}
