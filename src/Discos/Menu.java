package Discos;

import java.util.List;
import java.util.Scanner;

public class Menu {
	 private static Scanner scanner = new Scanner(System.in);
	    private static Disco disco = new Disco();

	    public static void main(String[] args) {
	        char opcion;
	        do {
	            System.out.println("\n--- Menú ---");
	            System.out.println("a. Añadir canción al disco");
	            System.out.println("b. Borrar canción del disco");
	            System.out.println("c. Ordenar canciones por duración");
	            System.out.println("d. Guardar en archivo");
	            System.out.println("e. Cargar desde archivo");
	            System.out.println("f. Salir");
	            System.out.print("Selecciona una opción: ");
	            opcion = scanner.next().charAt(0);

	            switch (opcion) {
	                case 'a':
	                    agregarCancion();
	                    break;
	                case 'b':
	                    borrarCancion();
	                    break;
	                case 'c':
	                    ordenarPorDuracion();
	                    break;
	                case 'd':
	                    guardarEnArchivo();
	                    break;
	                case 'e':
	                    cargarDesdeArchivo();
	                    break;
	                case 'f':
	                    System.out.println("Saliendo...");
	                    break;
	                default:
	                    System.out.println("Opción no válida. Inténtalo de nuevo.");
	            }
	        } while (opcion != 'f');
	    }

	    private static void agregarCancion() {
	        System.out.print("Ingrese el título de la canción: ");
	        String titulo = scanner.next();
	        System.out.print("Ingrese la duración de la canción: ");
	        double duracion = scanner.nextDouble();
	        Cancion cancion = new Cancion(titulo, duracion);
	        disco.agregarCancion(cancion);
	        System.out.println("Canción agregada al disco.");
	    }

	    private static void borrarCancion() {
	        System.out.print("Ingrese el título de la canción que desea borrar: ");
	        String titulo = scanner.next();
	        disco.borrarCancion(titulo);
	    }

	    private static void ordenarPorDuracion() {
	        disco.ordenarPorDuracion();
	        System.out.println("Canciones ordenadas por duración.");
	        List<Cancion> canciones = disco.getCanciones();
	        for (Cancion cancion : canciones) {
	            System.out.println("Título: " + cancion.getTitulo() + ", Duración: " + cancion.getDuracion());
	        }
	    }

	    private static void guardarEnArchivo() {
	        System.out.print("Ingrese el nombre del archivo para guardar el disco: ");
	        String nombreArchivo = scanner.next();
	        disco.guardarEnArchivo(nombreArchivo);
	    }

	    private static void cargarDesdeArchivo() {
	        System.out.print("Ingrese el nombre del archivo para cargar el disco: ");
	        String nombreArchivo = scanner.next();
	        disco.cargarDesdeArchivo(nombreArchivo);
	    }
}
