package com.kaptsiug.project.model;

public class TrainingGround {

    private static int lastUsedId = 0;

    private int id;

    public TrainingGround() {
        lastUsedId++;
        this.id = lastUsedId;
    }

    public int getId() {
        return id;
    }


}
