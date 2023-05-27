package com.csgm.model;

public class Mascota {
	
	private String tipo;
	private String nombre;
	private String edad;
	
	
	public Mascota() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mascota(String tipo, String nombre, String edad) {
		super();
		this.tipo = tipo;
		this.nombre = nombre;
		this.edad = edad;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Mascota [tipo=" + tipo + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	

}
