package pl.heinzelman.dbmodule.Enums;


import org.springframework.stereotype.Service;
import pl.heinzelman.dbmodule.Enums.Lang;

import java.util.List;
import java.util.Optional;

@Service
public class LangService  {

     public <S extends Lang> S save(S entity) {return null;}
     public <S extends Lang> Iterable<S> saveAll(Iterable<S> entities) {return null;}

     public Optional<Lang> findById(   Long aLong) { return Optional.of(Lang.getById( aLong ));}
     public Optional<Lang> findByCode( String code ) { return Optional.of(Lang.getByCode( code ));}
     public boolean existsById(Long aLong) { return (Lang.getById(aLong))!=null; }
     public Iterable<Lang> findAll() { return List.of(Lang.values()); }
     public Iterable<Lang> findAllById(Iterable<Long> longs) { return null; }
     public long count() { return Lang.values().length; }
     public void deleteById(Long aLong) { }
     public void delete(Lang entity) {}
     public void deleteAllById(Iterable<? extends Long> longs) {}
     public void deleteAll(Iterable<? extends Lang> entities) {}
     public void deleteAll() {}

}
