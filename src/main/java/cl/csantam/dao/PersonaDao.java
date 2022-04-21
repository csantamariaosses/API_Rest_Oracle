package cl.csantam.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.csantam.entity.Persona;

public interface PersonaDao extends JpaRepository<Persona, Integer> {

}
