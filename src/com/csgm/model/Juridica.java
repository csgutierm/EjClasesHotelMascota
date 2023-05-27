package com.csgm.model;

public class Juridica extends Persona {
	
	private String rol;
	
	public Juridica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Juridica(String rol) {
		super();
		this.rol = rol;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	@Override
	public String toString() {
		return "Juridica [rol=" + rol + ", Nombre=" + getNombre() + ", Direccion=" + getDireccion()
				+ ", Fono=" + getFono() + "]";
	}
		
	

}
