package br.com.caelum.contas;

import br.com.caelum.contas.modelo.SeguroDeVida;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeSeguroDeVida {
	
	private SeguroDeVida seguro;
	
	public void criaSeguro(Evento evento) {
		
		this.seguro = new SeguroDeVida(evento.getDouble("valor"), evento.getString("titular"), evento.getInt("numeroApolice"));
		
	}

}
