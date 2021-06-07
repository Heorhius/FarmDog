package com.kaptsiug.project.model.employee;

import com.kaptsiug.project.model.dog.Dog;

public class Trainer extends Employee {

    public Trainer(String name, String surname, Profession profession) {
        super(name, surname, profession);
    }

    @Override
    public void work(Dog dog) {
        System.out.println("Trainer is training the dog");
        dog.setTrained(true);
    }
}
