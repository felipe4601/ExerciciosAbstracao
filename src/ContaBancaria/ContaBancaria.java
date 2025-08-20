package ContaBancaria;

public class ContaBancaria implements OperacoesConta {
    private String numeroConta;
    private double saldo;
    private boolean saldoConta;


    public ContaBancaria(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    @Override
    public void depositar(double valor){
        saldo = saldo + valor;
    }
    @Override
    public void sacar(double valor){
        if(saldo < valor){
            System.out.println("Saldo insuficiente para saque.");
            saldoConta = false;
        }
        else{
            saldo = saldo - valor;
            saldoConta = true;
        }
    }
    @Override
    public double consultarSaldo() {
        return saldo;
    }
    @Override
    public void transferir (ContaBancaria destino, double valor){
        sacar(valor);
        if(saldoConta){
            destino.depositar(valor);
            System.out.println("Transferência realizada");
        }
        else{
            System.out.println("Saldo insuficiente para transferência");
        }

    }
}

