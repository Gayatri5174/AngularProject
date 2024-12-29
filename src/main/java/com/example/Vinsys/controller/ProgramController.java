package com.example.Vinsys.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Vinsys.model.Program;

@RestController
@RequestMapping("/api")
public class ProgramController {

    @GetMapping("/programs")
    public List<Program> getAllPrograms() {
        // Program data with details (AWS and Java)
        List<Program> programs = Arrays.asList(
            new Program(
                "AWS",
                "Cloud Application Developer",
                "Duration: 3 Months",
                Arrays.asList(
                    "Introduction to Cloud Formations",
                    "Linux, Networking, AWS",
                    "IT Security, Server",
                    "DevOps, Automation",
                    "Domain Name System",
                    "Python Programming",
                    "Databases",
                    "Version Control Systems",
                    "Web Server Basics",
                    "High Availability, AWS Certification"
                )
            ),
            new Program(
                "JAVA",
                "Full Stack Developer",
                "Duration: 4 Months",
                Arrays.asList(
                    "Fundamentals of Software Development",
                    "Software Development Cycle",
                    "HTML, CSS, Bootstrap",
                    "JavaScript, ReactJs",
                    "Java (Core & Advanced)",
                    "MySQL (Basic & Advanced)",
                    "API Integration",
                    "Agile + Scrum Development",
                    "Web Application Build & Deployment"
                )
            )
        );
        return programs;
    }
}
