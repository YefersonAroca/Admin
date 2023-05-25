package modelo;

import Interfaz.Logueo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class user {

	private String codigo;
	private String correo;
	private String codempleado;

	public void validar(JTextField cod) {
		try {

			ResultSet rs = null;
			PreparedStatement ps = null;
			Conexionbd.Conexion c = new Conexionbd.Conexion();
			String sql = "SELECT * FROM empleado where codigo = (?);";
			ps = c.establecerConexion().prepareStatement(sql);
			ps.setString(1, cod.getText().toUpperCase());
			rs = ps.executeQuery();

			if (rs.next()) {
				JOptionPane.showMessageDialog(null, "Ingreso");
				Logueo l = new Logueo(rs.getString("nombre") + " " + rs.getString("apellido"), rs.getString("codempleado"));
				l.setVisible(true);
			} else {

				JOptionPane.showMessageDialog(null, "INCORRECTO");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "error" + e.toString());
		}

	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCodempleado() {
		return codempleado;
	}

	public void setCodempleado(JTextField codigo) {
		try {
			ResultSet rs = null;
			PreparedStatement ps = null;
			Conexionbd.Conexion c = new Conexionbd.Conexion();
			String sql = "select codempleado from empleado where codigo = (?);";
			ps = c.establecerConexion().prepareStatement(sql);
			ps.setString(1, codigo.getText().toUpperCase());
			rs = ps.executeQuery();
			if (rs.next()) {
				codempleado = rs.getString("codempleado");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "error" + e.toString());
		}
	}

}
