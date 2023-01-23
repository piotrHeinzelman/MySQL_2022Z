package pl.heinzelman.dbmodule.dict;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;

@NoRepositoryBean
public interface AbsSimpleDictRepo<T extends AbsSimpleDict> extends CrudRepository<T, Long> {

     Iterable<T> findAllByActiveTrue();

            long count();
            long countAllByActiveTrue();


    Optional<T> findAllByName( String name );
    Optional<T> findAllByNameAndActiveTrue( String name );
    Optional<T> findAllByIdAndActiveTrue( Long aLong );

    boolean existsByIdAndActiveTrue( Long aLong );
    boolean existsByNameAndActiveTrue( String name );

//  https://stackoverflow.com/questions/17600790/query-by-boolean-properties-in-spring-data-jpa-without-using-method-parameters

}
