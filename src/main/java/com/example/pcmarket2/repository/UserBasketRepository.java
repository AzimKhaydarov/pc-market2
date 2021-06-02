package com.example.pcmarket2.repository;

import com.example.pcmarket2.entity.UserBasket;
import com.example.pcmarket2.projection.CustomUserBasket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "userBasket", collectionResourceRel = "list_info",excerptProjection = CustomUserBasket.class)
public interface UserBasketRepository extends JpaRepository<UserBasket, Integer> {
}
