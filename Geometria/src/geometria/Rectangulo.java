package geometria;

public class Rectangulo {
	private Punto esquinaSupIzq;
	private Punto esquinaInfDer;
	private Punto esquinaSupDer;
	private Punto esquinaInfIzq;
	private double largo;
	private double ancho;

	public Punto getP1() {
		return esquinaSupIzq;
	}

	public void setP1(Punto p1) {
		this.esquinaSupIzq = p1;
	}

	public Punto getP2() {
		return esquinaInfDer;
	}

	public void setP2(Punto p2) {
		this.esquinaInfDer = p2;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public Rectangulo(Punto p1, double alto, double ancho) {
		this.esquinaSupIzq = p1;
		this.esquinaInfDer = new Punto(p1.getX() + ancho, p1.getY() - alto);
		this.esquinaInfIzq = new Punto(p1.getX(), p1.getY() - alto);
		this.esquinaSupDer = new Punto(p1.getX() + ancho, p1.getY());
		this.largo = alto;
		this.ancho = ancho;
	}

	public boolean contiene(Punto p) {
		double distanciaDiag = this.esquinaSupIzq.distanciaHasta(this.esquinaInfDer);

		if (this.esquinaSupIzq.distanciaHasta(p) < distanciaDiag
				&& this.esquinaInfDer.distanciaHasta(p) < distanciaDiag)
			return true;
		return false;
	}

	public boolean colisionaCon(Rectangulo r) {
		/*
		 * double distanciaDiag = this.esquinaSupIzq.distanciaHasta(this.esquinaInfDer);
		 * 
		 * 
		 * //Caso esquina superior izq
		 * if(r.esquinaInfDer.distanciaHasta(this.esquinaSupIzq)< distanciaDiag &&
		 * r.esquinaInfDer.distanciaHasta(this.esquinaInfDer)< distanciaDiag) { return
		 * true; }
		 * 
		 * //Caso esquina inferior derecha
		 * if(r.esquinaSupIzq.distanciaHasta(this.esquinaSupIzq)< distanciaDiag &&
		 * r.esquinaSupIzq.distanciaHasta(this.esquinaInfDer)< distanciaDiag) { return
		 * true; }
		 * 
		 * //Caso esquina superiorDer
		 * if(r.esquinaSupDer.distanciaHasta(this.esquinaInfIzq) < distanciaDiag &&
		 * r.esquinaSupDer.distanciaHasta(this.esquinaSupDer)< distanciaDiag) { return
		 * true; }
		 * 
		 * //Caso esquina inferior izq
		 * if(r.esquinaInfIzq.distanciaHasta(this.esquinaInfIzq) < distanciaDiag &&
		 * r.esquinaInfIzq.distanciaHasta(this.esquinaSupDer)< distanciaDiag) { return
		 * true; }
		 * 
		 * 
		 * return false && r.colisionaCon(this);
		 */

		/*
		if (this.esquinaSupIzq.getY() < r.esquinaSupIzq.getY() && this.esquinaSupIzq.getY() > r.esquinaInfIzq.getY()) {

		}

		if (this.esquinaSupIzq.getY() < r.esquinaSupIzq.getY() && this.esquinaSupIzq.getY() > r.esquinaInfIzq.getY()) {

		}

		if (this.esquinaSupIzq.getY() < r.esquinaSupIzq.getY() && this.esquinaSupIzq.getY() > r.esquinaInfIzq.getY()) {

		}

		if (this.esquinaSupIzq.getY() < r.esquinaSupIzq.getY() && this.esquinaSupIzq.getY() > r.esquinaInfIzq.getY()) {

		}*/
		
		if(!this.contiene(r.esquinaInfDer) && !this.contiene(r.esquinaInfIzq) && !this.contiene(r.esquinaSupDer) && !this.contiene(r.esquinaSupIzq))
			return false;
		return true;
	}

}
