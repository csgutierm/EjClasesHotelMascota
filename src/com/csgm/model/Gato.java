package com.csgm.model;

public class Gato extends Mascota{
	
	public Gato() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Gato [Tipo=" + getTipo() + ", Nombre=" + getNombre() + ", Edad=" + getEdad() + "]";
	}
	

}
