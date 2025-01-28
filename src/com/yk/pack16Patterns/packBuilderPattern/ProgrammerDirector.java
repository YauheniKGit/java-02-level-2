package com.yk.pack16Patterns.packBuilderPattern;

import java.util.ArrayList;
import java.util.Arrays;

public class ProgrammerDirector {

    public void constructJuniorDev(BuilderProgrammerIF builderProgrammerIF) {
        builderProgrammerIF.setFirstName("Jack");
        builderProgrammerIF.setLastName("Bush");
        builderProgrammerIF.setAge(18);
        builderProgrammerIF.setSoftSkills(new ArrayList<>(Arrays.asList("Smart", "Good")));
        builderProgrammerIF.setHardSkills(new ArrayList<>(Arrays.asList("Java Core", "SQL")));
    }

    public void constructMiddleDev(BuilderProgrammerIF builderProgrammerIF) {
        builderProgrammerIF.setFirstName("Sam");
        builderProgrammerIF.setLastName("Genji");
        builderProgrammerIF.setAge(22);
        builderProgrammerIF.setSoftSkills(new ArrayList<>(Arrays.asList("Communication", "smart better")));
        builderProgrammerIF.setHardSkills(new ArrayList<>(Arrays.asList("Java", "Core", "SQL", "Spring", "Hibernate")));
    }

    public void constructSeniorDev(BuilderProgrammerIF builderProgrammerIF) {
        builderProgrammerIF.setFirstName("Tom");
        builderProgrammerIF.setLastName("Cruz");
        builderProgrammerIF.setAge(33);
        builderProgrammerIF.setSoftSkills(new ArrayList<>(Arrays.asList("Communication", "determination")));
        builderProgrammerIF.setHardSkills(new ArrayList<>(Arrays.asList("Java", "Core", "SQL", "Spring",
                "Hibernate, Kafka")));
    }

}
