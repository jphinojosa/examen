package com.petSmile.ReservaHora;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexion {

	public static void main(String[] args) {
		
Connection conexion1 = null;
		
		String user = "root";
		String password = "";
		try {
			Properties datos = new Properties();
			datos.put("user", user);
			datos.put("password", password);
			String url2 = "jdbc:mysql://localhost:3306/clinica";
			conexion1 = DriverManager.getConnection(url2, datos);
			if (conexion1 != null) {
				System.out.println("Conexión 2: Conexión a mibase satisfactoria");
			}
			
		}catch (SQLException e) {
			System.out.println(
					"Error en la conexión, verifique, su usuario y password o el nombre de la base a la que intenta conectarse");
			e.printStackTrace();

	}

	}

}
