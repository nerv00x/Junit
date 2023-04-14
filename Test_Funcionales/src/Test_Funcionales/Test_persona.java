package Test_Funcionales;


import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.fail;

import  org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

@SuppressWarnings("unused")
public class Test_persona {

	@Test
	void test() {
		fail("Not yet implemented");
	}

@Test public void test3() {
		
		Persona p = new Persona (0);
		assertFalse(p.isMayorDEdad());
	}
	
	@Test public void test4() {
		
		Persona p = new Persona (17);
		assertFalse(p.isMayorDEdad());
	}
	
	@Test public void test5() {
		
		Persona p = new Persona (18);
		assertTrue(p.isMayorDEdad());
	}
	
	@Test public void test6() {
		
		Persona p = new Persona (100);
		assertTrue(p.isMayorDEdad());
	}
	
	@Test (expected= AssertionError.class)
	public void test1() {
		
		Persona p = new Persona (-1);
		p.isMayorDEdad();
	}
	
	@Test(expected= AssertionError.class)
	
	public void test2() {
		
		Persona p = new Persona (-100);
		p.isMayorDEdad();
	}
	
}
