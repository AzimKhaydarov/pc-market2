package com.example.pcmarket2.task2.projection;

import com.example.pcmarket2.task2.entity.User;
import com.example.pcmarket2.task2.entity.UserBasket;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = UserBasket.class)
public interface CustomUserBasket {

    Integer getId();
    Double getAllSum();
    User getUser();
}
