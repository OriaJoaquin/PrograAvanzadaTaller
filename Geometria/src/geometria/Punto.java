package geometria;

public class Punto {
	
	private double x;
	private double y;
	
	
	
	public Punto(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}



	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	
	public double distanciaHasta(Punto that) {
		return Math.sqrt(Math.pow(this.x-that.x, 2) + Math.pow(this.y-that.y, 2));
	}
	
}
