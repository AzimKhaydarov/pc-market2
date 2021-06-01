package com.example.pcmarket2.task2.projection;

import com.example.pcmarket2.task2.entity.MyTeam;
import com.sun.xml.internal.ws.api.message.Attachment;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = MyTeam.class)
public interface CustomMyTeam {
    Integer getId();
    String getName();
    String getOccupation();
    Attachment getAttachment();
}
