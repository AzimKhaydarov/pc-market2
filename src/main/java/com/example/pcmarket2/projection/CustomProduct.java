package com.example.pcmarket2.projection;

import com.example.pcmarket2.entity.Attachment;
import com.example.pcmarket2.entity.Category;
import com.example.pcmarket2.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Product.class)
public interface CustomProduct {
    Integer getId();
    String getName();
    String getDescription();
    Attachment getAttachment();
    Double getPrice();
    Category getCategory();
    boolean isActive();
}
