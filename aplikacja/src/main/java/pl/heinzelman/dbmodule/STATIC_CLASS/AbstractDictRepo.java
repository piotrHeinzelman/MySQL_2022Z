package pl.heinzelman.dbmodule.STATIC_CLASS;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;

@NoRepositoryBean
public interface AbstractDictRepo<T extends AbstractDict> extends CrudRepository<T, Long> {
    Optional<T> findByName( String name );

    public default boolean existsByName(String name) {
        if (name==null) return false;
        return findByName( name.trim().toUpperCase() ).isPresent();
    }

    //https://stackoverflow.com/questions/17600790/query-by-boolean-properties-in-spring-data-jpa-without-using-method-parameters

    Iterable<T> findByActiveTrue();

}
