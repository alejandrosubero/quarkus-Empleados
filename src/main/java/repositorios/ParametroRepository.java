package repositorios;

import entyti.Parametro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ParametroRepository extends CrudRepository<Parametro, Integer> {

    public Optional<Parametro> findById(Integer id);

    public Optional<Parametro> findByClave(String clave);

    public Optional<Parametro> findByTipoDeHorario(String tipoDeHorario);

    public Optional<Parametro> findByTipoParametro(String tipoParametro);
}
