package co.usa.ciclo3.ciclo3.repository;

import java.util.List;
import java.util.Optional;
import co.usa.ciclo3.ciclo3.model.Ortopedic;
import co.usa.ciclo3.ciclo3.repository.crud.OrtopedicCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrtopedicRepository {

    @Autowired
    private OrtopedicCrudRepository CrudRepository;

    public List<Ortopedic> getAll(){return (List<Ortopedic>) CrudRepository.findAll();}
    public Optional <Ortopedic> getOrtopedic (int id){return CrudRepository.findById(id);}
    public Ortopedic save(Ortopedic ortopedic){return CrudRepository.save(ortopedic);}
    public void delete(Ortopedic ortopedic) {CrudRepository.delete(ortopedic);}
}