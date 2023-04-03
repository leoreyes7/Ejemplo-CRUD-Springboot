
package com.ejemplorest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejemplorest.entity.Empleado;

@Repository
public interface EmpleadoRepo extends JpaRepository<Empleado, Integer>{

}
