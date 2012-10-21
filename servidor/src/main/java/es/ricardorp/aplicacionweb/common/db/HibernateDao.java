/**
 * 
 */
package es.ricardorp.aplicacionweb.common.db;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

/**
 * Esta clase se utiliza para facilitar la implementación de los DAOs en Hibernate al proporcionar un mecanismo común
 * para gestionar la instanciación del {@link SessionFactory}. Además incluye las anotaciones necesarias para realizar
 * la traducción de excepciones típica de HibernateTemplate.
 *  
 * @author richie
 *
 */
@Repository
public abstract class HibernateDao {

	@Resource
	private SessionFactory sessionFactory;

	/**
	 * @return the sessionFactory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * @param sessionFactory the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
