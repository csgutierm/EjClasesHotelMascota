package com.csgm.model;

public class Veterinario extends Personal{
	
	private String especialidad;	
	
	public Veterinario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Veterinario(String rut, String nombre, String apellido, String contrato) {
		super(rut, nombre, apellido, contrato);
		// TODO Auto-generated constructor stub
	}

	public Veterinario(String especialidad) {
		super();
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	@Override
	public String toString() {
		return "Veterinario [especialidad=" + especialidad + ", Rut=" + getRut() + ", Nombre=" + getNombre()
				+ ", Apellido=" + getApellido() + ", Contrato=" + getContrato() + "]";
	}

	public void revisionClientes() {
		// TODO Auto-generated constructor stub
	}

	public void supervisaElemento() {
		// TODO Auto-generated constructor stub
	}
}
