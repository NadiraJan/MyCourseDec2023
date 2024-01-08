package be.nadira.lesson1.oopLesson2.operInsatnceOf.methodEquals;

public class App {
    public static void main(String[] args) {

        Child child1 = new Child("James Alex", 2009);
        Child child2 = new Child("Laslie Jan", 2010);
        Child child3 = new Child("Bart Smith", 2010);
        Child child4 = new Child("Anneke Puts", 2010);

        Child[] children = {child1,child2,child3,child4};
        ChildrenGarden childrenGarden = new ChildrenGarden(children);

        boolean result = false;

          /*  for(Child child : childrenGarden.getChildren()){
        if(child.getName().equals("James Alex") && child.getBirthYear() == 2010){
                result = true;
                break;
            }*/

        //other method
     Child childForFind = new Child("James Alex", 2009);
        for(Child child : childrenGarden.getChildren()){
            if(child.equals(childForFind)){
                result = true;
          break;
            }

        }
        System.out.println(result);
    }
}
