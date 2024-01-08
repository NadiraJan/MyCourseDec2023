package be.nadira.lesson1.oopLesson2.polymorphism.interfaces.tasks.hash_equals;

import java.util.Objects;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o instanceof User anotherUser) {
            return this.login.equals(anotherUser.login) && this.password.equals(anotherUser.password);
        }
        return false;
    }


    @Override
    public int hashCode() {
        return this.login.hashCode();
    }

 /*   @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }*/
}
