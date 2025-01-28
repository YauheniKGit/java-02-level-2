package com.yk.pack7Collections.tasksMap;

import java.util.*;

public class Manager {

    private static Map<String, User> userMap = new HashMap<>();

    public boolean addNewUser(User user) {
        if (userMap.containsKey(user.login())) {
            System.out.println("UserLombok with login - " + user.login() + " - already exists");
            return false;
        }
        userMap.put(user.login(), user);
        System.out.println("UserLombok added - " + user.login());
        return true;
    }

    public boolean login(String login, String password) {
        for (Map.Entry<String, User> userEntry : userMap.entrySet()) {
            if (userEntry.getKey().equals(login) && userEntry.getValue().password().equals(password)) {
                System.out.println("Successfully logged in - " + login);
                return true;
            }
        }
        System.out.println("The login or password are not correct");
        return false;
    }

    public boolean deleteUser(String login) {
        if (userMap.containsKey(login)) {
            userMap.remove(login);
            System.out.println("UserLombok deleted - " + login);
            return true;
        }
        System.out.println("Login does not exists - " + login);
        return false;
    }

    public boolean editUser(User user) {
        if (userMap.containsKey(user.login())) {
            userMap.put(user.login(), user);
            System.out.println("UserLombok updated successfully - " + user.login());
            return true;
        }
        System.out.println("UserLombok with login does not exist - " + user.login());
        return false;
    }

    public void getAllUsers() {
        System.out.println(userMap.keySet());
    }

    public void getAllUsers(String sortCriterion) {
        switch (sortCriterion) {
            case "login":
                Map<String, User> treeMapSortedByLogin = new TreeMap<>(userMap);
                for (Map.Entry<String, User> entryUser : treeMapSortedByLogin.entrySet()) {
                    System.out.println(entryUser);
                }

                break;
            case "date":
                List<User> userListSortedByDate = new ArrayList<>(userMap.values());
                userListSortedByDate.sort(Comparator.comparing(User::createDate).reversed());
                for (User elementUser : userListSortedByDate) {
                    System.out.println(elementUser);
                }
                break;
        }
    }

}
