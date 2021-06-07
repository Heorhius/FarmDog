package com.kaptsiug.project.model;

import com.kaptsiug.project.model.employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    private List<Aviary> aviaries = new ArrayList<>();
    private TrainingGround trainingGround;
    private List<Employee> employees = new ArrayList<>();

    public Farm(List<Aviary> aviaries, TrainingGround trainingGround, List<Employee> employees) {
        this.aviaries = aviaries;
        this.trainingGround = trainingGround;
        this.employees = employees;
    }

    public Farm() {

    }

    public List<Aviary> getAviaries() {
        return aviaries;
    }

    public void setAviaries(List<Aviary> aviaries) {
        this.aviaries = aviaries;
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
