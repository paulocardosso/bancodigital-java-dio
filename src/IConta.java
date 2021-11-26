
public interface IConta {
	
	//apenas ass de metodos (sem corpo), todos eles s�o publicos, n�o precisa declarar!
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, IConta contaDestino);
	
	void imprimirExtrato();
}
