package com.yk.pack7Collections.tasks;

import java.util.Comparator;

public class UserComparatorAge implements Comparator<User> {

    @Override
    public int compare(User user1, User user2) {
        return user1.getAge().compareTo(user2.getAge());
    }

}
