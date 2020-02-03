package com.bfs.smarttimesheet.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileService {
    void storeFile(MultipartFile file) throws IOException;

    void storePic(MultipartFile file) throws IOException;
}
