package Conexionbd;
import Conexionbd.Conexion;
import Interfaz.Logueo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.sql.Connection;

public class user {
	
	public void validar(JTextField cod) {
		try {
			
		
		ResultSet rs = null;
		PreparedStatement ps = null;
		Conexionbd.Conexion c = new Conexionbd.Conexion();
		String sql= "SELECT * FROM empleado where codigo = (?);";
		ps= c.establecerConexion().prepareStatement(sql);
		ps.setString(1, cod.getText());
		rs=ps.executeQuery();
		
		if (rs.next()) {
			JOptionPane.showMessageDialog(null, "ingreso");
			 Logueo l = new Logueo();
			 l.setVisible(true);
		} else {

			JOptionPane.showMessageDialog(null, "INCORRECTO");
		}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "error"+e.toString());
		}
		

	}

}
