package NUEVO;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class PRACTICA {
public static void main(String[] args) throws IOException {
	
	File n= new File ("C:\\Users\\alumno\\Desktop\\practica_files");
	
	n.mkdir();
	
	File a1 =new File ("C:\\Users\\alumno\\Desktop\\practica_files\\archivo1.txt");
	File a2 =new File ("C:\\Users\\alumno\\Desktop\\practica_files\\archivo2.txt");
	File a3 =new File ("C:\\Users\\alumno\\Desktop\\practica_files\\archivo3.txt");
	
	a1.createNewFile();
	a2.createNewFile();
	a3.createNewFile();
	
	String [] lista= n.list();
	for (int i = 0; i < lista.length; i++) {
		System.out.println(lista[i]);
		
		
		
		
	}

	
}
}
