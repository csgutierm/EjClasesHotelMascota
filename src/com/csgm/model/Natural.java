package com.csgm.model;

public class Natural extends Persona{
	
	private String rut;
	
	public Natural() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Natural(String nombre, String direccion, String fono) {
		super(nombre, direccion, fono);
		// TODO Auto-generated constructor stub
	}

	public Natural(String rut) {
		super();
		this.rut = rut;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	@Override
	public String toString() {
		return "Natural [rut=" + rut + ", Nombre=" + getNombre() + ", Direccion=" + getDireccion()
				+ ", Fono=" + getFono() + "]";
	}
	
	

}
