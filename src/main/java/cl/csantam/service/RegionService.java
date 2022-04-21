package cl.csantam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import cl.csantam.dao.RegionDao;
import cl.csantam.dto.RegionDto;
import cl.csantam.entity.Region;

@Service
public class RegionService {
	
	@Autowired
	RegionDao regionDao;
	
	@Transactional(readOnly=true)
	public RegionDto getAll() {
		List<Region> regions = regionDao.findAll();
		
		RegionDto regionDto = new RegionDto(new Region(), regionDao.findAll());
	    return regionDto;
	}
	
	@Transactional(readOnly=true)
	public List<Region> getAllRegiones() {
		List<Region> regions = regionDao.findAll();		
	    return regions;
	}
	
	@Transactional(readOnly=true)
	public Region getById( int id ) {
		Region region = regionDao.findById(id).orElse(new Region());
		return region;
	}
	
	@Transactional(readOnly=false)
	public Region save( Region region ) {
		Region region_ = regionDao.save( region );
		return region_;
	}
	
	@Transactional(readOnly=false)
	public Region delete( int id) {
		Region region = regionDao.findById(id).orElse(null);
		if( region != null ) {
			try{
				regionDao.delete( region );	
			} catch( Exception exc ) {
				System.out.print("************* Fallo la eliminacion");
				throw new ResponseStatusException(
				           HttpStatus.NOT_MODIFIED, "Fallo Delete");
			}
						
		}

		return region;
	}

	
}
