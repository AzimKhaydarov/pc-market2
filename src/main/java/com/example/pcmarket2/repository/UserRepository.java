package com.example.pcmarket2.repository;

import com.example.pcmarket2.entity.User;
import com.example.pcmarket2.projection.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "user", collectionResourceRel = "list_info",excerptProjection = CustomUser.class)
public interface UserRepository extends JpaRepository<User, Integer> {

}
