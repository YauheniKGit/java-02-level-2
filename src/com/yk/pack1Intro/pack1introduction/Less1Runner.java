package com.yk.pack1Intro.pack1introduction;

public class Less1Runner {

    public static void main(String[] args) {
        Less2Computer ComputerInstance = new Less2Computer();
        ComputerInstance.load();
        ComputerInstance.printState();

        Less2Computer ComputerInstance2 = new Less2Computer(1050, 500);
        ComputerInstance2.load();
        ComputerInstance2.printState();



    }

}
