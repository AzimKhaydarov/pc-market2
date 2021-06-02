package com.example.pcmarket2.repository;

import com.example.pcmarket2.entity.Region;
import com.example.pcmarket2.projection.CustomRegion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "region", collectionResourceRel = "list_info",excerptProjection = CustomRegion.class)
public interface RegionRepository extends JpaRepository<Region, Integer> {

}
