package com.kaptsiug.project.controller;

import com.kaptsiug.project.processor.DayProcessor;

public class Main {

    public static void main(String[] args) {
        DayProcessor oneDay = new DayProcessor();
        oneDay.liveDay(oneDay.init());
    }
}
