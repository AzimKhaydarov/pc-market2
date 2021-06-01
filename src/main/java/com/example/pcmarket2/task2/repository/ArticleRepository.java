package com.example.pcmarket2.task2.repository;

import com.example.pcmarket2.task2.entity.Article;
import com.example.pcmarket2.task2.projection.CustomArticle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "article", collectionResourceRel = "list_info",excerptProjection = CustomArticle.class)
public interface ArticleRepository extends JpaRepository<Article, Integer> {


}
