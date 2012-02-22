package es.ricardorp.aplicacionweb.servidor;

import javax.jws.WebService;

import es.ricardorp.aplicacionweb.interfaz.ServicioWeb;

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
