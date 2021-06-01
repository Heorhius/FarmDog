package com.kaptsiug.project.logic;

import com.kaptsiug.project.model.employee.Employee;
import com.kaptsiug.project.model.employee.Profession;
import com.kaptsiug.project.model.employee.Vet;

public class EmployeeFactory {
    public static Employee create(String name, String surname, Profession profession) {
        Employee employee = null;
        switch(profession) {
            case VET: {
                employee = new Vet(name, surname, Profession.VET);
                break;
            }
            case COOK: {
                employee = new Vet(name, surname, Profession.COOK);
            }
            case TRAINER: {
                employee = new Vet(name, surname, Profession.TRAINER);
            }

        }
        return employee;

    }
}
