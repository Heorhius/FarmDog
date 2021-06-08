package com.kaptsiug.project.builder;

import com.kaptsiug.project.logic.EmployeeFactory;
import com.kaptsiug.project.model.Aviary;
import com.kaptsiug.project.model.Farm;
import com.kaptsiug.project.model.TrainingGround;
import com.kaptsiug.project.model.dog.Dog;
import com.kaptsiug.project.model.employee.Employee;
import com.kaptsiug.project.model.employee.Profession;

import java.util.ArrayList;
import java.util.List;

public class FarmBuilder implements Builder {

    private static final String MSG_CREATE_FARM = "Create a new farm";
    private static final String MSG_CREATE_DOGS = "Create dogs";
    private static final String MSG_CREATE_TRAINING_GROUND = "Create a training ground";
    private static final String MSG_CREATE_EMPLOYEES = "Create employees";
    private Farm farm;

    @Override
    public void reset() {
        System.out.println(MSG_CREATE_FARM);
        farm = new Farm();
    }

    @Override
    public void setDogs() {
        System.out.println(MSG_CREATE_DOGS);
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Ken", 1, true, true, false));
        dogs.add(new Dog("Ben", 3, true, true, false));
        dogs.add(new Dog("Sam", 9, true, false, false));

        dogs.forEach(x -> x.setAviary(new Aviary()));

        farm.setDogs(dogs);
    }

    @Override
    public void setTrainingGroup() {
        System.out.println(MSG_CREATE_TRAINING_GROUND);
        TrainingGround trainingGround = new TrainingGround();
        farm.setTrainingGround(trainingGround);
    }

    @Override
    public void setEmployees() {
        System.out.println(MSG_CREATE_EMPLOYEES);
        List<Employee> employees = new ArrayList<>();
        employees.add(EmployeeFactory.create("Nick", "Jonson", Profession.COOK));
        employees.add(EmployeeFactory.create("John", "Buffet", Profession.TRAINER));
        employees.add(EmployeeFactory.create("Mike", "Robinson", Profession.VET));
        employees.add(EmployeeFactory.create("Carl", "Lesson", Profession.CLEANER));
        employees.add(EmployeeFactory.create("Paul", "Woker", Profession.POLICEMAN));

        farm.setEmployees(employees);
    }

    public Farm getResult() {
        return farm;
    }
}
