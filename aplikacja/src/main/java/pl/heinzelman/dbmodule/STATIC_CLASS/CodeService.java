package pl.heinzelman.dbmodule.STATIC_CLASS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class CodeService implements CodeRepo {

    @Autowired
    private final CodeRepo codeRepo;

    public CodeService(CodeRepo codeRepo) { this.codeRepo = codeRepo; }

    public boolean existsByCodeString(String codeString) {
        return codeRepo.findByCodeString( codeString.trim().toUpperCase() ).isPresent();
    }


    @Override
    public void insertWithID( Long codeId, String codeString ) {
        //System.out.println( codeId + " : " + codeString );
        try { codeRepo.insertWithID(codeId, codeString); } catch ( Exception e ){};
    }

    @Override
    public Long getLastExactId() {
        return codeRepo.getLastExactId();
    }

    @Override
    public List<Code> likeByCodeString(String codeString) {
        if ( codeString.trim().length()<2) return Collections.emptyList();
        return codeRepo.likeByCodeString( "%"+codeString.trim().toUpperCase()+"%" );
    }

    @Override
    public Optional<Code> findByCodeString(String codeString) {
        return codeRepo.findByCodeString( codeString.trim().toUpperCase() );
    }

    @Override
    public <S extends Code> S save(S s) {
        return codeRepo.save( s );
    }

    @Override
    public long count() { return codeRepo.count(); }

    @Override
    public boolean existsById(Long aLong) {
        return codeRepo.existsById( aLong );
    }

    @Override public void deleteById(Long aLong) {
        codeRepo.deleteById( aLong );
    }

    @Override
    public Optional<Code> findById(Long aLong) {
        return codeRepo.findById( aLong );
    }

    @Override
    public Iterable<Code> findAll() { return codeRepo.findAll(); }

    @Override
    public Iterable<Code> findAllWithInactive() { return codeRepo.findAllWithInactive(); }

    @Override public void deleteAll() { codeRepo.deleteAll(); }

    // ******** FAKE *************



    @Override public <S extends Code> Iterable<S> saveAll(Iterable<S> iterable) { return codeRepo.saveAll( iterable ); }
    @Override public Iterable<Code> findAllById(Iterable<Long> iterable) { return null; }
    @Override public void delete( Code code ) { }
    @Override public void deleteAll(Iterable<? extends Code> iterable) { }


    @Override
    public void insertWithIDAndEAN(Long id, Long exactId, String codeString, String EAN) {
        codeString = codeString.trim().toUpperCase();
        codeRepo.insertWithIDAndEAN( id, exactId, codeString, EAN );
    }
}
