package cl.csantam.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.csantam.entity.Region;

public interface RegionDao extends JpaRepository<Region, Integer> {

}
