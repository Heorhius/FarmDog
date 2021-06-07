package com.kaptsiug.project.logic;

import com.kaptsiug.project.model.dog.Dog;
import com.kaptsiug.project.model.employee.Employee;

import java.util.List;

public interface DogAction {

    public void action(List<Dog> dogs, List<Employee> employees);

}
