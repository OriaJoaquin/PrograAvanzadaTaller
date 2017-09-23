package app;

public class PirataEstadoHiperSaludable extends PirataEstado{
	
	@Override	
	public PirataEstado consumirGrog(Pirata p) {
		return new PirataEstadoSaludable();
	}

	@Override
	public PirataEstado consumirJugoNaranja(Pirata p) {
		return this;
	}
	

}
