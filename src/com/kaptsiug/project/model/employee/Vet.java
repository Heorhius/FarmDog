package com.kaptsiug.project.model.employee;

public class Vet extends Employee {

    public Vet(String name, String surname, Profession profession) {
        super(name, surname, profession);
    }

    @Override
    public void work() {
        System.out.println("Vet is treating the dog");
    }
}
