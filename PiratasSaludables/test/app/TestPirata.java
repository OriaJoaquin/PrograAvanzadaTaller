package app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPirata {
	Pirata p1;
	
	@Before
	public void setUp() {
		p1 = new Pirata();
	}
	
	@Test
	public void quePaseAEstadoEscorbuto(){
		p1.consumirGrog();
		p1.consumirGrog();
		p1.consumirGrog();
		Assert.assertEquals(Pirata.ESTADO_ESCORBUTO, p1.getEstado());
		Assert.assertEquals(2, p1.getAtaque());
		Assert.assertEquals(0, p1.getDefensa());
	}
	
	@Test
	public void quePaseAEstadoHiperSaludable() {
		p1.consumirJugoDeNaranja();
		Assert.assertEquals(Pirata.ESTADO_HIPERSALUDABLE, p1.getEstado());
		Assert.assertEquals(10, p1.getAtaque());
		Assert.assertEquals(-2, p1.getDefensa());
		
	}
	
	@Test
	public void quePaseDeEstadoEscorbutoASaludable() {
		p1.consumirGrog();
		p1.consumirGrog();
		p1.consumirGrog();
		p1.consumirJugoDeNaranja();
		Assert.assertEquals(Pirata.ESTADO_SALUDABLE, p1.getEstado());
		Assert.assertEquals(5, p1.getAtaque());
		Assert.assertEquals(2, p1.getDefensa());
	}
	
	@Test
	public void quePaseDeEstadoHiperSaludableASaludable() {
		p1.consumirJugoDeNaranja();
		p1.consumirGrog();
		Assert.assertEquals(Pirata.ESTADO_SALUDABLE, p1.getEstado());
		Assert.assertEquals(5, p1.getAtaque());
		Assert.assertEquals(2, p1.getDefensa());
	}
}
