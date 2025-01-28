package com.yk.pack16Patterns.packBuilderPattern.LombokBuilder;

import java.util.ArrayList;
import java.util.Arrays;

public class MainRunnerLombok {

    public static void main(String[] args) {

        ProgrammerLombokBuilder programmerLombokBuilder = ProgrammerLombokBuilder.builder()
                .firstName("Ivan")
                .hardSkills(new ArrayList<>(Arrays.asList("1111", "22222")))
                .build();


    }

}
