package com.csgm.service;

public class DetalleFactura {
	
	private String sevicio;
	private String cantidad;
	private String detalle;
	
	public DetalleFactura() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DetalleFactura(String sevicio, String cantidad, String detalle) {
		super();
		this.sevicio = sevicio;
		this.cantidad = cantidad;
		this.detalle = detalle;
	}
	
	public String getSevicio() {
		return sevicio;
	}
	
	public void setSevicio(String sevicio) {
		this.sevicio = sevicio;
	}
	
	public String getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	
	public String getDetalle() {
		return detalle;
	}
	
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	@Override
	public String toString() {
		return "DetalleFactura [sevicio=" + sevicio + ", cantidad=" + cantidad + ", detalle=" + detalle + "]";
	}
	
	

}
