package com.yk.pack1Intro.pack7Composition;

public class Less7RunnerComposition {

    public static void main(String[] args) {


        Ram ram = new Ram(300);
        Ssd ssd = new Ssd(1500);
        Less7Computer less7ComputerInstance = new Less7Computer(ram, ssd);
        less7ComputerInstance.printState();


    }


}
