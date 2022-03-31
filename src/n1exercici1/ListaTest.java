package n1exercici1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ListaTest {

	@Test
	void testTamanio() {
		Lista calcu = new Lista("Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre");
		calcu.agregar();
		int g = Lista.Calendario.size();
		assertEquals(12, g);
	}
	@Test
	void testAgosto() {
		Lista calcu = new Lista("Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre");
		calcu.agregar();
		int g = Lista.Calendario.size();
		assertEquals(calcu.mes8, "Agosto");
	}
	@Test
	void testEmpty() {
		Lista calcu = new Lista("Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre");
		if (calcu.isEmpty()==true) {System.out.println("Array is empty");}
		else {System.out.println("Array is not empty");}
		
	}
}

