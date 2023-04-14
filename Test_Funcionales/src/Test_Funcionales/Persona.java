package Test_Funcionales;

public class Persona {

	private int edad;
	
	public Persona(int edad) {
		
		this.edad = edad;
		
		
	}
	
	public boolean isMayorDEdad() {
		
		assert edad >= 0;
		return edad >= 18;
		
	}
	
}
