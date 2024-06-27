import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> Contas = new ArrayList<>();
    private List<Cliente> Clientes = new ArrayList<>();

    public Banco(String banco) {
        this.nome = banco;
    }

    public void adicionarConta(Conta conta) {
        this.Contas.add(conta);
    }
    public void adicionarCliente(Cliente cliente) {
        this.Clientes.add(cliente);
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nome='" + nome + '\'' +
                ",\n Contas=" + Contas +
                ",\n Clientes=" + Clientes +
                '}';
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
