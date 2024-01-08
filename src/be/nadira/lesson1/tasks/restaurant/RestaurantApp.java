package be.nadira.lesson1.tasks.restaurant;

public class RestaurantApp {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();
        Restaurant restaurant2 = new Restaurant();

        restaurant.cookHotDog();
        restaurant2.addProducts();
        restaurant.cookHotDog();

    }
}
