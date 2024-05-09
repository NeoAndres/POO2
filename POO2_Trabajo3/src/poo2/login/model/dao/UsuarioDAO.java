package poo2.login.model.dao;

public class UsuarioDAO {

	/**
	 * Este metodo tiene como propósito validar las credenciales
	 * ingresadas por el usuario.
	 * @param usuario
	 * @param passwd
	 * @return
	 */
	public UsuarioDTO validarCredenciales(String usuario, String passwd) {
		UsuarioDTO dto =  null;
		
		if(usuario.equals("poo2") && passwd.equals("poo2")) {
			dto = new UsuarioDTO();
			dto.setNombres("Boris");
			dto.setApellidos("Perez");
		}else if(usuario.equals("poo1") && passwd.equals("poo1")) {
			dto = new UsuarioDTO();
			dto.setNombres("Franco");
			dto.setApellidos("Velandia");
		}
			
		return dto;
	}
	
}
