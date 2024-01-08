package be.nadira.lesson1.oopLesson2.operInsatnceOf;

public class App {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();

        Animal[] garden = {cat,dog};
            for (Animal animal : garden){
              /*  if(animal instanceof Cat){
                    Cat cat1 = (Cat)animal;
                    cat1.sayMiauw();
                }*/


                //andere short writing of condition
                if(animal instanceof Cat cat1){
                    cat1.sayMiauw();
                }

            }
        }
    }

