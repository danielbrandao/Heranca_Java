public class ContaCorrente extends Conta{

	private double taxaOperacao;
	private double taxaManutencao;
	
	
	
	public double getTaxaOperacao() {
		return taxaOperacao;
	}
	public void setTaxaOperacao(double taxaOperacao) {
		this.taxaOperacao = taxaOperacao;
	}
	public double getTaxaManutencao() {
		return taxaManutencao;
	}
	public void setTaxaManutencao(double taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}

	public void debitar(double valor) {
		valor += this.taxaOperacao;
		if (valor <= getSaldo()) {
			this.setSaldo(this.getSaldo()-valor);
		}
	}
	
	
	
	
	
	
	public void debitarManutencao(){
		this.setSaldo(this.getSaldo() - this.taxaManutencao);
	}
	
}