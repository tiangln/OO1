package ar.edu.unlp.info.oo1.cuentaConGanchos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaDeAhorroTest {
	private CajaDeAhorro caja1;
	private CajaDeAhorro caja2;
	
	@BeforeEach
	public void setUp() {
		caja1 = new CajaDeAhorro();
		caja2 = new CajaDeAhorro();
	}
	
	@Test
	void testDepositar() {
		caja1.depositar(100);
		assertEquals(98, caja1.getSaldo());
	}
	
	@Test
	void testExtraer() {
		caja1.depositar(100);
		assertFalse(caja1.extraer(100));
		assertTrue(caja1.extraer(50));
		assertEquals(47, caja1.getSaldo());
	}
	
	@Test
	void testTransferirACuenta() {
		caja1.depositar(100);
		assertEquals(98, caja1.getSaldo());
		assertFalse(caja1.transferirACuenta(98, caja2));
		assertEquals(98, caja1.getSaldo());
		assertEquals(0, caja2.getSaldo());
		assertTrue(caja1.transferirACuenta(50, caja2));
		assertEquals(47, caja1.getSaldo());
		assertEquals(49, caja2.getSaldo());
	}
	
	@Test
	void testTransferirACuentaCorriente() {
		CuentaCorriente cc1 = new CuentaCorriente();
		
		caja1.depositar(100);
		assertEquals(98, caja1.getSaldo());
		
		assertFalse(caja1.transferirACuenta(98, cc1));
		assertEquals(98, caja1.getSaldo());
		assertEquals(0, cc1.getSaldo());
		
		assertTrue(caja1.transferirACuenta(50, cc1));
		assertEquals(47, caja1.getSaldo());
		assertEquals(50, cc1.getSaldo());
		
	}
}
