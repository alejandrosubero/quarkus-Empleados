package com.subero.controller;

import entyti.Empleado;
import exception.EmpleadoOrIdFound;
import org.jboss.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import servicios.EmpleadoServicio;

import java.util.List;

@RestController
@RequestMapping("/Empleados")
public class EmpleadoController {

    private static final org.jboss.logging.Logger LOG = Logger.getLogger(EmpleadoController.class);

    @Autowired
    private EmpleadoServicio empleadoServicio;

    @GetMapping("/Modulo")
    public String EmpleadosmoduloTest() {
        return "<h1> Empleados Modulo</h1>";
    }

    @GetMapping("/getAllEmpleados")
    public List<Empleado> getEmpleados() {
        return empleadoServicio.getAllEmpleados();
    }

    @GetMapping("/empleado/{id}")
    public Empleado getEmpleadByID(@PathVariable("id") Integer id) throws EmpleadoOrIdFound {
        LOG.info("Se inicia busqueda del epleado");
        Empleado empleado = empleadoServicio.getEmpleadoById(id);
        return empleado;
    }

    @GetMapping("/empleado/{legajo}")
    public Empleado getEmpleadoByEmpleadoNumero(@PathVariable("legajo") Integer numeroEmpleado){
        return empleadoServicio.getEmpleadoByEmpleadoNumero(numeroEmpleado);
    }


    @PostMapping("/salve")
    public boolean postSaveEmpleado(@RequestBody Empleado empleadoAsalvar) {
        LOG.info("INICIA LA COMBOCACON A SALVAR EL EMPLEADO");
        boolean resultado = empleadoServicio.salveEmpleado(empleadoAsalvar);
        LOG.info("FINALIZA  LA COMBOCACON A SALVAR EL EMPLEADO");
        return resultado;
    }
}
