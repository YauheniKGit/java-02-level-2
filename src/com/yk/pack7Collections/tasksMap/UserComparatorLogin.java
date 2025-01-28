package com.yk.pack7Collections.tasksMap;

import java.util.Comparator;

public class UserComparatorLogin implements Comparator<User> {
    @Override
    public int compare(User user1, User user2) {
        return user1.login().compareTo(user2.login());
    }
}
