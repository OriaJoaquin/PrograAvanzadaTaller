package contador;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contador c = new Contador();
		
		System.out.println(c.mostrar());
		
		c.contar();
		c.contar();
		
		System.out.println(c.mostrar());
		
		c.reiniciar();
		System.out.println(c.mostrar());
	}

}
