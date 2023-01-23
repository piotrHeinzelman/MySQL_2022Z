package pl.heinzelman.dbmodule.dict2Key;

import java.util.Optional;

public abstract class AbsDoubleDictService<T extends AbsDoubleDict, R extends AbsDoubleDictRepo<T>>  {

    protected R repo; // <- add final ?

    public AbsDoubleDictService(R repo) {
        this.repo = repo;
    }
    public <S extends T> S save(S entity) { return repo.save(entity); }
    public <S extends T> Iterable<S> saveAll(Iterable<S> entities) { return repo.saveAll(entities); }
    public Optional<T> findById(IdLang idLang) { return repo.findById(idLang); }
    public boolean existsById(IdLang idLang) { return repo.existsById(idLang); }
    public Iterable<T> findAll() { return repo.findAll(); }
    public Iterable<T> findAllById(Iterable<IdLang> idLangs) { return repo.findAllById(idLangs); }
    public long count() { return repo.count(); }
    public void deleteById(IdLang idLang) { repo.deleteById(idLang); }
    public void delete(T entity) { repo.delete(entity); }
    public void deleteAllById(Iterable<? extends IdLang> idLangs) { repo.deleteAllById(idLangs); }
    public void deleteAll(Iterable<? extends T> entities) { repo.deleteAll(entities); }
    public void deleteAll() { repo.deleteAll(); }
}
