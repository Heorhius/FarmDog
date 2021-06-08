package com.kaptsiug.project.model;

public class Aviary {

    private static int lastUsedId = 0;

    private int id;
    private boolean isCleaned;

    public Aviary() {
        lastUsedId++;
        this.id = lastUsedId;
    }

    public int getId() {
        return id;
    }

    public boolean isCleaned() {
        return isCleaned;
    }

    public void setCleaned(boolean cleaned) {
        isCleaned = cleaned;
    }
}
