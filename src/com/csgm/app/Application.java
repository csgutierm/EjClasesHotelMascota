package com.csgm.app;

import com.csgm.model.Mascota;
import com.csgm.service.Factura;
import com.csgm.service.Servicio;

public class Application {

	public static void main(String[] args) {
		
		Mascota mascota = new Mascota();
		Factura factura = new Factura();
		Servicio servicio = new Servicio();
		
		//setear
		mascota.setEdad(null);
		mascota.setNombre(null);
		mascota.setTipo(null);
		
		//setear
		factura.setFechaFactura(null);
		
		
		//setear
		servicio.setDescripcion(null);
		servicio.setIngreso(null);
		servicio.setSalida(null);
		

	}

}
