/**
 * 
 */
package es.ricardorp.aplicacionweb.cliente.factories;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author richie
 *
 */
public class SpringBeansFactory {
    private static final String SPRING_BEANS_CONFIG_FILE = "classpath:spring-beans-config.xml";

    private static ApplicationContext applicationContext;

    private SpringBeansFactory() {
        // Método privado vacío típico de implementación de singletons
    }

    public static void init() {
        if (applicationContext == null) {
            applicationContext = 
            		new ClassPathXmlApplicationContext(SPRING_BEANS_CONFIG_FILE);
        }
    }

    public static <T> T getBean(Class<T> type) {
        return applicationContext.getBean(type);
    }

    public static <T> T getBean(String beanName, Class<T> type) {
        return applicationContext.getBean(beanName, type);
    }

}
