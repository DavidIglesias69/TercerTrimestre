package pack;

import java.io.Serializable;

public class Persona implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	String nombre;
	int edad;
	double altura;
	char sexo;
	
	public Persona(String nombre, int edad, double altura, char sexo) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
		this.sexo = sexo;
	}
	
	public String toString() {
		
		StringBuffer str = new  StringBuffer();
		
		str.append("\n"+"nombre: "+nombre + ", ");
		str.append("\n"+"edad: " +edad + ", ");
		str.append("\n"+"altura: "+altura+ ", " );
		str.append("\n"+"sexo: "+sexo);
		
		return str.toString();
		
	}
	


}
