#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.spring_data.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Configuration class for Spring Data Jpa Repositories.
 */
@Configuration
@ComponentScan(basePackages = {
        "${package}.spring_data"
})
// TODO: add @EnableJpaRepositories if using Spring Data JPA
// TODO: add @EntityScan or resources/META-INF/orm.xml file
public class SpringDataConfig {
}
