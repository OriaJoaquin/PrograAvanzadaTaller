package app;

public class Arma {
	private double peso;
	private double volumen;
	
	
	public Arma(double peso, double volumen) {
		//super();
		this.peso = peso;
		this.volumen = volumen;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getVolumen() {
		return volumen;
	}
	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}
}
