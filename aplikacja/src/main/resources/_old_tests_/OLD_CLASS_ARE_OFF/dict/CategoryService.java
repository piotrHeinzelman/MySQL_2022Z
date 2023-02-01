package pl.heinzelman.dbmodule.dict;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService extends AbsSimpleDictService<Category, CategoryRepo> {

    @Autowired CategoryRepo repo;
    public CategoryService(CategoryRepo repo) { super(repo); }

    public List<Category> likeByCodeString(String str) {
        return repo.likeByCodeString(str);
    }

}
