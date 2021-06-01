package com.example.pcmarket2.task2.projection;

import com.example.pcmarket2.task2.entity.Article;
import com.sun.xml.internal.ws.api.message.Attachment;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Article.class)
public interface CustomArticle {
    Integer getId();
    String getTitle();
    String getDescription();
    String getUrlLink();
    Attachment getAttachment();
}
