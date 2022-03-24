package com.resume.resumemakerapi.helper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.springframework.core.io.ClassPathResource;

public class Template {

    static {
        try {
            byte[] byteArrays = Files.readAllBytes(
                    Path.of(new ClassPathResource("static").getFile().getAbsolutePath()+File.separator+"head-data.html")
            );
            HEAD = new String(byteArrays);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static String TOP = "<!DOCTYPE html><html>";

    public static String HEAD;

    public static String BODY = "<body>";

    public static String FOOTER = "</body></html>";

}
