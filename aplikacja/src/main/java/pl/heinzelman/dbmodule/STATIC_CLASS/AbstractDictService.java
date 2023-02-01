package pl.heinzelman.dbmodule.STATIC_CLASS;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class AbstractDictService<T extends AbstractDict> implements AbstractDictRepo<T> {


    @Autowired protected AbstractDictRepo<T> repo;

    public AbstractDictService(AbstractDictRepo<T> repo) { this.repo = repo; }
    public AbstractDictService() {}

//    @Override public Iterable<T> findAll() { return repo.findAll(); }
    @Override public Iterable<T> findAll() { return repo.findByActiveTrue(); }

    @Override public Iterable<T> findByActiveTrue() { return repo.findByActiveTrue(); }

    @Override public Optional<T> findByName( String name ) {
        return repo.findByName( name.trim().toUpperCase() );
    }
    @Override public <S extends T> S save(S entity) {
        return repo.save( entity );
    }
    @Override public <S extends T> Iterable<S> saveAll(Iterable<S> entities) {
        return repo.saveAll( entities );
    }
    @Override public Optional<T> findById(Long aLong) {
        return repo.findById( aLong );
    }
    @Override public boolean existsById(Long aLong) {
        return repo.existsById( aLong );
    }
    @Override public Iterable<T> findAllById(Iterable<Long> longs) {
        return repo.findAllById( longs );
    }
    @Override public long count() { return repo.count(); }
    @Override public void deleteById(Long aLong) { repo.deleteById( aLong ); }
    @Override public void delete(T entity) { repo.delete( entity ); }
    @Override public void deleteAll(Iterable<? extends T> entities) { repo.deleteAll( entities );}
    @Override public void deleteAll() { repo.deleteAll();}

}
