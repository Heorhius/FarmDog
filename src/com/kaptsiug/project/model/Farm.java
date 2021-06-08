package com.kaptsiug.project.model;

import com.kaptsiug.project.model.dog.Dog;
import com.kaptsiug.project.model.employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    private List<Dog> dogs = new ArrayList<>();
    private TrainingGround trainingGround;
    private List<Employee> employees = new ArrayList<>();

    public Farm(List<Dog> dogs, TrainingGround trainingGround, List<Employee> employees) {
        this.dogs = dogs;
        this.trainingGround = trainingGround;
        this.employees = employees;
    }

    public Farm() {

    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(List<Dog> dogs) {
        this.dogs = dogs;
    }

    public TrainingGround getTrainingGround() {
        return trainingGround;
    }

    public void setTrainingGround(TrainingGround trainingGround) {
        this.trainingGround = trainingGround;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }


}
