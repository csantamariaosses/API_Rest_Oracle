package cl.csantam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="regions")
public class Region {
	
	@Id
	@Column( name = "region_id")
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;
	private String  region_name;
	
	
	public Region(Integer id, String region_name) {
		super();
		Id = id;
		this.region_name = region_name;
	}


	public Region() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Integer getId() {
		return Id;
	}


	public void setId(Integer id) {
		Id = id;
	}


	public String getRegion_name() {
		return region_name;
	}


	public void setRegion_name(String region_name) {
		this.region_name = region_name;
	}


	@Override
	public String toString() {
		return "Region [Id=" + Id + ", region_name=" + region_name + "]";
	}
	
	
	
	

	
}
