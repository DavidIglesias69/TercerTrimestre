package Discos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;

public class Menu {

	
	public static void main(String[] args) {
		
		Disco disco = generarDisco();
		try {
			
			//ALMACENAR EL OBJETO
			FileOutputStream fos = new FileOutputStream("C:\\Users\\Pablo\\Desktop\\canciones.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(disco);
			
			oos.close();
			System.out.println("Objecto escrito correctamente");
			
			
			//RECUPERAR EL OBJETO
			
			FileInputStream fis = new FileInputStream("C:\\Users\\Pablo\\Desktop\\canciones.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Disco discoArchivo = (Disco)ois.readObject();
			
			System.out.println(discoArchivo);
			
			
			
		} catch (Exception e) {
			
		}
	
		
	}
	
	
	
	
	
	public static Disco generarDisco() {
		
		Cancion c1 = new Cancion("La gasolina", 150);
		Cancion c2 = new Cancion("Tu jardín con enanitos", 120);
		Cancion c3 = new Cancion("En que estrella estará", 140);
		Cancion c4 = new Cancion("Rosas", 100);
		Cancion c5 = new Cancion("Si tu novia te deja solo", 210);
		Cancion c6 = new Cancion("Sin noticias de holanda", 115);
		
		Cancion[] array_canciones = {c1, c2, c3, c4, c5, c6};
		Disco disco = new Disco(array_canciones);
		return disco;
		
	}
	
}
