package com.yk.pack1Intro.pack8PracticeTimeInter;

public class Less8TimeInterRunner {

    public static void main(String[] args) {

        Less8TimeInterval less8TimeInterval = new Less8TimeInterval(3750);
        Less8TimeInterval less8TimeInterval2 = new Less8TimeInterval(1, 2, 30);

        System.out.println(less8TimeInterval.getTotalSeconds());
        less8TimeInterval.getSplitSeconds();
        less8TimeInterval.printState();

        System.out.println();

        System.out.println(less8TimeInterval2.getTotalSeconds());
        less8TimeInterval2.printState();

        System.out.println();

        Less8TimeInterval less8TimeInterval3 = less8TimeInterval.getSumSeconds(less8TimeInterval2);
        less8TimeInterval3.getSplitSeconds();
        less8TimeInterval3.printState();


    }


}
