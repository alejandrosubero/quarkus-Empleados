package serviceImpl;

import entyti.Empleado;
import exception.EmpleadoOrIdFound;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositorios.EmpleadoRepository;
import servicios.EmpleadoServicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class EmpleadoServiceImplement implements EmpleadoServicio {


    private static final Logger LOG = Logger.getLogger(EmpleadoServiceImplement.class);

    @Autowired
    private EmpleadoRepository empleadoRepository;


    @Override
    public Empleado getEmpleadoById(Integer id) throws EmpleadoOrIdFound {
        Empleado empleado = empleadoRepository.findById(id).orElseThrow(() -> new EmpleadoOrIdFound("no existe el id"));
        return empleado;
    }

    @Override
    public Empleado getEmpleadoByEmpleadoNumero(Integer numeroEmpleado) {
        return null;
    }


    @Override
    public boolean salveEmpleado(Empleado empleado) {
        try {
            LOG.info("LA IMPL DEL SERVICIO COMBOCA AL SALVAR DEL REPOSITORY.....");
            empleadoRepository.save(empleado);
            LOG.info("FINALIZA  LA COMBOCACON A SALVAR EL EMPLEADO");
            return true;
        }catch (Exception e){
            LOG.info("OCURRE UN ERROR AL SALVAR EL EMPLEADO");
            LOG.info("EL ERROR O EXCEPTION: "+ e);
            LOG.info("NO SE SALVA");
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Empleado> getAllEmpleados() {
       List<Empleado> empleados = new ArrayList<>();
        empleadoRepository.findAll().forEach(x-> empleados.add(x));
       Collections.sort(empleados);
        return empleados;
    }

}
