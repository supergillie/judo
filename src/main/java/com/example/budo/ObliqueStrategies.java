package com.example.budo;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.ResourceUtils;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObliqueStrategies {


    private List<String> listRows;
    private String[] alistRows;

    public ObliqueStrategies() {
        File file = null;

        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAA startar oblique");

        try {
            InputStream resource = new ClassPathResource("apa.txt").getInputStream();
            byte[] binaryData = FileCopyUtils.copyToByteArray(resource);
            String fuu = new String(binaryData, StandardCharsets.UTF_8);
            String[] alistRows = fuu.split("\\r?\\n");
            listRows = Arrays.asList(alistRows);

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