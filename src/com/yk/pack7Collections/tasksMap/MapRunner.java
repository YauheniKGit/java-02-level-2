package com.yk.pack7Collections.tasksMap;

import java.time.LocalDate;

public class MapRunner {

    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.addNewUser(new User("jack", "123098", LocalDate.of(2020, 10, 10)));
        manager.addNewUser(new User("sam", "qwergsd2", LocalDate.now()));
        manager.addNewUser(new User("brandon", "pokemon", LocalDate.of(2022, 11, 10)));
        manager.addNewUser(new User("zaur", "zaur123", LocalDate.of(2019, 11, 10)));
        manager.addNewUser(new User("jackson", "root", LocalDate.of(2024, 12, 10)));
        manager.addNewUser(new User("alex", "test67", LocalDate.of(2023, 8, 9)));
        System.out.println();
        manager.login("jack", "123099");
        System.out.println();
        manager.deleteUser("alex1");
        System.out.println();
        manager.getAllUsers();
        manager.getAllUsers("login");
        System.out.println();
        manager.editUser(new User("jack", "123090000", LocalDate.of(2020, 10, 10)));
        manager.getAllUsers("login");
    }

}
