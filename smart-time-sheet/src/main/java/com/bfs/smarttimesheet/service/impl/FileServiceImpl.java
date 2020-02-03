package com.bfs.smarttimesheet.service.impl;

import com.bfs.smarttimesheet.service.FileService;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Component
public class FileServiceImpl implements FileService {
  private static final String FILE_DIRECTORY = "D:\\Java Project\\SmartTimeSheet-BackEnd";
  private static final String PIC_DIRECTORY =
          "C:\\Users\\78475\\Desktop\\ANGULAR\\SmartTimeSheet-FrontEnd\\src\\assets";

  public void storeFile(MultipartFile file) throws IOException {
    Path filePath = Paths.get(FILE_DIRECTORY + "\\" + file.getOriginalFilename());
    Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);
  }

  public void storePic(MultipartFile file) throws IOException {
    Path filePath = Paths.get(PIC_DIRECTORY + "\\" + file.getOriginalFilename());
    Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);
  }
}
