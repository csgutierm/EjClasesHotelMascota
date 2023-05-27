package com.csgm.model;

public class Auxiliares extends Personal{
	
	private String turnos;
	
	public Auxiliares() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Auxiliares(String turnos) {
		super();
		this.turnos = turnos;
	}

	public void MantenerOrden() {
		
	}
	
	public void AlimentarClientes() {
		
	}
	
	public void PasearCliente() {
		
	}

	public String getTurnos() {
		return turnos;
	}

	public void setTurnos(String turnos) {
		this.turnos = turnos;
	}

	@Override
	public String toString() {
		return "Auxiliares [turnos=" + turnos + "]";
	}
	
	
}
