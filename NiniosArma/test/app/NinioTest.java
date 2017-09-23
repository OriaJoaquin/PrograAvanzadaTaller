package app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NinioTest {
	Ninio n;
	
	@Before
	public void setUp() {
		n = new Ninio();
	}
	
	@Test 
	public void queCargueArma(){
		Arma a = new Arma(100, 2);
		n.equipar(a);
		
		Assert.assertEquals(1,n.getCantidadArmas());
	}
	
	@Test
	public void  queSeCargueBienElPeso() {
		Arma a = new Arma(100, 2);
		n.equipar(a);
		
		Assert.assertEquals(100,n.getPesoOcupado(),0.01);
	}
}
