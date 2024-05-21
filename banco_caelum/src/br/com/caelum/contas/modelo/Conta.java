package br.com.caelum.contas.modelo;

public abstract class Conta {

	private int identificador;
	private static int proximoIdentificador;
	protected int numero;
	protected String titular;
	protected String agencia;
	private Data dataAbertura;
	protected double saldo;
	double valor;

	public Conta() {
	}

	public Conta(String titular, int numero, String agencia) {
		this.titular = titular;
		this.setNumero(numero);
		this.setAgencia(agencia);
		this.identificador = proximoIdentificador++;
		this.dataAbertura = new Data();
	}

	public int getIdentificador() {
		return this.identificador;
	}

	public static int getInst() {
		return Conta.proximoIdentificador;
	}

	public String getTitular() {
		return this.titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return this.agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void deposita(double quantidade) {
		this.saldo += quantidade;
	}

	public boolean saca(double valor) {
		if (this.saldo < valor) {
			return false;
		} else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}

	public Data getDataDeAbertura() {
		return this.dataAbertura;
	}

	public void setDataDeAbertura(Data dataDeAbertura) {
		this.dataAbertura = dataDeAbertura;
	}

	double getRendimento() {
		double rendimento = 0.1 * this.saldo;
		return rendimento;
	}

	public boolean transferirPara(Conta destino, double valor) {
		if (this.saca(valor)) {
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}

	public abstract String getTipo();

	// Metodo para tranferir valores entre contas
	boolean transferePara(Conta destino, double valor) {
		boolean retirou = this.saca(valor);
		if (retirou == false) {
			return false;
		} else {
			destino.deposita(valor);
			return true;
		}
	}

	public String recuperarDadosParaImpressao() {
		String dados = "\nTitular: " + this.titular;
		dados += "\nNúmero: " + this.numero;
		dados += "\nAgencia: " + this.agencia;
		dados += "\nSaldo: " + this.saldo;
		if (this.dataAbertura != null) {
			dados += "\nData de abertura: " + this.dataAbertura.formatada();
		} else {
			dados += "\nData de abertura: [Data não especificada]";
		}
		dados += "\nData de abertura: " + this.dataAbertura.formatada();
		dados += "\nCalcula Rendimentos: " + this.getRendimento();
		dados += "\nNº de Instancias: " + this.getIdentificador();
		return dados;
	}
}
