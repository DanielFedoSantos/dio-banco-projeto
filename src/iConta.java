public interface iConta {
    void depositar(double valor);
    void transferir(double valor, Conta destino);
    void sacar(double valor);   

}
