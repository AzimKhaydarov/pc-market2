package com.example.pcmarket2.repository;

import com.example.pcmarket2.entity.Supplier;
import com.example.pcmarket2.projection.CustomSupplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "supplier", collectionResourceRel = "list_info",excerptProjection = CustomSupplier.class)
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}
