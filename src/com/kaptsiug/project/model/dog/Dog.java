package com.kaptsiug.project.model.dog;

import com.kaptsiug.project.model.Aviary;

public class Dog {

    private String name;
    private int age;
    private LifeCycle lifeCycle;
    private boolean isHungry;
    private boolean isHealthy;
    private boolean isTrained;
    private Aviary aviary;

    public Dog(String name, int age, boolean isHungry, boolean isHealthy, boolean isTrained) {
        this.name = name;
        this.age = age;
        setLifeCycle();
        this.isHungry = isHungry;
        this.isHealthy = isHealthy;
        this.isTrained = isTrained;
    }

    private void setLifeCycle() {
        if (this.age >= 0 && this.age <= 2) {
            this.lifeCycle = LifeCycle.YOUNG;
        } else if (this.age > 2 && this.age <= 8) {
            this.lifeCycle = LifeCycle.ADULT;
        } else if (this.age > 8 && this.age <= 21) {
            this.lifeCycle = LifeCycle.OLD;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        setLifeCycle();
    }

    public LifeCycle getLifeCycle() {
        return lifeCycle;
    }

    public boolean getHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public boolean getHealthy() {
        return isHealthy;
    }

    public void setHealthy(boolean healthy) {
        isHealthy = healthy;
    }

    public boolean getTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }

    public Aviary getAviary() {
        return aviary;
    }

    public void setAviary(Aviary aviary) {
        this.aviary = aviary;
    }

}
