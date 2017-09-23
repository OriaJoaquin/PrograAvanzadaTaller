package app;

public class Pirata {
	private int ataque;
	private int defensa;
	private PirataEstado estado;
	
	
	public Pirata() {
		this.estado = new PirataEstadoSaludable();
		this.ataque = 5;
		this.defensa = 2;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	
	public void consumirGrog() {
		this.estado= estado.consumirGrog(this);
	}
	
	public void consumirJugoDeNaranja() {
		this.estado = estado.consumirJugoNaranja();
		
	}
	
}
