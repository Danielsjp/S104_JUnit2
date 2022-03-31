package n1exercici1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ListaTest {

	@Test
	void testAgregar() {
		Lista calcu = new Lista("Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre");
		calcu.agregar();
		int g = Lista.Calendario.size();
		assertEquals(12, g);
	}

}
