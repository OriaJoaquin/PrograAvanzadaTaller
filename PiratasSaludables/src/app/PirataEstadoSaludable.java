package app;

public class PirataEstadoSaludable extends PirataEstado{
	
	private int grog;
	
	@Override
	public PirataEstado consumirGrog(Pirata p) {
		if(++this.grog==3) {
			p.setAtaque(2);
			p.setDefensa(0);
			return new PirataEstadoEscorbuto();
		}
		return this;
	}
	
	@Override
	public PirataEstado consumirJugoNaranja(Pirata p) {
		return new PirataEstadoHiperSaludable();
	}

	
	
}
