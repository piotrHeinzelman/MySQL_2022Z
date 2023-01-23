package pl.heinzelman.dbmodule.dict3key;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PriceService implements PriceRepo {

    @Autowired private final PriceRepo priceRepo;
    public PriceService(PriceRepo priceRepo) { this.priceRepo = priceRepo; }


    @Override public <S extends Price> S save(S entity) { return priceRepo.save(entity); }
    @Override public <S extends Price> Iterable<S> saveAll(Iterable<S> entities) { return priceRepo.saveAll(entities); }
    @Override public Optional<Price> findById(Key3CodeLangIssue key3CodeLangIssue) { return priceRepo.findById(key3CodeLangIssue); }
    @Override public boolean existsById(Key3CodeLangIssue key3CodeLangIssue) { return priceRepo.existsById(key3CodeLangIssue); }
    @Override public Iterable<Price> findAll() { return priceRepo.findAll(); }
    @Override public Iterable<Price> findAllById(Iterable<Key3CodeLangIssue> key3CodeLangIssues) { return priceRepo.findAllById(key3CodeLangIssues); }
    @Override public long count() { return priceRepo.count(); }
    @Override public void deleteById(Key3CodeLangIssue key3CodeLangIssue) { priceRepo.deleteById(key3CodeLangIssue); }
    @Override public void delete(Price entity) { priceRepo.delete(entity); }
    @Override public void deleteAllById(Iterable<? extends Key3CodeLangIssue> key3CodeLangIssues) { priceRepo.deleteAllById(key3CodeLangIssues); }
    @Override public void deleteAll(Iterable<? extends Price> entities) { priceRepo.deleteAll(entities); }
    @Override public void deleteAll() { priceRepo.deleteAll(); }

}