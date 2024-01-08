package be.nadira.lesson1.tasks;

public class Task1 {
    public static void main(String[] args) {
        //Check is the car workable: Engine and Transmission are ok
        // at least 3 wheels of 4 are ok
        //if the car is ok = car is ready
        //if not ok = car is broken

        boolean isWorkEngine = true;
        boolean isWorkTransmission = true;
        boolean isFineWheel1 = false;
        boolean isFineWheel2 = false;
        boolean isFineWheel3 = true;
        boolean isFineWheel4 = true;
        //to check wheels we need to create new variable countFineWheels
        // ternary: if is ok add 1 else 0
        int countFineWheels = 0;
        countFineWheels += isFineWheel1 ? 1 : 0;
        countFineWheels += isFineWheel2 ? 1 : 0;
        countFineWheels += isFineWheel3 ? 1 : 0;
        countFineWheels += isFineWheel4 ? 1 : 0;

        if(isWorkEngine && isWorkTransmission && (countFineWheels>=3)){
            System.out.println("car is ready");
        } else {
            System.out.println("car is broken");
        }

    }
}
