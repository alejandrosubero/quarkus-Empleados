package servicios;

import entyti.Empleado;
import exception.EmpleadoOrIdFound;

import java.util.List;

public interface EmpleadoServicio {

    public Empleado getEmpleadoById(Integer id) throws EmpleadoOrIdFound;
    public Empleado getEmpleadoByEmpleadoNumero(Integer numeroEmpleado);
    public boolean salveEmpleado(Empleado empleado);
    public List<Empleado> getAllEmpleados();

}
