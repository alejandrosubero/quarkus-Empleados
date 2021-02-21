package repositorios;

import entyti.DatosMedicos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DatosMedicosRepository extends CrudRepository <DatosMedicos, Integer> {

    public Optional<DatosMedicos> findById(Integer id);
    public Optional<DatosMedicos> findByHistorialMediconumero(String historialMediconumero);

}
