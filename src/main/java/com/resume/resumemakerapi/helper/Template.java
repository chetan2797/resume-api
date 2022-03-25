package com.resume.resumemakerapi.helper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import com.resume.resumemakerapi.ResumeMakerApiApplication;

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
        }
    }
    
    public static String TOP = "<!DOCTYPE html><html>";

    public static String HEAD;

    public static String BODY = "<body>";

    public static String FOOTER = "</body></html>";

}
