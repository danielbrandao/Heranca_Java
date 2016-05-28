public class ContaPoupanca extends Conta {

	private double taxaRendimento;
	
	public double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}
	
	
	public void creditarRendimento(){
		double novoValor = this.getSaldo() + (this.getSaldo() * this.taxaRendimento);
		this.setSaldo(novoValor);
	}	
	
	@Override
	public void debitar(double valor) {
		if (valor <= getSaldo()) {
			this.setSaldo(this.getSaldo()-valor);
		}
	}
}