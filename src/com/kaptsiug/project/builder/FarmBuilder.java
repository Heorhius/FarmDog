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

    private Farm farm;

    @Override
    public void reset() {
        System.out.println("Create a new farm");
        farm = new Farm();
    }

    @Override
    public void setAviaries() {
        System.out.println("Create an aviary with dogs");
        List<Dog> dogs = new ArrayList<>();
        Dog ken = new Dog("Ken", 1, true,true,false);
        Dog ben = new Dog("Ben", 3, true,true,false);
        Dog sam = new Dog("Sam", 9, true,true,false);

        dogs.add(ken);
        dogs.add(ben);
        dogs.add(sam);

        Aviary aviary = new Aviary(dogs);
        List<Aviary> aviaries = new ArrayList<>();
        aviaries.add(aviary);

        farm.setAviaries(aviaries);
    }

    @Override
    public void setTrainingGroup() {
        System.out.println("Create a training group");
        TrainingGround trainingGround = new TrainingGround();
        farm.setTrainingGround(trainingGround);
    }

    @Override
    public void setEmployees() {
        System.out.println("Create employees");
        List<Employee> employees = new ArrayList<>();
        Employee cook = EmployeeFactory.create("John","Jonson", Profession.COOK);
        Employee trainer = EmployeeFactory.create("John","Jonson", Profession.TRAINER);
        Employee vet = EmployeeFactory.create("John","Jonson", Profession.VET);

        employees.add(cook);
        employees.add(trainer);
        employees.add(vet);

        farm.setEmployees(employees);
    }

    public Farm getResult() {
        return farm;
    }
}
