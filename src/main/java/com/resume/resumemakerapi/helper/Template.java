package com.resume.resumemakerapi.helper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import com.resume.resumemakerapi.ResumeMakerApiApplication;

import org.springframework.core.io.ClassPathResource;
import org.springframework.util.ResourceUtils;

public class Template {

    static {
        try {
            ResumeMakerApiApplication obj = new ResumeMakerApiApplication();
            
            System.out.println(obj.getClass().getClassLoader().getResourceAsStream(""));
            System.out.println(new ClassPathResource("filename").getInputStream());
            System.out.println(ResourceUtils.getFile("classpath:static/head-data.html").getAbsolutePath());
            System.out.println(ResourceUtils.getFile("classpath:static"));
            System.out.println(ResourceUtils.getFile("classpath:static").toPath());

            HEAD = new String(Files.readAllBytes(java.nio.file.Paths.get(new ClassPathResource("static").getFile().getAbsolutePath()+File.separator+"head-data.html")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static String TOP = "<!DOCTYPE html><html>";

    public static String HEAD;

    public static String BODY = "<body>";

    public static String FOOTER = "</body></html>";

}
