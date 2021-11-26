
public interface IConta {
	
	//apenas ass de metodos (sem corpo), todos eles são publicos, não precisa declarar!
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, IConta contaDestino);
	
	void imprimirExtrato();
}
