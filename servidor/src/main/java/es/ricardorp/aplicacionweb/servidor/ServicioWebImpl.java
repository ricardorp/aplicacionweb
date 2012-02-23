package es.ricardorp.aplicacionweb.servidor;

import javax.jws.WebService;

import es.ricardorp.aplicacionweb.interfaz.ServicioWeb;

/**
 * Esta clase se encarga de la implementación del servicio web.
 * @author richie
 *
 */
@WebService (endpointInterface = "es.ricardorp.aplicacionweb.interfaz.ServicioWeb")
public class ServicioWebImpl implements ServicioWeb {

	/*
	 * (non-Javadoc)
	 * @see es.ricardorp.aplicacionweb.interfaz.ServicioWeb#holaMundo()
	 */
	public String holaMundo() {
		return "Hola mundo!";
	}


}
