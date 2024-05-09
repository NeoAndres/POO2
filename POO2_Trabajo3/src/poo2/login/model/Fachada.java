package poo2.login.model;

import poo2.login.model.dao.UsuarioDAO;
import poo2.login.model.dao.UsuarioDTO;

import java.time.LocalDateTime;


public class Fachada {

	private static Fachada instance;
	LocalDateTime now = LocalDateTime.now();
	
	// Patrón Singleton
	
	private Fachada() {}
	
	public static Fachada getInstance() {
		if(instance==null)
			instance = new Fachada();
		
		return instance;
	}
	
	public String getWelcomeText() {
		return "Sistema de información personal y de gestión";
	}
	
	public String validarCredenciales(String usuario, String passwd) throws Exception {
		String nombreCompleto = "";
		
		UsuarioDTO dto = (new UsuarioDAO()).validarCredenciales(usuario, passwd);
		if(dto!=null)
			nombreCompleto = dto.getNombreCompleto();
		else
			throw new Exception("No se encontró usuario con esas credenciales");
		
		return nombreCompleto;
	}

	
	public boolean validarHora(int horaIngresada, int minutoIngresado) throws Exception {
        LocalDateTime now = LocalDateTime.now();
        if (now.getHour() == horaIngresada && now.getMinute() == minutoIngresado) {
            return true;
        } else {
            throw new Exception("La hora ingresada no coincide con la hora actual");
        }
    }

	
}
