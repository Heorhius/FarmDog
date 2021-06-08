package com.kaptsiug.project.model.employee;

import com.kaptsiug.project.model.Aviary;
import com.kaptsiug.project.model.dog.Dog;

public class Cleaner extends Employee{

    private static final String MSG_CLEANING = "The cleaner %s is cleaning the aviary %d\n";

    public Cleaner(String name, String surname, Profession profession) {
        super(name, surname, profession);
    }

    @Override
    public void work(Dog dog) {
        Aviary aviary = dog.getAviary();
        if (!aviary.isCleaned()) {
            System.out.printf(MSG_CLEANING, this.getName(), aviary.getId());
            aviary.setCleaned(true);
        }
    }
}
