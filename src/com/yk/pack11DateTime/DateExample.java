package com.yk.pack11DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateExample {

    public static void main(String[] args) {

//        Task1();

        //Task2();

        LocalDate now = LocalDate.now();
        LocalDate dateOfBirth = LocalDate.of(1997, 11, 03);
        LocalDate dateOfBirth2 = LocalDate.of(1978, 06, 22);
        Period between = Period.between(dateOfBirth2, dateOfBirth);
        System.out.println(between.getYears() + " " + between.getMonths() + " " + between.getDays());


    }

    private static void Task2() {
        LocalDateTime localDateTime = LocalDateTime.now();
        String formattedDateTime = localDateTime.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"));
        System.out.println(formattedDateTime);
    }

    private static void Task1() {
        LocalDateTime dateTime = LocalDateTime.of(2020, 6, 25, 19, 47);
        LocalDateTime localDateTime = dateTime.plusMonths(3L);
        System.out.println(localDateTime.toLocalDate());
        System.out.println(localDateTime.toLocalTime());
    }


}
