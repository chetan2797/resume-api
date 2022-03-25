package com.resume.resumemakerapi.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

import com.resume.resumemakerapi.ResumeMakerApiApplication;

import org.springframework.core.io.ClassPathResource;
import org.springframework.util.ResourceUtils;

public class Template {

    static {
        try{System.out.println("1"+new ClassPathResource("").getInputStream().toString());}catch(Exception e){}
        try{System.out.println("2"+ResourceUtils.getFile("classpath:static"+File.separator+"head-data.html").getAbsolutePath());}catch(Exception e){}
        try{System.out.println("3"+ResourceUtils.getFile("classpath:static"));}catch(Exception e){}
        try{System.out.println("4"+ResourceUtils.getFile("classpath:static").toPath());}catch(Exception e){}
        try{System.out.println("5"+ResourceUtils.getFile("classpath:").toPath().toAbsolutePath());}catch(Exception e){}
        try{System.out.println("6"+ResourceUtils.getFile("classpath:").toPath().toFile());}catch(Exception e){}
        try{System.out.println("7"+ResourceUtils.getFile("classpath:").exists());}catch(Exception e){}
        try{System.out.println("8"+ResourceUtils.getFile("classpath:static"+File.separator+"head-data.html").toPath().toAbsolutePath());}catch(Exception e){}
        try{System.out.println("9"+ResourceUtils.getFile("classpath:static"+File.separator+"head-data.html").toPath().toUri());}catch(Exception e){}
        try{System.out.println("10"+ResourceUtils.getFile("classpath:static"+File.separator+"head-data.html").toPath().toString());}catch(Exception e){}
        try{System.out.println("11"+ResourceUtils.getFile("classpath:static"+File.separator+"head-data.html").toPath().toRealPath());}catch(Exception e){}
        try{
            File file = ResourceUtils.getFile("classpath:static"+File.separator+"head-data.html");
            System.out.println("12"+file.getAbsolutePath());
        }catch(Exception e){}
        try{
            ResumeMakerApiApplication obj = new ResumeMakerApiApplication();
            ClassLoader classLoader = obj.getClass().getClassLoader();
            File file = new File(classLoader.getResource("static"+File.separator+"head-data.html").getFile());
            System.out.println("13"+file);
        }catch(Exception e){}
        try {
            System.out.println(14);
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
