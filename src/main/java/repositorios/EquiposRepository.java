package repositorios;

import entyti.Equipos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EquiposRepository extends CrudRepository<Equipos, Integer> {
    public Optional<Equipos> findById(Integer id);
}
