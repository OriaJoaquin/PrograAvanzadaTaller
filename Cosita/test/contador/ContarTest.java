package contador;

import org.junit.Test;

import contador.Contador;
import org.junit.Assert;
import org.junit.Before;

public class ContarTest {
	Contador c;

	@Before
	public void setUp() {
		System.out.println();
		c = new Contador();
	}

	@Test
	public void queIniciaEnCero() {
		Assert.assertEquals(0, c.mostrar());
	}

	@Test
	public void queCuenteHastaUnMillon() {
		for (int i = 0; i < 1_000_000; i++) {
			c.contar();
		}
		Assert.assertEquals(1_000_000, c.mostrar());
	}

	@Test
	public void queCuenteHastaUno() {
		c.contar();
		Assert.assertEquals(1, c.mostrar());

	}

	@Test
	public void queCuenteHastaDos() {
		c.contar();
		c.contar();
		Assert.assertEquals(2, c.mostrar());

	}
}
