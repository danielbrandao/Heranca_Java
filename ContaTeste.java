import java.util.Formatter.*;

public class ContaTeste {

	public static void main(String[] args) {
		Conta cp = new ContaPoupanca();
		Conta cc = new ContaCorrente();
		
		cp.setNumero("1234-0");
		cp.setCliente("João da Silva");
		cp.setDataAbertura("22/12/2015");
		cp.setSaldo(5000.00);
		
		cc.setNumero("1234-1");
		cc.setCliente("Maria Santos");
		cc.setDataAbertura("29/02/2016");
		cc.setSaldo(299.10);
		
		cc.exibirMensagem();
		
		System.out.println("--- Saldo antes das operações ---");
		System.out.printf("Conta corrente: %.3f \n", cc.getSaldo());
		System.out.printf("Conta Poupanca: %.2f", cp.getSaldo());

		
		cp.creditar(200);	
				
		cc.debitar(100);
		
		System.out.println("\n--- Saldo após as Operações ---");
		System.out.printf("Conta corrente: " + cc.getNumero() + 
				"\nCliente: " + cc.getCliente() + 
				"\nSaldo: %.2f \n", cc.getSaldo());
		
		System.out.printf("\nConta Poupanca: " + cp.getNumero() + 
				"\nCliente: " + cp.getCliente() +
				"\nSaldo %.2f", cp.getSaldo()); 
	}
}
