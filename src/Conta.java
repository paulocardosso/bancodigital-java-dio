
public abstract class Conta implements IConta{
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIA = 1;
	
	private int agencia;
	private int numConta;
	private double saldo;
	
	public Conta() {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numConta = SEQUENCIA++;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	protected void imprimirInfoComuns() {
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Conta: %d", this.numConta));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumConta() {
		return numConta;
	}

	public double getSaldo() {
		return saldo;
	}
}
