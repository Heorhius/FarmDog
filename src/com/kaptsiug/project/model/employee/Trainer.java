package com.kaptsiug.project.model.employee;

public class Trainer extends Employee {

    public Trainer(String name, String surname, Profession profession) {
        super(name, surname, profession);
    }

    @Override
    public void work() {
        System.out.println("Trainer is training the dog");
    }
}
