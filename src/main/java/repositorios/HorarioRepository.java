package repositorios;

import entyti.Horario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HorarioRepository extends CrudRepository<Horario, Integer> {
    public Optional<Horario> findById(Integer id);
}