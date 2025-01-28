package com.yk.pack16Patterns.packBuilderPattern;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@ToString
public class Programmer {

    private String firstName;
    private String lastName;
    private int age;
    private List<String> hardSkills;
    private List<String> softSkills;

    public Programmer(String firstName, String lastName, int age, List<String> hardSkills, List<String> softSkills) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hardSkills = hardSkills;
        this.softSkills = softSkills;
    }

}
