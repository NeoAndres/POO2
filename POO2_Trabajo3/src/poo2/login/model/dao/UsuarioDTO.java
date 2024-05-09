package poo2.login.model.dao;

public class UsuarioDTO {

	private String nombres;
	private String apellidos;
	
	public String getNombres() {
		return nombres;
	}
	
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getNombreCompleto() {
		return nombres + " " + apellidos;
	}
	
	
	
}
