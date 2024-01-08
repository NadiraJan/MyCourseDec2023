package be.nadira.lesson1.oopLesson2.office;

import jdk.swing.interop.SwingInterOpUtils;

public class Secretary extends OfficeEmployer{

    public Secretary(boolean isMan) {
        super(isMan);
    }

    @Override
    public void getSalary() {
        System.out.println("Secretary gets 30000");
    }


}
