package modelo;

public class Persona {
	private int codigoPersona;
	private String nombreperosna;
	
	
	
	public Persona(int codigoPersona, String nombreperosna) {
		super();
		this.codigoPersona = codigoPersona;
		this.nombreperosna = nombreperosna;
	}
	
	
	public Persona() {
	
	}




	public int getCodigoPersona() {
		return codigoPersona;
	}
	public void setCodigoPersona(int i) {
		this.codigoPersona = i;
	}
	public String getNombreperosna() {
		return nombreperosna;
	}
	public void setNombreperosna(String nombreperosna) {
		this.nombreperosna = nombreperosna;
	}
	public String toString() {
		return codigoPersona+"-"+nombreperosna;
	}
	
	
	
}
