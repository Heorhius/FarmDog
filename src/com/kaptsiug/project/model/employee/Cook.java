package com.kaptsiug.project.model.employee;

import com.kaptsiug.project.model.dog.Dog;
import com.kaptsiug.project.model.dog.LifeCycle;

public class Cook extends Employee {

    public Cook(String name, String surname, Profession profession) {
        super(name, surname, profession);
    }

    @Override
    public void work(Dog dog) {
        System.out.println("Cook is feeding the dog");
        System.out.printf("Dog %s is eating %f", dog.getName(), dog.getLifeCycle().getPortion());
        dog.setHungry(false);

    }
}
