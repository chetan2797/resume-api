package com.resume.resumemakerapi.helper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import com.resume.resumemakerapi.ResumeMakerApiApplication;

import org.springframework.core.io.ClassPathResource;

public class Template {

    static { 
        try{
            ResumeMakerApiApplication obj = new ResumeMakerApiApplication();
            ClassLoader classLoader = obj.getClass().getClassLoader();
            File file = new File(classLoader.getResource("static"+File.separator+"head-data.html").getFile());
            System.out.println(14);
            HEAD = new String(Files.readAllBytes(java.nio.file.Paths.get(file.getAbsolutePath())));
            System.out.println("yes");
        } catch (IOException e) {
            e.stackPrintTrace();
        }
        try{
            System.out.println(15);
            byte[] byteArrays = Files.readAllBytes(
                    Path.of(new ClassPathResource("static").getFile().getAbsolutePath()+File.separator+"head-data.html")
            );
            HEAD = new String(byteArrays);
            System.out.println("yes");
        } catch (IOException e) {
            e.stackPrintTrace();
        }
    }
    
    public static String TOP = "<!DOCTYPE html><html>";

    public static String HEAD;

    public static String BODY = "<body>";

    public static String FOOTER = "</body></html>";

}
