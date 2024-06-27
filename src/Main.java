//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco("Banco");

        Cliente cliente1 = new Cliente("Cliente 1", banco);
        Cliente cliente2 = new Cliente("Cliente 2", banco);

        Conta contaCorrente = new ContaCorrente(cliente1, banco);
        Conta contaPoupanca = new ContaPoupanca(cliente2, banco);

        contaCorrente.depositar(100);
        contaPoupanca.depositar(200);
        contaCorrente.transferir(50, contaPoupanca);
        System.out.println(banco);

    }
}