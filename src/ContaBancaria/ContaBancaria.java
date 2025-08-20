package ContaBancaria;

public class ContaBancaria implements OperacoesConta {
    private String numeroConta;
    private double saldo;
    private ContaBancaria destino;

    public ContaBancaria(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo = saldo + valor;
    }

    public void sacar(double valor){
        if(saldo < valor){
            System.out.println("Saldo insuficiente para saque.");
        }
        else{
            saldo = saldo - valor;
        }
    }
    public double consultarSaldo() {
        return saldo;
    }

    public void transferir (ContaBancaria destino, double valor){
        sacar(valor);
        depositar(valor);
    }
}

