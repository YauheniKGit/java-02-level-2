package com.yk.pack16Patterns.packBuilderPattern;

import java.util.List;

public interface BuilderProgrammerIF {


    void setFirstName(String firstName);

    void setLastName(String lastName);

    void setAge(int age);

    void setHardSkills(List<String> hardSkills);

    void setSoftSkills(List<String> softSkills);

    Programmer createProgrammer();

}
