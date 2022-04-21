package cl.csantam.dto;

import java.util.List;

import cl.csantam.entity.Region;

public class RegionDto {
	private Region region;
	private List<Region> regions;
	
	
	
	
	public RegionDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public RegionDto(Region region, List<Region> regions) {
		super();
		this.region = region;
		this.regions = regions;
	}
	public Region getRegion() {
		return region;
	}
	public void setRegion(Region region) {
		this.region = region;
	}
	public List<Region> getRegions() {
		return regions;
	}
	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}


	@Override
	public String toString() {
		return "RegionDto [region=" + region + ", regions=" + regions + "]";
	}
	
	

}
