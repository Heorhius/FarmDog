package com.kaptsiug.project.model;

import com.kaptsiug.project.model.dog.Dog;

import java.util.List;

public class Aviary {

    private static int lastUsedId = 0;

    private int id;
    private List<Dog> dogs;

    public Aviary(List<Dog> dogs) {
        lastUsedId++;
        this.id = lastUsedId;
        this.dogs = dogs;
    }

    public int getId() {
        return id;
    }

    public List<Dog> getDogs() {
        return dogs;
    }
}
