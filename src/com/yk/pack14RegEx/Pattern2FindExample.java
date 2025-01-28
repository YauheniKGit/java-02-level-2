package com.yk.pack14RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern2FindExample {

    public static void main(String[] args) {

        String phoneNumber = "+375 (29) 898-12-13 sdvsdv" +
                "+375 (44) 898-15-19 sdvsdv";
        String regex = "\\+375 \\(\\d{2}\\) \\d{3}-\\d{2}-\\d{2}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);

        while(matcher.find()){
            System.out.println(matcher.group());
        }

    }


}
