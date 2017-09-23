package app;

public class Vieja extends Unidad {
	private static final double DISTANCIA_MAXIMA =700;
	private static final double VOLUMEN_MAXIMO = 1;
	private double volumenOcupado;
	private double alcanceMaximo;
	
	
	@Override
	protected boolean puedoCargar(Arma arma) {
		if((this.VOLUMEN_MAXIMO - this.volumenOcupado)>= arma.getVolumen()) {
			cargo(arma);
			return true;
		}
		return false;
	}
	@Override
	protected void cargo(Arma arma) {
		this.volumenOcupado += arma.getVolumen();
	}
	
	
	
}
