package com.kaptsiug.project.model.dog;

public class Dog {

    private String name;
    private int age;
    private LifeCycle lifeCycle;
    private boolean isHungry;
    private boolean isHealthy;
    private boolean isTrained;

    public Dog(String name, int age, boolean isHungry, boolean isHealthy, boolean isTrained) {
        this.name = name;
        this.age = age;
        this.lifeCycle = getLifeCycle(this.age);
        this.isHungry = isHungry;
        this.isHealthy = isHealthy;
        this.isTrained = isTrained;
    }

    private static LifeCycle getLifeCycle(int age) {
        LifeCycle lifeCycle = null;
        if (age >= 0 && age <= 2) {
            lifeCycle = LifeCycle.YOUNG;
        } else if (age > 2 && age <= 8) {
            lifeCycle = LifeCycle.ADULT;
        } else if (age > 8 && age <= 21) {
            lifeCycle = LifeCycle.OLD;
        }
        return lifeCycle;
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
        this.lifeCycle = getLifeCycle(this.age);
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
}
