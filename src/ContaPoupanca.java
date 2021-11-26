
public class ContaPoupanca extends Conta {

	@Override
	public void imprimirExtrato() {
		System.out.println(" ### EXTRATO DA CONTA POUPANCA ###");
		super.imprimirInfoComuns();
	}
	
}
