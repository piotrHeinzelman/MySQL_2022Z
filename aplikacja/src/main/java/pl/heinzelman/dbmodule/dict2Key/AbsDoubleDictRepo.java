package pl.heinzelman.dbmodule.dict2Key;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import pl.heinzelman.dbmodule.dict.AbsSimpleDict;

import java.util.Optional;

@NoRepositoryBean
public interface AbsDoubleDictRepo<T extends AbsDoubleDict> extends CrudRepository<T, IdLang> {

     //Iterable<T> findAllByActiveTrue();
     //  https://stackoverflow.com/questions/17600790/query-by-boolean-properties-in-spring-data-jpa-without-using-method-parameters

}
