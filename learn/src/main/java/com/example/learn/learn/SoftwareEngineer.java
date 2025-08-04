package com.example.learn.learn;

import java.util.List;
import java.util.Objects;

public class SoftwareEngineer {
    private Integer id;
    private String name;
    private List<String> skills;

    public SoftwareEngineer(){};

    public SoftwareEngineer(Integer id, String name, List<String> skills){
        this.id = id;
        this.name = name;
        this.skills = skills;
    };

    public Integer getId(){
        return this.id;
    };

    public void setId(Integer id){
        this.id = id;
    };

    public String getName(){
        return this.name;
    };

    public void setName(String name){
        this.name = name;
    };

    public List<String> getSkills(){
        return this.skills;
    };

    public void setSkills(List<String> skills){
        this.skills = skills;
    };

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SoftwareEngineer that = (SoftwareEngineer) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(skills, that.skills);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, skills);
    }
}
