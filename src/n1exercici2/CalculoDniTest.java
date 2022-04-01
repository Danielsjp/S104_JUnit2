package n1exercici2;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;

import org.junit.jupiter.api.Test;

class CalculoDniTest {

	@Test
	void testObtenerLetra() {
		CalculoDni dni = new CalculoDni(53130984);
		char letra = dni.obtenerLetra();
		if (letra == 'H') {
			System.out.println("Todo OK");
		} else {
			System.out.println("Algo ha salido mal");
		}
	}

	@Test
	void testLote() {

		int lote[] = new int[] { 53530984, 43130984, 99130984, 53139984, 53130999, 12330984, 53160984, 63130984, 53132984, 73130984 };
		for (int strTemp : lote) {
			CalculoDni dni = new CalculoDni(strTemp);
			if (dni.obtenerOK()) {
				System.out.println("Todo OK");
			} else {
				System.out.println("Algo ha salido mal");
			}
		}
	}

}
