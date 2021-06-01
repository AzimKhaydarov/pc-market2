package com.example.pcmarket2.task2.repository;

import com.example.pcmarket2.task2.entity.MyTeam;
import com.example.pcmarket2.task2.projection.CustomMyTeam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "my-team", collectionResourceRel = "list_info",excerptProjection = CustomMyTeam.class)
public interface MyTeamRepository extends JpaRepository<MyTeam, Integer> {

}
