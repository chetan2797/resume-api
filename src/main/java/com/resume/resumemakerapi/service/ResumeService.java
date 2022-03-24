package com.resume.resumemakerapi.service;

import com.resume.resumemakerapi.model.AllModel;

import org.springframework.stereotype.Service;

@Service
public class ResumeService {
    
    public StringBuilder resume1(AllModel model) {
        StringBuilder sb = new StringBuilder("");
        
        /*'
        <div class="row">
            <div class="col-5 pt-2">
                <div class="text-center mb-2">
                    <img class="resume1-photo" [src]="imagePath" alt="my photo">
                </div>
                <div class="line m-0"></div>
                <h4 class="mt-3 mb-2">GET IN TOUCH!</h4>
                <label class="contact" *ngIf="basicDetail.mobile"><span class="color-custom-blue font-weigth-500">Mobile:</span> <span><a class="link" href="tel:{{basicDetail.mobile}}"> {{basicDetail.mobile}}</a></span></label>
                <label class="contact" *ngIf="basicDetail.email"><span class="color-custom-blue font-weigth-500">Email:</span> <span><a class="link" href="mailto:{{basicDetail.email}}"> {{basicDetail.email}}</a></span></label>
                <label class="contact" *ngFor="let sl of basicDetail.socialLinks"><span class="color-custom-blue font-weigth-500">{{sl.account}}:</span> <span><a class="link" target="_blank" href="{{sl.link}}"> {{sl.link}}</a></span></label>
                <div class="line mt-3 mb-3"></div>
                <label *ngIf="personalInfo" class="resume1-heading">Personal details</label>
                <div class="font-size-12">
                    <div class="row" *ngIf="personalInfo.currentLocation">
                        <div class="col-6 font-weigth-500">Current Location</div>
                        <div class="col-6">{{personalInfo.currentLocation}}</div>
                    </div>
                    <div class="row" *ngIf="personalInfo.hometown">
                        <div class="col-6 font-weigth-500">Home Town</div>
                        <div class="col-6">{{personalInfo.hometown}}</div>
                    </div>
                    <div class="row" *ngIf="personalInfo.dateOfBirth">
                        <div class="col-6 font-weigth-500">Date of birth</div>
                        <div class="col-6">{{personalInfo.dateOfBirth | date:'dd/MMM/yyyy' }}</div>
                    </div>
                    <div class="row" *ngIf="personalInfo.gender">
                        <div class="col-6 font-weigth-500">Gender</div>
                        <div class="col-6">{{personalInfo.gender}}</div>
                    </div>
                    <div class="row" *ngIf="personalInfo.married">
                        <div class="col-6 font-weigth-500">Married</div>
                        <div class="col-6">{{personalInfo.married}}</div>
                    </div>
                    <div class="row" *ngIf="personalInfo.languageKnown">
                        <div class="col-6 font-weigth-500">Language Known</div>
                        <div class="col-6">{{personalInfo.languageKnown}}</div>
                    </div>
                    <div class="row" *ngIf="personalInfo.lookingForA">
                        <div class="col-6 font-weigth-500">Looking for a</div>
                        <div class="col-6">{{personalInfo.lookingForA}}</div>
                    </div>
                    <div class="row" *ngIf="personalInfo.canStartWork">
                        <div class="col-6 font-weigth-500">Can start working</div>
                        <div class="col-6">{{personalInfo.canStartWork}}</div>
                    </div>
                    <div class="row" *ngIf="personalInfo.preferedLocation">
                        <div class="col-6 font-weigth-500">Preferred Location</div>
                        <div class="col-6">{{personalInfo.preferedLocation}}</div>
                    </div>
                </div>
                <div *ngIf="strengthAndHobbies.hobbies.length>0">
                    <label class="resume1-heading mt-3">hobbies</label>
                    <ul>
                        <li *ngFor="let shh of strengthAndHobbies.hobbies">{{shh}}</li>
                    </ul>
                </div>
            </div>
            <div class="col-7 mt-3">
                <div class="resume1-name">{{basicDetail.name}}</div>
                <label class="resume1-heading">career objective</label>
                <p class="content">{{basicDetail.careerObjective}}</p>
                <div *ngIf="education.college.length>0 || education.school.length>0">
                    <label class="resume1-education">Education</label>
                    <div *ngFor="let ec of education.college">
                        <label class="color-custom-blue resume1-education-heading">{{ec.courseName}}</label>
                        <div class="row content">
                            <div class="col-3">College</div>
                            <div class="col-9">{{ec.collegeName}}</div>
                        </div>
                        <div class="row content">
                            <div class="col-3">Passing Year</div>
                            <div class="col-9">{{ec.passingYear}}</div>
                        </div>
                        <div class="row content">
                            <div class="col-3">Score</div>
                            <div class="col-9">{{ec.score}}</div>
                        </div>
                    </div>
                    <div *ngFor="let es of education.school">
                        <label class="color-custom-blue resume1-education-heading">{{es.name}}</label>
                        <div class="row content">
                            <div class="col-3">School Name</div>
                            <div class="col-9">{{es.schoolName}}</div>
                        </div>
                        <div class="row content">
                            <div class="col-3">Board Name</div>
                            <div class="col-9">{{es.board}}</div>
                        </div>
                        <div class="row content">
                            <div class="col-3">Passing Year</div>
                            <div class="col-9">{{es.passingYear}}</div>
                        </div>
                        <div class="row content">
                            <div class="col-3">Score</div>
                            <div class="col-9">{{es.score}}</div>
                        </div>
                    </div>
                </div>
                <div *ngIf="skillAndCertificate.skills.length>0">
                    <label class="resume1-heading mt-3">Skills</label>
                    <ul>
                        <li class="text-justify" *ngFor="let scs of skillAndCertificate.skills">
                            <div class="row">
                                <div class="col-5 font-weigth-500">{{scs.skillName}}</div>
                                <div class="col-7">{{scs.skills}}</div>
                            </div>
                        </li>
                    </ul>
                </div>
                <div *ngIf="skillAndCertificate.certificates.length>0">
                    <label class="resume1-heading mt-3">Certifications</label>
                    <ul>
                        <li class="text-justify" *ngFor="let scc of skillAndCertificate.certificates">{{scc.certificate}}</li>
                    </ul>
                </div>
                <div *ngIf="experiences.experiences.length>0">
                    <label class="resume1-heading mt-3">Expriences</label>
                    <ul>
                        <li *ngFor="let exp of experiences.experiences">
                            <label class="text-bold project-content">{{exp.companyName}}</label>
                            <label class="project-content"><span class="font-weigth-500">Job Profile:</span> {{exp.jobProfile}}</label>
                            <label class="project-content"><span class="font-weigth-500">Year of Experiences:</span> {{exp.yearOfExperience}}</label>
                        </li>
                    </ul>
                </div>
                <div *ngIf="projects.projects.length>0">
                    <label class="resume1-heading mt-3">Projects</label>
                    <ul>
                        <li *ngFor="let pro of projects.projects">
                            <label class="text-bold project-content">{{pro.name}}</label>
                            <label class="project-content"><span class="font-weigth-500">Associated with:</span> {{pro.associated}}</label>
                            <label class="project-content"><span class="font-weigth-500">Date:</span> {{pro.date}}</label>
                            <label class="project-content"><span class="font-weigth-500">Description:</span> {{pro.description}}</label>
                        </li>
                    </ul>
                </div>
                <div *ngIf="strengthAndHobbies.strengths.length>0">
                    <label class="resume1-heading mt-3">Strengths</label>
                    <ul>
                        <li *ngFor="let shs of strengthAndHobbies.strengths">{{shs}}</li>
                    </ul>
                </div>

                <label class="resume1-heading mt-3">Declaration</label>
                <p class="content">{{declaration}}</p>
            </div>
        </div>
        <div class="row mt-5 text-bold font-size-16">
            <div class="col-6">Date:</div>
            <div class="col-6 text-right">Signature</div>
        </div>';
 */

        return sb;
    }

}
