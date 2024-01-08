package be.nadira.lesson1.tasks;

public class StringTasks {
    public static void main(String[] args) {
        String carBrand = "Audi";
        String carModel = "Q3";
        double price = 150_000;
        boolean hasAutomaticTransmission = false;

       // System.out.printf("Hello! I'm a manager of %s. We have a carModel %s with a price %f", carBrand, carModel, price);
        String result = """
                Hello! I'm a manager of %s.
                We have a carModel %s with a price %f"
                Has it  an automatic transmission?
                %s
                """.formatted(carBrand, carModel, price,hasAutomaticTransmission ? "Yes": "No");

        System.out.println(result);


        }
    }

