package com.kaptsiug.project.model.dog;

public enum LifeCycle {
    YOUNG(0.5), ADULT(1.5), OLD(1);

    double portion;

    LifeCycle(double portion) {
        this.portion = portion;
    }

    public double getPortion() {
        return portion;
    }
}
