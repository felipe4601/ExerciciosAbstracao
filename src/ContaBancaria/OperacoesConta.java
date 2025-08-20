package ContaBancaria;

public interface OperacoesConta {
    void depositar(double valor);
    void sacar (double valor);
    double consultarSaldo();
    void transferir(ContaBancaria destino, double valor);

}
