package com.kaptsiug.project.logic.action;

import com.kaptsiug.project.model.dog.Dog;
import com.kaptsiug.project.model.employee.Employee;
import com.kaptsiug.project.model.employee.Profession;

import java.util.List;

public class Training implements DogAction {

    private static final String MSG_DOG_TO_TRAINING_GROUND = "Dog %s is going to the training ground.\n";
    private static final String MSG_DOG_TO_POLICE_OFFICE = "Dog %s is going to the police office.\n";
    private static final String MSG_DOG_TO_AVIARY = "Dog %s is going to the aviary.\n";

    @Override
    public void action(List<Dog> dogs, List<Employee> employees) {
        for (Dog dog : dogs) {
            switch (dog.getLifeCycle()) {
                case YOUNG: {
                    if (!dog.getTrained()) {
                        Employee employee = employees.stream().filter(x -> x.getProfession().equals(Profession.TRAINER)).findFirst().get();
                        System.out.printf(MSG_DOG_TO_TRAINING_GROUND, dog.getName());
                        employee.work(dog);
                    }
                    break;
                }
                case ADULT: {
                    if (!dog.getTrained()) {
                        Employee employee = employees.stream().filter(x -> x.getProfession().equals(Profession.POLICEMAN)).findFirst().get();
                        System.out.printf(MSG_DOG_TO_POLICE_OFFICE, dog.getName());
                        employee.work(dog);
                    }
                    break;
                }
                case OLD: {
                    System.out.printf(MSG_DOG_TO_AVIARY, dog.getName());
                    break;
                }

            }
            dog.setHungry(true);
        }

    }
}
