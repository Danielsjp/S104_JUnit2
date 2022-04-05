package n1exercici3;

import static org.junit.jupiter.api.Assertions.*;

import java.security.DomainCombiner;

import org.junit.jupiter.api.Test;

import com.sun.tools.javac.Main;

class pruebasTest {

	@Test
	void test() {
	ArrayExceptionTest.main(null); 
	
	//ArrayExceptionTest testArray = new ArrayExceptionTest();
  if (ArrayExceptionTest.resultado) {System.out.println("OK, todo bien.");}
  else {System.out.println("KO, algo ha fallado."+ ArrayExceptionTest.emes);}
	}
}
