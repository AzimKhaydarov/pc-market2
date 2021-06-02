package com.example.pcmarket2.projection;

import com.example.pcmarket2.entity.District;
import com.example.pcmarket2.entity.Region;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = District.class)
public interface CustomDistrict {
    Integer getId();

    String getName();

    Region getRegion();

}
