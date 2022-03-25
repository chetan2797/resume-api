package com.resume.resumemakerapi.helper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.springframework.core.io.ClassPathResource;
import org.springframework.util.ResourceUtils;

public class Template {

    static {
        try{System.out.println(new ClassPathResource("").getInputStream());}catch(Exception e){}
        try{System.out.println(ResourceUtils.getFile("classpath:static/head-data.html").getAbsolutePath());}catch(Exception e){}
        try{System.out.println(ResourceUtils.getFile("classpath:static"));}catch(Exception e){}
        try{System.out.println(ResourceUtils.getFile("classpath:static").toPath());}catch(Exception e){}
        try{System.out.println(ResourceUtils.getFile("classpath:").toPath().toAbsolutePath());}catch(Exception e){}
        try{System.out.println(ResourceUtils.getFile("classpath:").toPath().toFile());}catch(Exception e){}
        try{System.out.println(ResourceUtils.getFile("classpath:").exists());}catch(Exception e){}
        try{System.out.println(ResourceUtils.getFile("classpath:static").toPath().toAbsolutePath());}catch(Exception e){}
        try{System.out.println(ResourceUtils.getFile("classpath:static").toPath().toUri());}catch(Exception e){}
        try{System.out.println(ResourceUtils.getFile("classpath:static").toPath().toString());}catch(Exception e){}
        try{System.out.println(ResourceUtils.getFile("classpath:static").toPath().toRealPath());}catch(Exception e){}
        try {
            HEAD = new String(Files.readAllBytes(java.nio.file.Paths.get(new ClassPathResource("static").getFile().getAbsolutePath()+File.separator+"head-data.html")));
            System.out.println("yes");
        } catch (IOException e) {
        }
    }
    
    public static String TOP = "<!DOCTYPE html><html>";

    public static String HEAD;

    public static String BODY = "<body>";

    public static String FOOTER = "</body></html>";

}
