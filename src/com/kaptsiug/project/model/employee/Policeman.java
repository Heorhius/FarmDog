package com.kaptsiug.project.model.employee;

import com.kaptsiug.project.model.dog.Dog;

public class Policeman extends Employee {

    private static final String MSG_DUTY = "Policeman %s is on duty with the dog %s.\n";

    public Policeman(String name, String surname, Profession profession) {
        super(name, surname, profession);
    }

    @Override
    public void work(Dog dog) {
        System.out.printf(MSG_DUTY, this.getName(), dog.getName());
        dog.setTrained(true);
    }
}
