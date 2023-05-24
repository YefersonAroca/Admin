package modelo;

public class Conceptos {
	private String idCategoria;
	private String NombreCategoria;
	public Conceptos(String idCategoria, String nombreCategoria) {
		super();
		this.idCategoria = idCategoria;
		NombreCategoria = nombreCategoria;
	}
	public Conceptos() {
	
	}
	public String getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(String idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getNombreCategoria() {
		return NombreCategoria;
	}
	public void setNombreCategoria(String nombreCategoria) {
		NombreCategoria = nombreCategoria;
	}
	@Override
	public String toString() {
		return idCategoria+"-"+NombreCategoria;
	}
	

}
