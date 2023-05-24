package modelo;
import Conexionbd.Conexion;

import java.security.PublicKey;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Factura {

	private String nombreConcepto;
	private String idCategoria;
	public void name() {
		
		
	}

	public  void buscarNombre(String name) {

	
	try {
		ResultSet rs = null;
		PreparedStatement ps = null;
		Conexionbd.Conexion c = new Conexionbd.Conexion();
		String sql= "SELECT * FROM persona where LIKE '%?%';";
		ps= c.establecerConexion().prepareStatement(sql);
		ps.setString(1, name.toUpperCase());
		rs=ps.executeQuery();
	
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	}
	
	
}
