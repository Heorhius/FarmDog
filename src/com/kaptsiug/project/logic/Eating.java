package com.kaptsiug.project.logic;

import com.kaptsiug.project.model.dog.Dog;
import com.kaptsiug.project.model.employee.Employee;
import com.kaptsiug.project.model.employee.Profession;

import java.util.List;
import java.util.stream.Collectors;

public class Eating implements DogAction{

    @Override
    public void action(List<Dog> dogs, List<Employee> employees) {
        List<Dog> hungryDogs = dogs.stream().filter(Dog::getHungry).collect(Collectors.toList());
        Employee employee = employees.stream().filter(x -> x.getProfession().equals(Profession.COOK)).findFirst().get();
        for(Dog dog : hungryDogs) {
            employee.work(dog);
        }
    }
}
