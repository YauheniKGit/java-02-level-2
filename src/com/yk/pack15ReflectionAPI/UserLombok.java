package com.yk.pack15ReflectionAPI;

import java.time.LocalDate;

public class UserLombok extends Person implements Comparable {

    private String login;
    private LocalDate lastLoginDate;
    private boolean isActive;
    private String pwd = "secret_password";

    public UserLombok(String name, int age) {
        super(name, age);
    }

    @Deprecated
    public void purchase() {
        System.out.println("Купил");
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
