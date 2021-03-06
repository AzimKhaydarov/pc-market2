package com.example.pcmarket2.repository;

import com.example.pcmarket2.entity.Category;
import com.example.pcmarket2.projection.CustomCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="category", collectionResourceRel = "List_info", excerptProjection = CustomCategory.class)
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
