package com.kaptsiug.project.logic;

import com.kaptsiug.project.model.employee.*;

public class EmployeeFactory {
    public static Employee create(String name, String surname, Profession profession) {
        Employee employee = null;
        switch(profession) {
            case VET: {
                employee = new Vet(name, surname, Profession.VET);
                break;
            }
            case COOK: {
                employee = new Cook(name, surname, Profession.COOK);
                break;
            }
            case TRAINER: {
                employee = new Trainer(name, surname, Profession.TRAINER);
                break;
            }
            case CLEANER: {
                employee = new Cleaner(name, surname, Profession.CLEANER);
                break;
            }
            case POLICEMAN: {
                employee = new Policeman(name, surname, Profession.POLICEMAN);
                break;
            }

        }
        return employee;

    }
}
