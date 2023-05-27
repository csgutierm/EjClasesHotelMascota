package com.csgm.model;

public class Personal {
	
	private String rut;
	private String nombre;
	private String apellido;
	private String contrato;
	
	public Personal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Personal(String rut, String nombre, String apellido, String contrato) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.contrato = contrato;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getContrato() {
		return contrato;
	}

	public void setContrato(String contrato) {
		this.contrato = contrato;
	}

	@Override
	public String toString() {
		return "Personal [rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", contrato=" + contrato
				+ "]";
	}

	public void atenderCliente() {
		// TODO Auto-generated constructor stub
	}

	public void entregarCredencial() {
		// TODO Auto-generated constructor stub
	}
	
	
	
}
