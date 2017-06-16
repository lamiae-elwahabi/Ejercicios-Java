package org.foobarspam.tarjetaUsuario;

public class TarjetaUsuario {
	//Propiedades
	private String id = " ";
	private Boolean activada = false;
	
	//Constructores
	public TarjetaUsuario() {
		
	}
	public TarjetaUsuario(String id, Boolean activada) {
		this.id = id;
		this.activada = activada;
	}
	//Getters y Setters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Boolean getActivada() {
		return activada;
	}
	public void setActivada(Boolean activada) {
		this.activada = activada;
	}

}
