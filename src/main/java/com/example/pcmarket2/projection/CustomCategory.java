package com.example.pcmarket2.projection;

import com.example.pcmarket2.entity.Category;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Category.class)
public interface CustomCategory {
    Integer getId();
    String getName();
    Category getCategory();
}
