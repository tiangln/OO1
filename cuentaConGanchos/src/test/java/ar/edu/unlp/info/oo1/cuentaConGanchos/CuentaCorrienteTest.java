package ar.edu.unlp.info.oo1.cuentaConGanchos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaCorrienteTest {
	private CuentaCorriente cc1;
	private CuentaCorriente cc2;
	
	@BeforeEach
	void setUp() {
		cc1 = new CuentaCorriente();
		cc2 = new CuentaCorriente();
	}

	@Test
	void testDepositar() {
		cc1.depositar(100);
		assertEquals(100, cc1.getSaldo());
	}
	
	@Test
	void testExtraer() {
		cc1.setDescubierto(500);
		assertFalse(cc1.extraer(600));
		assertEquals(0, cc1.getSaldo());
		assertTrue(cc1.extraer(300));
		assertEquals(-300, cc1.getSaldo());
	}
	
	@Test
	void testTransferirACuenta() {
		cc1.setDescubierto(200);
		assertFalse(cc1.transferirACuenta(300, cc2));
		assertEquals(0, cc1.getSaldo());
		assertEquals(0, cc2.getSaldo());
		assertTrue(cc1.transferirACuenta(100, cc2));
		assertEquals(-100, cc1.getSaldo());
		assertEquals(100, cc2.getSaldo());
	}
	
	@Test
	void testTransferirACajaDeAhorro() {
		CajaDeAhorro caja1 = new CajaDeAhorro();
		
		cc1.setDescubierto(500);
		assertFalse(cc1.transferirACuenta(501, caja1));
		assertEquals(0, cc1.getSaldo());
		assertEquals(0, caja1.getSaldo());
		
		assertTrue(cc1.transferirACuenta(500, caja1));
		assertEquals(-500, cc1.getSaldo());
		assertEquals(490, caja1.getSaldo());
		
	}
}
