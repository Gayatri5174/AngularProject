package com.example.Vinsys.model;

import java.util.List;

public class Program {
    private String name;
    private String description;
    private String duration;
    private List<String> topics;

    // Constructor
    public Program(String name, String description, String duration, List<String> topics) {
        this.name = name;
        this.description = description;
        this.duration = duration;
        this.topics = topics;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public List<String> getTopics() {
        return topics;
    }

    public void setTopics(List<String> topics) {
        this.topics = topics;
    }
}
