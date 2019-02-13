#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.repositories;

import ${package}.models.User;

/**
 * A port out of the application that allows {@link User} persistence.
 */
// TODO: remove comment when JPA is added into the project.
public interface UserRepository /* extends ExtendedJpaRepository<User, Long> */ {
}
