package n1exercici3;

public class ArrayExceptionTest {

	protected static int[] exampleVariableOne = new int[5];
	protected static String emes;
	protected static boolean resultado;
	public static boolean main(String[] args) {
		try {
			exampleVariableOne[34] = 9;
			System.out.println("Array index is valid");
			return resultado = true;
		} catch (ArrayIndexOutOfBoundsException e) {
			emes = e.getMessage();
			System.out.println("ERROR:" + e.getMessage());
			return resultado = false;
		}
		
	}
	
	public String getMessage() {
		return emes;
	}
		
}