package geometria;

public class Circulo {
	private Punto punto;
	private int radio;
	
	public Circulo(Punto p, int radio) {
		this.punto = p;
		this.radio = radio;
	}
	
	public boolean contiene(Punto that) {
		return this.punto.distanciaHasta(that)<=radio;
	}
	
}
