package pl.heinzelman.dbmodule.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.stream.events.Comment;
import java.util.Optional;

@Service
public class CommentService implements CommentRepo {

    @Autowired private final CommentRepo repo;

    public CommentService(CommentRepo repo) {
        this.repo = repo;
    }

    public Comm addComment( Long code_id, String comm ){
        return repo.save( new Comm( code_id , comm ) );
    }


    @Override
    public <S extends Comm> S save(S s) {
        return repo.save(s);
    }

    @Override
    public <S extends Comm> Iterable<S> saveAll(Iterable<S> iterable) {
        return repo.saveAll(iterable);
    }

    @Override
    public Optional<Comm> findById(Long aLong) {
        return repo.findById(aLong);
    }

    @Override
    public boolean existsById(Long aLong) {
        return repo.existsById(aLong);
    }

    @Override
    public Iterable<Comm> findAll() {
        return repo.findAll();
    }

    @Override
    public Iterable<Comm> findAllById(Iterable<Long> iterable) {
        return repo.findAllById(iterable);
    }

    @Override
    public long count() {
        return repo.count();
    }

    @Override
    public void deleteById(Long aLong) {
        repo.deleteById(aLong);
    }

    @Override
    public void delete(Comm comm) {
        repo.delete(comm);
    }

    @Override
    public void deleteAll(Iterable<? extends Comm> iterable) {
        repo.deleteAll(iterable);
    }

    @Override
    public void deleteAll() {
        repo.deleteAll();
    }
}

