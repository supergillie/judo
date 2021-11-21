package com.example.budo;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.util.ResourceUtils;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ObliqueStrategies {


    private List<String> listRows;

    public ObliqueStrategies() {
        File file = null;

        try {
            file = ResourceUtils.getFile("classpath:apa.txt");
            if (file.exists()) {
              byte[] fileData = Files.readAllBytes(file.toPath());
              String fileContent = new String(fileData);
              listRows = Files.readAllLines(file.toPath());
              }
            } catch (Exception e) {
              e.printStackTrace();
        }
    }

    public int getRandombumber() {
            return (int) (Math.random() * numberOfLines());
    }

    public String getStrategy() {
        return listRows.get(getRandombumber());
    }

    public int numberOfLines()  {
            return (listRows.size());
    }
}