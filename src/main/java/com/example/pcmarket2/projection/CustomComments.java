package com.example.pcmarket2.projection;

import com.example.pcmarket2.entity.Comments;
import com.example.pcmarket2.entity.Product;
import com.example.pcmarket2.entity.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Comments.class)
public interface CustomComments {
    Integer getId();
    String getBody();
    Integer getNumberStar();
    User getUser();
    Product getProduct();
}
