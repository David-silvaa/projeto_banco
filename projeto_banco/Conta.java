package projeto_banco;

public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int numero;
	protected int agencia;
	protected double saldo;
	private Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public void transferir(Conta contaDestino, double valor) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	public int getNumero() {
		return numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public double getSaldo() {
		return saldo;
	}

	protected void ImprimirInfoComum() {
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
	
	
	
}
