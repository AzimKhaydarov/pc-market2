package com.example.pcmarket2.repository;

import com.example.pcmarket2.entity.Characteristics;
import com.example.pcmarket2.projection.CustomCharacteristics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "characteristics", collectionResourceRel = "info_list", excerptProjection = CustomCharacteristics.class)
public interface CharacteristicsRepository extends JpaRepository<Characteristics,Integer> {
}
