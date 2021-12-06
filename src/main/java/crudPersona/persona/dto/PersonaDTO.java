package crudPersona.persona.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonaDTO {

	private Long id;
	
	private String nombre;
	private String apellido;
	private String dni;
	private String telefono;
}
