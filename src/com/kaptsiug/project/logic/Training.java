package com.kaptsiug.project.logic;

import com.kaptsiug.project.model.dog.Dog;
import com.kaptsiug.project.model.employee.Employee;
import com.kaptsiug.project.model.employee.Profession;

import java.util.List;

public class Training implements DogAction {

    @Override
    public void action(List<Dog> dogs, List<Employee> employees) {
        Employee employee = employees.stream().filter(x -> x.getProfession().equals(Profession.TRAINER)).findFirst().get();
        for (Dog dog : dogs) {
            switch (dog.getLifeCycle()) {
                case YOUNG: {
                    if (!dog.getTrained()) {
                        System.out.printf("Dog %s is going to the training ground. The trainer is %s", dog.getName(), employee.getName());
                        employee.work(dog);
                    }
                    break;
                }
                case ADULT: {
                    if (!dog.getTrained()) {
                        System.out.printf("Dog %s is going to the police office. The trainer is %s", dog.getName(), employee.getName());
                        employee.work(dog);
                    }
                    break;
                }
                case OLD: {
                    System.out.printf("Dog %s is going to the aviary.", dog.getName());
                    break;
                }

            }
            dog.setHungry(true);
        }

    }
}
