package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel{
	
	public String retornaDadosAleatios() {
		return "saas";
	}
	
	@Override
	public boolean saca(double valor) {
		valor += 0.10;
		if (this.saldo < valor) {
			return false;
		} else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}
	
	@Override
	public String getTipo() {
		return "Conta Corrente";
	}

	@Override
	public Double getValorImposto() {
		return this.saldo * 0.1;
	}

}
