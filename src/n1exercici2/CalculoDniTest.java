package n1exercici2;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;

import org.junit.jupiter.api.Test;

class CalculoDniTest {

	@Test
	public void testObtenerLetra() {
		CalculoDni dni = new CalculoDni(53130984);
		char letra = dni.obtenerLetra();
		if (letra == 'H') {
			System.out.println("Todo OK");
		} else {
			System.out.println("Algo ha salido mal");
		}
	}

	@Test
	public void testLote() {
		int lote[] = new int[] { 53530984, 43130984, 99130984, 53139984, 53130999, 12330984, 53160984, 63130984, 53132984, 73130984 };
		for (int strTemp : lote) {
			final char [] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
			CalculoDni dni = new CalculoDni(strTemp);
			char letra = dni.obtenerLetra();
			if ( letra == letras[strTemp % 23] ) {
				System.out.println("Todo OK");
			} else {
				System.out.println("Algo ha salido mal");
			}
		}
	}

}


/*
 * public char obtenerLetra(){ int resto; int letra; resto = numeroDNI % 23;
 * System.out.println("DNI COMPLETO: "+numeroDNI+letras[resto]); return (char)
 * (letra = letras[resto]); //return letra = letras[resto]; // return true;
 * 
 * }
 */