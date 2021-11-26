
public class Main {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		cc.depositar(50);
		cc.transferir(20, cp);
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}
}
