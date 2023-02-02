package pl.heinzelman.dbmodule.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class ParamsService implements ParamsRepo {

    @Autowired private final ParamsRepo repo;

    public ParamsService(ParamsRepo repo) { this.repo = repo; }

    public Params addParamV( Long id_code, Long id_icon, Long id_unit, Double num_value ){
        Params P = new Params( id_code, id_icon );
        P.setId_unit( id_unit );
        P.setNum_value( num_value );
        return repo.save( P );
    }

    public Params addParamD( Long id_code, Long id_icon, Long id_word ){
        Params P = new Params( id_code, id_icon );
        P.setId_word( id_word );
        return repo.save( P );
    }

    public Params addParamS( Long id_code, Long id_icon, Long id_strings ){
        Params P = new Params( id_code, id_icon );
        P.setId_strings( id_strings );
        return repo.save( P );
    }


    @Override public <S extends Params> S save(S s) {return repo.save(s);}
    @Override public <S extends Params> Iterable<S> saveAll(Iterable<S> iterable) {return repo.saveAll(iterable);}
    @Override public Optional<Params> findById(Long aLong) {return repo.findById(aLong);}
    @Override public boolean existsById(Long aLong) {return repo.existsById(aLong);}
    @Override public Iterable<Params> findAll() {return repo.findAll();}
    @Override public Iterable<Params> findAllById(Iterable<Long> iterable) {return repo.findAllById(iterable);}
    @Override public long count() {return repo.count();}
    @Override public void deleteById(Long aLong) {repo.deleteById(aLong);}
    @Override public void delete(Params params) {repo.delete(params);}
    @Override public void deleteAll(Iterable<? extends Params> iterable) {repo.deleteAll(iterable);}
    @Override public void deleteAll() {repo.deleteAll();}

    @Override
    @Query( value = sql, nativeQuery = true )
    public List<Map<String, Object>> loadParamsByCodeId( Long codeId, Long langId ) {
        return repo.loadParamsByCodeId( codeId, langId );
    }

    /*
    @Override
    @Query(value = sql, nativeQuery = true)
    public List<Map<String, Object>> loadParamsByCodeId(Long codeId, Long langId) {
        return repo.loadParamsByCodeId(codeId, langId);
    }
     */
}

