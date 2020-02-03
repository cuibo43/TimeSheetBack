package com.bfs.smarttimesheet.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface FileService {
    void storeFile(MultipartFile file) throws IOException;
    void storePic(MultipartFile file) throws IOException;

//    Resource getFileSystem(String filename, HttpServletResponse response);
}

