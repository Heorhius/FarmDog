package com.kaptsiug.project.logic.action;

import com.kaptsiug.project.model.dog.Dog;
import com.kaptsiug.project.model.employee.Employee;
import com.kaptsiug.project.model.employee.Profession;

import java.util.List;
import java.util.stream.Collectors;

public class Treatment implements DogAction {

    @Override
    public void action(List<Dog> dogs, List<Employee> employees) {
        List<Dog> sickDogs = dogs.stream().filter(x -> !x.getHealthy()).collect(Collectors.toList());
        Employee employee = employees.stream().filter(x -> x.getProfession().equals(Profession.VET)).findFirst().get();
        sickDogs.forEach(employee::work);
    }
}
