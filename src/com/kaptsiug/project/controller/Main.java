package com.kaptsiug.project.controller;

import com.kaptsiug.project.model.Farm;
import com.kaptsiug.project.processor.DayProcessor;

public class Main {

    public static void main(String[] args) {
        DayProcessor oneDay = new DayProcessor();
        Farm farm = oneDay.init();
        oneDay.liveDay(farm);
    }
}
