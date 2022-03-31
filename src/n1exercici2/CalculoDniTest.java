package n1exercici2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculoDniTest {

	@Test
	void testObtenerLetra() {
		 CalculoDni dni = new CalculoDni(53130984);
	        char letra = dni.obtenerLetra();
			if (letra=='H') {System.out.println("Todo OK");}
			else {System.out.println("Algo ha salido mal");}
				
	}

}
