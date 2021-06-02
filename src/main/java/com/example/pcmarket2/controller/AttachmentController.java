package com.example.pcmarket2.controller;

import com.example.pcmarket2.entity.Attachment;
import com.example.pcmarket2.service.AttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/attachment")
public class AttachmentController {
    @Autowired
    AttachmentService attachmentService;
    @PostMapping
    public Attachment add(MultipartHttpServletRequest request) throws IOException {
        Attachment add = attachmentService.add(request);
        return add;
    }
    @GetMapping("/{id}")
    public void getById(@PathVariable Integer id, HttpServletResponse response) throws IOException {
        attachmentService.getById(id, response);
    }
    @DeleteMapping("/{id}")
    public void deleteById(Integer id){
        attachmentService.deleteById(id);
    }

}
