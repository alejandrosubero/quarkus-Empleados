package repositorios;

import entyti.DatosPersonales;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DatosPersonalesRepository extends CrudRepository<DatosPersonales, Integer> {
    public Optional<DatosPersonales> findById(Integer id);
    public Optional<DatosPersonales> findByTelefonoFijo(String telefonoFijo);
}