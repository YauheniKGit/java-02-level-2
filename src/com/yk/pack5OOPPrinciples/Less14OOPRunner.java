package com.yk.pack5OOPPrinciples;

public class Less14OOPRunner {

    public static void main(String[] args) {
        Computer less15Laptop = new Less15Laptop(new Ssd(250), new Ram(1024), 2);
        Computer mobile = new Mobile(new Ssd(125), new Ram(512));

        Less15Laptop less15Laptop1 = new Less15Laptop(new Ssd(5000), new Ram(10000), 5);

        loadComputers(less15Laptop, mobile, less15Laptop1);
        printInformation(new Computer[]{less15Laptop, mobile, less15Laptop1});
    }

    public static void loadComputers(Computer... computers) {

        final int value;

        for (Computer computer : computers) {

            if (computer instanceof Less15Laptop){
                Less15Laptop less15Laptop = (Less15Laptop) computer;
                less15Laptop.open();
            }

            computer.load();
        }
    }

    public static void printInformation(Computer[] computers) {
        for (Computer computer : computers) {
            computer.print();
        }
    }

}
