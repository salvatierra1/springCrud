package crudPersona.persona.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import crudPersona.persona.entity.PersonaEntity;

@Repository
public interface PersonaRepository  extends JpaRepository<PersonaEntity, Long>{

	
}
