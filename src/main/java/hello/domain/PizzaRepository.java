package hello.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Created by Arthur on 09/12/2015.
 */
public interface PizzaRepository extends CrudRepository<Pizza,Long> {
    @RestResource(path = "by-nom")
    Pizza findByNom(@Param("id") String nom);
}
