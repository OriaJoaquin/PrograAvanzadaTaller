package geometria;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestGeometria {
	Rectangulo r1;
	Rectangulo r2;
	Rectangulo r3;
	Rectangulo r4;
	
	@Before
	public void setUp() {
		 r1 = new Rectangulo(new Punto(0,0),2,2);
		 r2 = new Rectangulo(new Punto(1,1),2,2);
		 r3 = new Rectangulo(new Punto(3,3),1,1);
		 r4 = new Rectangulo(new Punto(1,1),10,10);
	}
	
	@Test
	public void queDosRectangulosColisionen() {
		Assert.assertEquals(true, r1.colisionaCon(r2));
	}
	
	@Test
	public void queDosRectangulosNoColisionen() {
		Assert.assertEquals(false, r1.colisionaCon(r3));
	}
	
	@Test
	public void queDosRectangulosColisionenEstandoUnoAdentroOtro() {
		Assert.assertEquals(true, r4.colisionaCon(r3));
		Assert.assertEquals(true, r3.colisionaCon(r4));
	}
}
