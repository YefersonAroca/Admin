package Metodos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import Conexionbd.Conexion;
import modelo.Conceptos;

public class Metodos_funciones {

	Conexionbd.Conexion c = new Conexion();
	Connection cn = c.establecerConexion();
	ResultSet rs;
	PreparedStatement st;
	Date date = new Date();
	private int id, idetalle;

	public ArrayList<Conceptos> obteneronceptos(String nom) {

		ArrayList<Conceptos> lista_conceptos = new ArrayList<>();
		lista_conceptos.clear();
		try {
			String sql = "select distinct (C.nomconcepto),C.idconcepto from concepto C, conceptotipopersona C1, tipopersona T, tenencia T1, persona P\n"
					+ "where C.idconcepto = C1.idconcepto and\n" + "	  C1.idtipopersona = T.idtipopersona and\n"
					+ "	  T.idtipopersona = T1.idtipopersona and\n" + "	  T1.codigo = P.codigo and \n"
					+ "	  P.nombrepersona = '" + nom + "' and\n" + "	  C.idtipotran = '1';";
			st = c.establecerConexion().prepareStatement(sql);
			rs = st.executeQuery();
			while (rs.next()) {
				Conceptos conce = new Conceptos();
				// conce.setIdCategoria(rs.getInt("idconcepto"));
				conce.setNombreCategoria(rs.getString("nomconcepto"));
				conce.setIdCategoria(rs.getInt("idconcepto"));
				lista_conceptos.add(conce);
			}

		} catch (Exception e) {
			System.out.print("fallo concepto" + e);
		}

		return lista_conceptos;
	}
	
	public ArrayList<Conceptos> obteneronceptos1(String nom) {

		ArrayList<Conceptos> lista_conceptos = new ArrayList<>();
		lista_conceptos.clear();
		try {
			String sql = "select distinct (C.nomconcepto),C.idconcepto from concepto C, conceptotipopersona C1, tipopersona T, tenencia T1, persona P\n"
					+ "where C.idconcepto = C1.idconcepto and\n" + "	  C1.idtipopersona = T.idtipopersona and\n"
					+ "	  T.idtipopersona = T1.idtipopersona and\n" + "	  T1.codigo = P.codigo and \n"
					+ "	  P.nombrepersona = '" + nom + "' and\n" + "	  C.idtipotran = '2';";
			st = c.establecerConexion().prepareStatement(sql);
			rs = st.executeQuery();
			while (rs.next()) {
				Conceptos conce = new Conceptos();
				// conce.setIdCategoria(rs.getInt("idconcepto"));
				conce.setNombreCategoria(rs.getString("nomconcepto"));
				conce.setIdCategoria(rs.getInt("idconcepto"));
				lista_conceptos.add(conce);
			}

		} catch (Exception e) {
			System.out.print("fallo concepto" + e);
		}

		return lista_conceptos;
	}

	public void crearfacturaingreso(String codigo, String codempleado, Float total) {

		this.Ultimo();
		try {
			String sql = "insert into factura (nfactura,codigo,codempleado,fechafac,totalfactura) values ("
					+ this.getId() + ",'" + this.idpersona(codigo) + "'," + codempleado + "," + "'2023-01-01'" + "," + 0
					+ ");";

			st = c.establecerConexion().prepareStatement(sql);
			rs = st.executeQuery();

		} catch (Exception e) {
			System.out.print("fallo concepto" + e);
		}
	}

	public void crearregistro(String concepto, String codempleado, int valor) {

		this.Ultimodetalle();
		this.Ultimo();
		try {
			String sql = "insert into detallefactura (item,idconcepto,nfactura,valoritem,soporte,idtipotran) values ("
					+ this.getIdetalle() + "," + this.idconcepto(concepto) + "," + (this.getId() - 1) + "," + valor
					+ "," + null + ",1);";
			System.out.println(sql);
			st = c.establecerConexion().prepareStatement(sql);
			rs = st.executeQuery();

		} catch (Exception e) {
			System.out.print("fallo concepto" + e);
		}
	}
	
	public void crearregistro1(String concepto, String codempleado, int valor, String soporte) {

		this.Ultimodetalle();
		this.Ultimo();
		try {
			String sql = "insert into detallefactura (item,idconcepto,nfactura,valoritem,soporte,idtipotran) values ("
					+ this.getIdetalle() + "," + this.idconcepto(concepto) + "," + (this.getId() - 1) + "," + valor
					+ "," + soporte + ",2);";
			System.out.println(sql);
			st = c.establecerConexion().prepareStatement(sql);
			rs = st.executeQuery();

		} catch (Exception e) {
			System.out.print("fallo concepto" + e);
		}
	}

	public void Ultimo() {

		String sql = "SELECT MAX(nfactura) AS nfactura FROM factura";
		try {
			st = c.establecerConexion().prepareStatement(sql);
			rs = st.executeQuery();
			if (rs.next()) {
				if (rs.getString("nfactura") == null) {
					setId(0);
				} else {
					setId(Integer.parseInt(rs.getString("nfactura")) + 1);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Ultimodetalle() {

		String sql = "SELECT MAX(item) AS item FROM detallefactura";
		try {
			st = c.establecerConexion().prepareStatement(sql);
			rs = st.executeQuery();
			if (rs.next()) {
				if (rs.getString("item") == null) {
					setIdetalle(0);
				} else {
					setIdetalle(rs.getInt("item") + 1);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String idpersona(String nom) {

		String sql = "select codigo from persona where nombrepersona = '" + nom + "';";
		try {
			st = c.establecerConexion().prepareStatement(sql);
			rs = st.executeQuery();
			if (rs.next()) {
				return rs.getString("codigo");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public String idconcepto(String nom) {

		String sql = "select idconcepto from concepto where nomconcepto = '" + nom + "';";
		try {
			st = c.establecerConexion().prepareStatement(sql);
			rs = st.executeQuery();
			if (rs.next()) {
				return rs.getString("idconcepto");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
	
	public void actualizarvalor(float valor) {
		this.Ultimo();
		String sql = "Update factura set totalfactura = " + valor + " where nfactura = '"+ (this.getId()-1) +"';";
		System.out.println(sql);
		try {
			st = c.establecerConexion().prepareStatement(sql);
			rs = st.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdetalle() {
		return idetalle;
	}

	public void setIdetalle(int idetalle) {
		this.idetalle = idetalle;
	}
}
