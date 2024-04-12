package Canciones;

import java.util.ArrayList;

public class Disco { 
	
	private static ArrayList<Cancion> canciones;
	
public Disco() {
    canciones = new ArrayList<>();
}

	
	
	 public static void agregarCancion(Cancion cancion) {
	        try {
				canciones.add(cancion);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
	    }
	 
	 public static void borrarCancion(Cancion cancion) {
	        canciones.remove(cancion);
	    }
	 
	 public static void ordenarCancionPorDuracion(Cancion cancion) {
	       
	    }
}
