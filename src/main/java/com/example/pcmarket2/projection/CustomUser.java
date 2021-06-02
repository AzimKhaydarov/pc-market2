package com.example.pcmarket2.projection;

import com.example.pcmarket2.entity.Address;
import com.example.pcmarket2.entity.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = User.class)
public interface CustomUser {
    Integer getId();

    String getFullName();

    String getEmail();

    Address getAddress();
}
