package pl.heinzelman.dbmodule.Entity;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.xml.stream.events.Comment;

@Repository
public interface CommentRepo extends CrudRepository<Comm, Long> {

}


