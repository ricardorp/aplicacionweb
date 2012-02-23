package es.ricardorp.aplicacionweb.interfaz;

import javax.jws.WebService;

/**
 * Esta interfaz define el servicio web y los métodos que ofrece al mundo. En
 * este caso ofrece un único método: holaMundo()
 *
 */
//Marcamos la interfaz como servicio web
@WebService
public interface ServicioWeb {

	/**
	 * Devuelve el String "Hola mundo!"
	 * @return Devuelve el String "Hola mundo!"
	 */
	public String holaMundo();
	
}
