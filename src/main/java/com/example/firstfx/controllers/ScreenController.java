package com.example.firstfx.controllers;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;

import java.util.HashMap;

public class ScreenController {
    private HashMap<String, Pane> screenMap = new HashMap<>();
    private Scene main;

    private ScreenController() {}
    private static ScreenController instance;
    public static ScreenController getInstance() {
        if (instance == null) {
            instance = new ScreenController();
        }

        return instance;
    }


    public void addScreen(String name, Pane pane) {
        screenMap.put(name, pane);
    }

    public void removeScreen(String name) {
        screenMap.remove(name);
    }

    public void activate(String name) {
        main.setRoot(screenMap.get(name));
    }
}