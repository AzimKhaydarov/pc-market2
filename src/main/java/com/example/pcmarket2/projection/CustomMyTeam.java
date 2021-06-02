package com.example.pcmarket2.projection;

import com.example.pcmarket2.entity.Attachment;
import com.example.pcmarket2.entity.MyTeam;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = MyTeam.class)
public interface CustomMyTeam {
    Integer getId();
    String getName();
    String getOccupation();
    Attachment getAttachment();
}
