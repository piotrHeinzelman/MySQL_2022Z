package pl.heinzelman.dbmodule.dict;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IssueService extends AbsSimpleDictService<Issue, IssueRepo> {

    @Autowired IssueRepo repo;
    public IssueService(IssueRepo repo) { super(repo); }
}
