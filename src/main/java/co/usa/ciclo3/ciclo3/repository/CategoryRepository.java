package co.usa.ciclo3.ciclo3.repository;

import java.util.List;
import java.util.Optional;
import co.usa.ciclo3.ciclo3.model.Category;
import co.usa.ciclo3.ciclo3.repository.crud.CategoryCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryRepository {

    @Autowired
    private  CategoryCrudRepository CrudRepository;
    public List<Category> getAll(){ return (List<Category>) CrudRepository.findAll();}
    public Optional<Category> getCategory(int id) {return CrudRepository.findById(id);}
    public Category save(Category category) {return CrudRepository.save(category);}
    public void delete(Category category){CrudRepository.delete(category);}
}