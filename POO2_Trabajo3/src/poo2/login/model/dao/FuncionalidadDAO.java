package poo2.login.model.dao;

import java.util.ArrayList;
import java.util.List;

public class FuncionalidadDAO {

	public List<FuncionalidadDTO> listarFuncionalidades(String usuario){
		
		List<FuncionalidadDTO> lista = null;
		
		if(usuario.equals("poo2")) {
			lista = new ArrayList<FuncionalidadDTO>();
			
			
		}else if(usuario.equals("poo1")) {
			lista = new ArrayList<FuncionalidadDTO>();
		}
		
		return lista;
		
	}
	
}
