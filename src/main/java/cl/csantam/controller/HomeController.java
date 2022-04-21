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

import cl.csantam.entity.Region;
import cl.csantam.service.RegionService;



@CrossOrigin( origins = "http://localhost:4200" )
@RestController
@RequestMapping("/api/regions")
public class HomeController {

	@Autowired
	private RegionService regionService;

	@GetMapping
	public List<Region> findAll() {
		return regionService.getAllRegiones();
	}
	
	@GetMapping("/{id}")
	public Region findById( @PathVariable int id ) {
		return regionService.getById(id);
	}
	
	@PostMapping
	public Region save( @RequestBody Region newRegion ) {
		Region region = regionService.save(newRegion);
		return region;
	}
		
	
	@PutMapping("/{id}")
	public Region replaceRegion(@RequestBody Region newRegion, @PathVariable int id) {
		Region region = regionService.getById(id);
		region.setRegion_name(newRegion.getRegion_name() );
		Region region_ = regionService.save(region);
		return region_;
	}
	
	@DeleteMapping("/{id}")
	public void deleteRegion(@PathVariable int id) {
		regionService.delete(id);
	}
	
	
	
}
