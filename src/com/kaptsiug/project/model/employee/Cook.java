package com.kaptsiug.project.model.employee;

import com.kaptsiug.project.model.dog.Dog;

public class Cook extends Employee {

    private static final String MSG_EATING = "The cook %s is feeding the dog %s with a portion of %.1f kg.\n";

    public Cook(String name, String surname, Profession profession) {
        super(name, surname, profession);
    }

    @Override
    public void work(Dog dog) {
        System.out.printf(MSG_EATING, this.getName(), dog.getName(), dog.getLifeCycle().getPortion());
        dog.setHungry(false);
    }
}
