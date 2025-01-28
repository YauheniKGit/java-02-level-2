package com.yk.pack7Collections.tasksMap;

import java.time.LocalDate;
import java.util.Objects;

public record User(String login, String password, LocalDate createDate) {

    @Override
    public String toString() {
        return "UserLombok{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", createDate='" + createDate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        User user = (User) object;
        return Objects.equals(login, user.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login);
    }


}
