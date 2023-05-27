package com.csgm.service;

public class Servicio {
	
	private String ingreso;
	private String salida;
	private String descripcion;
		
	public Servicio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Servicio(String ingreso, String salida, String descripcion) {
		super();
		this.ingreso = ingreso;
		this.salida = salida;
		this.descripcion = descripcion;
	}
	
	public String getIngreso() {
		return ingreso;
	}
	
	public void setIngreso(String ingreso) {
		this.ingreso = ingreso;
	}
	
	public String getSalida() {
		return salida;
	}
	
	public void setSalida(String salida) {
		this.salida = salida;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Servicio [ingreso=" + ingreso + ", salida=" + salida + ", descripcion=" + descripcion + "]";
	}
	
	

}
