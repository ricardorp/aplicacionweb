package es.ricardorp.aplicacionweb.interfaz.dtos;

/**
 * Esta clase guarda los datos referentes a un país concreto y se utiliza para intercambiar datos de países entre
 * distintas capas.
 * 
 * @author richie
 *
 */
public class PaisDto {

	/**
	 * Identificador del país
	 */
	private int idPais;
	/**
	 * Nombre del país
	 */
	private String nombrePais;
	/**
	 * Código ISO de dos caracteres del país
	 */
	private String codigoPais;
	/**
	 * Valor asignado al conjunto del país.
	 */
	private int valorPais;
	
	/**
	 * Constructor por defecto.
	 */
	public PaisDto() {
		super();
	}
	
	/**
	 * Constructor que inicializa todos los atributos de la clase.
	 * @param idPais identificador del país.
	 * @param nombrePais nombre del país.
	 * @param codigoPais código ISO de dos caracteres del país.
	 * @param valorPais valor del país.
	 */
	public PaisDto(int idPais, String nombrePais, String codigoPais, int valorPais) {
		this.idPais = idPais;
		this.nombrePais = nombrePais;
		this.codigoPais = codigoPais;
		this.valorPais = valorPais;
	}

	/**
	 * @return the idPais
	 */
	public int getIdPais() {
		return idPais;
	}

	/**
	 * @param idPais the idPais to set
	 */
	public void setIdPais(int idPais) {
		this.idPais = idPais;
	}

	/**
	 * @return the nombrePais
	 */
	public String getNombrePais() {
		return nombrePais;
	}

	/**
	 * @param nombrePais the nombrePais to set
	 */
	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}

	/**
	 * @return the codigoPais
	 */
	public String getCodigoPais() {
		return codigoPais;
	}

	/**
	 * @param codigoPais the codigoPais to set
	 */
	public void setCodigoPais(String codigoPais) {
		this.codigoPais = codigoPais;
	}

	/**
	 * @return the valorPais
	 */
	public int getValorPais() {
		return valorPais;
	}

	/**
	 * @param valorPais the valorPais to set
	 */
	public void setValorPais(int valorPais) {
		this.valorPais = valorPais;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idPais;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof PaisDto))
			return false;
		PaisDto other = (PaisDto) obj;
		if (idPais != other.idPais)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PaisDto [idPais=" + idPais + ", nombrePais=" + nombrePais
				+ ", codigoPais=" + codigoPais + ", valorPais=" + valorPais
				+ "]";
	}
}
