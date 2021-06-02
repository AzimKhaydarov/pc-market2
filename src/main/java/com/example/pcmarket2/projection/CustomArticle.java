package com.example.pcmarket2.projection;

import com.example.pcmarket2.entity.Article;
import com.example.pcmarket2.entity.Attachment;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Article.class)
public interface CustomArticle {
    Integer getId();
    String getTitle();
    String getDescription();
    String getUrlLink();
    Attachment getAttachment();
}
