package pl.heinzelman.dbmodule.EntityN;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface LangEntRepo<T extends LangEnt> extends CrudRepository<T, Key2LongLang> {

     //Iterable<T> findAllByActiveTrue();
     //  https://stackoverflow.com/questions/17600790/query-by-boolean-properties-in-spring-data-jpa-without-using-method-parameters

}
