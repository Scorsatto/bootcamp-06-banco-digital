public class Main {
    public static void main(String[] args) {
        IConta corrente = new ContaCorrente();
        IConta poupanca = new ContaPoupanca();

        corrente.depositar(100);
        poupanca.depositar(20);

        corrente.transferir(50, poupanca);

        corrente.sacar(10);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}