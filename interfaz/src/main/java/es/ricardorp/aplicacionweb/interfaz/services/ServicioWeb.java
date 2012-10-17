package es.ricardorp.aplicacionweb.interfaz.services;

import java.util.List;

import javax.jws.WebService;

import es.ricardorp.aplicacionweb.interfaz.dtos.PaisDto;

/**
 * Esta interfaz define el servicio web y los métodos que ofrece al mundo. En
 * este caso ofrece un único método: {@link #findAllPaises()}.
 *
 */
@WebService
public interface ServicioWeb {
	
	/**
	 * Este método se encarga de listar todos los países dados de alta en el sistema sin ningún tipo de filtro.
	 * @return La lista de países existentes en el sistema.
	 */
	public List<PaisDto> findAllPaises();
}
