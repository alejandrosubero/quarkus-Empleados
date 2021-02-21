package repositorios;

import entyti.Direccion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DireccionRepository extends CrudRepository<Direccion, Integer> {
    public Optional<Direccion> findById(Integer id);
    public Optional<Direccion> findByCodigoDeArea(String codigoDeArea);
}
