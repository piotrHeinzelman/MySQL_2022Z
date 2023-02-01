package pl.heinzelman.dbmodule.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ParamsService implements ParamsRepo {

    @Autowired private final ParamsRepo repo;

    public ParamsService(ParamsRepo repo) { this.repo = repo; }

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
}

