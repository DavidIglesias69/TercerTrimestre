import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;

public class FW {
public static void main(String[] args) throws IOException {
	char [] array = {'H','o', 'l','a'};
	
	try {
		FileWriter fw = new FileWriter("C:\\Users\\alumno\\Desktop\\nuevo.txt");
		fw.write((array));
		fw.write(" puedes poner lo que quieras ");
		fw.flush();
		fw.close();
		
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	try {
		FileWriter fw = new FileWriter("C:\\Users\\alumno\\Desktop\\nuevo.txt");
		BufferedWriter buffer= new BufferedWriter(fw);
		buffer.write((array));
		buffer.write(" puedes poner lo que quieras dhhtr");
		buffer.flush();
		buffer.close();
		fw.close();
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	try {
		FileReader fr = new FileReader("C:\\Users\\alumno\\Desktop\\nuevo.txt");
		int i;
		while ((i= fr.read()) != -1) {
			System.out.println((char) i);
			
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	try {
		FileReader frr = new FileReader("C:\\Users\\alumno\\Desktop\\nuevo.txt");
		BufferedReader brr = new BufferedReader(frr);
		
		while (brr.readLine() != null) {
		
		System.out.println(brr.readLine());
		}	
	}
		
	 catch (Exception e) {
		e.printStackTrace();
	}
	
	try {
		FileReader frr = new FileReader("C:\\Users\\alumno\\Desktop\\nuevo.txt");
		LineNumberReader lrn =new LineNumberReader(frr);
		System.out.println(lrn.getLineNumber() +"-"+lrn.readLine());
		lrn.setLineNumber(3);
		System.out.println(lrn.getLineNumber() +"-"+lrn.readLine());
		lrn.close();
		frr.close();
		
		}	
	
		
	 catch (Exception e) {
		e.printStackTrace();
	}
	
	
}
}
	

