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
    private ServletContext servletContext;

    @Autowired
    public FileController(FileService fileService) {
        this.fileService = fileService;
    }

    @PostMapping(value = "/summary/files")
    @ResponseStatus(HttpStatus.OK)
    public void handleFileUpload(@RequestParam("file") MultipartFile file) throws IOException {
        servletContext.setAttribute("file",file.getOriginalFilename());
        System.out.println((String)servletContext.getAttribute("file"));
        fileService.storeFile(file);
    }

//    @GetMapping(value = "/files/system/{filename}", produces = "text/csv; charset=utf-8")
//    @ResponseStatus(HttpStatus.OK)
//    public Resource getFileFromFileSystem(@PathVariable String filename, HttpServletResponse response) {
//        return fileService.getFileSystem(filename,response);
//    }



}