package com.example.pcmarket2.task2.projection;

import com.example.pcmarket2.task2.entity.Category;
import com.example.pcmarket2.task2.entity.Product;
import com.sun.xml.internal.ws.api.message.Attachment;
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
