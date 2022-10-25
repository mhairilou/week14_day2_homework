package com.example.files_and_folders.tuesdayhomework.models;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private Long id;
    private String name;
    private List<Folder> folders;

    public Person(){}

    public Person(String name){
        this.name = name;
        this.folders = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Folder> getFolders() {
        return folders;
    }

    public void setFolders(List<Folder> folders) {
        this.folders = folders;
    }
}
