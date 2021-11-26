
public class ContaCorrente extends Conta{

	@Override
	public void imprimirExtrato() {
		System.out.println(" ### EXTRATO DA CONTA CORRENTE ###");
		super.imprimirInfoComuns();
	}

}
