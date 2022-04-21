package cl.csantam.dto;

import java.util.List;

import cl.csantam.entity.Persona;

public class PersonaDto {
	private Persona persona;
	private List<Persona> personas;
	
	public PersonaDto(Persona persona, List<Persona> personas) {
		super();
		this.persona = persona;
		this.personas = personas;
	}

	public PersonaDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public List<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}

	@Override
	public String toString() {
		return "PersonaDto [persona=" + persona + ", personas=" + personas + "]";
	}
	
	
	
	

}
