package com.csgm.model;

public class Perro extends Mascota{
	
	public Perro() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Perro [Tipo=" + getTipo() + ", Nombre=" + getNombre() + ", Edad=" + getEdad() + "]";
	}

}
