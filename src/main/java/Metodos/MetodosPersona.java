package Metodos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import Conexionbd.Conexion;
import modelo.Persona;

public class MetodosPersona {
	Conexionbd.Conexion c = new Conexion();
	Connection cn = c.establecerConexion();
	ResultSet rs;
	PreparedStatement st;
	private String idestructura, unidad;
	private int area,valor;

	public ArrayList<Persona> buscarPersona(String nom) {

		ArrayList<Persona> lista_persona = new ArrayList<>();
		lista_persona.clear();
		try {
			String sql = "SELECT distinct (P.nombrepersona),P.codigo FROM  tenencia T, persona P where T.codigo = P.codigo and \n"
					+ "nombrepersona LIKE '%" + nom + "%' and T.estadotenencia = TRUE;";

			st = c.establecerConexion().prepareStatement(sql);

			rs = st.executeQuery();

			System.out.print("Concepto");
			while (rs.next()) {
				Persona perso = new Persona();
				perso.setCodigoPersona(rs.getString("codigo"));
				perso.setNombreperosna(rs.getString("nombrepersona"));
				lista_persona.add(perso);

			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "error" + e.toString());

		}

		return lista_persona;

	}

	public void Estructura(String nom) {

		try {
			String sql = "select distinct E.nestructura, E.area from tipopersona T, tenencia T1, persona P, estructura E\n"
					+ "where T.idtipopersona = T1.idtipopersona and\n"
					+ "	  T1.nestructura = E.nestructura and\n"
					+ "	  T1.codigo = P.codigo and \n"
					+ "	  P.nombrepersona = '"+ nom +"';";

			st = c.establecerConexion().prepareStatement(sql);

			rs = st.executeQuery();
			if (rs.next()) {
				idestructura = rs.getString("nestructura");
				setArea(rs.getInt("area"));
			}
			st.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void concepto(String nom) {

		try {
			String sql = "select H.valor, U.nomunidad from historicovalorconcepto H, unidadmedida U, concepto C\n"
					+ "where H.idunidad = U.idunidad and\n"
					+ "	  H.idconcepto = C.idconcepto and\n"
					+ "	  H.estado = true and \n"
					+ "	  C.nomconcepto = '" + nom + "';";

			st = c.establecerConexion().prepareStatement(sql);

			rs = st.executeQuery();
			if (rs.next()) {
				unidad = rs.getString("nomunidad");
				valor = rs.getInt("valor");
			}
			st.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getIdestructura() {
		return idestructura;
	}

	public void setIdestructura(String idestructura) {
		this.idestructura = idestructura;
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

}
