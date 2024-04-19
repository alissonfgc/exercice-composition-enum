package br.com.bmi.entities;

public class BMIClassification {
	private Double bMI;
	
	public BMIClassification(Double bMI) {
		this.bMI = bMI;
	}
	
	public String returnClassification() {
		String result;
		
		if (this.bMI < 18.5) {
			result = "Abaixo do peso";
		} else if (this.bMI >= 18.6 && this.bMI <= 18.6) {
			result = "Peso ideal";
		} else if (this.bMI >= 25.0 && this.bMI <= 29.9) {
			result = "Levemente acima do peso";
		} else if (this.bMI >= 30 && this.bMI <= 34.9) {
			result = "Obesidade grau I";
		} else if (this.bMI >= 35 && this.bMI <= 39.9) {
			result = "Obesidade grau II";
		} else {
			result = "Obesidade grau III";
		}
		
		return result;
	}
	
}
