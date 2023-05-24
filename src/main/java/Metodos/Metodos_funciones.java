package Metodos;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Conexionbd.Conexion;
import modelo.Conceptos;

public class Metodos_funciones {

	Conexionbd.Conexion c= new Conexion();
	Connection cn = c.establecerConexion();
	ResultSet rs ;
	PreparedStatement st;
	public ArrayList<Conceptos> obteneronceptos(){
		
		ArrayList<Conceptos> lista_conceptos=new ArrayList<>();
		try {
			String sql = "select * from concepto;";
			st = c.establecerConexion().prepareStatement(sql);
			rs = st.executeQuery();
			System.out.print("Concepto");
			while (rs.next()) {
				Conceptos conce=new Conceptos();
				conce.setIdCategoria(rs.getInt("idconcepto"));
				conce.setNombreCategoria(rs.getString("nomconcepto"));
				lista_conceptos.add(conce);
				System.out.print("good concep");
				
			}
			
		} catch (Exception e) {
			System.out.print("fallo concepto"+e);
		}
		
		return lista_conceptos;
	}
}
