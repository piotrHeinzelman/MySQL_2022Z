package pl.heinzelman.dbmodule.Entity;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParamsRepo extends CrudRepository<Params, Long> {

}


