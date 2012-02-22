package es.ricardorp.aplicacionweb.interfaz;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

//Marcamos la interfaz como servicio web
@WebService
//Le indicamos RPC para que las listas vacías no aparezcan como null.
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface ServicioWeb {

	/**
	 * Devuelve el String "Hola mundo!"
	 * @return Devuelve el String "Hola mundo!"
	 */
	public String holaMundo();
	
}
