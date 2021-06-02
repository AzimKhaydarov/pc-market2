package com.example.pcmarket2.repository;

import com.example.pcmarket2.entity.Address;
import com.example.pcmarket2.projection.CustomAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="address", collectionResourceRel = "list_info", excerptProjection = CustomAddress.class)
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
