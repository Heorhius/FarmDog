package com.kaptsiug.project.model.employee;

import com.kaptsiug.project.model.dog.Dog;

public class Vet extends Employee {

    private static final String MSG_TREATING = "Vet %s is treating the dog %s.\n";

    public Vet(String name, String surname, Profession profession) {
        super(name, surname, profession);
    }

    @Override
    public void work(Dog dog) {
        System.out.printf(MSG_TREATING, this.getName(), dog.getName());
        dog.setHealthy(true);
    }
}
