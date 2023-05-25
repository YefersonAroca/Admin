package modelo;

public class Conceptos {
	private int idCategoria;
	private String NombreCategoria;
	public Conceptos(int idCategoria, String nombreCategoria) {
		super();
		this.idCategoria = idCategoria;
		NombreCategoria = nombreCategoria;
	}
	public Conceptos() {
	
	}
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int i) {
		this.idCategoria = i;
	}
	public String getNombreCategoria() {
		return NombreCategoria;
	}
	public void setNombreCategoria(String nombreCategoria) {
		NombreCategoria = nombreCategoria;
	}
	@Override
	public String toString() {
		return NombreCategoria;
	}
	

}
