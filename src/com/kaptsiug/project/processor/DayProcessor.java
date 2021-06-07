package com.kaptsiug.project.processor;

import com.kaptsiug.project.builder.Builder;
import com.kaptsiug.project.builder.FarmBuilder;
import com.kaptsiug.project.logic.DogAction;
import com.kaptsiug.project.logic.Eating;
import com.kaptsiug.project.logic.EmployeeFactory;
import com.kaptsiug.project.logic.Training;
import com.kaptsiug.project.model.Aviary;
import com.kaptsiug.project.model.Farm;
import com.kaptsiug.project.model.TrainingGround;
import com.kaptsiug.project.model.dog.Dog;
import com.kaptsiug.project.model.employee.Employee;
import com.kaptsiug.project.model.employee.Profession;

import java.util.ArrayList;
import java.util.List;

public class DayProcessor {

    public void liveDay(Farm farm) {
        System.out.println("Start of the day...");
        List<Dog> dogsInAction = new ArrayList<>();
        List<Employee> employeesInAction = farm.getEmployees();

        for(Aviary aviary : farm.getAviaries()) {
            dogsInAction.addAll(aviary.getDogs());
        }

        DogAction dogAction = new Eating();
        dogAction.action(dogsInAction, employeesInAction);

        dogAction = new Training();
        dogAction.action(dogsInAction, employeesInAction);

        System.out.println("...End of the day");
    }

    public Farm init() {
        System.out.println("Start of initialization...");

        Builder builder = new FarmBuilder();
        builder.reset();
        builder.setAviaries();
        builder.setEmployees();
        builder.setTrainingGroup();

        System.out.println("...End of initialization");

        return ((FarmBuilder)builder).getResult();

//        List<Dog> dogs = new ArrayList<>();
//        Dog ken = new Dog("Ken", 1, true,true,false);
//        Dog ben = new Dog("Ben", 3, true,true,false);
//        Dog sam = new Dog("Sam", 9, true,true,false);
//
//        dogs.add(ken);
//        dogs.add(ben);
//        dogs.add(sam);
//
//        List<Aviary> aviaries = new ArrayList<>();
//        Aviary aviary = new Aviary(dogs);
//        aviaries.add(aviary);
//
//        TrainingGround trainingGround = new TrainingGround();
//
//        List<Employee> employees = new ArrayList<>();
//        Employee cook = EmployeeFactory.create("Kevin","Tomson", Profession.COOK);
//        Employee trainer = EmployeeFactory.create("John","Jonson", Profession.TRAINER);
//        Employee vet = EmployeeFactory.create("Mike","Amber", Profession.VET);
//
//        employees.add(cook);
//        employees.add(trainer);
//        employees.add(vet);
//
//        return new Farm(aviaries, trainingGround, employees);
    }
}
