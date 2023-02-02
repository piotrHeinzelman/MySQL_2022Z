package pl.heinzelman.dbmodule.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UnitService implements UnitRepo {

    @Autowired
    private final UnitRepo repo;

    public UnitService(UnitRepo repo) { this.repo = repo; }

    public Unit addUnit( String sysName, Long idMeasure, String suffix, Double multi ){
        Unit newUnit = new Unit( sysName, idMeasure, suffix, multi );
        return repo.save( newUnit );
    }

    @Override public <S extends Unit> S save(S s) {return repo.save(s);}
    @Override public <S extends Unit> Iterable<S> saveAll(Iterable<S> iterable) {return repo.saveAll(iterable);}
    @Override public Optional<Unit> findById(Long aLong) {return repo.findById(aLong);}
    @Override public boolean existsById(Long aLong) {return repo.existsById(aLong);}
    @Override public Iterable<Unit> findAll() {return repo.findAll();}
    @Override public Iterable<Unit> findAllById(Iterable<Long> iterable) {return repo.findAllById(iterable);}
    @Override public long count() {return repo.count();}
    @Override public void deleteById(Long aLong) {repo.deleteById(aLong);}
    @Override public void delete(Unit unit) {repo.delete(unit);}
    @Override public void deleteAll(Iterable<? extends Unit> iterable) {repo.deleteAll(iterable);}
    @Override public void deleteAll() {repo.deleteAll();}
}

