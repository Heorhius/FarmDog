package com.kaptsiug.project.model.employee;

public class Cook extends Employee {

    public Cook(String name, String surname, Profession profession) {
        super(name, surname, profession);
    }

    @Override
    public void work() {
        System.out.println("Cook is feeding the dog");
    }
}
