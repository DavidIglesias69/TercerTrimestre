package pruebaBBDD;

import java.sql.*;


public class Prueba {
	
	public static void main(String[] args) {

		Conexion cone = new Conexion();
		Statement stm = cone.abrirConexion();

		try {
			ResultSet rs= stm.executeQuery("SELECT * FROM persona;");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
