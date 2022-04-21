package cl.csantam.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="personas")
public class Persona implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column( name = "persona_id")
	private int     persona_id;
	private String  nombres;
	private String  apellidos;
	
	
	public Persona(int persona_id, String nombres, String apellidos) {
		super();
		this.persona_id = persona_id;
		this.nombres = nombres;
		this.apellidos = apellidos;
	}


	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}


	

	public int getPersona_id() {
		return persona_id;
	}


	public void setPersona_id(int persona_id) {
		this.persona_id = persona_id;
	}


	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Persona [persona_id=" + persona_id + ", nombres=" + nombres + ", apellidos=" + apellidos + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
