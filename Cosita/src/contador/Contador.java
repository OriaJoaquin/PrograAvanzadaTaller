package contador;

public class Contador {
	private int valor=0;
	
	public void contar() {
		this.valor++;
	}
	
	public int mostrar() {
		return this.valor;
	}
	
	public void reiniciar() {
		this.valor=0;
	}
}
