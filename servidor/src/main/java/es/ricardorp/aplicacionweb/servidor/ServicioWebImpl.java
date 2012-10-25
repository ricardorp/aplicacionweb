package es.ricardorp.aplicacionweb.servidor;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.ricardorp.aplicacionweb.entities.Pais;
import es.ricardorp.aplicacionweb.entities.PaisDao;
import es.ricardorp.aplicacionweb.interfaz.dtos.PaisDto;
import es.ricardorp.aplicacionweb.interfaz.services.ServicioWeb;

/**
 * Esta clase se encarga de la implementación del servicio web.
 * @author richie
 *
 */
@WebService (
	name= "servicioWeb",
	portName = "servicioWebPort",
	targetNamespace = "http://aplicacionweb.ricardorp.es/",
	serviceName = "ServicioWeb",
	endpointInterface = "es.ricardorp.aplicacionweb.interfaz.services.ServicioWeb")
@Service ("servicioWebImpl")
public class ServicioWebImpl implements ServicioWeb {

	private PaisDao paisDao;
	
	/* (non-Javadoc)
	 * @see es.ricardorp.aplicacionweb.interfaz.services.ServicioWeb#findAllPaises()
	 */
	@Override
	@Transactional(readOnly=true)
	public List<PaisDto> findAllPaises() {
		List<Pais> paises = paisDao.findAll();
		List<PaisDto> paisesDto = new ArrayList<PaisDto>(paises.size());
		for (Pais pais : paises) {
			paisesDto.add(new PaisDto(pais.getIdPais(), pais.getNombrePais(), pais.getCodigoPais(), pais.getValorPais()));
		}
		return paisesDto;
	}

	/**
	 * @return the paisDao
	 */
	@WebMethod(exclude = true)
	public PaisDao getPaisDao() {
		return paisDao;
	}

	/**
	 * @param paisDao the paisDao to set
	 */
	@WebMethod(exclude = true)
	public void setPaisDao(PaisDao paisDao) {
		this.paisDao = paisDao;
	}


}
