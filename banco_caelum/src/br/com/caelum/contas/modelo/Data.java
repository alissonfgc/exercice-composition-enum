package br.com.caelum.contas.modelo;

public class Data {

	int dia;
	int mes;
	int ano;

	String formatada() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
	
	public void preencheData(int dia, int mes, int ano) {
		
		if(!isDataViavel(dia, mes, ano)) {
			System.out.println("A data " + dia + "/" + mes + "/" + ano + "não existe!");
		}else {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}
	}
	

	private boolean isDataViavel(int dia, int mes, int ano) {
		if(ano <= 0 || mes <= 0 ) {
			return false;
		}
		
		int ultimoDiaMes = 31; //por padrão;
		
		if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			ultimoDiaMes = 30;
		}else if(mes == 2){
			if(ano % 4 == 0) {
				ultimoDiaMes = 29;
			}else {
				ultimoDiaMes = 28;
			}
		}
		if (dia > ultimoDiaMes) {
			return false;
		}
		
		return true;
	}
}
