package com.csgm.model;

public class Persona {
	
	private String nombre;
	private String direccion;
	private String fono;	
	
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Persona(String nombre, String direccion, String fono) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.fono = fono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getFono() {
		return fono;
	}

	public void setFono(String fono) {
		this.fono = fono;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", direccion=" + direccion + ", fono=" + fono + "]";
	}
	
	
}
