package com.example.pcmarket2.projection;

import com.example.pcmarket2.entity.Address;
import com.example.pcmarket2.entity.District;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Address.class)
public interface CustomAddress {
    Integer getId();
    String getStreet();
    String getHomeNumber();
    District getDistrict();

}