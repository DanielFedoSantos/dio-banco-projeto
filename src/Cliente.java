public class Cliente {

    private String nome;
    private Banco banco;

    public Cliente(String nome, Banco banco) {
        this.nome = nome;
        this.banco = banco;
        this.banco.adicionarCliente(this);

    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
