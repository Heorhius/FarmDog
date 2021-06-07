package com.kaptsiug.project.model.employee;

import com.kaptsiug.project.model.dog.Dog;

import java.util.Objects;

public abstract class Employee {

    private String name;
    private String surname;
    private Profession profession;

    public Employee(String name, String surname, Profession profession) {
        this.name = name;
        this.surname = surname;
        this.profession = profession;
    }

    public abstract void work(Dog dog);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return name.equals(employee.name) &&
                surname.equals(employee.surname) &&
                profession == employee.profession;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, profession);
    }

    @Override
    public String toString() {
        return "Employee: name " + name + ", surname=" + surname + ", profession=" + profession;
    }
}
