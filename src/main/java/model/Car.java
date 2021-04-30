package model;

import java.util.Random;

public class Car {
    private String name;
    private int position;

    final static int MAX_RANDOM_LENGTH = 5;

    public Car(String name) {
        if(name.length() > MAX_RANDOM_LENGTH){
            throw new IllegalArgumentException();
        }
        this.name = name;
        position = 0;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void addPosition() {
        this.position++;
    }
}
