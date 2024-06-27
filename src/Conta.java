// classe abstrata n pode ser instanciada
public abstract class Conta implements iConta {
    // o protected permite o aceso aos filhos
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1   ;
    protected Cliente cliente;
    protected Banco banco;

    public Conta(Cliente cliente, Banco banco) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.banco = banco;

        this.banco.adicionarConta(this);
    }

    protected int agencia;
    protected int numero;
    protected double saldo;

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if(saqueOk(valor)) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void transferir(double valor, Conta destino) {
        if(saqueOk(valor)) {
            this.sacar(valor);
            destino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public String toString() {
        return "Conta{" +
                "cliente=" + cliente +
                ", agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }

    private boolean saqueOk(double valor) {
        return saldo - valor >= 0;
    }

}
