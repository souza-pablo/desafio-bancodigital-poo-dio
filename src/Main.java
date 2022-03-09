public class Main {

    public static void main(String[] args) {
        Cliente pablo = new Cliente();
        pablo.setNome("Pablo");

        Conta cc = new ContaCorrente(pablo);
        Conta poupanca = new ContaPoupanca(pablo);

        cc.depositar(500);
        cc.transferir(380, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
