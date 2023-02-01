package pl.heinzelman.dbmodule.EntityN;

import java.util.Optional;

public abstract class LangEntService<T extends LangEnt, R extends LangEntRepo<T>>  {

    protected R repo; // <- add final ?

    public LangEntService(R repo) {
        this.repo = repo;
    }
    public <S extends T> S save(S entity) { return repo.save(entity); }
    public <S extends T> Iterable<S> saveAll(Iterable<S> entities) { return repo.saveAll(entities); }
    public Optional<T> findById(Key2LongLang idLang) { return repo.findById(idLang); }
    public boolean existsById(Key2LongLang idLang) { return repo.existsById(idLang); }
    public Iterable<T> findAll() { return repo.findAll(); }
    public Iterable<T> findAllById(Iterable<Key2LongLang> idLangs) { return repo.findAllById(idLangs); }
    public long count() { return repo.count(); }
    public void deleteById(Key2LongLang idLang) { repo.deleteById(idLang); }
    public void delete(T entity) { repo.delete(entity); }
    public void deleteAll(Iterable<? extends T> entities) { repo.deleteAll(entities); }
    public void deleteAll() { repo.deleteAll(); }
}
