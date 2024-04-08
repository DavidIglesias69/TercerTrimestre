package discos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Disco {
	 private List<Cancion> canciones;

	    public Disco() {
	        canciones = new ArrayList<>();
	    }

	    public void agregarCancion(Cancion cancion) {
	        canciones.add(cancion);
	    }

	    public void borrarCancion(String titulo) {
	        canciones.removeIf(c -> c.getTitulo().equals(titulo));
	    }

	    public void ordenarPorDuracion() {
	        Collections.sort(canciones, Comparator.comparing(Cancion::getDuracion));
	    }

	    public void guardarEnArchivo(String nombreArchivo) {
	        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
	            out.writeObject(canciones);
	            System.out.println("Disco guardado en archivo.");
	        } catch (IOException e) {
	            System.out.println("Error al guardar el disco en el archivo.");
	            e.printStackTrace();
	        }
	    }

	    public void cargarDesdeArchivo(String nombreArchivo) {
	        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
	            canciones = (List<Cancion>) in.readObject();
	            System.out.println("Disco cargado desde archivo.");
	        } catch (IOException | ClassNotFoundException e) {
	            System.out.println("Error al cargar el disco desde el archivo.");
	            e.printStackTrace();
	        }
	    }

	    public List<Cancion> getCanciones() {
	        return canciones;
	    }
}
