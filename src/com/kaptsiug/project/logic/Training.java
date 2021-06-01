package com.kaptsiug.project.logic;

import com.kaptsiug.project.model.dog.Dog;

public class Training implements DogAction {

    @Override
    public void action(Dog dog) {
        switch (dog.getLifeCycle()) {
            case YOUNG: {
                System.out.println("Go to the training ground");
                break;
            }
            case ADULT: {
                System.out.println("Go to the police office");
                break;
            }
            case OLD: {
                System.out.println("Go to the aviary");
                break;
            }

        }
    }
}
