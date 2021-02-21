package repositorios;

import entyti.Empleado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmpleadoRepository extends CrudRepository<Empleado, Integer> {
    public Optional<Empleado> findById(Integer id);
    public Optional<Empleado> findByEmpleadoNumero(Integer numeroEmpleado);

}
