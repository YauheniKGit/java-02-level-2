package com.yk.pack8Exceptions;
//comment from Jack, updated again
public class Less44Exceptions {

    public static void main(String[] args) {
        System.out.println("main start");

            unsafe(-10);

        System.out.println("main end");
        //code



    }

    public static void unsafe(int value) throws IllegalArgumentException{
        System.out.println("unsafe start");
        if (value < 0) {
            throw new IllegalArgumentException();
        }
        System.out.println("unsafe end");
    }


}
