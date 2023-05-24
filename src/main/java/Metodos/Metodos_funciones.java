package Metodos;

import java.sql.Connection;
import java.util.ArrayList;

import Conexionbd.Conexion;
import modelo.Conceptos;

public class Metodos_funciones {

	Conexionbd.Conexion c= new Conexion();
	Connection cn = c.establecerConexion();
	
	public ArrayList<Conceptos> obteneronceptos(){
		
		ArrayList<Conceptos> lista_conceptos=new ArrayList<>();
		try {
			
			System.out.print("Concepto");
			
		} catch (Exception e) {
			System.out.print("fallo concepto"+e);
		}
		
		return lista_conceptos;
	}
}
