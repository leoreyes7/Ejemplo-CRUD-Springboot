
package com.ejemplorest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplorest.entity.Empleado;
import com.ejemplorest.repo.EmpleadoRepo;

@Service
public class EmpleadoService{

    @Autowired
    private EmpleadoRepo empleadorepo;

    public Empleado insertar(Empleado emp){
        return empleadorepo.save(emp);
    }

    public Empleado actualizar(Empleado emp){
        return empleadorepo.save(emp);
    }

    public List<Empleado> listar(){
        return empleadorepo.findAll();
    }

    public void eliminar(Empleado emp){
        empleadorepo.delete(emp);
    }

}
