package crudPersona.persona.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crudPersona.persona.dto.PersonaDTO;
import crudPersona.persona.entity.PersonaEntity;
import crudPersona.persona.mapper.PersonaMapper;
import crudPersona.persona.repository.PersonaRepository;
import crudPersona.persona.service.PersonaService;

@Service
public class PersonaImpl implements PersonaService {
	
	@Autowired
	private PersonaMapper personaMapper;
	
	@Autowired
	private PersonaRepository personaRepository;
	
	
	public PersonaDTO save(PersonaDTO dto) {
		
		
		PersonaEntity entity = personaMapper.personaDTO2Entity(dto);
		
		PersonaEntity entitySaved = personaRepository.save(entity);
		
		PersonaDTO result = personaMapper.personaEntity2DTO(entitySaved);
		
		return result;
		
		
	}
	
}
