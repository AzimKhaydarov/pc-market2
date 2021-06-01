package com.example.pcmarket2.task2.projection;

import com.example.pcmarket2.task2.entity.Region;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Region.class)
public interface CustomRegion {
    Integer getId();

    String getName();
}
