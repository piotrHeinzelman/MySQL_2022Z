package pl.heinzelman.dbmodule.newDictClass;

import java.util.Optional;
import java.util.Set;

public abstract class SimpleEntService<T extends SimpleEnt, R extends SimpleEntRepo<T>>  {

    protected R repo; // <- add final ?

    public SimpleEntService(R repo) {
        this.repo = repo;
    }

    public Optional<T> findById(Long aLong) { return repo.findById(aLong); }

    public boolean existsById(Long aLong) { return repo.existsById(aLong); }

    public Iterable<T> findAll() { return repo.findAll(); }

    public long count() { return repo.count(); }

    public <S extends T> S save(S entity) { return repo.save( entity ); }

    //public Optional<T> findAllByName(String sysName) { return repo.findAllBySysName( sysName ); }
    public Set<T> findAllBySysName(String sysName) { return repo.findAllBySysName(sysName); }

    public <S extends T> Iterable<S> saveAll(Iterable<S> entities) { return repo.saveAll( entities ); }
     public Iterable<T> findAllById(Iterable<Long> longs) { return repo.findAllById( longs ); }
     public void deleteById(Long aLong) { repo.deleteById( aLong ); }
     public void delete(T entity) { repo.delete( entity ); }
     public void deleteAll(Iterable<? extends T> entities) { repo.deleteAll( entities );}
     public void deleteAll() { repo.deleteAll();}
     public void deleteAllById(Iterable<? extends Long> longs) {  }

}
