package be.nadira.lesson1.oopLesson2.polymorphism.interfaces.tasks.hash_equals;

public class App {
    public static void main(String[] args) {

        User user1 = new User("vianet", "password1");
        User user2 = new User("vianet", "password2");
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user1.equals(user2));

    }
}
