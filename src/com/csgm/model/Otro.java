package com.csgm.model;

public class Otro extends Mascota{
	
	private String raza;
	
	public Otro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Otro(String tipo, String nombre, String edad) {
		super(tipo, nombre, edad);
		// TODO Auto-generated constructor stub
	}

	public Otro(String raza) {
		super();
		this.raza = raza;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "Otro [raza=" + raza + ", Tipo=" + getTipo() + ", Nombre=" + getNombre() + ", Edad="
				+ getEdad() + "]";
	}
	
	

}
