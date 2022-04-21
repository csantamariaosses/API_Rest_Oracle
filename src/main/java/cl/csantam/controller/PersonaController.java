package cl.csantam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.csantam.entity.Persona;
import cl.csantam.entity.Region;
import cl.csantam.service.PersonaService;

@CrossOrigin( origins = "http://localhost:4200", maxAge=3600 )
@RestController
@RequestMapping("/api/personas")
public class PersonaController {
	
	@Autowired
	private PersonaService personaService;
	
	@GetMapping
	public List<Persona> getAll() {
		return personaService.getAll().getPersonas();
	}
	

	@GetMapping("/{id}")
	public Persona getBiId(@PathVariable int id) {
		return personaService.getById(id).getPersona();
	}
	
	@PostMapping
	public Persona save( @RequestBody Persona persona ) {
		personaService.save(persona);
		return persona;
	}
	
	
	@PutMapping("/{id}")
	public Persona updatePersona(@RequestBody Persona persona, @PathVariable int id) {
		Persona persona_ = personaService.getById( id ).getPersona();
		persona_.setNombres( persona.getNombres());
		persona_.setApellidos( persona.getApellidos());
		
		personaService.save( persona_ );
		return persona_;
	}
	
	@DeleteMapping("/{id}")
	public void deletePersona(@PathVariable int id) {		
		personaService.delete(id);
	}

	

}
