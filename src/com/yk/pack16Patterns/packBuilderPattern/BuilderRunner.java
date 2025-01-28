package com.yk.pack16Patterns.packBuilderPattern;

public class BuilderRunner {

    public static void main(String[] args) {

        ProgrammerDirector programmerDirector = new ProgrammerDirector();

        ProgrammerBuilder programmerBuilder = new ProgrammerBuilder();

        programmerDirector.constructJuniorDev(programmerBuilder);
        Programmer programmerJunior = programmerBuilder.createProgrammer();
        System.out.println(programmerJunior);

        programmerDirector.constructMiddleDev(programmerBuilder);
        Programmer programmerMiddle = programmerBuilder.createProgrammer();
        System.out.println(programmerMiddle);

        programmerDirector.constructSeniorDev(programmerBuilder);
        Programmer programmerSenior = programmerBuilder.createProgrammer();
        System.out.println(programmerSenior);


    }


}
