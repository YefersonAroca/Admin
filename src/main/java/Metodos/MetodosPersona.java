package Metodos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Conexionbd.Conexion;
import modelo.Persona;

public class MetodosPersona {
	Conexionbd.Conexion c= new Conexion();
	Connection cn = c.establecerConexion();
	ResultSet rs ;
	PreparedStatement st;
	public ArrayList<Persona> buscarPersona(String nom){
		
		ArrayList<Persona> lista_persona=new ArrayList<>();
		try {
			String sql = "select * from persona where nombrepersona like '%"+nom+"%' OR nombrepersona like '"+nom+"%';";
			
			st = c.establecerConexion().prepareStatement(sql);
		
			rs = st.executeQuery();
			
			System.out.print("Concepto");
			while (rs.next()) {
				Persona perso=new Persona();
				perso.setCodigoPersona(rs.getString("codigo"));
				perso.setNombreperosna(rs.getString("nombrepersona"));
				lista_persona.add(perso);
				
				JOptionPane.showMessageDialog(null, "error" );
				System.out.print("good person");
				
			}
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "error" + e.toString());
	
		}
		
		return lista_persona;

}
}
