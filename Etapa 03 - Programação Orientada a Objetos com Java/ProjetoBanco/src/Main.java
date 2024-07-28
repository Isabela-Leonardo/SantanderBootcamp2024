public class Main {
    public static void main(String[] args) throws Exception {

        Cliente c1 = new Cliente();
		c1.setNome("Jorge");
        c1.setCpf("000.000.000-00");

        Conta corrente = new ContaCorrente(c1);
		Conta poupanca = new ContaPoupanca(c1);

		corrente.depositar(100);
		corrente.transferir(80, poupanca);
		
		corrente.imprimirExtrato();
		poupanca.imprimirExtrato();
    }
}
