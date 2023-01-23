package pl.heinzelman.dbmodule.dict;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public abstract class AbsSimpleDictService<T extends AbsSimpleDict, R extends AbsSimpleDictRepo<T>>  {

    protected R repo; // <- add final ?

    public AbsSimpleDictService(R repo) {
        this.repo = repo;
    }

    public Optional<T> findById(Long aLong) { return repo.findById(aLong); }

    public boolean existsById(Long aLong) { return repo.existsById(aLong); }

    public Iterable<T> findAll() { return repo.findAll(); }

    public long count() { return repo.count(); }

    public <S extends T> S save(S entity) { return repo.save( entity ); }

    public Optional<T> findAllByName(String name) { return repo.findAllByName(name); }

    public <S extends T> Iterable<S> saveAll(Iterable<S> entities) { return repo.saveAll( entities ); }
     public Iterable<T> findAllById(Iterable<Long> longs) { return repo.findAllById( longs ); }
     public void deleteById(Long aLong) { repo.deleteById( aLong ); }
     public void delete(T entity) { repo.delete( entity ); }
     public void deleteAll(Iterable<? extends T> entities) { repo.deleteAll( entities );}
     public void deleteAll() { repo.deleteAll();}
     public void deleteAllById(Iterable<? extends Long> longs) {  }

}
