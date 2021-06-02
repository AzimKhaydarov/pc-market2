package com.example.pcmarket2.service;

import com.example.pcmarket2.entity.Attachment;
import com.example.pcmarket2.entity.AttachmentContent;
import com.example.pcmarket2.repository.AttachmentContentRepository;
import com.example.pcmarket2.repository.AttachmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Iterator;
import java.util.Optional;

@Service
public class AttachmentService {
    @Autowired
    AttachmentRepository attachmentRepository;
    @Autowired
    AttachmentContentRepository attachmentContentRepository;

    public Attachment add(MultipartHttpServletRequest request) throws IOException {
        Iterator<String> fileNames = request.getFileNames();
        while (fileNames.hasNext()) {
            MultipartFile file = request.getFile(fileNames.next());
            if (file != null) {
                Attachment attachment = new Attachment();
                attachment.setName(file.getOriginalFilename());
                attachment.setSize(file.getSize());
                attachment.setContentType(file.getContentType());
                Attachment saved = attachmentRepository.save(attachment);
                AttachmentContent attachmentContent = new AttachmentContent();
                attachmentContent.setAttachment(saved);
                attachmentContent.setBytes(file.getBytes());
                attachmentContentRepository.save(attachmentContent);
                return saved;
            }
        }
        return new Attachment();
    }

    public void getById(Integer id, HttpServletResponse response) throws IOException {
        Optional<Attachment> optionalAttachment = attachmentRepository.findById(id);
        if (optionalAttachment.isPresent()) {
            Attachment attachment = optionalAttachment.get();
            Optional<AttachmentContent> optionalAttachmentContent = attachmentContentRepository.findById(attachment.getId());
            if (optionalAttachmentContent.isPresent()) {
                AttachmentContent attachmentContent = optionalAttachmentContent.get();
                response.setHeader("Content-Disposition", "attachment;filename=\"" + attachment.getName() + "\"");
                response.setContentType(attachment.getContentType());
                FileCopyUtils.copy(attachmentContent.getBytes(), response.getOutputStream());
            }
        }
    }

    public void deleteById(Integer id) {
        Optional<Attachment> optionalAttachment = attachmentRepository.findById(id);
        if (optionalAttachment.isPresent()) {
            Attachment attachment = optionalAttachment.get();
            Optional<AttachmentContent> optionalAttachmentContent = attachmentContentRepository.findById(attachment.getId());
            if (optionalAttachmentContent.isPresent()) {
                AttachmentContent attachmentContent = optionalAttachmentContent.get();
                attachmentContentRepository.delete(attachmentContent);
            }
            attachmentRepository.delete(attachment);
        }

    }
}
