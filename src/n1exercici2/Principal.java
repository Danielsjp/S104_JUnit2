package n1exercici2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int numero;
	        System.out.print("Por favor, ingrese su numero de DNI: ");
	        numero = sc.nextInt();
	        CalculoDni dni = new CalculoDni(numero);
	        dni.obtenerLetra();

	}

}
