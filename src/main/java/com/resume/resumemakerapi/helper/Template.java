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
            try{System.out.println(new ClassPathResource("").getInputStream());}catch(Exception e){}
            try{System.out.println(ResourceUtils.getFile("classpath:static/head-data.html").getAbsolutePath());}catch(Exception e){}
            try{System.out.println(ResourceUtils.getFile("classpath:static"));}catch(Exception e){}
            try{System.out.println(ResourceUtils.getFile("classpath:static").toPath());}catch(Exception e){}

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
