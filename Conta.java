
public abstract class Conta {
	
	protected String numero;
	protected double  saldo;
	protected String cliente;
	protected String dataAbertura;
	
	public void exibirMensagem(){
		System.out.println("Bem-vindo ao relatório de contas \n");
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public void creditar(double valor) {
		this.saldo += valor;
	}
	
	public abstract void debitar(double valor);
	
	
	
}
