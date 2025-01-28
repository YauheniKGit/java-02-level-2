package com.yk.pack15ReflectionAPI;

public class MainRunnerLombok {
    public static void main(String[] args) {

        UserLombok ivan = new UserLombok("Ivan", 29);
        Class<UserLombok> userLombokClass = UserLombok.class;

        System.out.println(userLombokClass.getSuperclass());



    }



}
