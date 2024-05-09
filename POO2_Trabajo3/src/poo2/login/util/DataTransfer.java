package poo2.login.util;

public class DataTransfer {

	private String nombreCompleto;
    private int hora;
    private int minuto;
	
	/*
	 * Inicio
	 * Bloque creación singleton
	 */
	private static DataTransfer instance;
	
	private DataTransfer() {		
	}
	
	public static DataTransfer getInstance() {
		if(instance==null) {
			instance = new DataTransfer();
		}
		
		return instance;
	}
	
	/*
	 * Fin
	 * Bloque creación singleton
	 */
	
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }
	
}
