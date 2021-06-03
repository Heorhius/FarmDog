package com.kaptsiug.project.controller;

import com.kaptsiug.project.logic.DogAction;
import com.kaptsiug.project.logic.Eating;
import com.kaptsiug.project.model.dog.Dog;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Build the area

        List<Dog> dogs = new ArrayList<>();
        Dog ken = new Dog("Ken", 1, true,true,true);
        Dog ben = new Dog("Ben", 3, true,true,true);
        Dog sam = new Dog("Sam", 9, true,true,true);

        dogs.add(ken);
        dogs.add(ben);
        dogs.add(sam);

        DogAction eating = new Eating();
        for (Dog dog : dogs) {
            eating.action(dog);
        }

    }
    
}
