package app;

public class PirataEstadoEscorbuto extends PirataEstado {

	@Override	
	public PirataEstado consumirJugoNaranja(Pirata p) {
		return new PirataEstadoSaludable();
	}

	@Override
	public PirataEstado consumirGrog(Pirata p) {
		return this;
	}
}
