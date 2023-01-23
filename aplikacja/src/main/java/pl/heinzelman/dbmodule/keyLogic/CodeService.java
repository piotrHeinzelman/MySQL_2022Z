package pl.heinzelman.dbmodule.keyLogic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CodeService implements CodeRepo {

    @Autowired
    private final CodeRepo codeRepo;

    public CodeService(CodeRepo codeRepo) { this.codeRepo = codeRepo; }

    @Override
    public <S extends Code> S save(S entity) {
        return codeRepo.save( entity );
    }

    @Override
    public <S extends Code> Iterable<S> saveAll(Iterable<S> entities) {
        return codeRepo.saveAll( entities );
    }

    @Override
    public Optional<Code> findById(Long aLong) {
        return codeRepo.findById(aLong);
    }

    @Override
    public boolean existsById(Long aLong) {
        return codeRepo.existsById(aLong);
    }

    @Override
    public Iterable<Code> findAll() {
        return codeRepo.findAll();
    }

    @Override
    public Iterable<Code> findAllById(Iterable<Long> longs) {
        return codeRepo.findAllById( longs );
    }

    @Override
    public long count() {
        return codeRepo.count();
    }

    @Override
    public void deleteById( Long aLong ) {
        codeRepo.deleteById( aLong );
    }

    @Override
    public void delete( Code entity ) {
        codeRepo.delete( entity );
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {
        codeRepo.deleteAllById( longs );
    }

    @Override
    public void deleteAll(Iterable<? extends Code> entities) {
        codeRepo.deleteAll( entities );
    }

    @Override
    public void deleteAll() {
        codeRepo.deleteAll();
    }
}
