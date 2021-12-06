package crudPersona.persona.mapper;

import org.springframework.stereotype.Component;

import crudPersona.persona.dto.PersonaDTO;
import crudPersona.persona.entity.PersonaEntity;

@Component
public class PersonaMapper {
	
	public PersonaEntity personaDTO2Entity(PersonaDTO dto) {
		
		PersonaEntity personaEntity = new PersonaEntity();
		
		personaEntity.setNombre(dto.getNombre());
		personaEntity.setApellido(dto.getApellido());
		personaEntity.setDni(dto.getDni());
		personaEntity.setTelefono(dto.getTelefono());
		
		return personaEntity;
	}
	
	public PersonaDTO personaEntity2DTO(PersonaEntity entity){
		
		PersonaDTO dto = new PersonaDTO();
		
		dto.setId(entity.getId());
		dto.setNombre(entity.getNombre());
		dto.setApellido(entity.getApellido());
		dto.setDni(entity.getDni());
		dto.setTelefono(entity.getTelefono());
		
		return dto;
		
	}
}
