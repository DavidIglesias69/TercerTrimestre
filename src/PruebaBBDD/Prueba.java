package PruebaBBDD;

import java.sql.Statement;

public class Prueba {
	public static void main(String[] args) {

		Conexion cone = new Conexion();
		Statement stm = cone.abrirConexion();



	}
}
