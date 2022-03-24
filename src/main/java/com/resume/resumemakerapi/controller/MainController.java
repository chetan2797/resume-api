package com.resume.resumemakerapi.controller;

import com.resume.resumemakerapi.model.AllModel;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MainController {
    
    @PostMapping(value = "/resume-1")
    public String resume1(
                @RequestBody AllModel model) {
        System.out.println(model.getDeclaration());
        System.out.println(model.getBasicDetails());
        System.out.println(model.getCertificates());
        System.out.println(model.getEducationColleges());
        System.out.println(model.getEducationSchools());
        System.out.println(model.getExperiences());
        System.out.println(model.getPersonalInfo());
        System.out.println(model.getProjects());
        System.out.println(model.getSkills());
        System.out.println(model.getStrengthsAndHobbies());
        return "done";
    }

    @PostMapping(value = "/resume-2")
    public String resume2(
                @RequestBody(required = false) AllModel model) {
        System.out.println(model);
        return "done";
    }

    @PostMapping(value = "/resume-3")
    public String resume3(
                @RequestBody(required = false) AllModel model) {
        System.out.println(model);
        return "done";
    }

}
