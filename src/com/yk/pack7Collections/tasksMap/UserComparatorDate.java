package com.yk.pack7Collections.tasksMap;

import java.util.Comparator;

public class UserComparatorDate implements Comparator<User> {
    @Override
    public int compare(User user1, User user2) {
        return user1.createDate().compareTo(user2.createDate());
    }
}
