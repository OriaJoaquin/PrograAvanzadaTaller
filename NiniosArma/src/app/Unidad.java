package app;

public abstract class Unidad {
	
	public final boolean equipar(Arma arma) {
		if(puedoCargar(arma)) {
			cargo(arma);
			return true;
		}
		return false;
	}
	
	protected abstract boolean puedoCargar(Arma arma);
	protected abstract void cargo(Arma arma);
}
