package es.ricardorp.aplicacionweb.cliente;

import es.ricardorp.aplicacionweb.cliente.factories.SpringBeansFactory;
import es.ricardorp.aplicacionweb.interfaz.ServicioWeb;

/**
 * Esta es la clase cliente que se encarga de consumir el servicio web.
 *
 */
public class Cliente {

	/**
	 * Referencia al servicio web.
	 */
	private ServicioWeb servicioWeb;

	/**
	 * Método de inicialización del contexto de Spring y de obtención de la
	 * instancia del servicio web.
	 */
	public void init() {
		SpringBeansFactory.init();
		servicioWeb = SpringBeansFactory.getBean(ServicioWeb.class);
	}

	/**
	 * Declaración del hilo principal. Inicializa la clase e imprime un mensaje
	 * por pantalla.
	 * @param args Argumentos pasados en la línea de comandos.
	 */
	public static void main( String[] args ) {
		Cliente cliente = new Cliente();
		cliente.init();
    	String holaMundoAsString = "Falló!";
    	if (cliente.getServicioWeb() != null) {
    		holaMundoAsString = cliente.getServicioWeb().holaMundo();
    	}
    	System.out.println(holaMundoAsString);
    }

	/**
	 * @return the servicioWeb
	 */
	public ServicioWeb getServicioWeb() {
		return servicioWeb;
	}

	/**
	 * @param servicioWeb the servicioWeb to set
	 */
	public void setServicioWeb(ServicioWeb servicioWeb) {
		this.servicioWeb = servicioWeb;
	}
}
