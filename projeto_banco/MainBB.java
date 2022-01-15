package projeto_banco;

public class MainBB {

	public static void main(String[] args) {
		
		Cliente David = new Cliente();
		David.setNome("David");
		
		Cliente Joao = new Cliente();
		Joao.setNome("Joao");
		
		
		ContaPoupanca cp = new ContaPoupanca(Joao);
		ContaCorrente cc = new ContaCorrente(David);
		
		cc.depositar(1000);
		cc.transferir(cc, 300);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
		
		
	}

}
