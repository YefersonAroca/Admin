package modelo;
import java.sql.PreparedStatement;

public class Factura {

	public void name() {
		
		
	}

	public  void buscarNombre(String name) {

	
	try {
		PreparedStatement ps = null;
		Conexionbd.Conexion c = new Conexionbd.Conexion();
		String sql= "SELECT * FROM persona where LIKE '%?%';";
		ps= c.establecerConexion().prepareStatement(sql);
		ps.setString(1, name.toUpperCase());
		ps.executeQuery();
	
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	}
	
	
}
