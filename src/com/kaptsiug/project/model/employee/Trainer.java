package com.kaptsiug.project.model.employee;

import com.kaptsiug.project.model.dog.Dog;

public class Trainer extends Employee {

    private static final String MSG_TRAINING = "Trainer %s is training the dog %s.\n";

    public Trainer(String name, String surname, Profession profession) {
        super(name, surname, profession);
    }

    @Override
    public void work(Dog dog) {
        System.out.printf(MSG_TRAINING, this.getName(), dog.getName());
        dog.setTrained(true);
    }
}
