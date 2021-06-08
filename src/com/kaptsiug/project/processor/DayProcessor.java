package com.kaptsiug.project.processor;

import com.kaptsiug.project.builder.Builder;
import com.kaptsiug.project.builder.FarmBuilder;
import com.kaptsiug.project.logic.action.*;
import com.kaptsiug.project.model.Farm;
import com.kaptsiug.project.model.dog.Dog;
import com.kaptsiug.project.model.employee.Employee;

import java.util.List;

public class DayProcessor {

    private static final String MSG_START_DAY = "Start of the day...";
    private static final String MSG_END_DAY = "...End of the day";
    private static final String MSG_START_INITIALIZATION = "Start of initialization...";
    private static final String MSG_END_INITIALIZATION = "...End of initialization";

    public void liveDay(Farm farm) {
        System.out.println(MSG_START_DAY);
        List<Dog> dogsInAction = farm.getDogs();
        List<Employee> employeesInAction = farm.getEmployees();

        DogAction dogAction = new Eating();
        dogAction.action(dogsInAction, employeesInAction);

        dogAction = new Cleaning();
        dogAction.action(dogsInAction, employeesInAction);

        dogAction = new Treatment();
        dogAction.action(dogsInAction, employeesInAction);

        dogAction = new Training();
        dogAction.action(dogsInAction, employeesInAction);

        dogAction = new Eating();
        dogAction.action(dogsInAction, employeesInAction);

        System.out.println(MSG_END_DAY);
    }

    public Farm init() {
        System.out.println(MSG_START_INITIALIZATION);

        Builder builder = new FarmBuilder();
        builder.reset();
        builder.setDogs();
        builder.setEmployees();
        builder.setTrainingGroup();

        System.out.println(MSG_END_INITIALIZATION);

        return ((FarmBuilder) builder).getResult();
    }

}
