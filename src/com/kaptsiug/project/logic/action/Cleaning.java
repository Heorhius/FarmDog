package com.kaptsiug.project.logic.action;

import com.kaptsiug.project.model.dog.Dog;
import com.kaptsiug.project.model.employee.Employee;
import com.kaptsiug.project.model.employee.Profession;

import java.util.List;

public class Cleaning implements DogAction{
    @Override
    public void action(List<Dog> dogs, List<Employee> employees) {
        Employee employee = employees.stream().filter(x -> x.getProfession().equals(Profession.CLEANER)).findFirst().get();
        dogs.forEach(employee::work);
    }
}
