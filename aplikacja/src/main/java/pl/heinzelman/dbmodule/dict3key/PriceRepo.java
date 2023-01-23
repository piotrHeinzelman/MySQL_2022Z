package pl.heinzelman.dbmodule.dict3key;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.heinzelman.dbmodule.dict2Key.NameLong;

@Repository
public interface PriceRepo extends CrudRepository<Price, Key3CodeLangIssue> {


}
