/**
 * 
 */
package es.ricardorp.aplicacionweb.entities;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

/**
 * @author richie
 *
 */
public class PaisDaoImpl extends NamedParameterJdbcDaoSupport implements PaisDao {

	/* (non-Javadoc)
	 * @see es.ricardorp.aplicacionweb.entities.PaisDao#findPais(int)
	 */
	@Override
	public Pais findPais(int idPais) {
		String queryAsString = 
				"SELECT ID_PAIS, NOMBRE_PAIS, CODIGO_PAIS, VALOR_PAIS " +
				"FROM APLICACION_WEB.PAIS " +
				"WHERE ID_PAIS = :ID_PAIS";
		
        final Map<String, Object> filters = new HashMap<String, Object>();
        filters.put("ID_PAIS", idPais);

        final SqlParameterSource parameters = new MapSqlParameterSource(filters);

        final List<Pais> paises = getNamedParameterJdbcTemplate().query(queryAsString, parameters,
                new RowMapper<Pais>() {

					@Override
					public Pais mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						int i = 1;
						return new Pais(rs.getInt(i++), rs.getString(i++), rs.getString(i++), rs.getInt(i++));
					}
				});

        if (paises != null && paises.size() == 1) {
        	return paises.get(0);
        }
		return null;
	}

	/* (non-Javadoc)
	 * @see es.ricardorp.aplicacionweb.entities.PaisDao#findAll()
	 */
	@Override
	public List<Pais> findAll() {
		String queryAsString = 
				"SELECT ID_PAIS, NOMBRE_PAIS, CODIGO_PAIS, VALOR_PAIS " +
				"FROM APLICACION_WEB.PAIS ";
		
        final List<Pais> paises = getJdbcTemplate().query(queryAsString,
                new RowMapper<Pais>() {

					@Override
					public Pais mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						int i = 1;
						return new Pais(rs.getInt(i++), rs.getString(i++), rs.getString(i++), rs.getInt(i++));
					}
				});

		return paises;
	}

}
