package com.kaptsiug.project.model.employee;

import com.kaptsiug.project.model.dog.Dog;

public class Vet extends Employee {

    public Vet(String name, String surname, Profession profession) {
        super(name, surname, profession);
    }

    @Override
    public void work(Dog dog) {
        System.out.println("Vet is treating the dog");
    }
}
