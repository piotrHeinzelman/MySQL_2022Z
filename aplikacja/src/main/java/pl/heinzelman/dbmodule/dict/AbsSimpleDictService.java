package pl.heinzelman.dbmodule.dict;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public abstract class AbsSimpleDictService<T extends AbsSimpleDict, R extends AbsSimpleDictRepo<T>>  {

    protected R repo; // <- add final ?

    public AbsSimpleDictService(R repo) {
        this.repo = repo;
    }

     public Iterable<T> findAll           () {
                     return repo.findAllByActiveTrue  ();}

     public Iterable<T> findAllByActiveTrue  () {
                     return repo.findAllByActiveTrue  (); }



     public Optional<T> findById           (Long aLong) {
                     return repo.findAllByIdAndActiveTrue ( aLong );   }

    public Optional<T> findAllByIdAndActiveTrue (Long aLong) {
                      return repo.findAllByIdAndActiveTrue (aLong); }



    public Optional<T> findAllByName              ( String name ) {
                     return repo.findAllByNameAndActiveTrue ( name );          }

    public Optional<T> findAllByNameAndActiveTrue (String name) {
                     return repo.findAllByNameAndActiveTrue (name); }



    public boolean existsById            ( Long aLong ) {
                     return repo.existsByIdAndActiveTrue  ( aLong ); }

    public boolean     existsByIdAndActiveTrue  ( Long aLong ) {
                     return repo.existsByIdAndActiveTrue  ( aLong ); }

    public boolean    existsByNameAndActiveTrue ( String name) {
                     return repo.existsByNameAndActiveTrue ( name); }


    public long count() {
              return repo.countAllByActiveTrue(); }

     public long countAllByActiveTrue() {
              return repo.countAllByActiveTrue(); }


     public <S extends T> S save(S entity) { return repo.save( entity ); }


     public <S extends T> Iterable<S> saveAll(Iterable<S> entities) { return repo.saveAll( entities ); }
     public Iterable<T> findAllById(Iterable<Long> longs) { return repo.findAllById( longs ); }
     public void deleteById(Long aLong) { repo.deleteById( aLong ); }
     public void delete(T entity) { repo.delete( entity ); }
     public void deleteAll(Iterable<? extends T> entities) { repo.deleteAll( entities );}
     public void deleteAll() { repo.deleteAll();}
     public void deleteAllById(Iterable<? extends Long> longs) {  }

}
