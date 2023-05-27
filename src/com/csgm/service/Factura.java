package com.csgm.service;

public class Factura {
	
	private String fechaFactura;
	
	public Factura() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Factura(String fechaFactura) {
		super();
		this.fechaFactura = fechaFactura;
	}

	public String getFechaFactura() {
		return fechaFactura;
	}

	public void setFechaFactura(String fechaFactura) {
		this.fechaFactura = fechaFactura;
	}

	@Override
	public String toString() {
		return "Factura [fechaFactura=" + fechaFactura + "]";
	}
	
	

}
