package com.example.pcmarket2.task2.repository;

import com.example.pcmarket2.task2.entity.District;
import com.example.pcmarket2.task2.projection.CustomDistrict;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "district", collectionResourceRel = "list_info",excerptProjection = CustomDistrict.class)
public interface DistrictRepository extends JpaRepository<District, Integer> {

}
