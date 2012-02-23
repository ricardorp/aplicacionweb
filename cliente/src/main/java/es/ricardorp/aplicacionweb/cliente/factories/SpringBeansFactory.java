/**
 * 
 */
package es.ricardorp.aplicacionweb.cliente.factories;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Con esta clase inicializamos el contexto de Spring (a partir del único
 * archivo de configuración src/main/resources/spring-beans-config.xml) y
 * ofrecemos un par de métodos para obtener referencias a los distintos beans.
 * La inicialización se hace con una llamada al método init() y debe realizase
 * al inicio de la aplicación, antes de que sea necesaria cualquier instancia
 * de algún bean definido en Spring.
 *
 */
public class SpringBeansFactory {
    
	/**
	 * Archivo de configuración (en esta aplicación sólo hay uno).
	 */
	private static final String SPRING_BEANS_CONFIG_FILE = "classpath:spring-beans-config.xml";

    /**
     * Referencia al contexto
     */
    private static ApplicationContext applicationContext;

    /**
     * Método privado vacío típico en la implementación de singletons
     */
    private SpringBeansFactory() {
        // Método privado vacío típico de implementación de singletons
    }

    /**
     * Método para la inicialización del contexto. Debe llamarse antes de
     * solicitar ninguna instancia de un bean.
     */
    public static void init() {
        if (applicationContext == null) {
            applicationContext = 
            		new ClassPathXmlApplicationContext(SPRING_BEANS_CONFIG_FILE);
        }
    }

    /**
     * Devuelve una instancia concreta del tipo que se solicita.
     * @param type Tipo (interfaz) que se solicita.
     * @return Instancia de una clase concreta que implementa la interfaz.
     */
    public static <T> T getBean(Class<T> type) {
        return applicationContext.getBean(type);
    }

    /**
     * Similar al método anterior, pero además de indicar el tipo, se indica
     * el nombre del bean. Util cuando puede haber múltiples instancias de
     * un mismo tipo (un datasource para MySQL y DB2, por ejemplo).
     * 
     * @param beanName Nombre del bean
     * @param type Tipo (interfaz) que se solicita.
     * @return Instancia de una clase concreta que implementa la interfaz y que
     * se corresponde con el identificador del bean indicador.
     */
    public static <T> T getBean(String beanName, Class<T> type) {
        return applicationContext.getBean(beanName, type);
    }

}
