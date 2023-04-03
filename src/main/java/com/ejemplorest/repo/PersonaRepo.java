
package com.ejemplorest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejemplorest.entity.Persona;

@Repository
public interface PersonaRepo extends JpaRepository<Persona, Integer>{

}
