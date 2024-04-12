package Canciones;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        Cancion cancion = new Cancion(null, 0);

	        int opcion;
	        do {
	            // Mostrar el menú principal
	            System.out.println("\nMenú:");
	            System.out.println("1. Añadir cancion al disco");
	            System.out.println("2. Borrar cancion al disco.");
	            System.out.println("3. Orden canciones por duracion.");
	            System.out.println("4. Guardar en archivo.");
	            System.out.println("5. Cargar desde archivo.");
	            System.out.println("6. Salir");
	            System.out.print("Ingrese su opción: ");
	            opcion = scanner.nextInt();

	            switch (opcion) {
	                case 1:
	                	Disco.agregarCancion(cancion);
	                	break;
	                case 2:
	                    
	                   Disco.borrarCancion(cancion);
	                    break;
	                case 3:
	                    /
	                   Disco.ordenarCancionPorDuracion(cancion);
	                    break;
	                case 4:
	                  
	                    System.out.println("¡Hasta luego!");
	                case 5:
	                   
	                    System.out.println("¡Hasta luego!");
	                case 6:
	                    // Salir del programa
	                    System.out.println("¡Hasta luego!");
	                    break;
	                default:
	                    System.out.println("Opción no válida. Intente de nuevo.");
	            }
	        } while (opcion != 4);
	    }

	    public static void agregarDispositivo(Scanner scanner, Almacen almacen) throws CamaraInvalidaException, PantallaInvalidaException, ProcesadorInvalidoException {
	        // Solicitar información para agregar un nuevo dispositivo
	        System.out.println("Seleccione el tipo de dispositivo a agregar:");
	        System.out.println("1. Teléfono");
	        System.out.println("2. Tablet");
	        System.out.println("3. Ordenador");
	        System.out.print("Ingrese su opción: ");
	        int tipo = scanner.nextInt();
	        scanner.nextLine(); // Limpiar el buffer

	        System.out.print("Marca: ");
	        String marca = scanner.nextLine();

	        System.out.print("Modelo: ");
	        String modelo = scanner.nextLine();

	        // Manejo de entrada del precio con verificación
	        double precio = 0.0;
	        boolean precioValido = false;
	        while (!precioValido) {
	            try {
	                System.out.print("Precio: ");
	                String precioString = scanner.nextLine().replace(",", ".");
	                precio = Double.parseDouble(precioString);
	                precioValido = true;
	            } catch (NumberFormatException e) {
	                System.out.println("Precio no válido. Intente de nuevo.");
	            }
	        }

	        // Agregar el dispositivo al almacén según el tipo seleccionado
	        switch (tipo) {
	            case 1:
	                System.out.print("Megapíxeles de la cámara: ");
	                int megapixeles = scanner.nextInt();
	                almacen.agregarDispositivo(new Telefono(marca, modelo, precio, megapixeles));
	                break;
	            case 2:
	                System.out.print("Pulgadas de la pantalla: ");
	                double pulgadas = scanner.nextDouble();
	                almacen.agregarDispositivo(new Tablet(marca, modelo, precio, pulgadas));
	                break;
	            case 3:
	                System.out.print("Modelo de procesador: ");
	                String procesador = scanner.nextLine();
	                almacen.agregarDispositivo(new Ordenador(marca, modelo, precio, procesador));
	                break;
	            default:
	                System.out.println("Tipo de dispositivo no válido.");
	        }
	    }

	    public static void eliminarDispositivo(Scanner scanner, Almacen almacen) {
	        // Eliminar un dispositivo del almacén
	        System.out.println("Ingrese el índice del dispositivo a eliminar:");
	        almacen.mostrarDispositivos();
	        System.out.print("Posición del terminal a eliminar: ");
	        int posicionAEliminar = scanner.nextInt();
	        almacen.eliminarDispositivo(posicionAEliminar);
	    }
	}
}
}
