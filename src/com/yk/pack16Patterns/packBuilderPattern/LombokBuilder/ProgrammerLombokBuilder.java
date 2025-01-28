package com.yk.pack16Patterns.packBuilderPattern.LombokBuilder;

import lombok.Builder;

import java.util.List;

@Builder
public class ProgrammerLombokBuilder {

    private String firstName;
    private String lastName;
    private int age;
    private List<String> hardSkills;
    private List<String> softSkills;


}
