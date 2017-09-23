package app;

public class Ninio extends Unidad{
	static final double PESO_LIMITE=120;
	static final double CANTIDAD_ARMAS_MAX=2;
	private double pesoOcupado;
	public double getPesoOcupado() {
		return pesoOcupado;
	}
	public void setPesoOcupado(double pesoOcupado) {
		this.pesoOcupado = pesoOcupado;
	}
	public int getCantidadArmas() {
		return cantidadArmas;
	}
	public void setCantidadArmas(int cantidadArmas) {
		this.cantidadArmas = cantidadArmas;
	}
	private int cantidadArmas; 
	
	
	
	@Override
	protected boolean puedoCargar(Arma arma) {
		if(this.cantidadArmas < this.CANTIDAD_ARMAS_MAX) {
			if((this.PESO_LIMITE-this.pesoOcupado)>=arma.getPeso()) {
				//cargo(arma);
				return true;
			}
		}
		return false;
	}
	@Override
	protected void cargo(Arma arma) {
		this.pesoOcupado += arma.getPeso();
		this.cantidadArmas++;
	}
	

}
