package Discos;

import java.io.Serializable;
import java.util.Arrays;

public class Disco implements Serializable{

	public static final long serialVersionUID = 1L;
	
	
	Cancion[] canciones;
	
	
	
	
	public Disco(Cancion[] canciones) {
		this.canciones = canciones;
	}
	public Cancion[] getCanciones() {
		return canciones;
	}

	public void setCanciones(Cancion[] canciones) {
		this.canciones = canciones;
	}
	
	public String toString() {
		StringBuffer b = new StringBuffer();
		for (int i = 0; i < canciones.length; i++) {
			b.append(canciones[i]);
			b.append("\n");
		}
		
		return b.toString();
	}

	




}
