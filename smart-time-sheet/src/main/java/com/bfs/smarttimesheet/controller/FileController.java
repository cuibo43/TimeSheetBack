package com.bfs.smarttimesheet.controller;

import com.bfs.smarttimesheet.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class FileController {

    private final FileService fileService;

    @Autowired
    public FileController(FileService fileService) {
        this.fileService = fileService;
    }

    @PostMapping(value = "/summary/files")
    @ResponseStatus(HttpStatus.OK)
    public void handleFileUpload(@RequestParam("file") MultipartFile file) throws IOException {
        fileService.storeFile(file);
    }

    @PostMapping(value = "/summary/pic")
    @ResponseStatus(HttpStatus.OK)
    public void handlePicUpload(@RequestParam("file") MultipartFile file) throws IOException {
        fileService.storePic(file);
    }





}