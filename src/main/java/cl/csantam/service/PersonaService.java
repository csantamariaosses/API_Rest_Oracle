package cl.csantam.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.csantam.dao.PersonaDao;
import cl.csantam.dto.PersonaDto;
import cl.csantam.entity.Persona;


@Service
public class PersonaService {
	
	@Autowired
	private PersonaDao personaDao;
	
	@Transactional(readOnly=true)
	public PersonaDto getAll() {
		List<Persona> personas = personaDao.findAll();
		PersonaDto personaDto = new PersonaDto( new Persona(), personas);
		return personaDto;
	}
	
	@Transactional(readOnly=true)
	public PersonaDto getById(int id) {
		Persona persona = personaDao.findById(id).orElse(null);	
		PersonaDto personaDto = new PersonaDto( persona, null);
		return personaDto;
	}
	
	@Transactional(readOnly=false)
	public PersonaDto save( Persona persona ) {
		Persona persona_ = personaDao.save( persona );
		PersonaDto personaDto = new PersonaDto( persona_, null);
		return personaDto;
	}

	@Transactional(readOnly=false)
	public PersonaDto delete( int id ) {
		Persona persona = personaDao.findById(id).orElse(null);
		if( persona != null ) {
			personaDao.delete(persona);
		}
		
		PersonaDto personaDto = new PersonaDto( persona, null);
		return personaDto;
	}
	
	@Transactional(readOnly=false)
	public PersonaDto actualizar( Persona persona ) {
   	    PersonaDto personaDto = new PersonaDto();
   	    Persona persona_ = personaDao.findById( persona.getPersona_id()).orElse(null);
        
        if( persona_  != null ) {
       	    personaDao.save( persona );
        }
        personaDto.setPersona(persona_);
        return personaDto;
   }
	
	
}
