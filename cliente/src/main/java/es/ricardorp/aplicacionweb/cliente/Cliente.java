package es.ricardorp.aplicacionweb.cliente;

import org.springframework.beans.factory.annotation.Autowired;

import es.ricardorp.aplicacionweb.cliente.factories.SpringBeansFactory;
import es.ricardorp.aplicacionweb.interfaz.ServicioWeb;

public class Cliente {
	
	@Autowired
	private ServicioWeb servicioWeb;
	
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

	private void init() {
		SpringBeansFactory.init();
//		servicioWeb = SpringBeansFactory.getBean(ServicioWeb.class);
	}
	
	public static void main( String[] args ) {
		Cliente cliente = new Cliente();
		cliente.init();
    	String holaMundoAsString = "Falló!";
    	if (cliente.getServicioWeb() != null) {
    		holaMundoAsString = cliente.getServicioWeb().holaMundo();
    	}
    	System.out.println(holaMundoAsString);
    }
}
