package crudPersona.persona.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import crudPersona.persona.dto.PersonaDTO;
import crudPersona.persona.service.PersonaService;


@RestController
@RequestMapping("invitado")
public class PersonaController {
	
	
	@Autowired
	private PersonaService personaService;
	
	@PostMapping
	public ResponseEntity<PersonaDTO>save(@RequestBody PersonaDTO persona){
		
		PersonaDTO personaGuardada = personaService.save(persona);
		return ResponseEntity.status(HttpStatus.CREATED).body(personaGuardada);
		
	}
}
