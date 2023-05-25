package modelo;

public class Persona {
	private String codigoPersona;
	private String nombreperosna;
	
	
	
	public Persona(String codigoPersona, String nombreperosna) {
		super();
		this.codigoPersona = codigoPersona;
		this.nombreperosna = nombreperosna;
	}
	
	
	public Persona() {
	
	}




	public String getCodigoPersona() {
		return codigoPersona;
	}
	public void setCodigoPersona(String string) {
		this.codigoPersona = string;
	}
	public String getNombreperosna() {
		return nombreperosna;
	}
	public void setNombreperosna(String nombreperosna) {
		this.nombreperosna = nombreperosna;
	}
	public String toString() {
		return nombreperosna;
	}
	
	
	
}
