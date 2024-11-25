package com.yk.pack5OOPPrinciples;

public class Less21OOPRunner {

    public static void main(String[] args) {
        Printable laptop = new Less15Laptop(new Ssd(250), new Ram(1024), 2);
        Printable mobile = new Mobile(new Ssd(125), new Ram(512));

        printWithRandom(laptop, mobile);

    }

    public static void print(Printable... objects) {
        for (Printable object : objects) {
            object.print();
        }
    }

    public static void printWithRandom(Printable... objects) {
        for (Printable object : objects) {
            object.printWithRandom();
        }
    }

}
